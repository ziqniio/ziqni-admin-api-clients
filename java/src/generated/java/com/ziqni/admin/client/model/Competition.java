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
import com.ziqni.admin.client.model.CompetitionAllOf;
import com.ziqni.admin.client.model.CompetitionStatus;
import com.ziqni.admin.client.model.CompetitionType;
import com.ziqni.admin.client.model.DependantOn;
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.OptParamModels;
import com.ziqni.admin.client.model.ProductReduced;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Competition
 */
@JsonPropertyOrder({
  Competition.JSON_PROPERTY_ID,
  Competition.JSON_PROPERTY_SPACE_NAME,
  Competition.JSON_PROPERTY_CREATED,
  Competition.JSON_PROPERTY_CUSTOM_FIELDS,
  Competition.JSON_PROPERTY_TAGS,
  Competition.JSON_PROPERTY_METADATA,
  Competition.JSON_PROPERTY_COMPETITION_TYPE,
  Competition.JSON_PROPERTY_NUMBER_OF_ROUNDS,
  Competition.JSON_PROPERTY_NUMBER_OF_GROUP_STAGES,
  Competition.JSON_PROPERTY_NAME,
  Competition.JSON_PROPERTY_DESCRIPTION,
  Competition.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  Competition.JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS,
  Competition.JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS,
  Competition.JSON_PROPERTY_ENTRANT_MEMBER_TYPE,
  Competition.JSON_PROPERTY_SCHEDULED_START_DATE,
  Competition.JSON_PROPERTY_SCHEDULED_END_DATE,
  Competition.JSON_PROPERTY_ACTUAL_START_DATE,
  Competition.JSON_PROPERTY_ACTUAL_END_DATE,
  Competition.JSON_PROPERTY_STATUS,
  Competition.JSON_PROPERTY_STATUS_CODE,
  Competition.JSON_PROPERTY_CONSTRAINTS,
  Competition.JSON_PROPERTY_PRODUCTS,
  Competition.JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER,
  Competition.JSON_PROPERTY_PRODUCT_TAGS_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Competition {
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

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS = "maxNumberOfEntrants";
  private Integer maxNumberOfEntrants;

  public static final String JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS = "minNumberOfEntrants";
  private Integer minNumberOfEntrants;

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

  public static final String JSON_PROPERTY_STATUS = "status";
  private CompetitionStatus status;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private Set<String> constraints = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRODUCTS = "products";
  private List<ProductReduced> products = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER = "entrantMemberTagsFilter";
  private DependantOn entrantMemberTagsFilter;

  public static final String JSON_PROPERTY_PRODUCT_TAGS_FILTER = "productTagsFilter";
  private DependantOn productTagsFilter;


  public Competition id(String id) {
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


  public Competition spaceName(String spaceName) {
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


  public Competition created(OffsetDateTime created) {
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


  public Competition customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Competition putCustomFieldsItem(String key, Object customFieldsItem) {
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


  public Competition tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Competition addTagsItem(String tagsItem) {
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


  public Competition metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Competition putMetadataItem(String key, String metadataItem) {
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


  public Competition competitionType(CompetitionType competitionType) {
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


  public Competition numberOfRounds(Integer numberOfRounds) {
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


  public Competition numberOfGroupStages(Integer numberOfGroupStages) {
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


  public Competition name(String name) {
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


  public Competition description(String description) {
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


  public Competition termsAndConditions(String termsAndConditions) {
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


  public Competition maxNumberOfEntrants(Integer maxNumberOfEntrants) {
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


  public Competition minNumberOfEntrants(Integer minNumberOfEntrants) {
    this.minNumberOfEntrants = minNumberOfEntrants;
    return this;
  }

   /**
   * Maximum number of partiipants allowed in a competition
   * @return minNumberOfEntrants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Maximum number of partiipants allowed in a competition")
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


  public Competition entrantMemberType(String entrantMemberType) {
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


  public Competition scheduledStartDate(OffsetDateTime scheduledStartDate) {
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


  public Competition scheduledEndDate(OffsetDateTime scheduledEndDate) {
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




  public Competition status(CompetitionStatus status) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The code of the competition")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatusCode() {
    return statusCode;
  }




  public Competition constraints(Set<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Competition addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- notifyMember - memberAcknowledgmentRequired - isPublic - autoStart - autoStop - optinRequiredForEntrants", required = true, value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConstraints(Set<String> constraints) {
    this.constraints = constraints;
  }


  public Competition products(List<ProductReduced> products) {
    this.products = products;
    return this;
  }

  public Competition addProductsItem(ProductReduced productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ProductReduced> getProducts() {
    return products;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProducts(List<ProductReduced> products) {
    this.products = products;
  }


  public Competition entrantMemberTagsFilter(DependantOn entrantMemberTagsFilter) {
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


  public Competition productTagsFilter(DependantOn productTagsFilter) {
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
   * Return true if this Competition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Competition competition = (Competition) o;
    return Objects.equals(this.id, competition.id) &&
        Objects.equals(this.spaceName, competition.spaceName) &&
        Objects.equals(this.created, competition.created) &&
        Objects.equals(this.customFields, competition.customFields) &&
        Objects.equals(this.tags, competition.tags) &&
        Objects.equals(this.metadata, competition.metadata) &&
        Objects.equals(this.competitionType, competition.competitionType) &&
        Objects.equals(this.numberOfRounds, competition.numberOfRounds) &&
        Objects.equals(this.numberOfGroupStages, competition.numberOfGroupStages) &&
        Objects.equals(this.name, competition.name) &&
        Objects.equals(this.description, competition.description) &&
        Objects.equals(this.termsAndConditions, competition.termsAndConditions) &&
        Objects.equals(this.maxNumberOfEntrants, competition.maxNumberOfEntrants) &&
        Objects.equals(this.minNumberOfEntrants, competition.minNumberOfEntrants) &&
        Objects.equals(this.entrantMemberType, competition.entrantMemberType) &&
        Objects.equals(this.scheduledStartDate, competition.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, competition.scheduledEndDate) &&
        Objects.equals(this.actualStartDate, competition.actualStartDate) &&
        Objects.equals(this.actualEndDate, competition.actualEndDate) &&
        Objects.equals(this.status, competition.status) &&
        Objects.equals(this.statusCode, competition.statusCode) &&
        Objects.equals(this.constraints, competition.constraints) &&
        Objects.equals(this.products, competition.products) &&
        Objects.equals(this.entrantMemberTagsFilter, competition.entrantMemberTagsFilter) &&
        Objects.equals(this.productTagsFilter, competition.productTagsFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, customFields, tags, metadata, competitionType, numberOfRounds, numberOfGroupStages, name, description, termsAndConditions, maxNumberOfEntrants, minNumberOfEntrants, entrantMemberType, scheduledStartDate, scheduledEndDate, actualStartDate, actualEndDate, status, statusCode, constraints, products, entrantMemberTagsFilter, productTagsFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Competition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    competitionType: ").append(toIndentedString(competitionType)).append("\n");
    sb.append("    numberOfRounds: ").append(toIndentedString(numberOfRounds)).append("\n");
    sb.append("    numberOfGroupStages: ").append(toIndentedString(numberOfGroupStages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    maxNumberOfEntrants: ").append(toIndentedString(maxNumberOfEntrants)).append("\n");
    sb.append("    minNumberOfEntrants: ").append(toIndentedString(minNumberOfEntrants)).append("\n");
    sb.append("    entrantMemberType: ").append(toIndentedString(entrantMemberType)).append("\n");
    sb.append("    scheduledStartDate: ").append(toIndentedString(scheduledStartDate)).append("\n");
    sb.append("    scheduledEndDate: ").append(toIndentedString(scheduledEndDate)).append("\n");
    sb.append("    actualStartDate: ").append(toIndentedString(actualStartDate)).append("\n");
    sb.append("    actualEndDate: ").append(toIndentedString(actualEndDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

