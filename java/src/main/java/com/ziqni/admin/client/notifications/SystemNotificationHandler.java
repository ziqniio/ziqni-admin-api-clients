/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.notifications;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ziqni.admin.client.configuration.ApiRestClientFactory;
import com.ziqni.admin.client.notifications.model.*;
import com.ziqni.admin.client.notifications.model.EntityChanged;
import com.ziqni.admin.client.notifications.model.EntityStateChanged;
import com.ziqni.admin.client.notifications.model.SubscriptionTypes;
import com.ziqni.admin.client.streaming.*;
import com.ziqni.admin.client.util.ClassScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.stomp.StompHeaders;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;


public class SystemNotificationHandler extends EventHandler<Object> {

    private static final Logger logger = LoggerFactory.getLogger(SystemNotificationHandler.class);
    public final static String topic = "/user/queue/core-changes";
    private final ClassScanner classScanner;
    private Map<String, SystemNotifications.NotificationSubscription> subscriptions;
    private final Consumer<SubscriptionResponse> onSubscriptionResponse;
    private final Consumer<SubscriptionTypes> onSubscriptionTypes;
    private final ObjectMapper mapper;

    public SystemNotificationHandler(Consumer<SubscriptionResponse> onSubscriptionResponse, Consumer<SubscriptionTypes> onSubscriptionTypes) {
        this.onSubscriptionResponse = onSubscriptionResponse;
        this.onSubscriptionTypes = onSubscriptionTypes;

        this.classScanner = new ClassScanner("com.ziqni.admin.client.notifications.model");
        this.mapper = ApiRestClientFactory.getApiClient().getObjectMapper();
    }

    protected synchronized void updateNotification(Map<String, SystemNotifications.NotificationSubscription> subscriptions){
        this.subscriptions = subscriptions;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public JavaType getValType(StompHeaders headers) {
        return mapper.constructType(getPayloadType(headers));
    }

    @Override
    public Type getPayloadType(StompHeaders headers) {
        return this.classScanner.get(headers.getFirst("objectType")).orElse(Object.class);
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
        try {

            final var switcher = headers.getFirst("objectType");

            switch (switcher){
                case "EntityChanged":
                    handle( (EntityChanged) payload);
                    break;

                case "EntityStateChanged":
                    handle( (EntityStateChanged) payload);
                    break;

                case "SubscriptionResponse":
                    onSubscriptionResponse.accept( (SubscriptionResponse) payload);
                    break;

                case "SubscriptionTypes":
                    onSubscriptionTypes.accept( (SubscriptionTypes) payload);
                    break;

                default:
                    logger.error("No way to deal with {}", payload.getClass());
                    break;
        }

        } catch (Exception e) {
            logger.error("Failed to decode message" + e);
        }
    }

    @Override
    public void onData(Object data) {
        throw new RuntimeException("Not used");
    }

    private void handle(EntityStateChanged data){
        final var b  = Optional.ofNullable(this.subscriptions.get(data.getEntityType()));
        b.ifPresent( y -> y.
                getOnEntityStateChanged().accept(data)
        );
    }

    private void handle(EntityChanged data){

        final var a  = Optional.ofNullable(this.subscriptions.get(data.getEntityType()));
        a.ifPresent( y -> y.
                getOnEntityChanged().accept(data)
        );
    }
}
