/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client;

import com.ziqni.admin.client.streaming.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class StreamingClient {

    private static final Logger logger = LoggerFactory.getLogger(StreamingClient.class);

    private static final boolean DEFAULT_RECONNECT_FORCE = false;
    private static final int DEFAULT_RECONNECT_ATTEMPTS = 5;
    private static final int DEFAULT_RECONNECT_DELAY = 1000;
    private static final AtomicInteger threadCount = new AtomicInteger();

    private final Thread webSocketClientThread;
    private final Map<String, Consumer<StreamingClient>> onStartHandlers = new HashMap<>();
    private final Map<String, Consumer<StreamingClient>> onStopHandlers = new HashMap<>();
    private final LinkedBlockingDeque<Consumer<WebSocketClient>> webSocketClientTasks = new LinkedBlockingDeque<>();
    private final AtomicInteger connectionState = new AtomicInteger(WebSocketClient.NotConnected);

    public StreamingClient(String URL) throws ExecutionException, InterruptedException {

        this.webSocketClientThread = new Thread(new ThreadGroup("sockets"), () -> threadRunner(URL, this.webSocketClientTasks, this.connectionState),"WebSocketClient-" + threadCount.incrementAndGet());
        this.webSocketClientThread.start();
        Thread.sleep(500);
    }

    private static void threadRunner(final String URL, final LinkedBlockingDeque<Consumer<WebSocketClient>> webSocketClientTasks, final AtomicInteger connectionState){
        try {
            final var ws = new WebSocketClient(URL, connectionState::set);
            final var apiCallbackEventHandler = new ApiCallbackEventHandler();
            ws.subscribe(apiCallbackEventHandler);
            ws.subscribe(new MessageEventHandler("/user/queue/messages"));
            ws.startClient();

            try {
                while (true) {
                    final var task = webSocketClientTasks.take();
                    try {
                        task.accept(ws);
                    } catch (Throwable t){
                        logger.error("Streaming client failure", t);
                    }
                }
            } catch (InterruptedException e) {
                logger.error("Streaming client interupted", e);
                Thread.currentThread().interrupt();
            }
        } catch (Throwable t){
            logger.error("Streaming client failure", t);
        }
        logger.info("+++++ Streaming client thread shutting down");
    }

    public Thread getWebSocketClientThread() {
        return webSocketClientThread;
    }

    public void asyncWebSocketClient(Consumer<WebSocketClient> consumer) {
        this.webSocketClientTasks.offer(consumer);
    }

    public <TOUT, TIN> CompletableFuture<TOUT> sendWithApiCallback(String destination, TIN payload){

        final var fut = new CompletableFuture<TOUT>();

        this.webSocketClientTasks.offer(ws -> {
            try {
                ApiCallbackEventHandler.send(destination, payload, fut, ws::send);
            } catch (Throwable t){
                logger.error("Failed to send the message", t);
                fut.completeExceptionally(t);
            }
        });

        return fut;
    }


    public boolean isConnected() {
        return connectionState.get() == WebSocketClient.Connected && this.webSocketClientThread.isAlive();
    }

    public boolean isNotConnected() {
        return connectionState.get() == WebSocketClient.NotConnected;
    }

    public boolean isConnecting() {
        return connectionState.get() == WebSocketClient.Connecting;
    }

    public boolean isDisconnecting() {
        return connectionState.get() == WebSocketClient.Disconnecting;
    }

    public boolean isFailure() {
        return connectionState.get() == WebSocketClient.SevereFailure;
    }

    public void stop() {
        this.webSocketClientTasks.offer(WebSocketClient::shutdown);
    }

    public CompletableFuture<Boolean> start() {
        final var result = new CompletableFuture<Boolean>();
        this.webSocketClientTasks.offer( ws -> {
            ws.startClient(result);
            if(ws.isConnected()) {
                executeOnStartHandlers();
            }
        });
        return result;
    }

    public CompletableFuture<Boolean> reconnect() {
        return reconnect(DEFAULT_RECONNECT_FORCE);
    }

    public CompletableFuture<Boolean> reconnect(boolean force) {
        return reconnect(DEFAULT_RECONNECT_ATTEMPTS, DEFAULT_RECONNECT_DELAY, force);
    }

    public CompletableFuture<Boolean> reconnect(int maxRetryCount, long reconnectDelay, boolean force) {
        final var result = new CompletableFuture<Boolean>();
        this.webSocketClientTasks.offer(ws -> ws.reconnect(result, 0, maxRetryCount, reconnectDelay, force) );
        return result;
    }

    public <T> void subscribe(EventHandler<T> eventHandler){
        this.webSocketClientTasks.offer(ws -> ws.subscribe(eventHandler));
    }

    public void addOnStopHandler(String key, Consumer<StreamingClient> consumer){
        this.onStopHandlers.compute( key, (k,v) -> consumer);
    }

    public void addOnStartHandler(String key, Consumer<StreamingClient> consumer){
        this.onStartHandlers.compute( key, (k,v) -> consumer);
    }

    public void executeOnStopHandlers() {
        this.onStopHandlers.forEach((k, v) ->
                v.accept(this)
        );
    }

    public void executeOnStartHandlers() {
        this.onStartHandlers.forEach((k, v) ->
                v.accept(this)
        );
    }

}
