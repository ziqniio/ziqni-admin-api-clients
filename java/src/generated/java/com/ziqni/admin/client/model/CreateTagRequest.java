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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request for tag creation
 */
@ApiModel(description = "Request for tag creation")
@JsonPropertyOrder({
  CreateTagRequest.JSON_PROPERTY_NAME,
  CreateTagRequest.JSON_PROPERTY_KEY,
  CreateTagRequest.JSON_PROPERTY_DESCRIPTION,
  CreateTagRequest.JSON_PROPERTY_METADATA,
  CreateTagRequest.JSON_PROPERTY_ENTITY_TYPES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTagRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_ENTITY_TYPES = "entityTypes";
  private List<String> entityTypes = new ArrayList<>();


  public CreateTagRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tag
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Group", required = true, value = "The name of the tag")
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


  public CreateTagRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A unique key that represents a tag
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "group1", required = true, value = "A unique key that represents a tag")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public CreateTagRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the tag for your reference
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The group that has been called group1", value = "The description of the tag for your reference")
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


  public CreateTagRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateTagRequest putMetadataItem(String key, String metadataItem) {
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


  public CreateTagRequest entityTypes(List<String> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public CreateTagRequest addEntityTypesItem(String entityTypesItem) {
    this.entityTypes.add(entityTypesItem);
    return this;
  }

   /**
   * The model name the tag refers to
   * @return entityTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Member, Product", required = true, value = "The model name the tag refers to")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getEntityTypes() {
    return entityTypes;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityTypes(List<String> entityTypes) {
    this.entityTypes = entityTypes;
  }


  /**
   * Return true if this CreateTagRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTagRequest createTagRequest = (CreateTagRequest) o;
    return Objects.equals(this.name, createTagRequest.name) &&
        Objects.equals(this.key, createTagRequest.key) &&
        Objects.equals(this.description, createTagRequest.description) &&
        Objects.equals(this.metadata, createTagRequest.metadata) &&
        Objects.equals(this.entityTypes, createTagRequest.entityTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, description, metadata, entityTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTagRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
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
