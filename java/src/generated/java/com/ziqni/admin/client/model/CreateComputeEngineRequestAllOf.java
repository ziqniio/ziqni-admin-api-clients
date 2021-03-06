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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateComputeEngineRequestAllOf
 */
@JsonPropertyOrder({
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_VERSION,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_NAME,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_UPTIME,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_CONSTRAINTS,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_STATISTICS,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_LAST_KNOWN_STATUS_CODE,
  CreateComputeEngineRequestAllOf.JSON_PROPERTY_METADATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateComputeEngineRequestAllOf {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private Long uptime;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private Map<String, String> statistics = null;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS_CODE = "lastKnownStatusCode";
  private Integer lastKnownStatusCode;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public CreateComputeEngineRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateComputeEngineRequestAllOf version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Long version) {
    this.version = version;
  }


  public CreateComputeEngineRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CreateComputeEngineRequestAllOf uptime(Long uptime) {
    this.uptime = uptime;
    return this;
  }

   /**
   * Long
   * @return uptime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Long")
  @JsonProperty(JSON_PROPERTY_UPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUptime() {
    return uptime;
  }


  @JsonProperty(JSON_PROPERTY_UPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUptime(Long uptime) {
    this.uptime = uptime;
  }


  public CreateComputeEngineRequestAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public CreateComputeEngineRequestAllOf addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  public CreateComputeEngineRequestAllOf statistics(Map<String, String> statistics) {
    this.statistics = statistics;
    return this;
  }

  public CreateComputeEngineRequestAllOf putStatisticsItem(String key, String statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new HashMap<>();
    }
    this.statistics.put(key, statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistics(Map<String, String> statistics) {
    this.statistics = statistics;
  }


  public CreateComputeEngineRequestAllOf lastKnownStatusCode(Integer lastKnownStatusCode) {
    this.lastKnownStatusCode = lastKnownStatusCode;
    return this;
  }

   /**
   * Get lastKnownStatusCode
   * @return lastKnownStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastKnownStatusCode() {
    return lastKnownStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastKnownStatusCode(Integer lastKnownStatusCode) {
    this.lastKnownStatusCode = lastKnownStatusCode;
  }


  public CreateComputeEngineRequestAllOf metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateComputeEngineRequestAllOf putMetadataItem(String key, String metadataItem) {
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


  /**
   * Return true if this CreateComputeEngineRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateComputeEngineRequestAllOf createComputeEngineRequestAllOf = (CreateComputeEngineRequestAllOf) o;
    return Objects.equals(this.description, createComputeEngineRequestAllOf.description) &&
        Objects.equals(this.version, createComputeEngineRequestAllOf.version) &&
        Objects.equals(this.name, createComputeEngineRequestAllOf.name) &&
        Objects.equals(this.uptime, createComputeEngineRequestAllOf.uptime) &&
        Objects.equals(this.constraints, createComputeEngineRequestAllOf.constraints) &&
        Objects.equals(this.statistics, createComputeEngineRequestAllOf.statistics) &&
        Objects.equals(this.lastKnownStatusCode, createComputeEngineRequestAllOf.lastKnownStatusCode) &&
        Objects.equals(this.metadata, createComputeEngineRequestAllOf.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, version, name, uptime, constraints, statistics, lastKnownStatusCode, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateComputeEngineRequestAllOf {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    lastKnownStatusCode: ").append(toIndentedString(lastKnownStatusCode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

