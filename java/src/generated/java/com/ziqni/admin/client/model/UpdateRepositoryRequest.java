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
import com.ziqni.admin.client.model.HostingOptions;
import com.ziqni.admin.client.model.UpdateModelDefault;
import com.ziqni.admin.client.model.UpdateOptParamModels;
import com.ziqni.admin.client.model.UpdateRepositoryRequestAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateRepositoryRequest
 */
@JsonPropertyOrder({
  UpdateRepositoryRequest.JSON_PROPERTY_ID,
  UpdateRepositoryRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  UpdateRepositoryRequest.JSON_PROPERTY_TAGS,
  UpdateRepositoryRequest.JSON_PROPERTY_METADATA,
  UpdateRepositoryRequest.JSON_PROPERTY_NAME,
  UpdateRepositoryRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateRepositoryRequest.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateRepositoryRequest.JSON_PROPERTY_REMOVE_CONSTRAINTS,
  UpdateRepositoryRequest.JSON_PROPERTY_HOSTING_OPTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateRepositoryRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

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

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_REMOVE_CONSTRAINTS = "removeConstraints";
  private List<String> removeConstraints = null;

  public static final String JSON_PROPERTY_HOSTING_OPTIONS = "hostingOptions";
  private HostingOptions hostingOptions;


  public UpdateRepositoryRequest id(String id) {
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


  public UpdateRepositoryRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UpdateRepositoryRequest putCustomFieldsItem(String key, Object customFieldsItem) {
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


  public UpdateRepositoryRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateRepositoryRequest addTagsItem(String tagsItem) {
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


  public UpdateRepositoryRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateRepositoryRequest putMetadataItem(String key, String metadataItem) {
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


  public UpdateRepositoryRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the repository. No special charaters or spaces permitted
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Demo Page", value = "The name of the repository. No special charaters or spaces permitted")
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


  public UpdateRepositoryRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the repository
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Demo Page description", value = "The description of the repository")
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


  public UpdateRepositoryRequest addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateRepositoryRequest addAddConstraintsItem(String addConstraintsItem) {
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
  @ApiModelProperty(example = "- system - public-site - disabled", value = "Additional constraints")
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


  public UpdateRepositoryRequest removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateRepositoryRequest addRemoveConstraintsItem(String removeConstraintsItem) {
    if (this.removeConstraints == null) {
      this.removeConstraints = new ArrayList<>();
    }
    this.removeConstraints.add(removeConstraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return removeConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- system - public-site - disabled", value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_REMOVE_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRemoveConstraints() {
    return removeConstraints;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoveConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
  }


  public UpdateRepositoryRequest hostingOptions(HostingOptions hostingOptions) {
    this.hostingOptions = hostingOptions;
    return this;
  }

   /**
   * Get hostingOptions
   * @return hostingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOSTING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HostingOptions getHostingOptions() {
    return hostingOptions;
  }


  @JsonProperty(JSON_PROPERTY_HOSTING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostingOptions(HostingOptions hostingOptions) {
    this.hostingOptions = hostingOptions;
  }


  /**
   * Return true if this UpdateRepositoryRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRepositoryRequest updateRepositoryRequest = (UpdateRepositoryRequest) o;
    return Objects.equals(this.id, updateRepositoryRequest.id) &&
        Objects.equals(this.customFields, updateRepositoryRequest.customFields) &&
        Objects.equals(this.tags, updateRepositoryRequest.tags) &&
        Objects.equals(this.metadata, updateRepositoryRequest.metadata) &&
        Objects.equals(this.name, updateRepositoryRequest.name) &&
        Objects.equals(this.description, updateRepositoryRequest.description) &&
        Objects.equals(this.addConstraints, updateRepositoryRequest.addConstraints) &&
        Objects.equals(this.removeConstraints, updateRepositoryRequest.removeConstraints) &&
        Objects.equals(this.hostingOptions, updateRepositoryRequest.hostingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customFields, tags, metadata, name, description, addConstraints, removeConstraints, hostingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRepositoryRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    removeConstraints: ").append(toIndentedString(removeConstraints)).append("\n");
    sb.append("    hostingOptions: ").append(toIndentedString(hostingOptions)).append("\n");
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

