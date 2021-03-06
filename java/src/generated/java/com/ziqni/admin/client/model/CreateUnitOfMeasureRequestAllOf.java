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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateUnitOfMeasureRequestAllOf
 */
@JsonPropertyOrder({
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_NAME,
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_KEY,
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_ISO_CODE,
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_SYMBOL,
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_MULTIPLIER,
  CreateUnitOfMeasureRequestAllOf.JSON_PROPERTY_UNIT_OF_MEASURE_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateUnitOfMeasureRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ISO_CODE = "isoCode";
  private String isoCode;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_MULTIPLIER = "multiplier";
  private Double multiplier;

  public static final String JSON_PROPERTY_UNIT_OF_MEASURE_TYPE = "unitOfMeasureType";
  private UnitOfMeasureType unitOfMeasureType;


  public CreateUnitOfMeasureRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a unit of measure
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "United States Dollar", required = true, value = "The name of a unit of measure")
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


  public CreateUnitOfMeasureRequestAllOf key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The reference to the unit of measure in your system
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "united-states-dollar", required = true, value = "The reference to the unit of measure in your system")
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


  public CreateUnitOfMeasureRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of a unit of measure
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The United States dollar, or U.S. dollar, is made up of 100 cents and is presented with the symbol $ or US$ to differentiate it from other dollar-based currencies", value = "The description of a unit of measure")
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


  public CreateUnitOfMeasureRequestAllOf isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * An alphabetical or numerical code to identify a unit of measure
   * @return isoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "An alphabetical or numerical code to identify a unit of measure")
  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsoCode() {
    return isoCode;
  }


  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }


  public CreateUnitOfMeasureRequestAllOf symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of a unit of measure
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "$", value = "The symbol of a unit of measure")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public CreateUnitOfMeasureRequestAllOf multiplier(Double multiplier) {
    this.multiplier = multiplier;
    return this;
  }

   /**
   * Is used to multiply the value from the standardised one that is being used
   * @return multiplier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Is used to multiply the value from the standardised one that is being used")
  @JsonProperty(JSON_PROPERTY_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getMultiplier() {
    return multiplier;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMultiplier(Double multiplier) {
    this.multiplier = multiplier;
  }


  public CreateUnitOfMeasureRequestAllOf unitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
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


  /**
   * Return true if this CreateUnitOfMeasureRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUnitOfMeasureRequestAllOf createUnitOfMeasureRequestAllOf = (CreateUnitOfMeasureRequestAllOf) o;
    return Objects.equals(this.name, createUnitOfMeasureRequestAllOf.name) &&
        Objects.equals(this.key, createUnitOfMeasureRequestAllOf.key) &&
        Objects.equals(this.description, createUnitOfMeasureRequestAllOf.description) &&
        Objects.equals(this.isoCode, createUnitOfMeasureRequestAllOf.isoCode) &&
        Objects.equals(this.symbol, createUnitOfMeasureRequestAllOf.symbol) &&
        Objects.equals(this.multiplier, createUnitOfMeasureRequestAllOf.multiplier) &&
        Objects.equals(this.unitOfMeasureType, createUnitOfMeasureRequestAllOf.unitOfMeasureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, description, isoCode, symbol, multiplier, unitOfMeasureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUnitOfMeasureRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    unitOfMeasureType: ").append(toIndentedString(unitOfMeasureType)).append("\n");
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

