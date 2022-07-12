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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateRepositoryRequestAllOf
 */
@JsonPropertyOrder({
  UpdateRepositoryRequestAllOf.JSON_PROPERTY_NAME,
  UpdateRepositoryRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  UpdateRepositoryRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateRepositoryRequestAllOf.JSON_PROPERTY_REMOVE_CONSTRAINTS,
  UpdateRepositoryRequestAllOf.JSON_PROPERTY_HOSTING_OPTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateRepositoryRequestAllOf {
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


  public UpdateRepositoryRequestAllOf name(String name) {
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


  public UpdateRepositoryRequestAllOf description(String description) {
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


  public UpdateRepositoryRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateRepositoryRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
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


  public UpdateRepositoryRequestAllOf removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateRepositoryRequestAllOf addRemoveConstraintsItem(String removeConstraintsItem) {
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


  public UpdateRepositoryRequestAllOf hostingOptions(HostingOptions hostingOptions) {
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
   * Return true if this UpdateRepositoryRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRepositoryRequestAllOf updateRepositoryRequestAllOf = (UpdateRepositoryRequestAllOf) o;
    return Objects.equals(this.name, updateRepositoryRequestAllOf.name) &&
        Objects.equals(this.description, updateRepositoryRequestAllOf.description) &&
        Objects.equals(this.addConstraints, updateRepositoryRequestAllOf.addConstraints) &&
        Objects.equals(this.removeConstraints, updateRepositoryRequestAllOf.removeConstraints) &&
        Objects.equals(this.hostingOptions, updateRepositoryRequestAllOf.hostingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, addConstraints, removeConstraints, hostingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRepositoryRequestAllOf {\n");
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

