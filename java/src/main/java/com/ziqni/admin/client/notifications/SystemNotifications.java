/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.notifications;

import com.ziqni.admin.client.notifications.model.*;
import com.ziqni.admin.client.streaming.WebSocketClient;
import com.ziqni.admin.client.notifications.model.EntityChanged;
import org.springframework.messaging.simp.stomp.StompHeaders;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class SystemNotifications {

    public final ConcurrentHashMap<String, NotificationSubscription> subscriptions;
    private final SystemNotificationHandler systemNotificationHandler;
    private final WebSocketClient webSocketClient;

    public SystemNotifications(WebSocketClient webSocketClient, Consumer<SubscriptionResponse> onSubscriptionResponse, Consumer<SubscriptionTypes> onSubscriptionTypes){
        this.systemNotificationHandler = new SystemNotificationHandler(onSubscriptionResponse,onSubscriptionTypes);
        this.subscriptions = new ConcurrentHashMap<>();
        this.webSocketClient = webSocketClient;

        this.webSocketClient.subscribe(this.systemNotificationHandler);
    }

    public SystemNotificationHandler getSystemNotificationHandler() {
        return systemNotificationHandler;
    }

    public WebSocketClient getWebSocketClient() {
        return webSocketClient;
    }

    public Map<String, NotificationSubscription> getSubscriptions() {
        return Collections.unmodifiableMap(subscriptions);
    }

    public NotificationSubscription subscribeToNotifications(String entityType, List<String> constraints, Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        final StompHeaders headers = new StompHeaders();
        headers.setDestination("/aapi/cn-subscribe");
        getWebSocketClient().send(headers, new SubscriptionRequest().addEntityTypesItem(new SubscriptionRequestItem().entityType(entityType).constraints(constraints)));

        final var subscription = new NotificationSubscription(entityType,onEntityChanged,onEntityStateChanged);
        this.subscriptions.compute( entityType, (k,v) -> subscription);
        this.systemNotificationHandler.updateNotification(Collections.unmodifiableMap(this.subscriptions));
        return subscription;
    }

    public NotificationSubscription subscribeToAchievementNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Achievement", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToCompetitionNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Competition", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToContestNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Contest", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToProductNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Product", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToMemberNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Member", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToAwardNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Award", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToTransformerNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Transformer", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public NotificationSubscription subscribeToConnectionNotifications(Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged){
        return subscribeToNotifications("Connection", List.of(), onEntityChanged, onEntityStateChanged);
    }

    public void unsubscribe(NotificationSubscription subscription){
        final StompHeaders headers = new StompHeaders();
        headers.setDestination("/aapi/cn-unsubscribe");
        getWebSocketClient().send(headers, List.of(subscription.getEntityType()));
        this.subscriptions.computeIfPresent( subscription.entityType, (k,v) -> null);
    }

    public void requestSubscriptions(){
        final StompHeaders headers = new StompHeaders();
        headers.setDestination("/aapi/cn-subscriptions");
        getWebSocketClient().send(headers, null);
    }

    public void requestSampleNotificationMessages(SubscriptionRequest samplesFor){
        final StompHeaders headers = new StompHeaders();
        headers.setDestination("/aapi/cn-sampleMessage");
        getWebSocketClient().send(headers, samplesFor);
    }

    public void requestListOfAvailableEntityTypes(){
        final StompHeaders headers = new StompHeaders();
        headers.setDestination("/aapi/cn-availableEntityTypes");
        getWebSocketClient().send(headers, null);
    }

    public static class NotificationSubscription{

        private final String entityType;
        private final Consumer<EntityChanged> onEntityChanged;
        private final Consumer<EntityStateChanged> onEntityStateChanged;

        public NotificationSubscription(String entityType, Consumer<EntityChanged> onEntityChanged, Consumer<EntityStateChanged> onEntityStateChanged) {
            this.entityType = entityType;
            this.onEntityChanged = onEntityChanged;
            this.onEntityStateChanged = onEntityStateChanged;
        }

        public String getEntityType() {
            return entityType;
        }

        public Consumer<EntityChanged> getOnEntityChanged() {
            return onEntityChanged;
        }

        public Consumer<EntityStateChanged> getOnEntityStateChanged() {
            return onEntityStateChanged;
        }
    }
}
