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
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.OptParamModels;
import com.ziqni.admin.client.model.SqsConnectionAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SqsConnection
 */
@JsonPropertyOrder({
  SqsConnection.JSON_PROPERTY_ID,
  SqsConnection.JSON_PROPERTY_SPACE_NAME,
  SqsConnection.JSON_PROPERTY_CREATED,
  SqsConnection.JSON_PROPERTY_CUSTOM_FIELDS,
  SqsConnection.JSON_PROPERTY_TAGS,
  SqsConnection.JSON_PROPERTY_METADATA,
  SqsConnection.JSON_PROPERTY_NAME,
  SqsConnection.JSON_PROPERTY_DESCRIPTION,
  SqsConnection.JSON_PROPERTY_URI,
  SqsConnection.JSON_PROPERTY_ACESS_KEY,
  SqsConnection.JSON_PROPERTY_LAST_KNOWN_STATUS,
  SqsConnection.JSON_PROPERTY_LAST_KNOWN_STATUS_CODE,
  SqsConnection.JSON_PROPERTY_TRANSFORMER_ID,
  SqsConnection.JSON_PROPERTY_CONNECTION_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SqsConnection {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

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

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_ACESS_KEY = "acessKey";
  private String acessKey;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS = "lastKnownStatus";
  private String lastKnownStatus;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS_CODE = "lastKnownStatusCode";
  private Integer lastKnownStatusCode;

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private String connectionType;


  public SqsConnection id(String id) {
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


  public SqsConnection spaceName(String spaceName) {
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


  public SqsConnection created(OffsetDateTime created) {
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


  public SqsConnection customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SqsConnection putCustomFieldsItem(String key, Object customFieldsItem) {
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


  public SqsConnection tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SqsConnection addTagsItem(String tagsItem) {
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


  public SqsConnection metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SqsConnection putMetadataItem(String key, String metadataItem) {
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


  public SqsConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The type of the consumer
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SQS Test", required = true, value = "The type of the consumer")
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


  public SqsConnection description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the consumer
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQS Test", value = "The description of the consumer")
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


  public SqsConnection uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The SQS endpoint.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://sqs.us-west-1.amazonaws.com/123456789123/test_queue_233", required = true, value = "The SQS endpoint.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public SqsConnection acessKey(String acessKey) {
    this.acessKey = acessKey;
    return this;
  }

   /**
   * The access key of the IAM user
   * @return acessKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "AKIAQFGYH45678TYH", required = true, value = "The access key of the IAM user")
  @JsonProperty(JSON_PROPERTY_ACESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAcessKey() {
    return acessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcessKey(String acessKey) {
    this.acessKey = acessKey;
  }


  public SqsConnection lastKnownStatus(String lastKnownStatus) {
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


  public SqsConnection lastKnownStatusCode(Integer lastKnownStatusCode) {
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


  public SqsConnection transformerId(String transformerId) {
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


  public SqsConnection connectionType(String connectionType) {
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
   * Return true if this SqsConnection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqsConnection sqsConnection = (SqsConnection) o;
    return Objects.equals(this.id, sqsConnection.id) &&
        Objects.equals(this.spaceName, sqsConnection.spaceName) &&
        Objects.equals(this.created, sqsConnection.created) &&
        Objects.equals(this.customFields, sqsConnection.customFields) &&
        Objects.equals(this.tags, sqsConnection.tags) &&
        Objects.equals(this.metadata, sqsConnection.metadata) &&
        Objects.equals(this.name, sqsConnection.name) &&
        Objects.equals(this.description, sqsConnection.description) &&
        Objects.equals(this.uri, sqsConnection.uri) &&
        Objects.equals(this.acessKey, sqsConnection.acessKey) &&
        Objects.equals(this.lastKnownStatus, sqsConnection.lastKnownStatus) &&
        Objects.equals(this.lastKnownStatusCode, sqsConnection.lastKnownStatusCode) &&
        Objects.equals(this.transformerId, sqsConnection.transformerId) &&
        Objects.equals(this.connectionType, sqsConnection.connectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, customFields, tags, metadata, name, description, uri, acessKey, lastKnownStatus, lastKnownStatusCode, transformerId, connectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqsConnection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    acessKey: ").append(toIndentedString(acessKey)).append("\n");
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

