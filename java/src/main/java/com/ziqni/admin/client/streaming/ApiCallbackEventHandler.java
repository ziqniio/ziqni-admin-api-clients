/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.streaming;

import com.fasterxml.jackson.databind.JavaType;
import com.ziqni.admin.client.util.ClassScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.stomp.StompHeaders;

import java.lang.reflect.Type;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;


public class ApiCallbackEventHandler extends EventHandler<String> {

    private static final Logger logger = LoggerFactory.getLogger(ApiCallbackEventHandler.class);
    private static final AtomicLong sequenceNumber = new AtomicLong(0);
    private static final ConcurrentHashMap<String, ApiCallbackResponse<?,?>> awaitingResponse = new ConcurrentHashMap<>();

    private final String topic;
    private final ClassScanner classScanner;
    private final ExecutorService cachedThreadPool;

    public ApiCallbackEventHandler() {
        this("/user/queue/rpc-results");
    }

    public ApiCallbackEventHandler(String topic) {
        this.topic = topic;
        this.cachedThreadPool = Executors.newCachedThreadPool();
        this.classScanner = new ClassScanner("com.ziqni.admin.client.model");
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public JavaType getValType(StompHeaders headers) {
        return objectMapper.constructType(getPayloadType(headers));
    }

    @Override
    public void onData(String data) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Type getPayloadType(StompHeaders headers) {
        return this.classScanner.get(headers.getFirst("objectType")).orElse(Object.class);
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
        var sn = getSequenceNumber(headers);

        if(sn.isPresent()){
            handleWithSequenceNumber(this.cachedThreadPool, sn.get(), headers, payload);
        }
        else {
            if(!payload.getClass().isInstance(Message.class))
                logger.error("No sequence number provided. Headers: " + headers + ". Payload: " + payload);
        }
    }

    public static  <TIN, TOUT> ApiCallbackResponse<TIN, TOUT> send(String destination, TIN payload, CompletableFuture<TOUT> completableFuture, BiConsumer<StompHeaders, TIN> doSend){

        var sn = sequenceNumber.incrementAndGet();
        var nextSeq = Long.toString(sn);

        StompHeaders headers = new StompHeaders();
        headers.setDestination(destination);
        headers.setReceiptId(nextSeq);
        headers.add("sn", nextSeq);

        logger.debug("WS sent request to destination [{}] with receipt id [{}] and payload [{}] and headers [{}] and callback []", destination, nextSeq, payload, headers.toSingleValueMap());

        var streamingResponse = new ApiCallbackResponse<>(sn, payload, completableFuture);
        awaitingResponse.put(streamingResponse.getSequenceNumberAsString(), streamingResponse);
        doSend.accept(headers, payload);

        return streamingResponse;
    }

    private static Optional<String> getSequenceNumber(StompHeaders headers){
        return Optional.ofNullable(headers.get("sn")).map(list -> {
            var snIter = list.iterator();
            if(snIter.hasNext()){
                var sn = snIter.next();
                return (sn != null && !sn.trim().isBlank())
                        ? sn
                        : null;
            }
            else
                return null;
        });
    }

    private static void handleWithSequenceNumber(ExecutorService cachedThreadPool, String sequenceNumber, StompHeaders headers, Object payload) {
        final var handleWith = Optional.ofNullable(awaitingResponse.get(sequenceNumber));

        if(handleWith.isEmpty()) {
            logger.debug("No handler waiting for sequence number: " + sequenceNumber + ". Headers: " + headers + ". Payload: " + payload);
            return;
        }

        handleWith.map( callback ->
            cachedThreadPool.submit( callback.onCallBack(headers,payload) )
        );

        awaitingResponse.remove(sequenceNumber);
    }
}
