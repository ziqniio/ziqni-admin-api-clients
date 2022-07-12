/*
 * ZIQNI Admin API
 * Ziqni Application Services are used to manage and configure spaces.
 *
 * The version of the OpenAPI document: 3.0.1
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.admin.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * To which model does the custom field applies to
 */
public enum AppliesTo {
  
  MEMBER("Member"),
  
  PRODUCT("Product"),
  
  ACHIEVEMENT("Achievement"),
  
  REPOSITORY("Repository"),
  
  FILEOBJECT("FileObject"),
  
  LANGUAGE("Language"),
  
  MEMBERMESSAGE("MemberMessage"),
  
  REWARD("Reward"),
  
  MEMBERAWARD("MemberAward"),
  
  AWARD("Award"),
  
  MESSAGE("Message"),
  
  REWARDTYPE("RewardType"),
  
  ACTIONTYPE("ActionType"),
  
  UNITOFMEASURE("UnitOfMeasure"),
  
  COMPETITION("Competition"),
  
  CONTEST("Contest"),
  
  SQSCONNECTION("SqsConnection"),
  
  KAFKACONNECTION("KafkaConnection"),
  
  RABBITMQCONNECTION("RabbitMqConnection"),
  
  EVENT("Event"),
  
  WEBHOOK("Webhook"),
  
  ATTACHMENT("Attachment"),
  
  RULE("Rule"),
  
  APIKEY("APIKey");

  private String value;

  AppliesTo(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppliesTo fromValue(String value) {
    for (AppliesTo b : AppliesTo.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

