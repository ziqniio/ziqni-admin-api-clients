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
import com.ziqni.admin.client.model.CompetitionStatus;
import com.ziqni.admin.client.model.CompetitionType;
import com.ziqni.admin.client.model.Dependancy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CompetitionReducedAllOf
 */
@JsonPropertyOrder({
  CompetitionReducedAllOf.JSON_PROPERTY_COMPETITION_TYPE,
  CompetitionReducedAllOf.JSON_PROPERTY_NUMBER_OF_ROUNDS,
  CompetitionReducedAllOf.JSON_PROPERTY_NAME,
  CompetitionReducedAllOf.JSON_PROPERTY_STATUS,
  CompetitionReducedAllOf.JSON_PROPERTY_STATUS_CODE,
  CompetitionReducedAllOf.JSON_PROPERTY_DEPENDANT_ON,
  CompetitionReducedAllOf.JSON_PROPERTY_ENTRANT_MEMBER_TYPE,
  CompetitionReducedAllOf.JSON_PROPERTY_SCHEDULED_START_DATE,
  CompetitionReducedAllOf.JSON_PROPERTY_SCHEDULED_END_DATE,
  CompetitionReducedAllOf.JSON_PROPERTY_ACTUAL_START_DATE,
  CompetitionReducedAllOf.JSON_PROPERTY_ACTUAL_END_DATE,
  CompetitionReducedAllOf.JSON_PROPERTY_TAGS,
  CompetitionReducedAllOf.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompetitionReducedAllOf {
  public static final String JSON_PROPERTY_COMPETITION_TYPE = "competitionType";
  private CompetitionType competitionType;

  public static final String JSON_PROPERTY_NUMBER_OF_ROUNDS = "numberOfRounds";
  private Integer numberOfRounds;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CompetitionStatus status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_DEPENDANT_ON = "dependantOn";
  private List<Dependancy> dependantOn = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTRANT_MEMBER_TYPE = "entrantMemberType";
  private String entrantMemberType;

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

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();


  public CompetitionReducedAllOf competitionType(CompetitionType competitionType) {
    this.competitionType = competitionType;
    return this;
  }

   /**
   * Get competitionType
   * @return competitionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMPETITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CompetitionType getCompetitionType() {
    return competitionType;
  }


  @JsonProperty(JSON_PROPERTY_COMPETITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompetitionType(CompetitionType competitionType) {
    this.competitionType = competitionType;
  }


  public CompetitionReducedAllOf numberOfRounds(Integer numberOfRounds) {
    this.numberOfRounds = numberOfRounds;
    return this;
  }

   /**
   * Number of rounds to be played in a competition
   * @return numberOfRounds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Number of rounds to be played in a competition")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ROUNDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfRounds() {
    return numberOfRounds;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ROUNDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfRounds(Integer numberOfRounds) {
    this.numberOfRounds = numberOfRounds;
  }


  public CompetitionReducedAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name or a name of a competition. Can be translated
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Summer fest", required = true, value = "A name or a name of a competition. Can be translated")
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


  public CompetitionReducedAllOf status(CompetitionStatus status) {
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

  public CompetitionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(CompetitionStatus status) {
    this.status = status;
  }


   /**
   * The code of the competition
   * @return statusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "The code of the competition")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStatusCode() {
    return statusCode;
  }




  public CompetitionReducedAllOf dependantOn(List<Dependancy> dependantOn) {
    this.dependantOn = dependantOn;
    return this;
  }

  public CompetitionReducedAllOf addDependantOnItem(Dependancy dependantOnItem) {
    this.dependantOn.add(dependantOnItem);
    return this;
  }

   /**
   * Get dependantOn
   * @return dependantOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Dependancy> getDependantOn() {
    return dependantOn;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDependantOn(List<Dependancy> dependantOn) {
    this.dependantOn = dependantOn;
  }


  public CompetitionReducedAllOf entrantMemberType(String entrantMemberType) {
    this.entrantMemberType = entrantMemberType;
    return this;
  }

   /**
   * Get entrantMemberType
   * @return entrantMemberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRANT_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntrantMemberType() {
    return entrantMemberType;
  }


  @JsonProperty(JSON_PROPERTY_ENTRANT_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntrantMemberType(String entrantMemberType) {
    this.entrantMemberType = entrantMemberType;
  }


  public CompetitionReducedAllOf scheduledStartDate(OffsetDateTime scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
   * @return scheduledStartDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone")
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


  public CompetitionReducedAllOf scheduledEndDate(OffsetDateTime scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
   * @return scheduledEndDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone")
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




  public CompetitionReducedAllOf tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CompetitionReducedAllOf addTagsItem(String tagsItem) {
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


  public CompetitionReducedAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public CompetitionReducedAllOf addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- optinRequiredForEntrants", required = true, value = "Additional constraints")
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
   * Return true if this CompetitionReduced_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitionReducedAllOf competitionReducedAllOf = (CompetitionReducedAllOf) o;
    return Objects.equals(this.competitionType, competitionReducedAllOf.competitionType) &&
        Objects.equals(this.numberOfRounds, competitionReducedAllOf.numberOfRounds) &&
        Objects.equals(this.name, competitionReducedAllOf.name) &&
        Objects.equals(this.status, competitionReducedAllOf.status) &&
        Objects.equals(this.statusCode, competitionReducedAllOf.statusCode) &&
        Objects.equals(this.dependantOn, competitionReducedAllOf.dependantOn) &&
        Objects.equals(this.entrantMemberType, competitionReducedAllOf.entrantMemberType) &&
        Objects.equals(this.scheduledStartDate, competitionReducedAllOf.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, competitionReducedAllOf.scheduledEndDate) &&
        Objects.equals(this.actualStartDate, competitionReducedAllOf.actualStartDate) &&
        Objects.equals(this.actualEndDate, competitionReducedAllOf.actualEndDate) &&
        Objects.equals(this.tags, competitionReducedAllOf.tags) &&
        Objects.equals(this.constraints, competitionReducedAllOf.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitionType, numberOfRounds, name, status, statusCode, dependantOn, entrantMemberType, scheduledStartDate, scheduledEndDate, actualStartDate, actualEndDate, tags, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitionReducedAllOf {\n");
    sb.append("    competitionType: ").append(toIndentedString(competitionType)).append("\n");
    sb.append("    numberOfRounds: ").append(toIndentedString(numberOfRounds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    dependantOn: ").append(toIndentedString(dependantOn)).append("\n");
    sb.append("    entrantMemberType: ").append(toIndentedString(entrantMemberType)).append("\n");
    sb.append("    scheduledStartDate: ").append(toIndentedString(scheduledStartDate)).append("\n");
    sb.append("    scheduledEndDate: ").append(toIndentedString(scheduledEndDate)).append("\n");
    sb.append("    actualStartDate: ").append(toIndentedString(actualStartDate)).append("\n");
    sb.append("    actualEndDate: ").append(toIndentedString(actualEndDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
