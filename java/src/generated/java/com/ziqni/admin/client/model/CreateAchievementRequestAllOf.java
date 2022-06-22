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
import com.ziqni.admin.client.model.CreateRewardRequest;
import com.ziqni.admin.client.model.DependantOn;
import com.ziqni.admin.client.model.Rule;
import com.ziqni.admin.client.model.Scheduling;
import com.ziqni.admin.client.model.Translation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateAchievementRequestAllOf
 */
@JsonPropertyOrder({
  CreateAchievementRequestAllOf.JSON_PROPERTY_NAME,
  CreateAchievementRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateAchievementRequestAllOf.JSON_PROPERTY_TERMS_AND_CONDITIONS,
  CreateAchievementRequestAllOf.JSON_PROPERTY_ICON,
  CreateAchievementRequestAllOf.JSON_PROPERTY_RULES,
  CreateAchievementRequestAllOf.JSON_PROPERTY_SCHEDULING,
  CreateAchievementRequestAllOf.JSON_PROPERTY_MAX_NUMBER_OF_ISSUES,
  CreateAchievementRequestAllOf.JSON_PROPERTY_TRANSLATIONS,
  CreateAchievementRequestAllOf.JSON_PROPERTY_REWARDS,
  CreateAchievementRequestAllOf.JSON_PROPERTY_CONSTRAINTS,
  CreateAchievementRequestAllOf.JSON_PROPERTY_ACHIEVEMENT_DEPENDENCIES,
  CreateAchievementRequestAllOf.JSON_PROPERTY_MEMBER_TAGS_FILTER,
  CreateAchievementRequestAllOf.JSON_PROPERTY_PRODUCT_TAGS_FILTER,
  CreateAchievementRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAchievementRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TERMS_AND_CONDITIONS = "termsAndConditions";
  private String termsAndConditions;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<Rule> rules = null;

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private Scheduling scheduling;

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_ISSUES = "maxNumberOfIssues";
  private Integer maxNumberOfIssues;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private List<Translation> translations = null;

  public static final String JSON_PROPERTY_REWARDS = "rewards";
  private List<CreateRewardRequest> rewards = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();

  public static final String JSON_PROPERTY_ACHIEVEMENT_DEPENDENCIES = "achievementDependencies";
  private DependantOn achievementDependencies;

  public static final String JSON_PROPERTY_MEMBER_TAGS_FILTER = "memberTagsFilter";
  private DependantOn memberTagsFilter;

  public static final String JSON_PROPERTY_PRODUCT_TAGS_FILTER = "productTagsFilter";
  private DependantOn productTagsFilter;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;


  public CreateAchievementRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name for the Achievement. Can be translated
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Welcome badge", required = true, value = "A name for the Achievement. Can be translated")
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


  public CreateAchievementRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A name for the Achievement. Can be translated
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A Badge to welcome you on board", value = "A name for the Achievement. Can be translated")
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


  public CreateAchievementRequestAllOf termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Terms and conditions of an achievement. Can be translated
   * @return termsAndConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Participate to win", value = "Terms and conditions of an achievement. Can be translated")
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


  public CreateAchievementRequestAllOf icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * An Icon id that has been pre uploaded to the system to display for Achievement
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "An Icon id that has been pre uploaded to the system to display for Achievement")
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


  public CreateAchievementRequestAllOf rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public CreateAchievementRequestAllOf addRulesItem(Rule rulesItem) {
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


  public CreateAchievementRequestAllOf scheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Scheduling getScheduling() {
    return scheduling;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }


  public CreateAchievementRequestAllOf maxNumberOfIssues(Integer maxNumberOfIssues) {
    this.maxNumberOfIssues = maxNumberOfIssues;
    return this;
  }

   /**
   * Maximum number of issued achievements
   * @return maxNumberOfIssues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9999", value = "Maximum number of issued achievements")
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNumberOfIssues() {
    return maxNumberOfIssues;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxNumberOfIssues(Integer maxNumberOfIssues) {
    this.maxNumberOfIssues = maxNumberOfIssues;
  }


  public CreateAchievementRequestAllOf translations(List<Translation> translations) {
    this.translations = translations;
    return this;
  }

  public CreateAchievementRequestAllOf addTranslationsItem(Translation translationsItem) {
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


  public CreateAchievementRequestAllOf rewards(List<CreateRewardRequest> rewards) {
    this.rewards = rewards;
    return this;
  }

  public CreateAchievementRequestAllOf addRewardsItem(CreateRewardRequest rewardsItem) {
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


  public CreateAchievementRequestAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public CreateAchievementRequestAllOf addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- notifyMember - isHidden - deprecated - optinRequiredForEntrants", required = true, value = "Additional constraints")
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


  public CreateAchievementRequestAllOf achievementDependencies(DependantOn achievementDependencies) {
    this.achievementDependencies = achievementDependencies;
    return this;
  }

   /**
   * Get achievementDependencies
   * @return achievementDependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACHIEVEMENT_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DependantOn getAchievementDependencies() {
    return achievementDependencies;
  }


  @JsonProperty(JSON_PROPERTY_ACHIEVEMENT_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAchievementDependencies(DependantOn achievementDependencies) {
    this.achievementDependencies = achievementDependencies;
  }


  public CreateAchievementRequestAllOf memberTagsFilter(DependantOn memberTagsFilter) {
    this.memberTagsFilter = memberTagsFilter;
    return this;
  }

   /**
   * Get memberTagsFilter
   * @return memberTagsFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_TAGS_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DependantOn getMemberTagsFilter() {
    return memberTagsFilter;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_TAGS_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberTagsFilter(DependantOn memberTagsFilter) {
    this.memberTagsFilter = memberTagsFilter;
  }


  public CreateAchievementRequestAllOf productTagsFilter(DependantOn productTagsFilter) {
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


  public CreateAchievementRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateAchievementRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
    if (this.addConstraints == null) {
      this.addConstraints = new ArrayList<>();
    }
    this.addConstraints.add(addConstraintsItem);
    return this;
  }

   /**
   * Get addConstraints
   * @return addConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  /**
   * Return true if this CreateAchievementRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchievementRequestAllOf createAchievementRequestAllOf = (CreateAchievementRequestAllOf) o;
    return Objects.equals(this.name, createAchievementRequestAllOf.name) &&
        Objects.equals(this.description, createAchievementRequestAllOf.description) &&
        Objects.equals(this.termsAndConditions, createAchievementRequestAllOf.termsAndConditions) &&
        Objects.equals(this.icon, createAchievementRequestAllOf.icon) &&
        Objects.equals(this.rules, createAchievementRequestAllOf.rules) &&
        Objects.equals(this.scheduling, createAchievementRequestAllOf.scheduling) &&
        Objects.equals(this.maxNumberOfIssues, createAchievementRequestAllOf.maxNumberOfIssues) &&
        Objects.equals(this.translations, createAchievementRequestAllOf.translations) &&
        Objects.equals(this.rewards, createAchievementRequestAllOf.rewards) &&
        Objects.equals(this.constraints, createAchievementRequestAllOf.constraints) &&
        Objects.equals(this.achievementDependencies, createAchievementRequestAllOf.achievementDependencies) &&
        Objects.equals(this.memberTagsFilter, createAchievementRequestAllOf.memberTagsFilter) &&
        Objects.equals(this.productTagsFilter, createAchievementRequestAllOf.productTagsFilter) &&
        Objects.equals(this.addConstraints, createAchievementRequestAllOf.addConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, termsAndConditions, icon, rules, scheduling, maxNumberOfIssues, translations, rewards, constraints, achievementDependencies, memberTagsFilter, productTagsFilter, addConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchievementRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    maxNumberOfIssues: ").append(toIndentedString(maxNumberOfIssues)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    achievementDependencies: ").append(toIndentedString(achievementDependencies)).append("\n");
    sb.append("    memberTagsFilter: ").append(toIndentedString(memberTagsFilter)).append("\n");
    sb.append("    productTagsFilter: ").append(toIndentedString(productTagsFilter)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
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

