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
import com.ziqni.admin.client.model.MessageStatus;
import com.ziqni.admin.client.model.MessageType;
import com.ziqni.admin.client.model.Scheduling;
import com.ziqni.admin.client.model.Translation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateNotificationRequestAllOf
 */
@JsonPropertyOrder({
  CreateNotificationRequestAllOf.JSON_PROPERTY_MESSAGE_TYPE,
  CreateNotificationRequestAllOf.JSON_PROPERTY_SUBJECT,
  CreateNotificationRequestAllOf.JSON_PROPERTY_BODY,
  CreateNotificationRequestAllOf.JSON_PROPERTY_STATUS,
  CreateNotificationRequestAllOf.JSON_PROPERTY_TRANSLATIONS,
  CreateNotificationRequestAllOf.JSON_PROPERTY_MEMBER_GROUP,
  CreateNotificationRequestAllOf.JSON_PROPERTY_MEMBER_ID,
  CreateNotificationRequestAllOf.JSON_PROPERTY_SCHEDULING,
  CreateNotificationRequestAllOf.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateNotificationRequestAllOf {
  public static final String JSON_PROPERTY_MESSAGE_TYPE = "messageType";
  private MessageType messageType;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MessageStatus status;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private List<Translation> translations = null;

  public static final String JSON_PROPERTY_MEMBER_GROUP = "memberGroup";
  private List<String> memberGroup = null;

  public static final String JSON_PROPERTY_MEMBER_ID = "memberId";
  private List<String> memberId = new ArrayList<>();

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private Scheduling scheduling;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();


  public CreateNotificationRequestAllOf messageType(MessageType messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageType getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageType(MessageType messageType) {
    this.messageType = messageType;
  }


  public CreateNotificationRequestAllOf subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The title of the message
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Hello and welcome", required = true, value = "The title of the message")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public CreateNotificationRequestAllOf body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The context of the message
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Here is a message to welcome you on board!", required = true, value = "The context of the message")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBody(String body) {
    this.body = body;
  }


  public CreateNotificationRequestAllOf status(MessageStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(MessageStatus status) {
    this.status = status;
  }


  public CreateNotificationRequestAllOf translations(List<Translation> translations) {
    this.translations = translations;
    return this;
  }

  public CreateNotificationRequestAllOf addTranslationsItem(Translation translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Translation> getTranslations() {
    return translations;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }


  public CreateNotificationRequestAllOf memberGroup(List<String> memberGroup) {
    this.memberGroup = memberGroup;
    return this;
  }

  public CreateNotificationRequestAllOf addMemberGroupItem(String memberGroupItem) {
    if (this.memberGroup == null) {
      this.memberGroup = new ArrayList<>();
    }
    this.memberGroup.add(memberGroupItem);
    return this;
  }

   /**
   * The reference ID of the event object
   * @return memberGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "- Dc4swmQBVd51K6gPQqFx", value = "The reference ID of the event object")
  @JsonProperty(JSON_PROPERTY_MEMBER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMemberGroup() {
    return memberGroup;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberGroup(List<String> memberGroup) {
    this.memberGroup = memberGroup;
  }


  public CreateNotificationRequestAllOf memberId(List<String> memberId) {
    this.memberId = memberId;
    return this;
  }

  public CreateNotificationRequestAllOf addMemberIdItem(String memberIdItem) {
    this.memberId.add(memberIdItem);
    return this;
  }

   /**
   * The reference ID of the event object
   * @return memberId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- Dc4swmQBVd51K6gPQqFx", required = true, value = "The reference ID of the event object")
  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getMemberId() {
    return memberId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMemberId(List<String> memberId) {
    this.memberId = memberId;
  }


  public CreateNotificationRequestAllOf scheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Scheduling getScheduling() {
    return scheduling;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }


  public CreateNotificationRequestAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public CreateNotificationRequestAllOf addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- deprecated", required = true, value = "Additional constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }


  /**
   * Return true if this CreateNotificationRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNotificationRequestAllOf createNotificationRequestAllOf = (CreateNotificationRequestAllOf) o;
    return Objects.equals(this.messageType, createNotificationRequestAllOf.messageType) &&
        Objects.equals(this.subject, createNotificationRequestAllOf.subject) &&
        Objects.equals(this.body, createNotificationRequestAllOf.body) &&
        Objects.equals(this.status, createNotificationRequestAllOf.status) &&
        Objects.equals(this.translations, createNotificationRequestAllOf.translations) &&
        Objects.equals(this.memberGroup, createNotificationRequestAllOf.memberGroup) &&
        Objects.equals(this.memberId, createNotificationRequestAllOf.memberId) &&
        Objects.equals(this.scheduling, createNotificationRequestAllOf.scheduling) &&
        Objects.equals(this.constraints, createNotificationRequestAllOf.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, subject, body, status, translations, memberGroup, memberId, scheduling, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNotificationRequestAllOf {\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    memberGroup: ").append(toIndentedString(memberGroup)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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
