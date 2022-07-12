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
import com.ziqni.admin.client.model.CreateMemberRequestAllOf;
import com.ziqni.admin.client.model.CreateOptParamModels;
import com.ziqni.admin.client.model.MemberType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This is a request for Member creation
 */
@ApiModel(description = "This is a request for Member creation")
@JsonPropertyOrder({
  CreateMemberRequest.JSON_PROPERTY_NAME,
  CreateMemberRequest.JSON_PROPERTY_MEMBER_REF_ID,
  CreateMemberRequest.JSON_PROPERTY_MEMBER_TYPE,
  CreateMemberRequest.JSON_PROPERTY_TEAM_MEMBERS,
  CreateMemberRequest.JSON_PROPERTY_ADD_CONSTRAINTS,
  CreateMemberRequest.JSON_PROPERTY_TIME_ZONE_OFFSET,
  CreateMemberRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  CreateMemberRequest.JSON_PROPERTY_TAGS,
  CreateMemberRequest.JSON_PROPERTY_METADATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateMemberRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MEMBER_REF_ID = "memberRefId";
  private String memberRefId;

  public static final String JSON_PROPERTY_MEMBER_TYPE = "memberType";
  private MemberType memberType;

  public static final String JSON_PROPERTY_TEAM_MEMBERS = "teamMembers";
  private List<String> teamMembers = null;

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_TIME_ZONE_OFFSET = "timeZoneOffset";
  private String timeZoneOffset;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public CreateMemberRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the member that is used on leader boards and public displays
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Player 1", required = true, value = "The name of the member that is used on leader boards and public displays")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateMemberRequest memberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
    return this;
  }

   /**
   * The reference to this member in your system
   * @return memberRefId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Player-1", required = true, value = "The reference to this member in your system")
  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMemberRefId() {
    return memberRefId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberRefId(String memberRefId) {
    this.memberRefId = memberRefId;
  }


  public CreateMemberRequest memberType(MemberType memberType) {
    this.memberType = memberType;
    return this;
  }

   /**
   * Get memberType
   * @return memberType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MemberType getMemberType() {
    return memberType;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberType(MemberType memberType) {
    this.memberType = memberType;
  }


  public CreateMemberRequest teamMembers(List<String> teamMembers) {
    this.teamMembers = teamMembers;
    return this;
  }

  public CreateMemberRequest addTeamMembersItem(String teamMembersItem) {
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


  public CreateMemberRequest addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateMemberRequest addAddConstraintsItem(String addConstraintsItem) {
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
  @ApiModelProperty(example = "- notifyMember - isMemberAcknowledgmentRequired", value = "Additional constraints")
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


  public CreateMemberRequest timeZoneOffset(String timeZoneOffset) {
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


  public CreateMemberRequest customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CreateMemberRequest putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * A list of custom field entries
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of custom field entries")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  public CreateMemberRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateMemberRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of id&#39;s used to tag models
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Dc4swmQBVd51K6gPQqFx\",\"Dc4swmQBVd51K6gPQqF2\"]", value = "A list of id's used to tag models")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public CreateMemberRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateMemberRequest putMetadataItem(String key, String metadataItem) {
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
   * Return true if this CreateMemberRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMemberRequest createMemberRequest = (CreateMemberRequest) o;
    return Objects.equals(this.name, createMemberRequest.name) &&
        Objects.equals(this.memberRefId, createMemberRequest.memberRefId) &&
        Objects.equals(this.memberType, createMemberRequest.memberType) &&
        Objects.equals(this.teamMembers, createMemberRequest.teamMembers) &&
        Objects.equals(this.addConstraints, createMemberRequest.addConstraints) &&
        Objects.equals(this.timeZoneOffset, createMemberRequest.timeZoneOffset) &&
        Objects.equals(this.customFields, createMemberRequest.customFields) &&
        Objects.equals(this.tags, createMemberRequest.tags) &&
        Objects.equals(this.metadata, createMemberRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, memberRefId, memberType, teamMembers, addConstraints, timeZoneOffset, customFields, tags, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMemberRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberRefId: ").append(toIndentedString(memberRefId)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    teamMembers: ").append(toIndentedString(teamMembers)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

