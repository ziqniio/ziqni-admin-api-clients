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
import com.ziqni.admin.client.model.CollaboratorAllOf;
import com.ziqni.admin.client.model.CollaboratorRolesAvailable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Collaborator
 */
@JsonPropertyOrder({
  Collaborator.JSON_PROPERTY_EMAIL,
  Collaborator.JSON_PROPERTY_ROLES,
  Collaborator.JSON_PROPERTY_LAST_NAME,
  Collaborator.JSON_PROPERTY_FIRST_NAME,
  Collaborator.JSON_PROPERTY_AVAILABLE_ROLES,
  Collaborator.JSON_PROPERTY_ID,
  Collaborator.JSON_PROPERTY_SPACE_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Collaborator {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_AVAILABLE_ROLES = "availableRoles";
  private CollaboratorRolesAvailable availableRoles;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;


  public Collaborator email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user to log in
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "abc@ziqni.com", required = true, value = "The email of the user to log in")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Collaborator roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public Collaborator addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The access role of an individual
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator, Web, User etc", value = "The access role of an individual")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public Collaborator lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The Surname of an individual
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dough", value = "The Surname of an individual")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Collaborator firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The Name of an individual
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "The Name of an individual")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Collaborator availableRoles(CollaboratorRolesAvailable availableRoles) {
    this.availableRoles = availableRoles;
    return this;
  }

   /**
   * Get availableRoles
   * @return availableRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CollaboratorRolesAvailable getAvailableRoles() {
    return availableRoles;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableRoles(CollaboratorRolesAvailable availableRoles) {
    this.availableRoles = availableRoles;
  }


  public Collaborator id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique system generated identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sc1samQmVr61KgaPQq7x", value = "A unique system generated identifier")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Collaborator spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * This is the space name which is linked to the account
   * @return spaceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Your_space_name", value = "This is the space name which is linked to the account")
  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpaceName() {
    return spaceName;
  }


  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }


  /**
   * Return true if this Collaborator object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collaborator collaborator = (Collaborator) o;
    return Objects.equals(this.email, collaborator.email) &&
        Objects.equals(this.roles, collaborator.roles) &&
        Objects.equals(this.lastName, collaborator.lastName) &&
        Objects.equals(this.firstName, collaborator.firstName) &&
        Objects.equals(this.availableRoles, collaborator.availableRoles) &&
        Objects.equals(this.id, collaborator.id) &&
        Objects.equals(this.spaceName, collaborator.spaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, roles, lastName, firstName, availableRoles, id, spaceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collaborator {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    availableRoles: ").append(toIndentedString(availableRoles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
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

