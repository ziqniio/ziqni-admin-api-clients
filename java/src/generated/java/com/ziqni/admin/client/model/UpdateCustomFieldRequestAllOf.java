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
import com.ziqni.admin.client.model.AppliesTo;
import com.ziqni.admin.client.model.FieldType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateCustomFieldRequestAllOf
 */
@JsonPropertyOrder({
  UpdateCustomFieldRequestAllOf.JSON_PROPERTY_NAME,
  UpdateCustomFieldRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  UpdateCustomFieldRequestAllOf.JSON_PROPERTY_FIELD_TYPE,
  UpdateCustomFieldRequestAllOf.JSON_PROPERTY_APPLIES_TO
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCustomFieldRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIELD_TYPE = "fieldType";
  private FieldType fieldType;

  public static final String JSON_PROPERTY_APPLIES_TO = "appliesTo";
  private AppliesTo appliesTo;


  public UpdateCustomFieldRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a Custom field
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Promotional field", value = "The name of a Custom field")
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


  public UpdateCustomFieldRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of a Custom field
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Promotional discount field (AD20) applied to Events", value = "The description of a Custom field")
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


  public UpdateCustomFieldRequestAllOf fieldType(FieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldType getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }


  public UpdateCustomFieldRequestAllOf appliesTo(AppliesTo appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLIES_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppliesTo getAppliesTo() {
    return appliesTo;
  }


  @JsonProperty(JSON_PROPERTY_APPLIES_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliesTo(AppliesTo appliesTo) {
    this.appliesTo = appliesTo;
  }


  /**
   * Return true if this UpdateCustomFieldRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomFieldRequestAllOf updateCustomFieldRequestAllOf = (UpdateCustomFieldRequestAllOf) o;
    return Objects.equals(this.name, updateCustomFieldRequestAllOf.name) &&
        Objects.equals(this.description, updateCustomFieldRequestAllOf.description) &&
        Objects.equals(this.fieldType, updateCustomFieldRequestAllOf.fieldType) &&
        Objects.equals(this.appliesTo, updateCustomFieldRequestAllOf.appliesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, fieldType, appliesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomFieldRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
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

