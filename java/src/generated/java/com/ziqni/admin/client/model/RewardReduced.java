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
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.RewardReducedAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RewardReduced
 */
@JsonPropertyOrder({
  RewardReduced.JSON_PROPERTY_ID,
  RewardReduced.JSON_PROPERTY_SPACE_NAME,
  RewardReduced.JSON_PROPERTY_CREATED,
  RewardReduced.JSON_PROPERTY_REWARD_RANK,
  RewardReduced.JSON_PROPERTY_NAME,
  RewardReduced.JSON_PROPERTY_REWARD_VALUE,
  RewardReduced.JSON_PROPERTY_REWARD_TYPE,
  RewardReduced.JSON_PROPERTY_REWARD_TYPE_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RewardReduced {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_REWARD_RANK = "rewardRank";
  private String rewardRank;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REWARD_VALUE = "rewardValue";
  private Double rewardValue;

  public static final String JSON_PROPERTY_REWARD_TYPE = "rewardType";
  private String rewardType;

  public static final String JSON_PROPERTY_REWARD_TYPE_ID = "rewardTypeId";
  private String rewardTypeId;


  public RewardReduced id(String id) {
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


  public RewardReduced spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * This is the space name which is linked to the account
   * @return spaceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Your_space_name", required = true, value = "This is the space name which is linked to the account")
  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpaceName() {
    return spaceName;
  }


  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }


  public RewardReduced created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public RewardReduced rewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
    return this;
  }

   /**
   * If used in the context of contest this will associate with the rank of the leaderboard
   * @return rewardRank
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "If used in the context of contest this will associate with the rank of the leaderboard")
  @JsonProperty(JSON_PROPERTY_REWARD_RANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardRank() {
    return rewardRank;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_RANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
  }


  public RewardReduced name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a reward
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Welcome badge", required = true, value = "The name of a reward")
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


  public RewardReduced rewardValue(Double rewardValue) {
    this.rewardValue = rewardValue;
    return this;
  }

   /**
   * Numerical value of the reward that will be issued based on the reward type
   * @return rewardValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Numerical value of the reward that will be issued based on the reward type")
  @JsonProperty(JSON_PROPERTY_REWARD_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getRewardValue() {
    return rewardValue;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardValue(Double rewardValue) {
    this.rewardValue = rewardValue;
  }


  public RewardReduced rewardType(String rewardType) {
    this.rewardType = rewardType;
    return this;
  }

   /**
   * Reward Type key
   * @return rewardType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "free-spins", required = true, value = "Reward Type key")
  @JsonProperty(JSON_PROPERTY_REWARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardType() {
    return rewardType;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardType(String rewardType) {
    this.rewardType = rewardType;
  }


  public RewardReduced rewardTypeId(String rewardTypeId) {
    this.rewardTypeId = rewardTypeId;
    return this;
  }

   /**
   * A unique id of the Reward Type
   * @return rewardTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", required = true, value = "A unique id of the Reward Type")
  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardTypeId() {
    return rewardTypeId;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardTypeId(String rewardTypeId) {
    this.rewardTypeId = rewardTypeId;
  }


  /**
   * Return true if this RewardReduced object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardReduced rewardReduced = (RewardReduced) o;
    return Objects.equals(this.id, rewardReduced.id) &&
        Objects.equals(this.spaceName, rewardReduced.spaceName) &&
        Objects.equals(this.created, rewardReduced.created) &&
        Objects.equals(this.rewardRank, rewardReduced.rewardRank) &&
        Objects.equals(this.name, rewardReduced.name) &&
        Objects.equals(this.rewardValue, rewardReduced.rewardValue) &&
        Objects.equals(this.rewardType, rewardReduced.rewardType) &&
        Objects.equals(this.rewardTypeId, rewardReduced.rewardTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, rewardRank, name, rewardValue, rewardType, rewardTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardReduced {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    rewardRank: ").append(toIndentedString(rewardRank)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
    sb.append("    rewardTypeId: ").append(toIndentedString(rewardTypeId)).append("\n");
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

