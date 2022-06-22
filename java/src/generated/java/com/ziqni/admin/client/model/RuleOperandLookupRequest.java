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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RuleOperandLookupRequest
 */
@JsonPropertyOrder({
  RuleOperandLookupRequest.JSON_PROPERTY_CONTEXT,
  RuleOperandLookupRequest.JSON_PROPERTY_SEARCH_TEXT,
  RuleOperandLookupRequest.JSON_PROPERTY_ID,
  RuleOperandLookupRequest.JSON_PROPERTY_SKIP,
  RuleOperandLookupRequest.JSON_PROPERTY_LIMIT,
  RuleOperandLookupRequest.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RuleOperandLookupRequest {
  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_SEARCH_TEXT = "searchText";
  private String searchText;

  public static final String JSON_PROPERTY_ID = "id";
  private List<String> id = null;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;


  public RuleOperandLookupRequest context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The object context to search within
   * @return context
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The object context to search within")
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(String context) {
    this.context = context;
  }


  public RuleOperandLookupRequest searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }

   /**
   * The text to search, at least 3 characters are required.
   * @return searchText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text to search, at least 3 characters are required.")
  @JsonProperty(JSON_PROPERTY_SEARCH_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchText() {
    return searchText;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }


  public RuleOperandLookupRequest id(List<String> id) {
    this.id = id;
    return this;
  }

  public RuleOperandLookupRequest addIdItem(String idItem) {
    if (this.id == null) {
      this.id = new ArrayList<>();
    }
    this.id.add(idItem);
    return this;
  }

   /**
   * The identifier to retrieve, if this is set search text will be ignored
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier to retrieve, if this is set search text will be ignored")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(List<String> id) {
    this.id = id;
  }


  public RuleOperandLookupRequest skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * How many response objects will be skipped for preview. Deafault is zero [0]
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many response objects will be skipped for preview. Deafault is zero [0]")
  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkip() {
    return skip;
  }


  @JsonProperty(JSON_PROPERTY_SKIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public RuleOperandLookupRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * How many response objects will be returned. Deafult is zero [0] and the maximum is fifty [50]
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many response objects will be returned. Deafult is zero [0] and the maximum is fifty [50]")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public RuleOperandLookupRequest constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public RuleOperandLookupRequest addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  /**
   * Return true if this RuleOperandLookupRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleOperandLookupRequest ruleOperandLookupRequest = (RuleOperandLookupRequest) o;
    return Objects.equals(this.context, ruleOperandLookupRequest.context) &&
        Objects.equals(this.searchText, ruleOperandLookupRequest.searchText) &&
        Objects.equals(this.id, ruleOperandLookupRequest.id) &&
        Objects.equals(this.skip, ruleOperandLookupRequest.skip) &&
        Objects.equals(this.limit, ruleOperandLookupRequest.limit) &&
        Objects.equals(this.constraints, ruleOperandLookupRequest.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, searchText, id, skip, limit, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleOperandLookupRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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
