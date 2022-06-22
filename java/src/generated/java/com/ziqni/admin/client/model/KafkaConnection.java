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
import com.ziqni.admin.client.model.KafkaConnectionAllOf;
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.OptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * KafkaConnection
 */
@JsonPropertyOrder({
  KafkaConnection.JSON_PROPERTY_CUSTOM_FIELDS,
  KafkaConnection.JSON_PROPERTY_TAGS,
  KafkaConnection.JSON_PROPERTY_METADATA,
  KafkaConnection.JSON_PROPERTY_NAME,
  KafkaConnection.JSON_PROPERTY_DESCRIPTION,
  KafkaConnection.JSON_PROPERTY_BROKERS,
  KafkaConnection.JSON_PROPERTY_GROUP_ID,
  KafkaConnection.JSON_PROPERTY_TOPIC,
  KafkaConnection.JSON_PROPERTY_LAST_KNOWN_STATUS,
  KafkaConnection.JSON_PROPERTY_LAST_KNOWN_STATUS_CODE,
  KafkaConnection.JSON_PROPERTY_TRANSFORMER_ID,
  KafkaConnection.JSON_PROPERTY_CONNECTION_TYPE,
  KafkaConnection.JSON_PROPERTY_ID,
  KafkaConnection.JSON_PROPERTY_SPACE_NAME,
  KafkaConnection.JSON_PROPERTY_CREATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaConnection {
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

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS = "lastKnownStatus";
  private String lastKnownStatus;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS_CODE = "lastKnownStatusCode";
  private Integer lastKnownStatusCode;

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private String connectionType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;


  public KafkaConnection customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public KafkaConnection putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public KafkaConnection tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public KafkaConnection addTagsItem(String tagsItem) {
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
  @ApiModelProperty(value = "A list of id's used to tag models")
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


  public KafkaConnection metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public KafkaConnection putMetadataItem(String key, String metadataItem) {
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


  public KafkaConnection name(String name) {
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


  public KafkaConnection description(String description) {
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


  public KafkaConnection brokers(String brokers) {
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


  public KafkaConnection groupId(String groupId) {
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


  public KafkaConnection topic(String topic) {
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


  public KafkaConnection lastKnownStatus(String lastKnownStatus) {
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


  public KafkaConnection lastKnownStatusCode(Integer lastKnownStatusCode) {
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


  public KafkaConnection transformerId(String transformerId) {
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


  public KafkaConnection connectionType(String connectionType) {
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


  public KafkaConnection id(String id) {
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


  public KafkaConnection spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * This is the space name which is linked to the account
   * @return spaceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Your_space_name", required = true, value = "This is the space name which is linked to the account")
  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpaceName() {
    return spaceName;
  }


  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }


  public KafkaConnection created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  /**
   * Return true if this KafkaConnection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaConnection kafkaConnection = (KafkaConnection) o;
    return Objects.equals(this.customFields, kafkaConnection.customFields) &&
        Objects.equals(this.tags, kafkaConnection.tags) &&
        Objects.equals(this.metadata, kafkaConnection.metadata) &&
        Objects.equals(this.name, kafkaConnection.name) &&
        Objects.equals(this.description, kafkaConnection.description) &&
        Objects.equals(this.brokers, kafkaConnection.brokers) &&
        Objects.equals(this.groupId, kafkaConnection.groupId) &&
        Objects.equals(this.topic, kafkaConnection.topic) &&
        Objects.equals(this.lastKnownStatus, kafkaConnection.lastKnownStatus) &&
        Objects.equals(this.lastKnownStatusCode, kafkaConnection.lastKnownStatusCode) &&
        Objects.equals(this.transformerId, kafkaConnection.transformerId) &&
        Objects.equals(this.connectionType, kafkaConnection.connectionType) &&
        Objects.equals(this.id, kafkaConnection.id) &&
        Objects.equals(this.spaceName, kafkaConnection.spaceName) &&
        Objects.equals(this.created, kafkaConnection.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, tags, metadata, name, description, brokers, groupId, topic, lastKnownStatus, lastKnownStatusCode, transformerId, connectionType, id, spaceName, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaConnection {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    lastKnownStatus: ").append(toIndentedString(lastKnownStatus)).append("\n");
    sb.append("    lastKnownStatusCode: ").append(toIndentedString(lastKnownStatusCode)).append("\n");
    sb.append("    transformerId: ").append(toIndentedString(transformerId)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
