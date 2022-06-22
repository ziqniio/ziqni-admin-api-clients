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
import com.ziqni.admin.client.model.UpdateModelDefault;
import com.ziqni.admin.client.model.UpdateOptParamModels;
import com.ziqni.admin.client.model.UpdateSqsConnectionRequestAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateSqsConnectionRequest
 */
@JsonPropertyOrder({
  UpdateSqsConnectionRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  UpdateSqsConnectionRequest.JSON_PROPERTY_TAGS,
  UpdateSqsConnectionRequest.JSON_PROPERTY_METADATA,
  UpdateSqsConnectionRequest.JSON_PROPERTY_NAME,
  UpdateSqsConnectionRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateSqsConnectionRequest.JSON_PROPERTY_URI,
  UpdateSqsConnectionRequest.JSON_PROPERTY_ACESS_KEY,
  UpdateSqsConnectionRequest.JSON_PROPERTY_SECRET_KEY,
  UpdateSqsConnectionRequest.JSON_PROPERTY_TRANSFORMER_ID,
  UpdateSqsConnectionRequest.JSON_PROPERTY_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSqsConnectionRequest {
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

  public static final String JSON_PROPERTY_SECRET_KEY = "secretKey";
  private String secretKey;

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public UpdateSqsConnectionRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UpdateSqsConnectionRequest putCustomFieldsItem(String key, Object customFieldsItem) {
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


  public UpdateSqsConnectionRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateSqsConnectionRequest addTagsItem(String tagsItem) {
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


  public UpdateSqsConnectionRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateSqsConnectionRequest putMetadataItem(String key, String metadataItem) {
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


  public UpdateSqsConnectionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the consumer
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQS Test", value = "The name of the consumer")
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


  public UpdateSqsConnectionRequest description(String description) {
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


  public UpdateSqsConnectionRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The SQS endpoint.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://sqs.us-west-1.amazonaws.com/123456789123/test_queue_233", value = "The SQS endpoint.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public UpdateSqsConnectionRequest acessKey(String acessKey) {
    this.acessKey = acessKey;
    return this;
  }

   /**
   * The access key of the IAM user
   * @return acessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AKIAQFGYH45678TYH", value = "The access key of the IAM user")
  @JsonProperty(JSON_PROPERTY_ACESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcessKey() {
    return acessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcessKey(String acessKey) {
    this.acessKey = acessKey;
  }


  public UpdateSqsConnectionRequest secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * The secret key of IAM user
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "swVAJR8makGqWG8+OIKlJEykP5Es2Mgcbo3G09Qk", value = "The secret key of IAM user")
  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretKey() {
    return secretKey;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public UpdateSqsConnectionRequest transformerId(String transformerId) {
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


  public UpdateSqsConnectionRequest id(String id) {
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
   * Return true if this UpdateSqsConnectionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSqsConnectionRequest updateSqsConnectionRequest = (UpdateSqsConnectionRequest) o;
    return Objects.equals(this.customFields, updateSqsConnectionRequest.customFields) &&
        Objects.equals(this.tags, updateSqsConnectionRequest.tags) &&
        Objects.equals(this.metadata, updateSqsConnectionRequest.metadata) &&
        Objects.equals(this.name, updateSqsConnectionRequest.name) &&
        Objects.equals(this.description, updateSqsConnectionRequest.description) &&
        Objects.equals(this.uri, updateSqsConnectionRequest.uri) &&
        Objects.equals(this.acessKey, updateSqsConnectionRequest.acessKey) &&
        Objects.equals(this.secretKey, updateSqsConnectionRequest.secretKey) &&
        Objects.equals(this.transformerId, updateSqsConnectionRequest.transformerId) &&
        Objects.equals(this.id, updateSqsConnectionRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, tags, metadata, name, description, uri, acessKey, secretKey, transformerId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSqsConnectionRequest {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    acessKey: ").append(toIndentedString(acessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

