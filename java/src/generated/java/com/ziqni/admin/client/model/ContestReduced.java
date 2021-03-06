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
import com.ziqni.admin.client.model.ContestReducedAllOf;
import com.ziqni.admin.client.model.ContestStatus;
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.RewardReduced;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContestReduced
 */
@JsonPropertyOrder({
  ContestReduced.JSON_PROPERTY_ID,
  ContestReduced.JSON_PROPERTY_SPACE_NAME,
  ContestReduced.JSON_PROPERTY_CREATED,
  ContestReduced.JSON_PROPERTY_COMPETITION_ID,
  ContestReduced.JSON_PROPERTY_ROW,
  ContestReduced.JSON_PROPERTY_NAME,
  ContestReduced.JSON_PROPERTY_ROUND,
  ContestReduced.JSON_PROPERTY_GROUP_STAGE,
  ContestReduced.JSON_PROPERTY_ENTRANTS_FROM_CONTEST,
  ContestReduced.JSON_PROPERTY_STATUS,
  ContestReduced.JSON_PROPERTY_STATUS_CODE,
  ContestReduced.JSON_PROPERTY_SCHEDULED_START_DATE,
  ContestReduced.JSON_PROPERTY_SCHEDULED_END_DATE,
  ContestReduced.JSON_PROPERTY_ACTUAL_START_DATE,
  ContestReduced.JSON_PROPERTY_ACTUAL_END_DATE,
  ContestReduced.JSON_PROPERTY_TAGS,
  ContestReduced.JSON_PROPERTY_REWARDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContestReduced {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_COMPETITION_ID = "competitionId";
  private String competitionId;

  public static final String JSON_PROPERTY_ROW = "row";
  private Integer row;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Integer round;

  public static final String JSON_PROPERTY_GROUP_STAGE = "groupStage";
  private Integer groupStage;

  public static final String JSON_PROPERTY_ENTRANTS_FROM_CONTEST = "entrantsFromContest";
  private List<String> entrantsFromContest = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private ContestStatus status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_SCHEDULED_START_DATE = "scheduledStartDate";
  private OffsetDateTime scheduledStartDate;

  public static final String JSON_PROPERTY_SCHEDULED_END_DATE = "scheduledEndDate";
  private OffsetDateTime scheduledEndDate;

  public static final String JSON_PROPERTY_ACTUAL_START_DATE = "actualStartDate";
  private OffsetDateTime actualStartDate;

  public static final String JSON_PROPERTY_ACTUAL_END_DATE = "actualEndDate";
  private OffsetDateTime actualEndDate;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_REWARDS = "rewards";
  private List<RewardReduced> rewards = null;


  public ContestReduced id(String id) {
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


  public ContestReduced spaceName(String spaceName) {
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


  public ContestReduced created(OffsetDateTime created) {
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


  public ContestReduced competitionId(String competitionId) {
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


  public ContestReduced row(Integer row) {
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


  public ContestReduced name(String name) {
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


  public ContestReduced round(Integer round) {
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


  public ContestReduced groupStage(Integer groupStage) {
    this.groupStage = groupStage;
    return this;
  }

   /**
   * Is used for more complex Competitions e.g. multi round competitions where round 1 group stage matched round 2
   * @return groupStage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Is used for more complex Competitions e.g. multi round competitions where round 1 group stage matched round 2")
  @JsonProperty(JSON_PROPERTY_GROUP_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getGroupStage() {
    return groupStage;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupStage(Integer groupStage) {
    this.groupStage = groupStage;
  }


  public ContestReduced entrantsFromContest(List<String> entrantsFromContest) {
    this.entrantsFromContest = entrantsFromContest;
    return this;
  }

  public ContestReduced addEntrantsFromContestItem(String entrantsFromContestItem) {
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


  public ContestReduced status(ContestStatus status) {
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




  public ContestReduced scheduledStartDate(OffsetDateTime scheduledStartDate) {
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


  public ContestReduced scheduledEndDate(OffsetDateTime scheduledEndDate) {
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
   * ISO8601 timestamp for when a Contest started. All records are stored in UTC time zone
   * @return actualStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Contest started. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_ACTUAL_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActualStartDate() {
    return actualStartDate;
  }




   /**
   * ISO8601 timestamp for when a Contest ended. All records are stored in UTC time zone
   * @return actualEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Contest ended. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_ACTUAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActualEndDate() {
    return actualEndDate;
  }




  public ContestReduced tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ContestReduced addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to tag
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- Dc4swmQBVd51K6gPQqFx - Dc4swmQBVd51K6gPQqF2", value = "A list of id's used to tag")
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


  public ContestReduced rewards(List<RewardReduced> rewards) {
    this.rewards = rewards;
    return this;
  }

  public ContestReduced addRewardsItem(RewardReduced rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new ArrayList<>();
    }
    this.rewards.add(rewardsItem);
    return this;
  }

   /**
   * Get rewards
   * @return rewards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RewardReduced> getRewards() {
    return rewards;
  }


  @JsonProperty(JSON_PROPERTY_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewards(List<RewardReduced> rewards) {
    this.rewards = rewards;
  }


  /**
   * Return true if this ContestReduced object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestReduced contestReduced = (ContestReduced) o;
    return Objects.equals(this.id, contestReduced.id) &&
        Objects.equals(this.spaceName, contestReduced.spaceName) &&
        Objects.equals(this.created, contestReduced.created) &&
        Objects.equals(this.competitionId, contestReduced.competitionId) &&
        Objects.equals(this.row, contestReduced.row) &&
        Objects.equals(this.name, contestReduced.name) &&
        Objects.equals(this.round, contestReduced.round) &&
        Objects.equals(this.groupStage, contestReduced.groupStage) &&
        Objects.equals(this.entrantsFromContest, contestReduced.entrantsFromContest) &&
        Objects.equals(this.status, contestReduced.status) &&
        Objects.equals(this.statusCode, contestReduced.statusCode) &&
        Objects.equals(this.scheduledStartDate, contestReduced.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, contestReduced.scheduledEndDate) &&
        Objects.equals(this.actualStartDate, contestReduced.actualStartDate) &&
        Objects.equals(this.actualEndDate, contestReduced.actualEndDate) &&
        Objects.equals(this.tags, contestReduced.tags) &&
        Objects.equals(this.rewards, contestReduced.rewards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, competitionId, row, name, round, groupStage, entrantsFromContest, status, statusCode, scheduledStartDate, scheduledEndDate, actualStartDate, actualEndDate, tags, rewards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestReduced {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    groupStage: ").append(toIndentedString(groupStage)).append("\n");
    sb.append("    entrantsFromContest: ").append(toIndentedString(entrantsFromContest)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    scheduledStartDate: ").append(toIndentedString(scheduledStartDate)).append("\n");
    sb.append("    scheduledEndDate: ").append(toIndentedString(scheduledEndDate)).append("\n");
    sb.append("    actualStartDate: ").append(toIndentedString(actualStartDate)).append("\n");
    sb.append("    actualEndDate: ").append(toIndentedString(actualEndDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
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

