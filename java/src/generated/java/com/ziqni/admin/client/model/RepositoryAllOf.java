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
import com.ziqni.admin.client.model.HostingOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RepositoryAllOf
 */
@JsonPropertyOrder({
  RepositoryAllOf.JSON_PROPERTY_NAME,
  RepositoryAllOf.JSON_PROPERTY_DESCRIPTION,
  RepositoryAllOf.JSON_PROPERTY_CONSTRAINTS,
  RepositoryAllOf.JSON_PROPERTY_HOSTING_OPTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RepositoryAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();

  public static final String JSON_PROPERTY_HOSTING_OPTIONS = "hostingOptions";
  private HostingOptions hostingOptions;


  public RepositoryAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the repository. This cannot contain spaces or specil characters.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Demo-Page", required = true, value = "The name of the repository. This cannot contain spaces or specil characters.")
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


  public RepositoryAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the promotion page
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Demo Page description", value = "The description of the promotion page")
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


  public RepositoryAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public RepositoryAllOf addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- system - public-site - disabled", required = true, value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  public RepositoryAllOf hostingOptions(HostingOptions hostingOptions) {
    this.hostingOptions = hostingOptions;
    return this;
  }

   /**
   * Get hostingOptions
   * @return hostingOptions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOSTING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HostingOptions getHostingOptions() {
    return hostingOptions;
  }


  @JsonProperty(JSON_PROPERTY_HOSTING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHostingOptions(HostingOptions hostingOptions) {
    this.hostingOptions = hostingOptions;
  }


  /**
   * Return true if this Repository_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryAllOf repositoryAllOf = (RepositoryAllOf) o;
    return Objects.equals(this.name, repositoryAllOf.name) &&
        Objects.equals(this.description, repositoryAllOf.description) &&
        Objects.equals(this.constraints, repositoryAllOf.constraints) &&
        Objects.equals(this.hostingOptions, repositoryAllOf.hostingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, constraints, hostingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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
