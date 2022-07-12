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
import com.ziqni.admin.client.model.Collaborator;
import com.ziqni.admin.client.model.Error;
import com.ziqni.admin.client.model.MetaExtended;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CollaboratorResponse
 */
@JsonPropertyOrder({
  CollaboratorResponse.JSON_PROPERTY_META,
  CollaboratorResponse.JSON_PROPERTY_RESULTS,
  CollaboratorResponse.JSON_PROPERTY_ERRORS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollaboratorResponse {
  public static final String JSON_PROPERTY_META = "meta";
  private MetaExtended meta;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Collaborator> results = new ArrayList<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;


  public CollaboratorResponse meta(MetaExtended meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MetaExtended getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(MetaExtended meta) {
    this.meta = meta;
  }


  public CollaboratorResponse results(List<Collaborator> results) {
    this.results = results;
    return this;
  }

  public CollaboratorResponse addResultsItem(Collaborator resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Collaborator> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResults(List<Collaborator> results) {
    this.results = results;
  }


  public CollaboratorResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CollaboratorResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this CollaboratorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaboratorResponse collaboratorResponse = (CollaboratorResponse) o;
    return Objects.equals(this.meta, collaboratorResponse.meta) &&
        Objects.equals(this.results, collaboratorResponse.results) &&
        Objects.equals(this.errors, collaboratorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, results, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollaboratorResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

