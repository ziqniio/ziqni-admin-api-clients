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
import com.ziqni.admin.client.model.UpdateModelDefault;
import com.ziqni.admin.client.model.UpdateOptParamModels;
import com.ziqni.admin.client.model.UpdateUnitOfMeasureRequestAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateUnitOfMeasureRequest
 */
@JsonPropertyOrder({
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_ID,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_TAGS,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_METADATA,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_NAME,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_ISO_CODE,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_SYMBOL,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_MULTIPLIER,
  UpdateUnitOfMeasureRequest.JSON_PROPERTY_UNIT_OF_MEASURE_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUnitOfMeasureRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

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


  public UpdateUnitOfMeasureRequest id(String id) {
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


  public UpdateUnitOfMeasureRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UpdateUnitOfMeasureRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to add cutom fields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of id's used to add cutom fields")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  public UpdateUnitOfMeasureRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateUnitOfMeasureRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to tag models
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Dc4swmQBVd51K6gPQqFx\",\"Dc4swmQBVd51K6gPQqF2\"]", value = "A list of id's used to tag models")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public UpdateUnitOfMeasureRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateUnitOfMeasureRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public UpdateUnitOfMeasureRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a unit of measure
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States Dollar", value = "The name of a unit of measure")
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


  public UpdateUnitOfMeasureRequest description(String description) {
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


  public UpdateUnitOfMeasureRequest isoCode(String isoCode) {
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


  public UpdateUnitOfMeasureRequest symbol(String symbol) {
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


  public UpdateUnitOfMeasureRequest multiplier(Double multiplier) {
    this.multiplier = multiplier;
    return this;
  }

   /**
   * Is used to multiply the value from the standardised one that is being used
   * @return multiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Is used to multiply the value from the standardised one that is being used")
  @JsonProperty(JSON_PROPERTY_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMultiplier() {
    return multiplier;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiplier(Double multiplier) {
    this.multiplier = multiplier;
  }


  public UpdateUnitOfMeasureRequest unitOfMeasureType(UnitOfMeasureType unitOfMeasureType) {
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


  /**
   * Return true if this UpdateUnitOfMeasureRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUnitOfMeasureRequest updateUnitOfMeasureRequest = (UpdateUnitOfMeasureRequest) o;
    return Objects.equals(this.id, updateUnitOfMeasureRequest.id) &&
        Objects.equals(this.customFields, updateUnitOfMeasureRequest.customFields) &&
        Objects.equals(this.tags, updateUnitOfMeasureRequest.tags) &&
        Objects.equals(this.metadata, updateUnitOfMeasureRequest.metadata) &&
        Objects.equals(this.name, updateUnitOfMeasureRequest.name) &&
        Objects.equals(this.description, updateUnitOfMeasureRequest.description) &&
        Objects.equals(this.isoCode, updateUnitOfMeasureRequest.isoCode) &&
        Objects.equals(this.symbol, updateUnitOfMeasureRequest.symbol) &&
        Objects.equals(this.multiplier, updateUnitOfMeasureRequest.multiplier) &&
        Objects.equals(this.unitOfMeasureType, updateUnitOfMeasureRequest.unitOfMeasureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customFields, tags, metadata, name, description, isoCode, symbol, multiplier, unitOfMeasureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUnitOfMeasureRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

