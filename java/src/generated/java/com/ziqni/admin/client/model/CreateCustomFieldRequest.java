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
import com.ziqni.admin.client.model.AppliesTo;
import com.ziqni.admin.client.model.FieldType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request to create custom fields
 */
@ApiModel(description = "Request to create custom fields")
@JsonPropertyOrder({
  CreateCustomFieldRequest.JSON_PROPERTY_NAME,
  CreateCustomFieldRequest.JSON_PROPERTY_KEY,
  CreateCustomFieldRequest.JSON_PROPERTY_DESCRIPTION,
  CreateCustomFieldRequest.JSON_PROPERTY_FIELD_TYPE,
  CreateCustomFieldRequest.JSON_PROPERTY_APPLIES_TO
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCustomFieldRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIELD_TYPE = "fieldType";
  private FieldType fieldType;

  public static final String JSON_PROPERTY_APPLIES_TO = "appliesTo";
  private AppliesTo appliesTo;


  public CreateCustomFieldRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a Custom field
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Promotional field", required = true, value = "The name of a Custom field")
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


  public CreateCustomFieldRequest key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of a Custom field
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "promotional-field", required = true, value = "The key of a Custom field")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public CreateCustomFieldRequest description(String description) {
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


  public CreateCustomFieldRequest fieldType(FieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FieldType getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }


  public CreateCustomFieldRequest appliesTo(AppliesTo appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_APPLIES_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppliesTo getAppliesTo() {
    return appliesTo;
  }


  @JsonProperty(JSON_PROPERTY_APPLIES_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppliesTo(AppliesTo appliesTo) {
    this.appliesTo = appliesTo;
  }


  /**
   * Return true if this CreateCustomFieldRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomFieldRequest createCustomFieldRequest = (CreateCustomFieldRequest) o;
    return Objects.equals(this.name, createCustomFieldRequest.name) &&
        Objects.equals(this.key, createCustomFieldRequest.key) &&
        Objects.equals(this.description, createCustomFieldRequest.description) &&
        Objects.equals(this.fieldType, createCustomFieldRequest.fieldType) &&
        Objects.equals(this.appliesTo, createCustomFieldRequest.appliesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, description, fieldType, appliesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomFieldRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
