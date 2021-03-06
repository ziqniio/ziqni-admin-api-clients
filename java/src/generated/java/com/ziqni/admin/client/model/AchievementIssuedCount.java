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
import com.ziqni.admin.client.model.CountResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AchievementIssuedCount
 */
@JsonPropertyOrder({
  AchievementIssuedCount.JSON_PROPERTY_ENTITY_ID,
  AchievementIssuedCount.JSON_PROPERTY_COUNT_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AchievementIssuedCount {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_COUNT_VALUE = "countValue";
  private Integer countValue;


  public AchievementIssuedCount entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * A unique identifier of a Entity
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", required = true, value = "A unique identifier of a Entity")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public AchievementIssuedCount countValue(Integer countValue) {
    this.countValue = countValue;
    return this;
  }

   /**
   * The value in how many times the achievemnt was issued
   * @return countValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The value in how many times the achievemnt was issued")
  @JsonProperty(JSON_PROPERTY_COUNT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCountValue() {
    return countValue;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountValue(Integer countValue) {
    this.countValue = countValue;
  }


  /**
   * Return true if this AchievementIssuedCount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchievementIssuedCount achievementIssuedCount = (AchievementIssuedCount) o;
    return Objects.equals(this.entityId, achievementIssuedCount.entityId) &&
        Objects.equals(this.countValue, achievementIssuedCount.countValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, countValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementIssuedCount {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    countValue: ").append(toIndentedString(countValue)).append("\n");
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

