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
import com.ziqni.admin.client.model.UnitOfMeasureType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateActionTypeRequestAllOf
 */
@JsonPropertyOrder({
  UpdateActionTypeRequestAllOf.JSON_PROPERTY_NAME,
  UpdateActionTypeRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  UpdateActionTypeRequestAllOf.JSON_PROPERTY_UNIT_OF_MEASURE_TYPE,
  UpdateActionTypeRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateActionTypeRequestAllOf.JSON_PROPERTY_REMOVE_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateActionTypeRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_UNIT_OF_MEASURE_TYPE = "unitOfMeasureType";
  private UnitOfMeasureType unitOfMeasureType;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_REMOVE_CONSTRAINTS = "removeConstraints";
  private List<String> removeConstraints = null;


  public UpdateActionTypeRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Action Helper
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Big Win", value = "The name of the Action Helper")
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


  public UpdateActionTypeRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the rule action helper for your reference
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The action called Big Win", value = "The description of the rule action helper for your reference")
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


  public UpdateActionTypeRequestAllOf unitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
    return this;
  }

   /**
   * Get unitOfMeasureType
   * @return unitOfMeasureType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnitOfMeasureType getUnitOfMeasureType() {
    return unitOfMeasureType;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
  }


  public UpdateActionTypeRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateActionTypeRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
    if (this.addConstraints == null) {
      this.addConstraints = new ArrayList<>();
    }
    this.addConstraints.add(addConstraintsItem);
    return this;
  }

   /**
   * Additional constraints, if the value is present it means the
   * @return addConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- system", value = "Additional constraints, if the value is present it means the")
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


  public UpdateActionTypeRequestAllOf removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateActionTypeRequestAllOf addRemoveConstraintsItem(String removeConstraintsItem) {
    if (this.removeConstraints == null) {
      this.removeConstraints = new ArrayList<>();
    }
    this.removeConstraints.add(removeConstraintsItem);
    return this;
  }

   /**
   * Additional constraints, if the value is present it means the
   * @return removeConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- system    ", value = "Additional constraints, if the value is present it means the")
  @JsonProperty(JSON_PROPERTY_REMOVE_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRemoveConstraints() {
    return removeConstraints;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoveConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
  }


  /**
   * Return true if this UpdateActionTypeRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateActionTypeRequestAllOf updateActionTypeRequestAllOf = (UpdateActionTypeRequestAllOf) o;
    return Objects.equals(this.name, updateActionTypeRequestAllOf.name) &&
        Objects.equals(this.description, updateActionTypeRequestAllOf.description) &&
        Objects.equals(this.unitOfMeasureType, updateActionTypeRequestAllOf.unitOfMeasureType) &&
        Objects.equals(this.addConstraints, updateActionTypeRequestAllOf.addConstraints) &&
        Objects.equals(this.removeConstraints, updateActionTypeRequestAllOf.removeConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, unitOfMeasureType, addConstraints, removeConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateActionTypeRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitOfMeasureType: ").append(toIndentedString(unitOfMeasureType)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    removeConstraints: ").append(toIndentedString(removeConstraints)).append("\n");
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

