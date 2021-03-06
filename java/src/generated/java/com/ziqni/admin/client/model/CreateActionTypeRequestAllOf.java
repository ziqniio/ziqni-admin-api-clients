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
import com.ziqni.admin.client.model.UnitOfMeasureType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateActionTypeRequestAllOf
 */
@JsonPropertyOrder({
  CreateActionTypeRequestAllOf.JSON_PROPERTY_NAME,
  CreateActionTypeRequestAllOf.JSON_PROPERTY_KEY,
  CreateActionTypeRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateActionTypeRequestAllOf.JSON_PROPERTY_UNIT_OF_MEASURE_TYPE,
  CreateActionTypeRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateActionTypeRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_UNIT_OF_MEASURE_TYPE = "unitOfMeasureType";
  private UnitOfMeasureType unitOfMeasureType;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;


  public CreateActionTypeRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Action Helper
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Big Win", required = true, value = "The name of the Action Helper")
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


  public CreateActionTypeRequestAllOf key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A unique key that represents an action helper
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "big-win", required = true, value = "A unique key that represents an action helper")
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


  public CreateActionTypeRequestAllOf description(String description) {
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


  public CreateActionTypeRequestAllOf unitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
    return this;
  }

   /**
   * Get unitOfMeasureType
   * @return unitOfMeasureType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UnitOfMeasureType getUnitOfMeasureType() {
    return unitOfMeasureType;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
    this.unitOfMeasureType = unitOfMeasureType;
  }


  public CreateActionTypeRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateActionTypeRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
    if (this.addConstraints == null) {
      this.addConstraints = new ArrayList<>();
    }
    this.addConstraints.add(addConstraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return addConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- system", value = "Additional constraints")
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
   * Return true if this CreateActionTypeRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateActionTypeRequestAllOf createActionTypeRequestAllOf = (CreateActionTypeRequestAllOf) o;
    return Objects.equals(this.name, createActionTypeRequestAllOf.name) &&
        Objects.equals(this.key, createActionTypeRequestAllOf.key) &&
        Objects.equals(this.description, createActionTypeRequestAllOf.description) &&
        Objects.equals(this.unitOfMeasureType, createActionTypeRequestAllOf.unitOfMeasureType) &&
        Objects.equals(this.addConstraints, createActionTypeRequestAllOf.addConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, description, unitOfMeasureType, addConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateActionTypeRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitOfMeasureType: ").append(toIndentedString(unitOfMeasureType)).append("\n");
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

