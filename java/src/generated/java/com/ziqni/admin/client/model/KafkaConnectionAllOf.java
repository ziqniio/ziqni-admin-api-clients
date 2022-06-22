/*
 * Ziqni Admin Api
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * KafkaConnectionAllOf
 */
@JsonPropertyOrder({
  KafkaConnectionAllOf.JSON_PROPERTY_NAME,
  KafkaConnectionAllOf.JSON_PROPERTY_DESCRIPTION,
  KafkaConnectionAllOf.JSON_PROPERTY_BROKERS,
  KafkaConnectionAllOf.JSON_PROPERTY_GROUP_ID,
  KafkaConnectionAllOf.JSON_PROPERTY_TOPIC,
  KafkaConnectionAllOf.JSON_PROPERTY_LAST_KNOWN_STATUS,
  KafkaConnectionAllOf.JSON_PROPERTY_LAST_KNOWN_STATUS_CODE,
  KafkaConnectionAllOf.JSON_PROPERTY_TRANSFORMER_ID,
  KafkaConnectionAllOf.JSON_PROPERTY_CONNECTION_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaConnectionAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_BROKERS = "brokers";
  private String brokers;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS = "lastKnownStatus";
  private String lastKnownStatus;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS_CODE = "lastKnownStatusCode";
  private Integer lastKnownStatusCode;

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private String connectionType;


  public KafkaConnectionAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the consumer
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Kafka Test", required = true, value = "The name of the consumer")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public KafkaConnectionAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the consumer
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kafka Test", value = "The description of the consumer")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public KafkaConnectionAllOf brokers(String brokers) {
    this.brokers = brokers;
    return this;
  }

   /**
   * Kafka broker endpoints.
   * @return brokers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- 'kafka-broker-1:9092' - 'kafka-broker-2:9092,kafka-broker-3:9093'", required = true, value = "Kafka broker endpoints.")
  @JsonProperty(JSON_PROPERTY_BROKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrokers() {
    return brokers;
  }


  @JsonProperty(JSON_PROPERTY_BROKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrokers(String brokers) {
    this.brokers = brokers;
  }


  public KafkaConnectionAllOf groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group Id for connection
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CL-SomeId", required = true, value = "Group Id for connection")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public KafkaConnectionAllOf topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Topic name
   * @return topic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "some_test_topic", required = true, value = "Topic name")
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  public KafkaConnectionAllOf lastKnownStatus(String lastKnownStatus) {
    this.lastKnownStatus = lastKnownStatus;
    return this;
  }

   /**
   * Last known status of the connection
   * @return lastKnownStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Stopped", required = true, value = "Last known status of the connection")
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastKnownStatus() {
    return lastKnownStatus;
  }


  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastKnownStatus(String lastKnownStatus) {
    this.lastKnownStatus = lastKnownStatus;
  }


  public KafkaConnectionAllOf lastKnownStatusCode(Integer lastKnownStatusCode) {
    this.lastKnownStatusCode = lastKnownStatusCode;
    return this;
  }

   /**
   * Status code correspoding to the last known status
   * @return lastKnownStatusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Status code correspoding to the last known status")
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLastKnownStatusCode() {
    return lastKnownStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastKnownStatusCode(Integer lastKnownStatusCode) {
    this.lastKnownStatusCode = lastKnownStatusCode;
  }


  public KafkaConnectionAllOf transformerId(String transformerId) {
    this.transformerId = transformerId;
    return this;
  }

   /**
   * The transformer to use, if empty the default system transformer will be used
   * @return transformerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The transformer to use, if empty the default system transformer will be used")
  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransformerId() {
    return transformerId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransformerId(String transformerId) {
    this.transformerId = transformerId;
  }


  public KafkaConnectionAllOf connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * The type of connection
   * @return connectionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of connection")
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionType() {
    return connectionType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }


  /**
   * Return true if this KafkaConnection_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaConnectionAllOf kafkaConnectionAllOf = (KafkaConnectionAllOf) o;
    return Objects.equals(this.name, kafkaConnectionAllOf.name) &&
        Objects.equals(this.description, kafkaConnectionAllOf.description) &&
        Objects.equals(this.brokers, kafkaConnectionAllOf.brokers) &&
        Objects.equals(this.groupId, kafkaConnectionAllOf.groupId) &&
        Objects.equals(this.topic, kafkaConnectionAllOf.topic) &&
        Objects.equals(this.lastKnownStatus, kafkaConnectionAllOf.lastKnownStatus) &&
        Objects.equals(this.lastKnownStatusCode, kafkaConnectionAllOf.lastKnownStatusCode) &&
        Objects.equals(this.transformerId, kafkaConnectionAllOf.transformerId) &&
        Objects.equals(this.connectionType, kafkaConnectionAllOf.connectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, connectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaConnectionAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    lastKnownStatus: ").append(toIndentedString(lastKnownStatus)).append("\n");
    sb.append("    lastKnownStatusCode: ").append(toIndentedString(lastKnownStatusCode)).append("\n");
    sb.append("    transformerId: ").append(toIndentedString(transformerId)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

