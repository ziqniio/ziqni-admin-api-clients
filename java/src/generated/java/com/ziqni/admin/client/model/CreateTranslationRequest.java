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
import com.ziqni.admin.client.model.TranslationEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Translations to attach to the models.
 */
@ApiModel(description = "Translations to attach to the models.")
@JsonPropertyOrder({
  CreateTranslationRequest.JSON_PROPERTY_ENTITY_ID,
  CreateTranslationRequest.JSON_PROPERTY_ENTITY_TYPE,
  CreateTranslationRequest.JSON_PROPERTY_TRANSLATIONS,
  CreateTranslationRequest.JSON_PROPERTY_LANGUAGE_ID,
  CreateTranslationRequest.JSON_PROPERTY_LANGUAGE_KEY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTranslationRequest {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private List<TranslationEntry> translations = new ArrayList<>();

  public static final String JSON_PROPERTY_LANGUAGE_ID = "languageId";
  private String languageId;

  public static final String JSON_PROPERTY_LANGUAGE_KEY = "languageKey";
  private String languageKey;


  public CreateTranslationRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public CreateTranslationRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public CreateTranslationRequest translations(List<TranslationEntry> translations) {
    this.translations = translations;
    return this;
  }

  public CreateTranslationRequest addTranslationsItem(TranslationEntry translationsItem) {
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TranslationEntry> getTranslations() {
    return translations;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTranslations(List<TranslationEntry> translations) {
    this.translations = translations;
  }


  public CreateTranslationRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLanguageId() {
    return languageId;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  public CreateTranslationRequest languageKey(String languageKey) {
    this.languageKey = languageKey;
    return this;
  }

   /**
   * Get languageKey
   * @return languageKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLanguageKey() {
    return languageKey;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLanguageKey(String languageKey) {
    this.languageKey = languageKey;
  }


  /**
   * Return true if this CreateTranslationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTranslationRequest createTranslationRequest = (CreateTranslationRequest) o;
    return Objects.equals(this.entityId, createTranslationRequest.entityId) &&
        Objects.equals(this.entityType, createTranslationRequest.entityType) &&
        Objects.equals(this.translations, createTranslationRequest.translations) &&
        Objects.equals(this.languageId, createTranslationRequest.languageId) &&
        Objects.equals(this.languageKey, createTranslationRequest.languageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, translations, languageId, languageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranslationRequest {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    languageKey: ").append(toIndentedString(languageKey)).append("\n");
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

