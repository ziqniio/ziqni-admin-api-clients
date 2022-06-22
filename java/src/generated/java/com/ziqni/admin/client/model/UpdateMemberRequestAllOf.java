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
import com.ziqni.admin.client.model.MemberType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateMemberRequestAllOf
 */
@JsonPropertyOrder({
  UpdateMemberRequestAllOf.JSON_PROPERTY_NAME,
  UpdateMemberRequestAllOf.JSON_PROPERTY_MEMBER_TYPE,
  UpdateMemberRequestAllOf.JSON_PROPERTY_TEAM_MEMBERS,
  UpdateMemberRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS,
  UpdateMemberRequestAllOf.JSON_PROPERTY_REMOVE_CONSTRAINTS,
  UpdateMemberRequestAllOf.JSON_PROPERTY_TIME_ZONE_OFFSET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateMemberRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MEMBER_TYPE = "memberType";
  private MemberType memberType;

  public static final String JSON_PROPERTY_TEAM_MEMBERS = "teamMembers";
  private List<String> teamMembers = null;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_REMOVE_CONSTRAINTS = "removeConstraints";
  private List<String> removeConstraints = null;

  public static final String JSON_PROPERTY_TIME_ZONE_OFFSET = "timeZoneOffset";
  private String timeZoneOffset;


  public UpdateMemberRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the member that is used on leader boards and public displays
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Player 1", value = "The name of the member that is used on leader boards and public displays")
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


  public UpdateMemberRequestAllOf memberType(MemberType memberType) {
    this.memberType = memberType;
    return this;
  }

   /**
   * Get memberType
   * @return memberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MemberType getMemberType() {
    return memberType;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberType(MemberType memberType) {
    this.memberType = memberType;
  }


  public UpdateMemberRequestAllOf teamMembers(List<String> teamMembers) {
    this.teamMembers = teamMembers;
    return this;
  }

  public UpdateMemberRequestAllOf addTeamMembersItem(String teamMembersItem) {
    if (this.teamMembers == null) {
      this.teamMembers = new ArrayList<>();
    }
    this.teamMembers.add(teamMembersItem);
    return this;
  }

   /**
   * A social group like Guilds
   * @return teamMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A social group like Guilds")
  @JsonProperty(JSON_PROPERTY_TEAM_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTeamMembers() {
    return teamMembers;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamMembers(List<String> teamMembers) {
    this.teamMembers = teamMembers;
  }


  public UpdateMemberRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public UpdateMemberRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
    if (this.addConstraints == null) {
      this.addConstraints = new ArrayList<>();
    }
    this.addConstraints.add(addConstraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return addConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- Disabled", value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_ADD_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAddConstraints() {
    return addConstraints;
  }


  @JsonProperty(JSON_PROPERTY_ADD_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
  }


  public UpdateMemberRequestAllOf removeConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
    return this;
  }

  public UpdateMemberRequestAllOf addRemoveConstraintsItem(String removeConstraintsItem) {
    if (this.removeConstraints == null) {
      this.removeConstraints = new ArrayList<>();
    }
    this.removeConstraints.add(removeConstraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return removeConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- Disabled", value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_REMOVE_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRemoveConstraints() {
    return removeConstraints;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoveConstraints(List<String> removeConstraints) {
    this.removeConstraints = removeConstraints;
  }


  public UpdateMemberRequestAllOf timeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * To what time zone teh emmber belongs to
   * @return timeZoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To what time zone teh emmber belongs to")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneOffset() {
    return timeZoneOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  /**
   * Return true if this UpdateMemberRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMemberRequestAllOf updateMemberRequestAllOf = (UpdateMemberRequestAllOf) o;
    return Objects.equals(this.name, updateMemberRequestAllOf.name) &&
        Objects.equals(this.memberType, updateMemberRequestAllOf.memberType) &&
        Objects.equals(this.teamMembers, updateMemberRequestAllOf.teamMembers) &&
        Objects.equals(this.addConstraints, updateMemberRequestAllOf.addConstraints) &&
        Objects.equals(this.removeConstraints, updateMemberRequestAllOf.removeConstraints) &&
        Objects.equals(this.timeZoneOffset, updateMemberRequestAllOf.timeZoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, memberType, teamMembers, addConstraints, removeConstraints, timeZoneOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    teamMembers: ").append(toIndentedString(teamMembers)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    removeConstraints: ").append(toIndentedString(removeConstraints)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
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

