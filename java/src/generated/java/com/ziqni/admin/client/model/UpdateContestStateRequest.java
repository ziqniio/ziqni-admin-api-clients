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
import com.ziqni.admin.client.model.ContestStateOperations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateContestStateRequest
 */
@JsonPropertyOrder({
  UpdateContestStateRequest.JSON_PROPERTY_CONTEST_ID,
  UpdateContestStateRequest.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateContestStateRequest {
  public static final String JSON_PROPERTY_CONTEST_ID = "contestId";
  private String contestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ContestStateOperations status;


  public UpdateContestStateRequest contestId(String contestId) {
    this.contestId = contestId;
    return this;
  }

   /**
   * A unique identifier of a Contest
   * @return contestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dc4swmQBVd51K6gPQqFx", value = "A unique identifier of a Contest")
  @JsonProperty(JSON_PROPERTY_CONTEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContestId() {
    return contestId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContestId(String contestId) {
    this.contestId = contestId;
  }


  public UpdateContestStateRequest status(ContestStateOperations status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContestStateOperations getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ContestStateOperations status) {
    this.status = status;
  }


  /**
   * Return true if this UpdateContestStateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateContestStateRequest updateContestStateRequest = (UpdateContestStateRequest) o;
    return Objects.equals(this.contestId, updateContestStateRequest.contestId) &&
        Objects.equals(this.status, updateContestStateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contestId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContestStateRequest {\n");
    sb.append("    contestId: ").append(toIndentedString(contestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

