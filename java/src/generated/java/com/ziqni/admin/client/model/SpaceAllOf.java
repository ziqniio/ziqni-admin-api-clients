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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SpaceAllOf
 */
@JsonPropertyOrder({
  SpaceAllOf.JSON_PROPERTY_ACCOUNT_TYPE,
  SpaceAllOf.JSON_PROPERTY_MASTER_SPACE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpaceAllOf {
  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private String accountType;

  public static final String JSON_PROPERTY_MASTER_SPACE = "masterSpace";
  private String masterSpace;


  public SpaceAllOf accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account; personal or company or vendor
   * @return accountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "company", required = true, value = "Type of account; personal or company or vendor")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public SpaceAllOf masterSpace(String masterSpace) {
    this.masterSpace = masterSpace;
    return this;
  }

   /**
   * The master account for this account
   * @return masterSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sc1samQmVr61KgaPQq7x", value = "The master account for this account")
  @JsonProperty(JSON_PROPERTY_MASTER_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMasterSpace() {
    return masterSpace;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterSpace(String masterSpace) {
    this.masterSpace = masterSpace;
  }


  /**
   * Return true if this Space_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceAllOf spaceAllOf = (SpaceAllOf) o;
    return Objects.equals(this.accountType, spaceAllOf.accountType) &&
        Objects.equals(this.masterSpace, spaceAllOf.masterSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, masterSpace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceAllOf {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    masterSpace: ").append(toIndentedString(masterSpace)).append("\n");
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

