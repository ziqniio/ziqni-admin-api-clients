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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Translations to attach to the models.
 */
@ApiModel(description = "Translations to attach to the models.")
@JsonPropertyOrder({
  Translation.JSON_PROPERTY_ID,
  Translation.JSON_PROPERTY_ACCOUNT_ID,
  Translation.JSON_PROPERTY_ENTITY_ID,
  Translation.JSON_PROPERTY_ENTITY_TYPE,
  Translation.JSON_PROPERTY_VERSION,
  Translation.JSON_PROPERTY_CREATED,
  Translation.JSON_PROPERTY_TRANSLATIONS,
  Translation.JSON_PROPERTY_LANGUAGE_KEY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Translation {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private List<TranslationEntry> translations = new ArrayList<>();

  public static final String JSON_PROPERTY_LANGUAGE_KEY = "languageKey";
  private String languageKey;


  public Translation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public Translation accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Translation entityId(String entityId) {
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


  public Translation entityType(String entityType) {
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


  public Translation version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(Long version) {
    this.version = version;
  }


  public Translation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * date-time
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "date-time")
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


  public Translation translations(List<TranslationEntry> translations) {
    this.translations = translations;
    return this;
  }

  public Translation addTranslationsItem(TranslationEntry translationsItem) {
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


  public Translation languageKey(String languageKey) {
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
   * Return true if this Translation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Translation translation = (Translation) o;
    return Objects.equals(this.id, translation.id) &&
        Objects.equals(this.accountId, translation.accountId) &&
        Objects.equals(this.entityId, translation.entityId) &&
        Objects.equals(this.entityType, translation.entityType) &&
        Objects.equals(this.version, translation.version) &&
        Objects.equals(this.created, translation.created) &&
        Objects.equals(this.translations, translation.translations) &&
        Objects.equals(this.languageKey, translation.languageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, entityId, entityType, version, created, translations, languageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Translation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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

