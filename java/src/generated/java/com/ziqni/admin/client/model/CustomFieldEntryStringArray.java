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
import com.ziqni.admin.client.model.CustomFieldEntry;
import com.ziqni.admin.client.model.CustomFieldEntryStringArrayAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The base type for custom field entries
 */
@ApiModel(description = "The base type for custom field entries")
@JsonPropertyOrder({
  CustomFieldEntryStringArray.JSON_PROPERTY_FIELD_TYPE,
  CustomFieldEntryStringArray.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomFieldEntryStringArray {
  public static final String JSON_PROPERTY_FIELD_TYPE = "fieldType";
  private String fieldType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private List<String> value = null;


  public CustomFieldEntryStringArray fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The data type stored in this generic object ( string, number, string[], number[])
   * @return fieldType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The data type stored in this generic object ( string, number, string[], number[])")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public CustomFieldEntryStringArray value(List<String> value) {
    this.value = value;
    return this;
  }

  public CustomFieldEntryStringArray addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(List<String> value) {
    this.value = value;
  }


  /**
   * Return true if this CustomFieldEntryStringArray object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldEntryStringArray customFieldEntryStringArray = (CustomFieldEntryStringArray) o;
    return Objects.equals(this.fieldType, customFieldEntryStringArray.fieldType) &&
        Objects.equals(this.value, customFieldEntryStringArray.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldEntryStringArray {\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

