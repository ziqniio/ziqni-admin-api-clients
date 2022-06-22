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
 * QueryMultiple
 */
@JsonPropertyOrder({
  QueryMultiple.JSON_PROPERTY_QUERY_FIELD,
  QueryMultiple.JSON_PROPERTY_QUERY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryMultiple {
  public static final String JSON_PROPERTY_QUERY_FIELD = "queryField";
  private String queryField;

  public static final String JSON_PROPERTY_QUERY_VALUES = "queryValues";
  private List<String> queryValues = new ArrayList<>();


  public QueryMultiple queryField(String queryField) {
    this.queryField = queryField;
    return this;
  }

   /**
   * The key of the parameter that is being searched
   * @return queryField
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "competitionId", required = true, value = "The key of the parameter that is being searched")
  @JsonProperty(JSON_PROPERTY_QUERY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueryField() {
    return queryField;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryField(String queryField) {
    this.queryField = queryField;
  }


  public QueryMultiple queryValues(List<String> queryValues) {
    this.queryValues = queryValues;
    return this;
  }

  public QueryMultiple addQueryValuesItem(String queryValuesItem) {
    this.queryValues.add(queryValuesItem);
    return this;
  }

   /**
   * Multiple values for parameter that is being searched
   * @return queryValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- Dc4swmQBVd51K6gPQqFx - Dc4swmQBVd51K6gPQqFx", required = true, value = "Multiple values for parameter that is being searched")
  @JsonProperty(JSON_PROPERTY_QUERY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getQueryValues() {
    return queryValues;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryValues(List<String> queryValues) {
    this.queryValues = queryValues;
  }


  /**
   * Return true if this QueryMultiple object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryMultiple queryMultiple = (QueryMultiple) o;
    return Objects.equals(this.queryField, queryMultiple.queryField) &&
        Objects.equals(this.queryValues, queryMultiple.queryValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryField, queryValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMultiple {\n");
    sb.append("    queryField: ").append(toIndentedString(queryField)).append("\n");
    sb.append("    queryValues: ").append(toIndentedString(queryValues)).append("\n");
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

