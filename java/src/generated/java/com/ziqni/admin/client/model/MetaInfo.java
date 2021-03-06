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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MetaInfo
 */
@JsonPropertyOrder({
  MetaInfo.JSON_PROPERTY_OBJECT_TYPE,
  MetaInfo.JSON_PROPERTY_TOTAL_RECORDS,
  MetaInfo.JSON_PROPERTY_RESULT_COUNT,
  MetaInfo.JSON_PROPERTY_ERROR_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetaInfo {
  public static final String JSON_PROPERTY_OBJECT_TYPE = "objectType";
  private String objectType;

  public static final String JSON_PROPERTY_TOTAL_RECORDS = "totalRecords";
  private Integer totalRecords;

  public static final String JSON_PROPERTY_RESULT_COUNT = "resultCount";
  private Integer resultCount;

  public static final String JSON_PROPERTY_ERROR_COUNT = "errorCount";
  private Integer errorCount;


  public MetaInfo objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObjectType() {
    return objectType;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public MetaInfo totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * The count of all results
   * @return totalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The count of all results")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalRecords() {
    return totalRecords;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }


  public MetaInfo resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }

   /**
   * The count of successful results
   * @return resultCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "The count of successful results")
  @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getResultCount() {
    return resultCount;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }


  public MetaInfo errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * The count of errors
   * @return errorCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The count of errors")
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getErrorCount() {
    return errorCount;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  /**
   * Return true if this MetaInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaInfo metaInfo = (MetaInfo) o;
    return Objects.equals(this.objectType, metaInfo.objectType) &&
        Objects.equals(this.totalRecords, metaInfo.totalRecords) &&
        Objects.equals(this.resultCount, metaInfo.resultCount) &&
        Objects.equals(this.errorCount, metaInfo.errorCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, totalRecords, resultCount, errorCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaInfo {\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
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

