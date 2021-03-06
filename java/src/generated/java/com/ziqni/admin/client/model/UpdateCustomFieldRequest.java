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
import com.ziqni.admin.client.model.UpdateCustomFieldRequestAllOf;
import com.ziqni.admin.client.model.UpdateModelDefault;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request to update custom fields
 */
@ApiModel(description = "Request to update custom fields")
@JsonPropertyOrder({
  UpdateCustomFieldRequest.JSON_PROPERTY_ID,
  UpdateCustomFieldRequest.JSON_PROPERTY_NAME,
  UpdateCustomFieldRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateCustomFieldRequest.JSON_PROPERTY_FIELD_TYPE,
  UpdateCustomFieldRequest.JSON_PROPERTY_APPLIES_TO
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCustomFieldRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIELD_TYPE = "fieldType";
  private FieldType fieldType;

  public static final String JSON_PROPERTY_APPLIES_TO = "appliesTo";
  private AppliesTo appliesTo;


  public UpdateCustomFieldRequest id(String id) {
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


  public UpdateCustomFieldRequest name(String name) {
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


  public UpdateCustomFieldRequest description(String description) {
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


  public UpdateCustomFieldRequest fieldType(FieldType fieldType) {
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


  public UpdateCustomFieldRequest appliesTo(AppliesTo appliesTo) {
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
   * Return true if this UpdateCustomFieldRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomFieldRequest updateCustomFieldRequest = (UpdateCustomFieldRequest) o;
    return Objects.equals(this.id, updateCustomFieldRequest.id) &&
        Objects.equals(this.name, updateCustomFieldRequest.name) &&
        Objects.equals(this.description, updateCustomFieldRequest.description) &&
        Objects.equals(this.fieldType, updateCustomFieldRequest.fieldType) &&
        Objects.equals(this.appliesTo, updateCustomFieldRequest.appliesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, fieldType, appliesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomFieldRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

