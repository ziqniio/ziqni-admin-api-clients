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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Subscribes a client to receive out-of-band data
 */
@ApiModel(description = "Subscribes a client to receive out-of-band data")
@JsonPropertyOrder({
  SubscriptionRequest.JSON_PROPERTY_ENTITY_TYPES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubscriptionRequest {
  public static final String JSON_PROPERTY_ENTITY_TYPES = "entityTypes";
  private List<SubscriptionRequestItem> entityTypes = new ArrayList<>();


  public SubscriptionRequest entityTypes(List<SubscriptionRequestItem> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public SubscriptionRequest addEntityTypesItem(SubscriptionRequestItem entityTypesItem) {
    this.entityTypes.add(entityTypesItem);
    return this;
  }

   /**
   * Get entityTypes
   * @return entityTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubscriptionRequestItem> getEntityTypes() {
    return entityTypes;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityTypes(List<SubscriptionRequestItem> entityTypes) {
    this.entityTypes = entityTypes;
  }


  /**
   * Return true if this SubscriptionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.entityTypes, subscriptionRequest.entityTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
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

