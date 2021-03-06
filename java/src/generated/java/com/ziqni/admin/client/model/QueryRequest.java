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
import com.ziqni.admin.client.model.QueryMultiple;
import com.ziqni.admin.client.model.QueryMultipleFields;
import com.ziqni.admin.client.model.QuerySingle;
import com.ziqni.admin.client.model.QuerySortBy;
import com.ziqni.admin.client.model.RangeQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * QueryRequest
 */
@JsonPropertyOrder({
  QueryRequest.JSON_PROPERTY_MUST,
  QueryRequest.JSON_PROPERTY_MUST_NOT,
  QueryRequest.JSON_PROPERTY_SHOULD,
  QueryRequest.JSON_PROPERTY_GTE,
  QueryRequest.JSON_PROPERTY_GT,
  QueryRequest.JSON_PROPERTY_LTE,
  QueryRequest.JSON_PROPERTY_LT,
  QueryRequest.JSON_PROPERTY_RANGE,
  QueryRequest.JSON_PROPERTY_SORT_BY,
  QueryRequest.JSON_PROPERTY_MULTI_FIELDS,
  QueryRequest.JSON_PROPERTY_INCLUDE_FIELDS,
  QueryRequest.JSON_PROPERTY_HAS_VALUE,
  QueryRequest.JSON_PROPERTY_HAS_NO_VALUE,
  QueryRequest.JSON_PROPERTY_SHOULD_MATCH,
  QueryRequest.JSON_PROPERTY_SKIP,
  QueryRequest.JSON_PROPERTY_LIMIT,
  QueryRequest.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryRequest {
  public static final String JSON_PROPERTY_MUST = "must";
  private List<QueryMultiple> must = null;

  public static final String JSON_PROPERTY_MUST_NOT = "mustNot";
  private List<QueryMultiple> mustNot = null;

  public static final String JSON_PROPERTY_SHOULD = "should";
  private List<QueryMultiple> should = null;

  public static final String JSON_PROPERTY_GTE = "gte";
  private List<QuerySingle> gte = null;

  public static final String JSON_PROPERTY_GT = "gt";
  private List<QuerySingle> gt = null;

  public static final String JSON_PROPERTY_LTE = "lte";
  private List<QuerySingle> lte = null;

  public static final String JSON_PROPERTY_LT = "lt";
  private List<QuerySingle> lt = null;

  public static final String JSON_PROPERTY_RANGE = "range";
  private List<RangeQuery> range = null;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private List<QuerySortBy> sortBy = null;

  public static final String JSON_PROPERTY_MULTI_FIELDS = "multiFields";
  private List<QueryMultipleFields> multiFields = null;

  public static final String JSON_PROPERTY_INCLUDE_FIELDS = "includeFields";
  private List<String> includeFields = null;

  public static final String JSON_PROPERTY_HAS_VALUE = "hasValue";
  private List<String> hasValue = null;

  public static final String JSON_PROPERTY_HAS_NO_VALUE = "hasNoValue";
  private List<String> hasNoValue = null;

  public static final String JSON_PROPERTY_SHOULD_MATCH = "shouldMatch";
  private Integer shouldMatch;

  public static final String JSON_PROPERTY_SKIP = "skip";
  private Integer skip;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;


  public QueryRequest must(List<QueryMultiple> must) {
    this.must = must;
    return this;
  }

  public QueryRequest addMustItem(QueryMultiple mustItem) {
    if (this.must == null) {
      this.must = new ArrayList<>();
    }
    this.must.add(mustItem);
    return this;
  }

   /**
   * Get must
   * @return must
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryMultiple> getMust() {
    return must;
  }


  @JsonProperty(JSON_PROPERTY_MUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMust(List<QueryMultiple> must) {
    this.must = must;
  }


  public QueryRequest mustNot(List<QueryMultiple> mustNot) {
    this.mustNot = mustNot;
    return this;
  }

  public QueryRequest addMustNotItem(QueryMultiple mustNotItem) {
    if (this.mustNot == null) {
      this.mustNot = new ArrayList<>();
    }
    this.mustNot.add(mustNotItem);
    return this;
  }

   /**
   * Get mustNot
   * @return mustNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUST_NOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryMultiple> getMustNot() {
    return mustNot;
  }


  @JsonProperty(JSON_PROPERTY_MUST_NOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMustNot(List<QueryMultiple> mustNot) {
    this.mustNot = mustNot;
  }


  public QueryRequest should(List<QueryMultiple> should) {
    this.should = should;
    return this;
  }

  public QueryRequest addShouldItem(QueryMultiple shouldItem) {
    if (this.should == null) {
      this.should = new ArrayList<>();
    }
    this.should.add(shouldItem);
    return this;
  }

   /**
   * Get should
   * @return should
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryMultiple> getShould() {
    return should;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShould(List<QueryMultiple> should) {
    this.should = should;
  }


  public QueryRequest gte(List<QuerySingle> gte) {
    this.gte = gte;
    return this;
  }

  public QueryRequest addGteItem(QuerySingle gteItem) {
    if (this.gte == null) {
      this.gte = new ArrayList<>();
    }
    this.gte.add(gteItem);
    return this;
  }

   /**
   * Get gte
   * @return gte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuerySingle> getGte() {
    return gte;
  }


  @JsonProperty(JSON_PROPERTY_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGte(List<QuerySingle> gte) {
    this.gte = gte;
  }


  public QueryRequest gt(List<QuerySingle> gt) {
    this.gt = gt;
    return this;
  }

  public QueryRequest addGtItem(QuerySingle gtItem) {
    if (this.gt == null) {
      this.gt = new ArrayList<>();
    }
    this.gt.add(gtItem);
    return this;
  }

   /**
   * Get gt
   * @return gt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuerySingle> getGt() {
    return gt;
  }


  @JsonProperty(JSON_PROPERTY_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGt(List<QuerySingle> gt) {
    this.gt = gt;
  }


  public QueryRequest lte(List<QuerySingle> lte) {
    this.lte = lte;
    return this;
  }

  public QueryRequest addLteItem(QuerySingle lteItem) {
    if (this.lte == null) {
      this.lte = new ArrayList<>();
    }
    this.lte.add(lteItem);
    return this;
  }

   /**
   * Get lte
   * @return lte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuerySingle> getLte() {
    return lte;
  }


  @JsonProperty(JSON_PROPERTY_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLte(List<QuerySingle> lte) {
    this.lte = lte;
  }


  public QueryRequest lt(List<QuerySingle> lt) {
    this.lt = lt;
    return this;
  }

  public QueryRequest addLtItem(QuerySingle ltItem) {
    if (this.lt == null) {
      this.lt = new ArrayList<>();
    }
    this.lt.add(ltItem);
    return this;
  }

   /**
   * Get lt
   * @return lt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuerySingle> getLt() {
    return lt;
  }


  @JsonProperty(JSON_PROPERTY_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLt(List<QuerySingle> lt) {
    this.lt = lt;
  }


  public QueryRequest range(List<RangeQuery> range) {
    this.range = range;
    return this;
  }

  public QueryRequest addRangeItem(RangeQuery rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RangeQuery> getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(List<RangeQuery> range) {
    this.range = range;
  }


  public QueryRequest sortBy(List<QuerySortBy> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public QueryRequest addSortByItem(QuerySortBy sortByItem) {
    if (this.sortBy == null) {
      this.sortBy = new ArrayList<>();
    }
    this.sortBy.add(sortByItem);
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QuerySortBy> getSortBy() {
    return sortBy;
  }


  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortBy(List<QuerySortBy> sortBy) {
    this.sortBy = sortBy;
  }


  public QueryRequest multiFields(List<QueryMultipleFields> multiFields) {
    this.multiFields = multiFields;
    return this;
  }

  public QueryRequest addMultiFieldsItem(QueryMultipleFields multiFieldsItem) {
    if (this.multiFields == null) {
      this.multiFields = new ArrayList<>();
    }
    this.multiFields.add(multiFieldsItem);
    return this;
  }

   /**
   * Get multiFields
   * @return multiFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTI_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QueryMultipleFields> getMultiFields() {
    return multiFields;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiFields(List<QueryMultipleFields> multiFields) {
    this.multiFields = multiFields;
  }


  public QueryRequest includeFields(List<String> includeFields) {
    this.includeFields = includeFields;
    return this;
  }

  public QueryRequest addIncludeFieldsItem(String includeFieldsItem) {
    if (this.includeFields == null) {
      this.includeFields = new ArrayList<>();
    }
    this.includeFields.add(includeFieldsItem);
    return this;
  }

   /**
   * Get includeFields
   * @return includeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIncludeFields() {
    return includeFields;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
  }


  public QueryRequest hasValue(List<String> hasValue) {
    this.hasValue = hasValue;
    return this;
  }

  public QueryRequest addHasValueItem(String hasValueItem) {
    if (this.hasValue == null) {
      this.hasValue = new ArrayList<>();
    }
    this.hasValue.add(hasValueItem);
    return this;
  }

   /**
   * Get hasValue
   * @return hasValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHasValue() {
    return hasValue;
  }


  @JsonProperty(JSON_PROPERTY_HAS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasValue(List<String> hasValue) {
    this.hasValue = hasValue;
  }


  public QueryRequest hasNoValue(List<String> hasNoValue) {
    this.hasNoValue = hasNoValue;
    return this;
  }

  public QueryRequest addHasNoValueItem(String hasNoValueItem) {
    if (this.hasNoValue == null) {
      this.hasNoValue = new ArrayList<>();
    }
    this.hasNoValue.add(hasNoValueItem);
    return this;
  }

   /**
   * Get hasNoValue
   * @return hasNoValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_NO_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHasNoValue() {
    return hasNoValue;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NO_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNoValue(List<String> hasNoValue) {
    this.hasNoValue = hasNoValue;
  }


  public QueryRequest shouldMatch(Integer shouldMatch) {
    this.shouldMatch = shouldMatch;
    return this;
  }

   /**
   * Get shouldMatch
   * @return shouldMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShouldMatch() {
    return shouldMatch;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldMatch(Integer shouldMatch) {
    this.shouldMatch = shouldMatch;
  }


  public QueryRequest skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public QueryRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public QueryRequest constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public QueryRequest addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Return true if this QueryRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;
    return Objects.equals(this.must, queryRequest.must) &&
        Objects.equals(this.mustNot, queryRequest.mustNot) &&
        Objects.equals(this.should, queryRequest.should) &&
        Objects.equals(this.gte, queryRequest.gte) &&
        Objects.equals(this.gt, queryRequest.gt) &&
        Objects.equals(this.lte, queryRequest.lte) &&
        Objects.equals(this.lt, queryRequest.lt) &&
        Objects.equals(this.range, queryRequest.range) &&
        Objects.equals(this.sortBy, queryRequest.sortBy) &&
        Objects.equals(this.multiFields, queryRequest.multiFields) &&
        Objects.equals(this.includeFields, queryRequest.includeFields) &&
        Objects.equals(this.hasValue, queryRequest.hasValue) &&
        Objects.equals(this.hasNoValue, queryRequest.hasNoValue) &&
        Objects.equals(this.shouldMatch, queryRequest.shouldMatch) &&
        Objects.equals(this.skip, queryRequest.skip) &&
        Objects.equals(this.limit, queryRequest.limit) &&
        Objects.equals(this.constraints, queryRequest.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(must, mustNot, should, gte, gt, lte, lt, range, sortBy, multiFields, includeFields, hasValue, hasNoValue, shouldMatch, skip, limit, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    sb.append("    must: ").append(toIndentedString(must)).append("\n");
    sb.append("    mustNot: ").append(toIndentedString(mustNot)).append("\n");
    sb.append("    should: ").append(toIndentedString(should)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    multiFields: ").append(toIndentedString(multiFields)).append("\n");
    sb.append("    includeFields: ").append(toIndentedString(includeFields)).append("\n");
    sb.append("    hasValue: ").append(toIndentedString(hasValue)).append("\n");
    sb.append("    hasNoValue: ").append(toIndentedString(hasNoValue)).append("\n");
    sb.append("    shouldMatch: ").append(toIndentedString(shouldMatch)).append("\n");
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

