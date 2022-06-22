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
import com.ziqni.admin.client.model.EntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MemberAwardAllOf
 */
@JsonPropertyOrder({
  MemberAwardAllOf.JSON_PROPERTY_REWARD_ID,
  MemberAwardAllOf.JSON_PROPERTY_REWARD_TYPE,
  MemberAwardAllOf.JSON_PROPERTY_REWARD_TYPE_ID,
  MemberAwardAllOf.JSON_PROPERTY_REWARD_VALUE,
  MemberAwardAllOf.JSON_PROPERTY_DELAY,
  MemberAwardAllOf.JSON_PROPERTY_ENTITY_TYPE,
  MemberAwardAllOf.JSON_PROPERTY_ENTITY_ID,
  MemberAwardAllOf.JSON_PROPERTY_POINT_IN_TIME,
  MemberAwardAllOf.JSON_PROPERTY_PERIOD,
  MemberAwardAllOf.JSON_PROPERTY_TAGS,
  MemberAwardAllOf.JSON_PROPERTY_METADATA,
  MemberAwardAllOf.JSON_PROPERTY_CONSTRAINTS,
  MemberAwardAllOf.JSON_PROPERTY_CLAIMED_TIMESTAMP
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberAwardAllOf {
  public static final String JSON_PROPERTY_REWARD_ID = "rewardId";
  private String rewardId;

  public static final String JSON_PROPERTY_REWARD_TYPE = "rewardType";
  private String rewardType;

  public static final String JSON_PROPERTY_REWARD_TYPE_ID = "rewardTypeId";
  private String rewardTypeId;

  public static final String JSON_PROPERTY_REWARD_VALUE = "rewardValue";
  private Double rewardValue;

  public static final String JSON_PROPERTY_DELAY = "delay";
  private Integer delay;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_POINT_IN_TIME = "pointInTime";
  private OffsetDateTime pointInTime;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private Integer period;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();

  public static final String JSON_PROPERTY_CLAIMED_TIMESTAMP = "claimedTimestamp";
  private OffsetDateTime claimedTimestamp;


  public MemberAwardAllOf rewardId(String rewardId) {
    this.rewardId = rewardId;
    return this;
  }

   /**
   * A unique identifier of a Reward
   * @return rewardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", required = true, value = "A unique identifier of a Reward")
  @JsonProperty(JSON_PROPERTY_REWARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardId() {
    return rewardId;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardId(String rewardId) {
    this.rewardId = rewardId;
  }


  public MemberAwardAllOf rewardType(String rewardType) {
    this.rewardType = rewardType;
    return this;
  }

   /**
   * The type of the Reward
   * @return rewardType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Free-spins", required = true, value = "The type of the Reward")
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


  public MemberAwardAllOf rewardTypeId(String rewardTypeId) {
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


  public MemberAwardAllOf rewardValue(Double rewardValue) {
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


  public MemberAwardAllOf delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * Delay of issuing a reward in minutes
   * @return delay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Delay of issuing a reward in minutes")
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDelay() {
    return delay;
  }


  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelay(Integer delay) {
    this.delay = delay;
  }


  public MemberAwardAllOf entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public MemberAwardAllOf entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The Id of the contest or achievement related to this Award. Dependant on entityType
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", required = true, value = "The Id of the contest or achievement related to this Award. Dependant on entityType")
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


  public MemberAwardAllOf pointInTime(OffsetDateTime pointInTime) {
    this.pointInTime = pointInTime;
    return this;
  }

   /**
   * ISO8601 timestamp for when an Award is available until a specific point in time. All records are stored in UTC time zone. * There can only be one time definition used for claim period either \&quot;pointInTime\&quot; or \&quot;period\&quot;
   * @return pointInTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when an Award is available until a specific point in time. All records are stored in UTC time zone. * There can only be one time definition used for claim period either \"pointInTime\" or \"period\"")
  @JsonProperty(JSON_PROPERTY_POINT_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPointInTime() {
    return pointInTime;
  }


  @JsonProperty(JSON_PROPERTY_POINT_IN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointInTime(OffsetDateTime pointInTime) {
    this.pointInTime = pointInTime;
  }


  public MemberAwardAllOf period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Claimable duration in minutes, this value will set the controls until when the award is claimable. * There can only be one time definition used for claim period either \&quot;pointInTime\&quot; or \&quot;period\&quot;
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Claimable duration in minutes, this value will set the controls until when the award is claimable. * There can only be one time definition used for claim period either \"pointInTime\" or \"period\"")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(Integer period) {
    this.period = period;
  }


  public MemberAwardAllOf tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MemberAwardAllOf addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of Strings of groups that the reward belongs to.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Strings of groups that the reward belongs to.")
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


  public MemberAwardAllOf metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public MemberAwardAllOf putMetadataItem(String key, String metadataItem) {
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


  public MemberAwardAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public MemberAwardAllOf addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- memberAcknowledgmentRequired - claimed", required = true, value = "Additional constraints")
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


  public MemberAwardAllOf claimedTimestamp(OffsetDateTime claimedTimestamp) {
    this.claimedTimestamp = claimedTimestamp;
    return this;
  }

   /**
   * ISO8601 timestamp for when an Award is claimed. All records are stored in UTC time zone. *
   * @return claimedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when an Award is claimed. All records are stored in UTC time zone. *")
  @JsonProperty(JSON_PROPERTY_CLAIMED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getClaimedTimestamp() {
    return claimedTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_CLAIMED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClaimedTimestamp(OffsetDateTime claimedTimestamp) {
    this.claimedTimestamp = claimedTimestamp;
  }


  /**
   * Return true if this MemberAward_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberAwardAllOf memberAwardAllOf = (MemberAwardAllOf) o;
    return Objects.equals(this.rewardId, memberAwardAllOf.rewardId) &&
        Objects.equals(this.rewardType, memberAwardAllOf.rewardType) &&
        Objects.equals(this.rewardTypeId, memberAwardAllOf.rewardTypeId) &&
        Objects.equals(this.rewardValue, memberAwardAllOf.rewardValue) &&
        Objects.equals(this.delay, memberAwardAllOf.delay) &&
        Objects.equals(this.entityType, memberAwardAllOf.entityType) &&
        Objects.equals(this.entityId, memberAwardAllOf.entityId) &&
        Objects.equals(this.pointInTime, memberAwardAllOf.pointInTime) &&
        Objects.equals(this.period, memberAwardAllOf.period) &&
        Objects.equals(this.tags, memberAwardAllOf.tags) &&
        Objects.equals(this.metadata, memberAwardAllOf.metadata) &&
        Objects.equals(this.constraints, memberAwardAllOf.constraints) &&
        Objects.equals(this.claimedTimestamp, memberAwardAllOf.claimedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardId, rewardType, rewardTypeId, rewardValue, delay, entityType, entityId, pointInTime, period, tags, metadata, constraints, claimedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberAwardAllOf {\n");
    sb.append("    rewardId: ").append(toIndentedString(rewardId)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
    sb.append("    rewardTypeId: ").append(toIndentedString(rewardTypeId)).append("\n");
    sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    pointInTime: ").append(toIndentedString(pointInTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    claimedTimestamp: ").append(toIndentedString(claimedTimestamp)).append("\n");
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
