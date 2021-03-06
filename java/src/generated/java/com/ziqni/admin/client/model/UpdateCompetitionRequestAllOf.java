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
import com.ziqni.admin.client.model.CompetitionType;
import com.ziqni.admin.client.model.CreateContestForCompetitionRequest;
import com.ziqni.admin.client.model.DependantOn;
import com.ziqni.admin.client.model.UpdateContestRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateCompetitionRequestAllOf
 */
@JsonPropertyOrder({
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_COMPETITION_TYPE,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_NUMBER_OF_ROUNDS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_NUMBER_OF_GROUP_STAGES,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_NAME,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_ENTRANT_MEMBER_TYPE,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_SCHEDULED_START_DATE,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_SCHEDULED_END_DATE,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_CONSTRAINTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_REMOVE_CONSTRAINTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_PRODUCT_IDS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_CREATE_CONTESTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_UPDATE_CONTESTS,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER,
  UpdateCompetitionRequestAllOf.JSON_PROPERTY_PRODUCT_TAGS_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCompetitionRequestAllOf {
  public static final String JSON_PROPERTY_COMPETITION_TYPE = "competitionType";
  private CompetitionType competitionType;

  public static final String JSON_PROPERTY_NUMBER_OF_ROUNDS = "numberOfRounds";
  private Integer numberOfRounds;

  public static final String JSON_PROPERTY_NUMBER_OF_GROUP_STAGES = "numberOfGroupStages";
  private Integer numberOfGroupStages;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TERMS_AND_CONDITIONS = "termsAndConditions";
  private String termsAndConditions;

  public static final String JSON_PROPERTY_ENTRANT_MEMBER_TYPE = "entrantMemberType";
  private String entrantMemberType;

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS = "maxNumberOfEntrants";
  private Integer maxNumberOfEntrants;

  public static final String JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS = "minNumberOfEntrants";
  private Integer minNumberOfEntrants;

  public static final String JSON_PROPERTY_SCHEDULED_START_DATE = "scheduledStartDate";
  private OffsetDateTime scheduledStartDate;

  public static final String JSON_PROPERTY_SCHEDULED_END_DATE = "scheduledEndDate";
  private OffsetDateTime scheduledEndDate;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_REMOVE_CONSTRAINTS = "removeConstraints";
  private List<String> removeConstraints = null;

  public static final String JSON_PROPERTY_PRODUCT_IDS = "productIds";
  private List<String> productIds = null;

  public static final String JSON_PROPERTY_CREATE_CONTESTS = "createContests";
  private CreateContestForCompetitionRequest createContests;

  public static final String JSON_PROPERTY_UPDATE_CONTESTS = "updateContests";
  private UpdateContestRequest updateContests;

  public static final String JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER = "entrantMemberTagsFilter";
  private DependantOn entrantMemberTagsFilter;

  public static final String JSON_PROPERTY_PRODUCT_TAGS_FILTER = "productTagsFilter";
  private DependantOn productTagsFilter;


  public UpdateCompetitionRequestAllOf competitionType(CompetitionType competitionType) {
    this.competitionType = competitionType;
    return this;
  }

   /**
   * Get competitionType
   * @return competitionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPETITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompetitionType getCompetitionType() {
    return competitionType;
  }


  @JsonProperty(JSON_PROPERTY_COMPETITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompetitionType(CompetitionType competitionType) {
    this.competitionType = competitionType;
  }


  public UpdateCompetitionRequestAllOf numberOfRounds(Integer numberOfRounds) {
    this.numberOfRounds = numberOfRounds;
    return this;
  }

   /**
   * Number of rounds to be played in a competition
   * @return numberOfRounds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of rounds to be played in a competition")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ROUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfRounds() {
    return numberOfRounds;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_ROUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfRounds(Integer numberOfRounds) {
    this.numberOfRounds = numberOfRounds;
  }


  public UpdateCompetitionRequestAllOf numberOfGroupStages(Integer numberOfGroupStages) {
    this.numberOfGroupStages = numberOfGroupStages;
    return this;
  }

   /**
   * Number of group stages
   * @return numberOfGroupStages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of group stages")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_GROUP_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfGroupStages() {
    return numberOfGroupStages;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_GROUP_STAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfGroupStages(Integer numberOfGroupStages) {
    this.numberOfGroupStages = numberOfGroupStages;
  }


  public UpdateCompetitionRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name or a name of a competition. Can be translated
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Summer fest", value = "A name or a name of a competition. Can be translated")
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


  public UpdateCompetitionRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the competition. Can be translated
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A competition that is for 1 day", value = "Description of the competition. Can be translated")
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


  public UpdateCompetitionRequestAllOf termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Terms and conditions of a competition. Can be translated
   * @return termsAndConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Participate to win", value = "Terms and conditions of a competition. Can be translated")
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


  public UpdateCompetitionRequestAllOf entrantMemberType(String entrantMemberType) {
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


  public UpdateCompetitionRequestAllOf maxNumberOfEntrants(Integer maxNumberOfEntrants) {
    this.maxNumberOfEntrants = maxNumberOfEntrants;
    return this;
  }

   /**
   * Maximum number of partiipants allowed in a competition
   * @return maxNumberOfEntrants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999", value = "Maximum number of partiipants allowed in a competition")
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


  public UpdateCompetitionRequestAllOf minNumberOfEntrants(Integer minNumberOfEntrants) {
    this.minNumberOfEntrants = minNumberOfEntrants;
    return this;
  }

   /**
   * Maximum number of partiipants allowed in a competition
   * @return minNumberOfEntrants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Maximum number of partiipants allowed in a competition")
  @JsonProperty(JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinNumberOfEntrants() {
    return minNumberOfEntrants;
  }


  @JsonProperty(JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinNumberOfEntrants(Integer minNumberOfEntrants) {
    this.minNumberOfEntrants = minNumberOfEntrants;
  }


  public UpdateCompetitionRequestAllOf scheduledStartDate(OffsetDateTime scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone
   * @return scheduledStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Competition should start. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getScheduledStartDate() {
    return scheduledStartDate;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledStartDate(OffsetDateTime scheduledStartDate) {
    this.scheduledStartDate = scheduledStartDate;
  }


  public UpdateCompetitionRequestAllOf scheduledEndDate(OffsetDateTime scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone
   * @return scheduledEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 timestamp for when a Competition should end. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getScheduledEndDate() {
    return scheduledEndDate;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledEndDate(OffsetDateTime scheduledEndDate) {
    this.scheduledEndDate = scheduledEndDate;
  }


  public UpdateCompetitionRequestAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public UpdateCompetitionRequestAllOf addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- notifyMember - memberAcknowledgmentRequired - isPublic - autoStart - autoStop - optinRequiredForEntrants", value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  public UpdateCompetitionRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateCompetitionRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
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


  public UpdateCompetitionRequestAllOf removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateCompetitionRequestAllOf addRemoveConstraintsItem(String removeConstraintsItem) {
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
  @ApiModelProperty(example = "- isPublic", value = "Additional constraints")
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


  public UpdateCompetitionRequestAllOf productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public UpdateCompetitionRequestAllOf addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * Get productIds
   * @return productIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProductIds() {
    return productIds;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  public UpdateCompetitionRequestAllOf createContests(CreateContestForCompetitionRequest createContests) {
    this.createContests = createContests;
    return this;
  }

   /**
   * Get createContests
   * @return createContests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_CONTESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateContestForCompetitionRequest getCreateContests() {
    return createContests;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CONTESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateContests(CreateContestForCompetitionRequest createContests) {
    this.createContests = createContests;
  }


  public UpdateCompetitionRequestAllOf updateContests(UpdateContestRequest updateContests) {
    this.updateContests = updateContests;
    return this;
  }

   /**
   * Get updateContests
   * @return updateContests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_CONTESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateContestRequest getUpdateContests() {
    return updateContests;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_CONTESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateContests(UpdateContestRequest updateContests) {
    this.updateContests = updateContests;
  }


  public UpdateCompetitionRequestAllOf entrantMemberTagsFilter(DependantOn entrantMemberTagsFilter) {
    this.entrantMemberTagsFilter = entrantMemberTagsFilter;
    return this;
  }

   /**
   * Get entrantMemberTagsFilter
   * @return entrantMemberTagsFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DependantOn getEntrantMemberTagsFilter() {
    return entrantMemberTagsFilter;
  }


  @JsonProperty(JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntrantMemberTagsFilter(DependantOn entrantMemberTagsFilter) {
    this.entrantMemberTagsFilter = entrantMemberTagsFilter;
  }


  public UpdateCompetitionRequestAllOf productTagsFilter(DependantOn productTagsFilter) {
    this.productTagsFilter = productTagsFilter;
    return this;
  }

   /**
   * Get productTagsFilter
   * @return productTagsFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_TAGS_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DependantOn getProductTagsFilter() {
    return productTagsFilter;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TAGS_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductTagsFilter(DependantOn productTagsFilter) {
    this.productTagsFilter = productTagsFilter;
  }


  /**
   * Return true if this UpdateCompetitionRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCompetitionRequestAllOf updateCompetitionRequestAllOf = (UpdateCompetitionRequestAllOf) o;
    return Objects.equals(this.competitionType, updateCompetitionRequestAllOf.competitionType) &&
        Objects.equals(this.numberOfRounds, updateCompetitionRequestAllOf.numberOfRounds) &&
        Objects.equals(this.numberOfGroupStages, updateCompetitionRequestAllOf.numberOfGroupStages) &&
        Objects.equals(this.name, updateCompetitionRequestAllOf.name) &&
        Objects.equals(this.description, updateCompetitionRequestAllOf.description) &&
        Objects.equals(this.termsAndConditions, updateCompetitionRequestAllOf.termsAndConditions) &&
        Objects.equals(this.entrantMemberType, updateCompetitionRequestAllOf.entrantMemberType) &&
        Objects.equals(this.maxNumberOfEntrants, updateCompetitionRequestAllOf.maxNumberOfEntrants) &&
        Objects.equals(this.minNumberOfEntrants, updateCompetitionRequestAllOf.minNumberOfEntrants) &&
        Objects.equals(this.scheduledStartDate, updateCompetitionRequestAllOf.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, updateCompetitionRequestAllOf.scheduledEndDate) &&
        Objects.equals(this.constraints, updateCompetitionRequestAllOf.constraints) &&
        Objects.equals(this.addConstraints, updateCompetitionRequestAllOf.addConstraints) &&
        Objects.equals(this.removeConstraints, updateCompetitionRequestAllOf.removeConstraints) &&
        Objects.equals(this.productIds, updateCompetitionRequestAllOf.productIds) &&
        Objects.equals(this.createContests, updateCompetitionRequestAllOf.createContests) &&
        Objects.equals(this.updateContests, updateCompetitionRequestAllOf.updateContests) &&
        Objects.equals(this.entrantMemberTagsFilter, updateCompetitionRequestAllOf.entrantMemberTagsFilter) &&
        Objects.equals(this.productTagsFilter, updateCompetitionRequestAllOf.productTagsFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitionType, numberOfRounds, numberOfGroupStages, name, description, termsAndConditions, entrantMemberType, maxNumberOfEntrants, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, constraints, addConstraints, removeConstraints, productIds, createContests, updateContests, entrantMemberTagsFilter, productTagsFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCompetitionRequestAllOf {\n");
    sb.append("    competitionType: ").append(toIndentedString(competitionType)).append("\n");
    sb.append("    numberOfRounds: ").append(toIndentedString(numberOfRounds)).append("\n");
    sb.append("    numberOfGroupStages: ").append(toIndentedString(numberOfGroupStages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    entrantMemberType: ").append(toIndentedString(entrantMemberType)).append("\n");
    sb.append("    maxNumberOfEntrants: ").append(toIndentedString(maxNumberOfEntrants)).append("\n");
    sb.append("    minNumberOfEntrants: ").append(toIndentedString(minNumberOfEntrants)).append("\n");
    sb.append("    scheduledStartDate: ").append(toIndentedString(scheduledStartDate)).append("\n");
    sb.append("    scheduledEndDate: ").append(toIndentedString(scheduledEndDate)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    removeConstraints: ").append(toIndentedString(removeConstraints)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    createContests: ").append(toIndentedString(createContests)).append("\n");
    sb.append("    updateContests: ").append(toIndentedString(updateContests)).append("\n");
    sb.append("    entrantMemberTagsFilter: ").append(toIndentedString(entrantMemberTagsFilter)).append("\n");
    sb.append("    productTagsFilter: ").append(toIndentedString(productTagsFilter)).append("\n");
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

