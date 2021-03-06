/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */

/*
 * Ziqni System Notification Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.admin.client.notifications.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * SubscriptionRequestItem
 */
@JsonPropertyOrder({
  SubscriptionRequestItem.JSON_PROPERTY_ENTITY_TYPE,
  SubscriptionRequestItem.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionRequestItem {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;


  public SubscriptionRequestItem entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public SubscriptionRequestItem constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public SubscriptionRequestItem addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraints of this subscription like gauranteedDelivery
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Constraints of this subscription like gauranteedDelivery")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  /**
   * Return true if this SubscriptionRequestItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequestItem subscriptionRequestItem = (SubscriptionRequestItem) o;
    return Objects.equals(this.entityType, subscriptionRequestItem.entityType) &&
        Objects.equals(this.constraints, subscriptionRequestItem.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequestItem {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

