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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Location
 */
@JsonPropertyOrder({
  Location.JSON_PROPERTY_LAT,
  Location.JSON_PROPERTY_LON
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Location {
  public static final String JSON_PROPERTY_LAT = "lat";
  private Double lat;

  public static final String JSON_PROPERTY_LON = "lon";
  private Double lon;


  public Location lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Latitude
   * @return lat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "51.260145", required = true, value = "Latitude")
  @JsonProperty(JSON_PROPERTY_LAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLat() {
    return lat;
  }


  @JsonProperty(JSON_PROPERTY_LAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLat(Double lat) {
    this.lat = lat;
  }


  public Location lon(Double lon) {
    this.lon = lon;
    return this;
  }

   /**
   * Longitude
   * @return lon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.8442802", required = true, value = "Longitude")
  @JsonProperty(JSON_PROPERTY_LON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLon() {
    return lon;
  }


  @JsonProperty(JSON_PROPERTY_LON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLon(Double lon) {
    this.lon = lon;
  }


  /**
   * Return true if this Location object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.lon, location.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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

