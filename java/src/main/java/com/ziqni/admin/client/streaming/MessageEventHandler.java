/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.admin.client.streaming;

import com.fasterxml.jackson.databind.JavaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.stomp.StompHeaders;


public class MessageEventHandler extends EventHandler<Message> {

    private static final Logger logger = LoggerFactory.getLogger(MessageEventHandler.class);

    private final String topic;

    public MessageEventHandler(String topic) {
        this.topic = topic;
    }

    @Override
    public String getTopic() {
        return this.topic;
    }

    @Override
    public JavaType getValType(StompHeaders headers) {
        return objectMapper.constructType(Message.class);
    }

    @Override
    public void onData(Message data) {
        logger.info("Received: " + data);
    }
}
