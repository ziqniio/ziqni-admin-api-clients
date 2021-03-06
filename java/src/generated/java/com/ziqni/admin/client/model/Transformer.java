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
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.SourceLanguage;
import com.ziqni.admin.client.model.TransformerAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Transformer
 */
@JsonPropertyOrder({
  Transformer.JSON_PROPERTY_ID,
  Transformer.JSON_PROPERTY_SPACE_NAME,
  Transformer.JSON_PROPERTY_CREATED,
  Transformer.JSON_PROPERTY_NAME,
  Transformer.JSON_PROPERTY_SOURCE,
  Transformer.JSON_PROPERTY_SOURCE_LANGUAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Transformer {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_SOURCE_LANGUAGE = "sourceLanguage";
  private SourceLanguage sourceLanguage;


  public Transformer id(String id) {
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


  public Transformer spaceName(String spaceName) {
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


  public Transformer created(OffsetDateTime created) {
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


  public Transformer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Transformer
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Daily Login", required = true, value = "The name of the Transformer")
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


  public Transformer source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source code
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/_** This is your source code **_/", required = true, value = "Source code")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(String source) {
    this.source = source;
  }


  public Transformer sourceLanguage(SourceLanguage sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Get sourceLanguage
   * @return sourceLanguage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SourceLanguage getSourceLanguage() {
    return sourceLanguage;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceLanguage(SourceLanguage sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }


  /**
   * Return true if this Transformer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transformer transformer = (Transformer) o;
    return Objects.equals(this.id, transformer.id) &&
        Objects.equals(this.spaceName, transformer.spaceName) &&
        Objects.equals(this.created, transformer.created) &&
        Objects.equals(this.name, transformer.name) &&
        Objects.equals(this.source, transformer.source) &&
        Objects.equals(this.sourceLanguage, transformer.sourceLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, name, source, sourceLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transformer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
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

