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
import com.ziqni.admin.client.model.UpdateCompetitionRequestAllOf;
import com.ziqni.admin.client.model.UpdateContestRequest;
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
 * UpdateCompetitionRequest
 */
@JsonPropertyOrder({
  UpdateCompetitionRequest.JSON_PROPERTY_ID,
  UpdateCompetitionRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  UpdateCompetitionRequest.JSON_PROPERTY_TAGS,
  UpdateCompetitionRequest.JSON_PROPERTY_METADATA,
  UpdateCompetitionRequest.JSON_PROPERTY_COMPETITION_TYPE,
  UpdateCompetitionRequest.JSON_PROPERTY_NUMBER_OF_ROUNDS,
  UpdateCompetitionRequest.JSON_PROPERTY_NUMBER_OF_GROUP_STAGES,
  UpdateCompetitionRequest.JSON_PROPERTY_NAME,
  UpdateCompetitionRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateCompetitionRequest.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  UpdateCompetitionRequest.JSON_PROPERTY_ENTRANT_MEMBER_TYPE,
  UpdateCompetitionRequest.JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS,
  UpdateCompetitionRequest.JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS,
  UpdateCompetitionRequest.JSON_PROPERTY_SCHEDULED_START_DATE,
  UpdateCompetitionRequest.JSON_PROPERTY_SCHEDULED_END_DATE,
  UpdateCompetitionRequest.JSON_PROPERTY_CONSTRAINTS,
  UpdateCompetitionRequest.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateCompetitionRequest.JSON_PROPERTY_REMOVE_CONSTRAINTS,
  UpdateCompetitionRequest.JSON_PROPERTY_PRODUCT_IDS,
  UpdateCompetitionRequest.JSON_PROPERTY_CREATE_CONTESTS,
  UpdateCompetitionRequest.JSON_PROPERTY_UPDATE_CONTESTS,
  UpdateCompetitionRequest.JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER,
  UpdateCompetitionRequest.JSON_PROPERTY_PRODUCT_TAGS_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCompetitionRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

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


  public UpdateCompetitionRequest id(String id) {
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


  public UpdateCompetitionRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UpdateCompetitionRequest putCustomFieldsItem(String key, Object customFieldsItem) {
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


  public UpdateCompetitionRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateCompetitionRequest addTagsItem(String tagsItem) {
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


  public UpdateCompetitionRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateCompetitionRequest putMetadataItem(String key, String metadataItem) {
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


  public UpdateCompetitionRequest competitionType(CompetitionType competitionType) {
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


  public UpdateCompetitionRequest numberOfRounds(Integer numberOfRounds) {
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


  public UpdateCompetitionRequest numberOfGroupStages(Integer numberOfGroupStages) {
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


  public UpdateCompetitionRequest name(String name) {
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


  public UpdateCompetitionRequest description(String description) {
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


  public UpdateCompetitionRequest termsAndConditions(String termsAndConditions) {
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


  public UpdateCompetitionRequest entrantMemberType(String entrantMemberType) {
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


  public UpdateCompetitionRequest maxNumberOfEntrants(Integer maxNumberOfEntrants) {
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


  public UpdateCompetitionRequest minNumberOfEntrants(Integer minNumberOfEntrants) {
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


  public UpdateCompetitionRequest scheduledStartDate(OffsetDateTime scheduledStartDate) {
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


  public UpdateCompetitionRequest scheduledEndDate(OffsetDateTime scheduledEndDate) {
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


  public UpdateCompetitionRequest constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public UpdateCompetitionRequest addConstraintsItem(String constraintsItem) {
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


  public UpdateCompetitionRequest addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateCompetitionRequest addAddConstraintsItem(String addConstraintsItem) {
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


  public UpdateCompetitionRequest removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateCompetitionRequest addRemoveConstraintsItem(String removeConstraintsItem) {
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


  public UpdateCompetitionRequest productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public UpdateCompetitionRequest addProductIdsItem(String productIdsItem) {
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


  public UpdateCompetitionRequest createContests(CreateContestForCompetitionRequest createContests) {
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


  public UpdateCompetitionRequest updateContests(UpdateContestRequest updateContests) {
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


  public UpdateCompetitionRequest entrantMemberTagsFilter(DependantOn entrantMemberTagsFilter) {
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


  public UpdateCompetitionRequest productTagsFilter(DependantOn productTagsFilter) {
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
   * Return true if this UpdateCompetitionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCompetitionRequest updateCompetitionRequest = (UpdateCompetitionRequest) o;
    return Objects.equals(this.id, updateCompetitionRequest.id) &&
        Objects.equals(this.customFields, updateCompetitionRequest.customFields) &&
        Objects.equals(this.tags, updateCompetitionRequest.tags) &&
        Objects.equals(this.metadata, updateCompetitionRequest.metadata) &&
        Objects.equals(this.competitionType, updateCompetitionRequest.competitionType) &&
        Objects.equals(this.numberOfRounds, updateCompetitionRequest.numberOfRounds) &&
        Objects.equals(this.numberOfGroupStages, updateCompetitionRequest.numberOfGroupStages) &&
        Objects.equals(this.name, updateCompetitionRequest.name) &&
        Objects.equals(this.description, updateCompetitionRequest.description) &&
        Objects.equals(this.termsAndConditions, updateCompetitionRequest.termsAndConditions) &&
        Objects.equals(this.entrantMemberType, updateCompetitionRequest.entrantMemberType) &&
        Objects.equals(this.maxNumberOfEntrants, updateCompetitionRequest.maxNumberOfEntrants) &&
        Objects.equals(this.minNumberOfEntrants, updateCompetitionRequest.minNumberOfEntrants) &&
        Objects.equals(this.scheduledStartDate, updateCompetitionRequest.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, updateCompetitionRequest.scheduledEndDate) &&
        Objects.equals(this.constraints, updateCompetitionRequest.constraints) &&
        Objects.equals(this.addConstraints, updateCompetitionRequest.addConstraints) &&
        Objects.equals(this.removeConstraints, updateCompetitionRequest.removeConstraints) &&
        Objects.equals(this.productIds, updateCompetitionRequest.productIds) &&
        Objects.equals(this.createContests, updateCompetitionRequest.createContests) &&
        Objects.equals(this.updateContests, updateCompetitionRequest.updateContests) &&
        Objects.equals(this.entrantMemberTagsFilter, updateCompetitionRequest.entrantMemberTagsFilter) &&
        Objects.equals(this.productTagsFilter, updateCompetitionRequest.productTagsFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customFields, tags, metadata, competitionType, numberOfRounds, numberOfGroupStages, name, description, termsAndConditions, entrantMemberType, maxNumberOfEntrants, minNumberOfEntrants, scheduledStartDate, scheduledEndDate, constraints, addConstraints, removeConstraints, productIds, createContests, updateContests, entrantMemberTagsFilter, productTagsFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCompetitionRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

