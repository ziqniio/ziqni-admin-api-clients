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
import com.ziqni.admin.client.model.CreateApiKeyRequestAllOf;
import com.ziqni.admin.client.model.CreateOptParamModels;
import com.ziqni.admin.client.model.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateApiKeyRequest
 */
@JsonPropertyOrder({
  CreateApiKeyRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  CreateApiKeyRequest.JSON_PROPERTY_TAGS,
  CreateApiKeyRequest.JSON_PROPERTY_METADATA,
  CreateApiKeyRequest.JSON_PROPERTY_DESCRIPTION,
  CreateApiKeyRequest.JSON_PROPERTY_WHITE_LIST_I_PS,
  CreateApiKeyRequest.JSON_PROPERTY_ROLE,
  CreateApiKeyRequest.JSON_PROPERTY_ADD_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApiKeyRequest {
  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_WHITE_LIST_I_PS = "whiteListIPs";
  private List<String> whiteListIPs = null;

  public static final String JSON_PROPERTY_ROLE = "role";
  private Role role;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;


  public CreateApiKeyRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CreateApiKeyRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A list of custom field entries
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of custom field entries")
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


  public CreateApiKeyRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateApiKeyRequest addTagsItem(String tagsItem) {
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


  public CreateApiKeyRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateApiKeyRequest putMetadataItem(String key, String metadataItem) {
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


  public CreateApiKeyRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of an Api key
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "User api key", value = "The description of an Api key")
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


  public CreateApiKeyRequest whiteListIPs(List<String> whiteListIPs) {
    this.whiteListIPs = whiteListIPs;
    return this;
  }

  public CreateApiKeyRequest addWhiteListIPsItem(String whiteListIPsItem) {
    if (this.whiteListIPs == null) {
      this.whiteListIPs = new ArrayList<>();
    }
    this.whiteListIPs.add(whiteListIPsItem);
    return this;
  }

   /**
   * the IP&#39;s that need to be whitelisted with the Api key
   * @return whiteListIPs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- 123.221.22.1 - 333.224.34.1", value = "the IP's that need to be whitelisted with the Api key")
  @JsonProperty(JSON_PROPERTY_WHITE_LIST_I_PS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWhiteListIPs() {
    return whiteListIPs;
  }


  @JsonProperty(JSON_PROPERTY_WHITE_LIST_I_PS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhiteListIPs(List<String> whiteListIPs) {
    this.whiteListIPs = whiteListIPs;
  }


  public CreateApiKeyRequest role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Role getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(Role role) {
    this.role = role;
  }


  public CreateApiKeyRequest addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateApiKeyRequest addAddConstraintsItem(String addConstraintsItem) {
    if (this.addConstraints == null) {
      this.addConstraints = new ArrayList<>();
    }
    this.addConstraints.add(addConstraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return addConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- active - default                    ", value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_ADD_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAddConstraints() {
    return addConstraints;
  }


  @JsonProperty(JSON_PROPERTY_ADD_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
  }


  /**
   * Return true if this CreateApiKeyRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiKeyRequest createApiKeyRequest = (CreateApiKeyRequest) o;
    return Objects.equals(this.customFields, createApiKeyRequest.customFields) &&
        Objects.equals(this.tags, createApiKeyRequest.tags) &&
        Objects.equals(this.metadata, createApiKeyRequest.metadata) &&
        Objects.equals(this.description, createApiKeyRequest.description) &&
        Objects.equals(this.whiteListIPs, createApiKeyRequest.whiteListIPs) &&
        Objects.equals(this.role, createApiKeyRequest.role) &&
        Objects.equals(this.addConstraints, createApiKeyRequest.addConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, tags, metadata, description, whiteListIPs, role, addConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApiKeyRequest {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    whiteListIPs: ").append(toIndentedString(whiteListIPs)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
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

