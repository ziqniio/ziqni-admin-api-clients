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
import com.ziqni.admin.client.model.CreateOptParamModels;
import com.ziqni.admin.client.model.CreateRewardRequestAllOf;
import com.ziqni.admin.client.model.Translation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateRewardRequest
 */
@JsonPropertyOrder({
  CreateRewardRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  CreateRewardRequest.JSON_PROPERTY_TAGS,
  CreateRewardRequest.JSON_PROPERTY_METADATA,
  CreateRewardRequest.JSON_PROPERTY_NAME,
  CreateRewardRequest.JSON_PROPERTY_DESCRIPTION,
  CreateRewardRequest.JSON_PROPERTY_REWARD_RANK,
  CreateRewardRequest.JSON_PROPERTY_REWARD_VALUE,
  CreateRewardRequest.JSON_PROPERTY_ICON,
  CreateRewardRequest.JSON_PROPERTY_ISSUE_LIMIT,
  CreateRewardRequest.JSON_PROPERTY_DELAY,
  CreateRewardRequest.JSON_PROPERTY_POINT_IN_TIME,
  CreateRewardRequest.JSON_PROPERTY_PERIOD,
  CreateRewardRequest.JSON_PROPERTY_TRANSLATIONS,
  CreateRewardRequest.JSON_PROPERTY_ADD_CONSTRAINTS,
  CreateRewardRequest.JSON_PROPERTY_REWARD_TYPE_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRewardRequest {
  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

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

  public static final String JSON_PROPERTY_REWARD_TYPE_ID = "rewardTypeId";
  private String rewardTypeId;


  public CreateRewardRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CreateRewardRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A list of custom field entries
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of custom field entries")
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


  public CreateRewardRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateRewardRequest addTagsItem(String tagsItem) {
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


  public CreateRewardRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateRewardRequest putMetadataItem(String key, String metadataItem) {
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


  public CreateRewardRequest name(String name) {
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


  public CreateRewardRequest description(String description) {
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


  public CreateRewardRequest rewardRank(String rewardRank) {
    this.rewardRank = rewardRank;
    return this;
  }

   /**
   * If used in the context of contest this will associate with the rank of the leaderboard
   * @return rewardRank
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1,2 3 ...10", required = true, value = "If used in the context of contest this will associate with the rank of the leaderboard")
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


  public CreateRewardRequest rewardValue(Double rewardValue) {
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


  public CreateRewardRequest icon(String icon) {
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


  public CreateRewardRequest issueLimit(Integer issueLimit) {
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


  public CreateRewardRequest delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * Delay of issuing a reward in minutes
   * @return delay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Delay of issuing a reward in minutes")
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDelay() {
    return delay;
  }


  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelay(Integer delay) {
    this.delay = delay;
  }


  public CreateRewardRequest pointInTime(OffsetDateTime pointInTime) {
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


  public CreateRewardRequest period(Integer period) {
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


  public CreateRewardRequest translations(List<Translation> translations) {
    this.translations = translations;
    return this;
  }

  public CreateRewardRequest addTranslationsItem(Translation translationsItem) {
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


  public CreateRewardRequest addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateRewardRequest addAddConstraintsItem(String addConstraintsItem) {
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
  @ApiModelProperty(example = "- memberAcknowledgmentRequired", value = "Additional constraints")
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


  public CreateRewardRequest rewardTypeId(String rewardTypeId) {
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
   * Return true if this CreateRewardRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRewardRequest createRewardRequest = (CreateRewardRequest) o;
    return Objects.equals(this.customFields, createRewardRequest.customFields) &&
        Objects.equals(this.tags, createRewardRequest.tags) &&
        Objects.equals(this.metadata, createRewardRequest.metadata) &&
        Objects.equals(this.name, createRewardRequest.name) &&
        Objects.equals(this.description, createRewardRequest.description) &&
        Objects.equals(this.rewardRank, createRewardRequest.rewardRank) &&
        Objects.equals(this.rewardValue, createRewardRequest.rewardValue) &&
        Objects.equals(this.icon, createRewardRequest.icon) &&
        Objects.equals(this.issueLimit, createRewardRequest.issueLimit) &&
        Objects.equals(this.delay, createRewardRequest.delay) &&
        Objects.equals(this.pointInTime, createRewardRequest.pointInTime) &&
        Objects.equals(this.period, createRewardRequest.period) &&
        Objects.equals(this.translations, createRewardRequest.translations) &&
        Objects.equals(this.addConstraints, createRewardRequest.addConstraints) &&
        Objects.equals(this.rewardTypeId, createRewardRequest.rewardTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, tags, metadata, name, description, rewardRank, rewardValue, icon, issueLimit, delay, pointInTime, period, translations, addConstraints, rewardTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRewardRequest {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
