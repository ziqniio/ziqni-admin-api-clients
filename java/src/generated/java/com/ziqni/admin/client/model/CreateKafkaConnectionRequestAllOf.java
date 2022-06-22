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
 * CreateKafkaConnectionRequestAllOf
 */
@JsonPropertyOrder({
  CreateKafkaConnectionRequestAllOf.JSON_PROPERTY_NAME,
  CreateKafkaConnectionRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateKafkaConnectionRequestAllOf.JSON_PROPERTY_BROKERS,
  CreateKafkaConnectionRequestAllOf.JSON_PROPERTY_GROUP_ID,
  CreateKafkaConnectionRequestAllOf.JSON_PROPERTY_TOPIC,
  CreateKafkaConnectionRequestAllOf.JSON_PROPERTY_TRANSFORMER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateKafkaConnectionRequestAllOf {
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

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;


  public CreateKafkaConnectionRequestAllOf name(String name) {
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


  public CreateKafkaConnectionRequestAllOf description(String description) {
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


  public CreateKafkaConnectionRequestAllOf brokers(String brokers) {
    this.brokers = brokers;
    return this;
  }

   /**
   * Kafka broker endpoints.
   * @return brokers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "kafka-broker-1:9092,kafka-broker-2:9092,kafka-broker-3:9093", required = true, value = "Kafka broker endpoints.")
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


  public CreateKafkaConnectionRequestAllOf groupId(String groupId) {
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


  public CreateKafkaConnectionRequestAllOf topic(String topic) {
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


  public CreateKafkaConnectionRequestAllOf transformerId(String transformerId) {
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


  /**
   * Return true if this CreateKafkaConnectionRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKafkaConnectionRequestAllOf createKafkaConnectionRequestAllOf = (CreateKafkaConnectionRequestAllOf) o;
    return Objects.equals(this.name, createKafkaConnectionRequestAllOf.name) &&
        Objects.equals(this.description, createKafkaConnectionRequestAllOf.description) &&
        Objects.equals(this.brokers, createKafkaConnectionRequestAllOf.brokers) &&
        Objects.equals(this.groupId, createKafkaConnectionRequestAllOf.groupId) &&
        Objects.equals(this.topic, createKafkaConnectionRequestAllOf.topic) &&
        Objects.equals(this.transformerId, createKafkaConnectionRequestAllOf.transformerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, brokers, groupId, topic, transformerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKafkaConnectionRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    transformerId: ").append(toIndentedString(transformerId)).append("\n");
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

