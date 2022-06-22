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
import com.ziqni.admin.client.model.ContestAllOf;
import com.ziqni.admin.client.model.ContestStatus;
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.OptParamModels;
import com.ziqni.admin.client.model.RoundType;
import com.ziqni.admin.client.model.Strategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contest
 */
@JsonPropertyOrder({
  Contest.JSON_PROPERTY_ID,
  Contest.JSON_PROPERTY_SPACE_NAME,
  Contest.JSON_PROPERTY_CREATED,
  Contest.JSON_PROPERTY_CUSTOM_FIELDS,
  Contest.JSON_PROPERTY_TAGS,
  Contest.JSON_PROPERTY_METADATA,
  Contest.JSON_PROPERTY_COMPETITION_ID,
  Contest.JSON_PROPERTY_ROW,
  Contest.JSON_PROPERTY_NAME,
  Contest.JSON_PROPERTY_DESCRIPTION,
  Contest.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  Contest.JSON_PROPERTY_ROUND,
  Contest.JSON_PROPERTY_ROUND_TYPE,
  Contest.JSON_PROPERTY_GROUP_STAGE,
  Contest.JSON_PROPERTY_GROUP_STAGE_LABEL,
  Contest.JSON_PROPERTY_ENTRANTS_FROM_CONTEST,
  Contest.JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS,
  Contest.JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS,
  Contest.JSON_PROPERTY_SCHEDULED_START_DATE,
  Contest.JSON_PROPERTY_SCHEDULED_END_DATE,
  Contest.JSON_PROPERTY_ACTUAL_START_DATE,
  Contest.JSON_PROPERTY_ACTUAL_END_DATE,
  Contest.JSON_PROPERTY_STRATEGIES,
  Contest.JSON_PROPERTY_STATUS,
  Contest.JSON_PROPERTY_STATUS_CODE,
  Contest.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Contest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_COMPETITION_ID = "competitionId";
  private String competitionId;

  public static final String JSON_PROPERTY_ROW = "row";
  private Integer row;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TERMS_AND_CONDITIONS = "termsAndConditions";
  private String termsAndConditions;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Integer round;

  public static final String JSON_PROPERTY_ROUND_TYPE = "roundType";
  private RoundType roundType;

  public static final String JSON_PROPERTY_GROUP_STAGE = "groupStage";
  private Integer groupStage;

  public static final String JSON_PROPERTY_GROUP_STAGE_LABEL = "groupStageLabel";
  private String groupStageLabel;

  public static final String JSON_PROPERTY_ENTRANTS_FROM_CONTEST = "entrantsFromContest";
  private List<String> entrantsFromContest = new ArrayList<>();

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS = "maxNumberOfEntrants";
  private Integer maxNumberOfEntrants;

  public static final String JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS = "minNumberOfEntrants";
  private Integer minNumberOfEntrants;

  public static final String JSON_PROPERTY_SCHEDULED_START_DATE = "scheduledStartDate";
  private OffsetDateTime scheduledStartDate;

  public static final String JSON_PROPERTY_SCHEDULED_END_DATE = "scheduledEndDate";
  private OffsetDateTime scheduledEndDate;

  public static final String JSON_PROPERTY_ACTUAL_START_DATE = "actualStartDate";
  private OffsetDateTime actualStartDate;

  public static final String JSON_PROPERTY_ACTUAL_END_DATE = "actualEndDate";
  private OffsetDateTime actualEndDate;

  public static final String JSON_PROPERTY_STRATEGIES = "strategies";
  private Strategy strategies;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ContestStatus status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();


  public Contest id(String id) {
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


  public Contest spaceName(String spaceName) {
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


  public Contest created(OffsetDateTime created) {
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


  public Contest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Contest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Contest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Contest addTagsItem(String tagsItem) {
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
  @ApiModelProperty(value = "A list of id's used to tag models")
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


  public Contest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Contest putMetadataItem(String key, String metadataItem) {
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


  public Contest competitionId(String competitionId) {
    this.competitionId = competitionId;
    return this;
  }

   /**
   * A unique identifier of a Competition
   * @return competitionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", required = true, value = "A unique identifier of a Competition")
  @JsonProperty(JSON_PROPERTY_COMPETITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompetitionId() {
    return competitionId;
  }


  @JsonProperty(JSON_PROPERTY_COMPETITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompetitionId(String competitionId) {
    this.competitionId = competitionId;
  }


  public Contest row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * The row number for displaying the Contest in a table
   * @return row
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The row number for displaying the Contest in a table")
  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRow() {
    return row;
  }


  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRow(Integer row) {
    this.row = row;
  }


  public Contest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name for the Contest. Can be translated
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Fish and Chips", required = true, value = "A name for the Contest. Can be translated")
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


  public Contest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the contest
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fish and Chips contest", value = "Description of the contest")
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


  public Contest termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Terms and conditions for participating in the Contest. Can be translated
   * @return termsAndConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Buy 1 get 1 free", value = "Terms and conditions for participating in the Contest. Can be translated")
  @JsonProperty(JSON_PROPERTY_TERMS_AND_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsAndConditions() {
    return termsAndConditions;
  }


  @JsonProperty(JSON_PROPERTY_TERMS_AND_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  public Contest round(Integer round) {
    this.round = round;
    return this;
  }

   /**
   * To what round does the contest belong
   * @return round
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "To what round does the contest belong")
  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRound() {
    return round;
  }


  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRound(Integer round) {
    this.round = round;
  }


  public Contest roundType(RoundType roundType) {
    this.roundType = roundType;
    return this;
  }

   /**
   * Get roundType
   * @return roundType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoundType getRoundType() {
    return roundType;
  }


  @JsonProperty(JSON_PROPERTY_ROUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoundType(RoundType roundType) {
    this.roundType = roundType;
  }


  public Contest groupStage(Integer groupStage) {
    this.groupStage = groupStage;
    return this;
  }

   /**
   * Is used for more complex Competitions e.g. multi round competitions where round 1 group stage matched round 2
   * @return groupStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Is used for more complex Competitions e.g. multi round competitions where round 1 group stage matched round 2")
  @JsonProperty(JSON_PROPERTY_GROUP_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupStage() {
    return groupStage;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupStage(Integer groupStage) {
    this.groupStage = groupStage;
  }


  public Contest groupStageLabel(String groupStageLabel) {
    this.groupStageLabel = groupStageLabel;
    return this;
  }

   /**
   * The name of the group stages
   * @return groupStageLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Semi-finals", value = "The name of the group stages")
  @JsonProperty(JSON_PROPERTY_GROUP_STAGE_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupStageLabel() {
    return groupStageLabel;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_STAGE_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupStageLabel(String groupStageLabel) {
    this.groupStageLabel = groupStageLabel;
  }


  public Contest entrantsFromContest(List<String> entrantsFromContest) {
    this.entrantsFromContest = entrantsFromContest;
    return this;
  }

  public Contest addEntrantsFromContestItem(String entrantsFromContestItem) {
    this.entrantsFromContest.add(entrantsFromContestItem);
    return this;
  }

   /**
   * A list of Ziqni contest identifiers to allow contests chaining. When a Progression competition is active and you have a 2 round competition the first round has to reference the second round then this parameter becomes mandatory instead of Optional.
   * @return entrantsFromContest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- Dc4swmQBVd51K6gPQqFx - sc3jsrfLewVdt6KugPqFx", required = true, value = "A list of Ziqni contest identifiers to allow contests chaining. When a Progression competition is active and you have a 2 round competition the first round has to reference the second round then this parameter becomes mandatory instead of Optional.")
  @JsonProperty(JSON_PROPERTY_ENTRANTS_FROM_CONTEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getEntrantsFromContest() {
    return entrantsFromContest;
  }


  @JsonProperty(JSON_PROPERTY_ENTRANTS_FROM_CONTEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntrantsFromContest(List<String> entrantsFromContest) {
    this.entrantsFromContest = entrantsFromContest;
  }


  public Contest maxNumberOfEntrants(Integer maxNumberOfEntrants) {
    this.maxNumberOfEntrants = maxNumberOfEntrants;
    return this;
  }

   /**
   * Maximum number of entrants for the contest
   * @return maxNumberOfEntrants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999", value = "Maximum number of entrants for the contest")
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNumberOfEntrants() {
    return maxNumberOfEntrants;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxNumberOfEntrants(Integer maxNumberOfEntrants) {
    this.maxNumberOfEntrants = maxNumberOfEntrants;
  }


  public Contest minNumberOfEntrants(Integer minNumberOfEntrants) {
    this.minNumberOfEntrants = minNumberOfEntrants;
    return this;
  }

   /**
   * Minimum number of entrants for the contest
   * @return minNumberOfEntrants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Minimum number of entrants for the contest")
  @JsonProperty(JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMinNumberOfEntrants() {
    return minNumberOfEntrants;
  }


  @JsonProperty(JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinNumberOfEntrants(Integer minNumberOfEntrants) {
    this.minNumberOfEntrants = minNumberOfEntrants;
  }


  public Contest scheduledStartDate(OffsetDateTime scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Contest should start. All records are stored in UTC time zone
   * @return scheduledStartDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Contest should start. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getScheduledStartDate() {
    return scheduledStartDate;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduledStartDate(OffsetDateTime scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
  }


  public Contest scheduledEndDate(OffsetDateTime scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Contest should end. All records are stored in UTC time zone
   * @return scheduledEndDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Contest should end. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getScheduledEndDate() {
    return scheduledEndDate;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduledEndDate(OffsetDateTime scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
  }


   /**
   * ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone
   * @return actualStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Competition started. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_ACTUAL_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActualStartDate() {
    return actualStartDate;
  }




   /**
   * ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone
   * @return actualEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Competition ended. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_ACTUAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActualEndDate() {
    return actualEndDate;
  }




  public Contest strategies(Strategy strategies) {
    this.strategies = strategies;
    return this;
  }

   /**
   * Get strategies
   * @return strategies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Strategy getStrategies() {
    return strategies;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategies(Strategy strategies) {
    this.strategies = strategies;
  }


  public Contest status(ContestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContestStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ContestStatus status) {
    this.status = status;
  }


   /**
   * The code of the contest
   * @return statusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "The code of the contest")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStatusCode() {
    return statusCode;
  }




  public Contest constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Contest addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- isPublic - autoStart - auto Stop - memberAcknowledgmentRequired", required = true, value = "Additional constraints")
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


  /**
   * Return true if this Contest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contest contest = (Contest) o;
    return Objects.equals(this.id, contest.id) &&
        Objects.equals(this.spaceName, contest.spaceName) &&
        Objects.equals(this.created, contest.created) &&
        Objects.equals(this.customFields, contest.customFields) &&
        Objects.equals(this.tags, contest.tags) &&
        Objects.equals(this.metadata, contest.metadata) &&
        Objects.equals(this.competitionId, contest.competitionId) &&
        Objects.equals(this.row, contest.row) &&
        Objects.equals(this.name, contest.name) &&
        Objects.equals(this.description, contest.description) &&
        Objects.equals(this.termsAndConditions, contest.termsAndConditions) &&
        Objects.equals(this.round, contest.round) &&
        Objects.equals(this.roundType, contest.roundType) &&
        Objects.equals(this.groupStage, contest.groupStage) &&
        Objects.equals(this.groupStageLabel, contest.groupStageLabel) &&
        Objects.equals(this.entrantsFromContest, contest.entrantsFromContest) &&
        Objects.equals(this.maxNumberOfEntrants, contest.maxNumberOfEntrants) &&
        Objects.equals(this.minNumberOfEntrants, contest.minNumberOfEntrants) &&
        Objects.equals(this.scheduledStartDate, contest.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, contest.scheduledEndDate) &&
        Objects.equals(this.actualStartDate, contest.actualStartDate) &&
        Objects.equals(this.actualEndDate, contest.actualEndDate) &&
        Objects.equals(this.strategies, contest.strategies) &&
        Objects.equals(this.status, contest.status) &&
        Objects.equals(this.statusCode, contest.statusCode) &&
        Objects.equals(this.constraints, contest.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, customFields, tags, metadata, competitionId, row, name, description, termsAndConditions, round, roundType, groupStage, groupStageLabel, entrantsFromContest, maxNumberOfEntrants, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, actualStartDate, actualEndDate, strategies, status, statusCode, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    roundType: ").append(toIndentedString(roundType)).append("\n");
    sb.append("    groupStage: ").append(toIndentedString(groupStage)).append("\n");
    sb.append("    groupStageLabel: ").append(toIndentedString(groupStageLabel)).append("\n");
    sb.append("    entrantsFromContest: ").append(toIndentedString(entrantsFromContest)).append("\n");
    sb.append("    maxNumberOfEntrants: ").append(toIndentedString(maxNumberOfEntrants)).append("\n");
    sb.append("    minNumberOfEntrants: ").append(toIndentedString(minNumberOfEntrants)).append("\n");
    sb.append("    scheduledStartDate: ").append(toIndentedString(scheduledStartDate)).append("\n");
    sb.append("    scheduledEndDate: ").append(toIndentedString(scheduledEndDate)).append("\n");
    sb.append("    actualStartDate: ").append(toIndentedString(actualStartDate)).append("\n");
    sb.append("    actualEndDate: ").append(toIndentedString(actualEndDate)).append("\n");
    sb.append("    strategies: ").append(toIndentedString(strategies)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
