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
import com.ziqni.admin.client.model.RewardEntityType;
import com.ziqni.admin.client.model.Translation;
import com.ziqni.admin.client.model.UpdateEntityRewardRequestAllOf;
import com.ziqni.admin.client.model.UpdateModelDefault;
import com.ziqni.admin.client.model.UpdateOptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateEntityRewardRequest
 */
@JsonPropertyOrder({
  UpdateEntityRewardRequest.JSON_PROPERTY_ID,
  UpdateEntityRewardRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  UpdateEntityRewardRequest.JSON_PROPERTY_TAGS,
  UpdateEntityRewardRequest.JSON_PROPERTY_METADATA,
  UpdateEntityRewardRequest.JSON_PROPERTY_ENTITY_TYPE,
  UpdateEntityRewardRequest.JSON_PROPERTY_ENTITY_ID,
  UpdateEntityRewardRequest.JSON_PROPERTY_NAME,
  UpdateEntityRewardRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateEntityRewardRequest.JSON_PROPERTY_REWARD_RANK,
  UpdateEntityRewardRequest.JSON_PROPERTY_REWARD_VALUE,
  UpdateEntityRewardRequest.JSON_PROPERTY_ICON,
  UpdateEntityRewardRequest.JSON_PROPERTY_ISSUE_LIMIT,
  UpdateEntityRewardRequest.JSON_PROPERTY_DELAY,
  UpdateEntityRewardRequest.JSON_PROPERTY_POINT_IN_TIME,
  UpdateEntityRewardRequest.JSON_PROPERTY_PERIOD,
  UpdateEntityRewardRequest.JSON_PROPERTY_TRANSLATIONS,
  UpdateEntityRewardRequest.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateEntityRewardRequest.JSON_PROPERTY_REMOVE_CONSTRAINTS,
  UpdateEntityRewardRequest.JSON_PROPERTY_REWARD_TYPE_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateEntityRewardRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private RewardEntityType entityType;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REWARD_RANK = "rewardRank";
  private String rewardRank;

  public static final String JSON_PROPERTY_REWARD_VALUE = "rewardValue";
  private Double rewardValue;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ISSUE_LIMIT = "issueLimit";
  private Integer issueLimit;

  public static final String JSON_PROPERTY_DELAY = "delay";
  private Integer delay;

  public static final String JSON_PROPERTY_POINT_IN_TIME = "pointInTime";
  private OffsetDateTime pointInTime;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private Integer period;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private List<Translation> translations = null;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_REMOVE_CONSTRAINTS = "removeConstraints";
  private List<String> removeConstraints = null;

  public static final String JSON_PROPERTY_REWARD_TYPE_ID = "rewardTypeId";
  private String rewardTypeId;


  public UpdateEntityRewardRequest id(String id) {
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


  public UpdateEntityRewardRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UpdateEntityRewardRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to add cutom fields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of id's used to add cutom fields")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  public UpdateEntityRewardRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateEntityRewardRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to tag models
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Dc4swmQBVd51K6gPQqFx\",\"Dc4swmQBVd51K6gPQqF2\"]", value = "A list of id's used to tag models")
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


  public UpdateEntityRewardRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateEntityRewardRequest putMetadataItem(String key, String metadataItem) {
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


  public UpdateEntityRewardRequest entityType(RewardEntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RewardEntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(RewardEntityType entityType) {
    this.entityType = entityType;
  }


  public UpdateEntityRewardRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * A unique identifier of an achievement or contest. Dependant on entityType
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "A unique identifier of an achievement or contest. Dependant on entityType")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public UpdateEntityRewardRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a reward
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Welcome badge", value = "The name of a reward")
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


  public UpdateEntityRewardRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of a Reward
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A badge to welcome a new player", value = "The description of a Reward")
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


  public UpdateEntityRewardRequest rewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
    return this;
  }

   /**
   * If used in the context of contest this will associate with the rank of the leaderboard
   * @return rewardRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1,2 3 ...10", value = "If used in the context of contest this will associate with the rank of the leaderboard")
  @JsonProperty(JSON_PROPERTY_REWARD_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRewardRank() {
    return rewardRank;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
  }


  public UpdateEntityRewardRequest rewardValue(Double rewardValue) {
    this.rewardValue = rewardValue;
    return this;
  }

   /**
   * Numerical value of the reward that will be issued based on the reward type
   * @return rewardValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Numerical value of the reward that will be issued based on the reward type")
  @JsonProperty(JSON_PROPERTY_REWARD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRewardValue() {
    return rewardValue;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardValue(Double rewardValue) {
    this.rewardValue = rewardValue;
  }


  public UpdateEntityRewardRequest icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * An Icon id that has been pre uploaded to the system to display for reward
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "An Icon id that has been pre uploaded to the system to display for reward")
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }


  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(String icon) {
    this.icon = icon;
  }


  public UpdateEntityRewardRequest issueLimit(Integer issueLimit) {
    this.issueLimit = issueLimit;
    return this;
  }

   /**
   * how many of thsese rewards are
   * @return issueLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "how many of thsese rewards are")
  @JsonProperty(JSON_PROPERTY_ISSUE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIssueLimit() {
    return issueLimit;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueLimit(Integer issueLimit) {
    this.issueLimit = issueLimit;
  }


  public UpdateEntityRewardRequest delay(Integer delay) {
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


  public UpdateEntityRewardRequest pointInTime(OffsetDateTime pointInTime) {
    this.pointInTime = pointInTime;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Reward is available until a specific point in time. All records are stored in UTC time zone
   * @return pointInTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Reward is available until a specific point in time. All records are stored in UTC time zone")
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


  public UpdateEntityRewardRequest period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Reward available for a period of time from issuing in minutes
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Reward available for a period of time from issuing in minutes")
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


  public UpdateEntityRewardRequest translations(List<Translation> translations) {
    this.translations = translations;
    return this;
  }

  public UpdateEntityRewardRequest addTranslationsItem(Translation translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Translation> getTranslations() {
    return translations;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }


  public UpdateEntityRewardRequest addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateEntityRewardRequest addAddConstraintsItem(String addConstraintsItem) {
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
  @ApiModelProperty(example = "- notifyMember - isMemberAcknowledgmentRequired", value = "Additional constraints")
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


  public UpdateEntityRewardRequest removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateEntityRewardRequest addRemoveConstraintsItem(String removeConstraintsItem) {
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
  @ApiModelProperty(example = "- notifyMember - isMemberAcknowledgmentRequired", value = "Additional constraints")
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


  public UpdateEntityRewardRequest rewardTypeId(String rewardTypeId) {
    this.rewardTypeId = rewardTypeId;
    return this;
  }

   /**
   * A unique id of the Reward Type
   * @return rewardTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "A unique id of the Reward Type")
  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRewardTypeId() {
    return rewardTypeId;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardTypeId(String rewardTypeId) {
    this.rewardTypeId = rewardTypeId;
  }


  /**
   * Return true if this UpdateEntityRewardRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEntityRewardRequest updateEntityRewardRequest = (UpdateEntityRewardRequest) o;
    return Objects.equals(this.id, updateEntityRewardRequest.id) &&
        Objects.equals(this.customFields, updateEntityRewardRequest.customFields) &&
        Objects.equals(this.tags, updateEntityRewardRequest.tags) &&
        Objects.equals(this.metadata, updateEntityRewardRequest.metadata) &&
        Objects.equals(this.entityType, updateEntityRewardRequest.entityType) &&
        Objects.equals(this.entityId, updateEntityRewardRequest.entityId) &&
        Objects.equals(this.name, updateEntityRewardRequest.name) &&
        Objects.equals(this.description, updateEntityRewardRequest.description) &&
        Objects.equals(this.rewardRank, updateEntityRewardRequest.rewardRank) &&
        Objects.equals(this.rewardValue, updateEntityRewardRequest.rewardValue) &&
        Objects.equals(this.icon, updateEntityRewardRequest.icon) &&
        Objects.equals(this.issueLimit, updateEntityRewardRequest.issueLimit) &&
        Objects.equals(this.delay, updateEntityRewardRequest.delay) &&
        Objects.equals(this.pointInTime, updateEntityRewardRequest.pointInTime) &&
        Objects.equals(this.period, updateEntityRewardRequest.period) &&
        Objects.equals(this.translations, updateEntityRewardRequest.translations) &&
        Objects.equals(this.addConstraints, updateEntityRewardRequest.addConstraints) &&
        Objects.equals(this.removeConstraints, updateEntityRewardRequest.removeConstraints) &&
        Objects.equals(this.rewardTypeId, updateEntityRewardRequest.rewardTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customFields, tags, metadata, entityType, entityId, name, description, rewardRank, rewardValue, icon, issueLimit, delay, pointInTime, period, translations, addConstraints, removeConstraints, rewardTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEntityRewardRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rewardRank: ").append(toIndentedString(rewardRank)).append("\n");
    sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    issueLimit: ").append(toIndentedString(issueLimit)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    pointInTime: ").append(toIndentedString(pointInTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    removeConstraints: ").append(toIndentedString(removeConstraints)).append("\n");
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

