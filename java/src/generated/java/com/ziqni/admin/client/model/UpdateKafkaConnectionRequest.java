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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ziqni.admin.client.model.UpdateKafkaConnectionRequestAllOf;
import com.ziqni.admin.client.model.UpdateModelDefault;
import com.ziqni.admin.client.model.UpdateOptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateKafkaConnectionRequest
 */
@JsonPropertyOrder({
  UpdateKafkaConnectionRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_TAGS,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_METADATA,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_NAME,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_BROKERS,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_GROUP_ID,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_TOPIC,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_TRANSFORMER_ID,
  UpdateKafkaConnectionRequest.JSON_PROPERTY_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateKafkaConnectionRequest {
  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

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

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public UpdateKafkaConnectionRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UpdateKafkaConnectionRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to add cutom fields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of id's used to add cutom fields")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  public UpdateKafkaConnectionRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateKafkaConnectionRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to tag models
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Dc4swmQBVd51K6gPQqFx\",\"Dc4swmQBVd51K6gPQqF2\"]", value = "A list of id's used to tag models")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public UpdateKafkaConnectionRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateKafkaConnectionRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public UpdateKafkaConnectionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the consumer
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Kafka Test", value = "The name of the consumer")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateKafkaConnectionRequest description(String description) {
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


  public UpdateKafkaConnectionRequest brokers(String brokers) {
    this.brokers = brokers;
    return this;
  }

   /**
   * Kafka broker endpoints.
   * @return brokers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "kafka-broker-1:9092,kafka-broker-2:9092,kafka-broker-3:9093", value = "Kafka broker endpoints.")
  @JsonProperty(JSON_PROPERTY_BROKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrokers() {
    return brokers;
  }


  @JsonProperty(JSON_PROPERTY_BROKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrokers(String brokers) {
    this.brokers = brokers;
  }


  public UpdateKafkaConnectionRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group Id for connection
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CL-SomeId", value = "Group Id for connection")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public UpdateKafkaConnectionRequest topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Topic name
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some_test_topic", value = "Topic name")
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  public UpdateKafkaConnectionRequest transformerId(String transformerId) {
    this.transformerId = transformerId;
    return this;
  }

   /**
   * The transformer to use, if empty the default system transformer will be used
   * @return transformerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transformer to use, if empty the default system transformer will be used")
  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransformerId() {
    return transformerId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransformerId(String transformerId) {
    this.transformerId = transformerId;
  }


  public UpdateKafkaConnectionRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique system generated identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sc1samQmVr61KgaPQq7x", required = true, value = "A unique system generated identifier")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this UpdateKafkaConnectionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateKafkaConnectionRequest updateKafkaConnectionRequest = (UpdateKafkaConnectionRequest) o;
    return Objects.equals(this.customFields, updateKafkaConnectionRequest.customFields) &&
        Objects.equals(this.tags, updateKafkaConnectionRequest.tags) &&
        Objects.equals(this.metadata, updateKafkaConnectionRequest.metadata) &&
        Objects.equals(this.name, updateKafkaConnectionRequest.name) &&
        Objects.equals(this.description, updateKafkaConnectionRequest.description) &&
        Objects.equals(this.brokers, updateKafkaConnectionRequest.brokers) &&
        Objects.equals(this.groupId, updateKafkaConnectionRequest.groupId) &&
        Objects.equals(this.topic, updateKafkaConnectionRequest.topic) &&
        Objects.equals(this.transformerId, updateKafkaConnectionRequest.transformerId) &&
        Objects.equals(this.id, updateKafkaConnectionRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, tags, metadata, name, description, brokers, groupId, topic, transformerId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateKafkaConnectionRequest {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    transformerId: ").append(toIndentedString(transformerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

