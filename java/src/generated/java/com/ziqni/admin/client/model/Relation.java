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
 * Relation
 */
@JsonPropertyOrder({
  Relation.JSON_PROPERTY_ID,
  Relation.JSON_PROPERTY_RELATION_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Relation {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATION_TYPE = "relationType";
  private String relationType;


  public Relation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique system identifier to which this record is related to
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sc1samQmVr61KgaPQq7x", required = true, value = "A unique system identifier to which this record is related to")
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


  public Relation relationType(String relationType) {
    this.relationType = relationType;
    return this;
  }

   /**
   * Entity type of the id
   * @return relationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "contest", required = true, value = "Entity type of the id")
  @JsonProperty(JSON_PROPERTY_RELATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRelationType() {
    return relationType;
  }


  @JsonProperty(JSON_PROPERTY_RELATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }


  /**
   * Return true if this Relation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relation relation = (Relation) o;
    return Objects.equals(this.id, relation.id) &&
        Objects.equals(this.relationType, relation.relationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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

