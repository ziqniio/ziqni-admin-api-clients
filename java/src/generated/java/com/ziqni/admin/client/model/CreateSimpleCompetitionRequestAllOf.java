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
import com.ziqni.admin.client.model.CreateRewardRequest;
import com.ziqni.admin.client.model.DependantOn;
import com.ziqni.admin.client.model.Rule;
import com.ziqni.admin.client.model.Strategy;
import com.ziqni.admin.client.model.Translation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateSimpleCompetitionRequestAllOf
 */
@JsonPropertyOrder({
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_COMPETITION_TYPE,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_NAME,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_ENTRANT_MEMBER_TYPE,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_MAX_NUMBER_OF_ENTRANTS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_MIN_NUMBER_OF_ENTRANTS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_RULES,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_SCHEDULED_START_DATE,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_SCHEDULED_END_DATE,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_TRANSLATIONS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_REWARDS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_PRODUCT_IDS,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_PRODUCT_TAGS_FILTER,
  CreateSimpleCompetitionRequestAllOf.JSON_PROPERTY_STRATEGIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSimpleCompetitionRequestAllOf {
  public static final String JSON_PROPERTY_COMPETITION_TYPE = "competitionType";
  private CompetitionType competitionType;

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

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<Rule> rules = null;

  public static final String JSON_PROPERTY_SCHEDULED_START_DATE = "scheduledStartDate";
  private OffsetDateTime scheduledStartDate;

  public static final String JSON_PROPERTY_SCHEDULED_END_DATE = "scheduledEndDate";
  private OffsetDateTime scheduledEndDate;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private List<Translation> translations = null;

  public static final String JSON_PROPERTY_REWARDS = "rewards";
  private List<CreateRewardRequest> rewards = null;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_PRODUCT_IDS = "productIds";
  private List<String> productIds = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTRANT_MEMBER_TAGS_FILTER = "entrantMemberTagsFilter";
  private DependantOn entrantMemberTagsFilter;

  public static final String JSON_PROPERTY_PRODUCT_TAGS_FILTER = "productTagsFilter";
  private DependantOn productTagsFilter;

  public static final String JSON_PROPERTY_STRATEGIES = "strategies";
  private Strategy strategies;


  public CreateSimpleCompetitionRequestAllOf competitionType(CompetitionType competitionType) {
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


  public CreateSimpleCompetitionRequestAllOf name(String name) {
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


  public CreateSimpleCompetitionRequestAllOf description(String description) {
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


  public CreateSimpleCompetitionRequestAllOf termsAndConditions(String termsAndConditions) {
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


  public CreateSimpleCompetitionRequestAllOf entrantMemberType(String entrantMemberType) {
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


  public CreateSimpleCompetitionRequestAllOf maxNumberOfEntrants(Integer maxNumberOfEntrants) {
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


  public CreateSimpleCompetitionRequestAllOf minNumberOfEntrants(Integer minNumberOfEntrants) {
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


  public CreateSimpleCompetitionRequestAllOf rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public CreateSimpleCompetitionRequestAllOf addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Rule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }


  public CreateSimpleCompetitionRequestAllOf scheduledStartDate(OffsetDateTime scheduledStartDate) {
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


  public CreateSimpleCompetitionRequestAllOf scheduledEndDate(OffsetDateTime scheduledEndDate) {
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


  public CreateSimpleCompetitionRequestAllOf translations(List<Translation> translations) {
    this.translations = translations;
    return this;
  }

  public CreateSimpleCompetitionRequestAllOf addTranslationsItem(Translation translationsItem) {
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


  public CreateSimpleCompetitionRequestAllOf rewards(List<CreateRewardRequest> rewards) {
    this.rewards = rewards;
    return this;
  }

  public CreateSimpleCompetitionRequestAllOf addRewardsItem(CreateRewardRequest rewardsItem) {
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

  public List<CreateRewardRequest> getRewards() {
    return rewards;
  }


  @JsonProperty(JSON_PROPERTY_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewards(List<CreateRewardRequest> rewards) {
    this.rewards = rewards;
  }


  public CreateSimpleCompetitionRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateSimpleCompetitionRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
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
  @ApiModelProperty(example = "- notifyMember - memberAcknowledgmentRequired - isPublic - autoStart - autoStop - optinRequiredForEntrants", value = "Additional constraints")
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


  public CreateSimpleCompetitionRequestAllOf productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public CreateSimpleCompetitionRequestAllOf addProductIdsItem(String productIdsItem) {
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * Get productIds
   * @return productIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getProductIds() {
    return productIds;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  public CreateSimpleCompetitionRequestAllOf entrantMemberTagsFilter(DependantOn entrantMemberTagsFilter) {
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


  public CreateSimpleCompetitionRequestAllOf productTagsFilter(DependantOn productTagsFilter) {
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


  public CreateSimpleCompetitionRequestAllOf strategies(Strategy strategies) {
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


  /**
   * Return true if this CreateSimpleCompetitionRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSimpleCompetitionRequestAllOf createSimpleCompetitionRequestAllOf = (CreateSimpleCompetitionRequestAllOf) o;
    return Objects.equals(this.competitionType, createSimpleCompetitionRequestAllOf.competitionType) &&
        Objects.equals(this.name, createSimpleCompetitionRequestAllOf.name) &&
        Objects.equals(this.description, createSimpleCompetitionRequestAllOf.description) &&
        Objects.equals(this.termsAndConditions, createSimpleCompetitionRequestAllOf.termsAndConditions) &&
        Objects.equals(this.entrantMemberType, createSimpleCompetitionRequestAllOf.entrantMemberType) &&
        Objects.equals(this.maxNumberOfEntrants, createSimpleCompetitionRequestAllOf.maxNumberOfEntrants) &&
        Objects.equals(this.minNumberOfEntrants, createSimpleCompetitionRequestAllOf.minNumberOfEntrants) &&
        Objects.equals(this.rules, createSimpleCompetitionRequestAllOf.rules) &&
        Objects.equals(this.scheduledStartDate, createSimpleCompetitionRequestAllOf.scheduledStartDate) &&
        Objects.equals(this.scheduledEndDate, createSimpleCompetitionRequestAllOf.scheduledEndDate) &&
        Objects.equals(this.translations, createSimpleCompetitionRequestAllOf.translations) &&
        Objects.equals(this.rewards, createSimpleCompetitionRequestAllOf.rewards) &&
        Objects.equals(this.addConstraints, createSimpleCompetitionRequestAllOf.addConstraints) &&
        Objects.equals(this.productIds, createSimpleCompetitionRequestAllOf.productIds) &&
        Objects.equals(this.entrantMemberTagsFilter, createSimpleCompetitionRequestAllOf.entrantMemberTagsFilter) &&
        Objects.equals(this.productTagsFilter, createSimpleCompetitionRequestAllOf.productTagsFilter) &&
        Objects.equals(this.strategies, createSimpleCompetitionRequestAllOf.strategies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitionType, name, description, termsAndConditions, entrantMemberType, maxNumberOfEntrants, minNumberOfEntrants, rules, scheduledStartDate, scheduledEndDate, translations, rewards, addConstraints, productIds, entrantMemberTagsFilter, productTagsFilter, strategies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSimpleCompetitionRequestAllOf {\n");
    sb.append("    competitionType: ").append(toIndentedString(competitionType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    entrantMemberType: ").append(toIndentedString(entrantMemberType)).append("\n");
    sb.append("    maxNumberOfEntrants: ").append(toIndentedString(maxNumberOfEntrants)).append("\n");
    sb.append("    minNumberOfEntrants: ").append(toIndentedString(minNumberOfEntrants)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    scheduledStartDate: ").append(toIndentedString(scheduledStartDate)).append("\n");
    sb.append("    scheduledEndDate: ").append(toIndentedString(scheduledEndDate)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    entrantMemberTagsFilter: ").append(toIndentedString(entrantMemberTagsFilter)).append("\n");
    sb.append("    productTagsFilter: ").append(toIndentedString(productTagsFilter)).append("\n");
    sb.append("    strategies: ").append(toIndentedString(strategies)).append("\n");
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

