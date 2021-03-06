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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TranslatedField
 */
@JsonPropertyOrder({
  TranslatedField.JSON_PROPERTY_FIELD_NAME,
  TranslatedField.JSON_PROPERTY_TEXT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranslatedField {
  public static final String JSON_PROPERTY_FIELD_NAME = "fieldName";
  private String fieldName;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;


  public TranslatedField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The name of the translatable field of the model. Reference to translatableFields
   * @return fieldName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "description", required = true, value = "The name of the translatable field of the model. Reference to translatableFields")
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFieldName() {
    return fieldName;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public TranslatedField text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text of the selected language
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "English translation for description", required = true, value = "The text of the selected language")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Return true if this TranslatedField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslatedField translatedField = (TranslatedField) o;
    return Objects.equals(this.fieldName, translatedField.fieldName) &&
        Objects.equals(this.text, translatedField.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslatedField {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

