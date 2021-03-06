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
 * ScoringStrategy
 */
@JsonPropertyOrder({
  ScoringStrategy.JSON_PROPERTY_LIMIT_UPDATES_TO,
  ScoringStrategy.JSON_PROPERTY_SUM_BEST_X_OF,
  ScoringStrategy.JSON_PROPERTY_LAST_UPDATE_TIME_STAMP,
  ScoringStrategy.JSON_PROPERTY_RECORD_TIME_WHEN_SUM_REACHES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScoringStrategy {
  public static final String JSON_PROPERTY_LIMIT_UPDATES_TO = "limitUpdatesTo";
  private Integer limitUpdatesTo;

  public static final String JSON_PROPERTY_SUM_BEST_X_OF = "sumBestXOf";
  private Integer sumBestXOf;

  public static final String JSON_PROPERTY_LAST_UPDATE_TIME_STAMP = "lastUpdateTimeStamp";
  private Long lastUpdateTimeStamp;

  public static final String JSON_PROPERTY_RECORD_TIME_WHEN_SUM_REACHES = "recordTimeWhenSumReaches";
  private Double recordTimeWhenSumReaches;


  public ScoringStrategy limitUpdatesTo(Integer limitUpdatesTo) {
    this.limitUpdatesTo = limitUpdatesTo;
    return this;
  }

   /**
   * The scoring strategies types \&quot;SumBest\&quot; value
   * @return limitUpdatesTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The scoring strategies types \"SumBest\" value")
  @JsonProperty(JSON_PROPERTY_LIMIT_UPDATES_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLimitUpdatesTo() {
    return limitUpdatesTo;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_UPDATES_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimitUpdatesTo(Integer limitUpdatesTo) {
    this.limitUpdatesTo = limitUpdatesTo;
  }


  public ScoringStrategy sumBestXOf(Integer sumBestXOf) {
    this.sumBestXOf = sumBestXOf;
    return this;
  }

   /**
   * The scoring strategies types \&quot;LimitedTo\&quot; value
   * @return sumBestXOf
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The scoring strategies types \"LimitedTo\" value")
  @JsonProperty(JSON_PROPERTY_SUM_BEST_X_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSumBestXOf() {
    return sumBestXOf;
  }


  @JsonProperty(JSON_PROPERTY_SUM_BEST_X_OF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSumBestXOf(Integer sumBestXOf) {
    this.sumBestXOf = sumBestXOf;
  }


  public ScoringStrategy lastUpdateTimeStamp(Long lastUpdateTimeStamp) {
    this.lastUpdateTimeStamp = lastUpdateTimeStamp;
    return this;
  }

   /**
   * The scoring strategies types \&quot;FirstTo\&quot; value
   * @return lastUpdateTimeStamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "The scoring strategies types \"FirstTo\" value")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastUpdateTimeStamp() {
    return lastUpdateTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastUpdateTimeStamp(Long lastUpdateTimeStamp) {
    this.lastUpdateTimeStamp = lastUpdateTimeStamp;
  }


  public ScoringStrategy recordTimeWhenSumReaches(Double recordTimeWhenSumReaches) {
    this.recordTimeWhenSumReaches = recordTimeWhenSumReaches;
    return this;
  }

   /**
   * Not supported at the moment
   * @return recordTimeWhenSumReaches
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Not supported at the moment")
  @JsonProperty(JSON_PROPERTY_RECORD_TIME_WHEN_SUM_REACHES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getRecordTimeWhenSumReaches() {
    return recordTimeWhenSumReaches;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TIME_WHEN_SUM_REACHES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordTimeWhenSumReaches(Double recordTimeWhenSumReaches) {
    this.recordTimeWhenSumReaches = recordTimeWhenSumReaches;
  }


  /**
   * Return true if this ScoringStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoringStrategy scoringStrategy = (ScoringStrategy) o;
    return Objects.equals(this.limitUpdatesTo, scoringStrategy.limitUpdatesTo) &&
        Objects.equals(this.sumBestXOf, scoringStrategy.sumBestXOf) &&
        Objects.equals(this.lastUpdateTimeStamp, scoringStrategy.lastUpdateTimeStamp) &&
        Objects.equals(this.recordTimeWhenSumReaches, scoringStrategy.recordTimeWhenSumReaches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitUpdatesTo, sumBestXOf, lastUpdateTimeStamp, recordTimeWhenSumReaches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoringStrategy {\n");
    sb.append("    limitUpdatesTo: ").append(toIndentedString(limitUpdatesTo)).append("\n");
    sb.append("    sumBestXOf: ").append(toIndentedString(sumBestXOf)).append("\n");
    sb.append("    lastUpdateTimeStamp: ").append(toIndentedString(lastUpdateTimeStamp)).append("\n");
    sb.append("    recordTimeWhenSumReaches: ").append(toIndentedString(recordTimeWhenSumReaches)).append("\n");
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

