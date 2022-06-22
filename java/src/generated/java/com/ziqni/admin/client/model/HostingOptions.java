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
 * Host a static website or any other web assets on Ziqni
 */
@ApiModel(description = "Host a static website or any other web assets on Ziqni")
@JsonPropertyOrder({
  HostingOptions.JSON_PROPERTY_INDEX_FILE_NAME,
  HostingOptions.JSON_PROPERTY_ERROR_FILE_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HostingOptions {
  public static final String JSON_PROPERTY_INDEX_FILE_NAME = "indexFileName";
  private String indexFileName;

  public static final String JSON_PROPERTY_ERROR_FILE_NAME = "errorFileName";
  private String errorFileName;


  public HostingOptions indexFileName(String indexFileName) {
    this.indexFileName = indexFileName;
    return this;
  }

   /**
   * Get indexFileName
   * @return indexFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndexFileName() {
    return indexFileName;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexFileName(String indexFileName) {
    this.indexFileName = indexFileName;
  }


  public HostingOptions errorFileName(String errorFileName) {
    this.errorFileName = errorFileName;
    return this;
  }

   /**
   * Get errorFileName
   * @return errorFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorFileName() {
    return errorFileName;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorFileName(String errorFileName) {
    this.errorFileName = errorFileName;
  }


  /**
   * Return true if this HostingOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostingOptions hostingOptions = (HostingOptions) o;
    return Objects.equals(this.indexFileName, hostingOptions.indexFileName) &&
        Objects.equals(this.errorFileName, hostingOptions.errorFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexFileName, errorFileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostingOptions {\n");
    sb.append("    indexFileName: ").append(toIndentedString(indexFileName)).append("\n");
    sb.append("    errorFileName: ").append(toIndentedString(errorFileName)).append("\n");
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
