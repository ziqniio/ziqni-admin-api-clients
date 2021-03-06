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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateFileObjectRequestAllOf
 */
@JsonPropertyOrder({
  UpdateFileObjectRequestAllOf.JSON_PROPERTY_REPOSITORY_ID,
  UpdateFileObjectRequestAllOf.JSON_PROPERTY_NAME,
  UpdateFileObjectRequestAllOf.JSON_PROPERTY_MIME_TYPE,
  UpdateFileObjectRequestAllOf.JSON_PROPERTY_PARENT_FOLDER_PATH,
  UpdateFileObjectRequestAllOf.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateFileObjectRequestAllOf {
  public static final String JSON_PROPERTY_REPOSITORY_ID = "repositoryId";
  private String repositoryId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private String mimeType;

  public static final String JSON_PROPERTY_PARENT_FOLDER_PATH = "parentFolderPath";
  private String parentFolderPath;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;


  public UpdateFileObjectRequestAllOf repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * The repository identifier this file belongs too
   * @return repositoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sample", value = "The repository identifier this file belongs too")
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepositoryId() {
    return repositoryId;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }


  public UpdateFileObjectRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the original file uploaded
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "First-upload-file-sample.png", value = "Name of the original file uploaded")
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


  public UpdateFileObjectRequestAllOf mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime type of the file. Valid mime types - text/csv or application/vmd.ms-excel
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "application/vnd.png", value = "Mime type of the file. Valid mime types - text/csv or application/vmd.ms-excel")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public UpdateFileObjectRequestAllOf parentFolderPath(String parentFolderPath) {
    this.parentFolderPath = parentFolderPath;
    return this;
  }

   /**
   * The folder containing the attachment within the repository
   * @return parentFolderPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/achievement-icons", value = "The folder containing the attachment within the repository")
  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentFolderPath() {
    return parentFolderPath;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentFolderPath(String parentFolderPath) {
    this.parentFolderPath = parentFolderPath;
  }


  public UpdateFileObjectRequestAllOf constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public UpdateFileObjectRequestAllOf addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints, if the value is present it means the
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional constraints, if the value is present it means the")
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
   * Return true if this UpdateFileObjectRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFileObjectRequestAllOf updateFileObjectRequestAllOf = (UpdateFileObjectRequestAllOf) o;
    return Objects.equals(this.repositoryId, updateFileObjectRequestAllOf.repositoryId) &&
        Objects.equals(this.name, updateFileObjectRequestAllOf.name) &&
        Objects.equals(this.mimeType, updateFileObjectRequestAllOf.mimeType) &&
        Objects.equals(this.parentFolderPath, updateFileObjectRequestAllOf.parentFolderPath) &&
        Objects.equals(this.constraints, updateFileObjectRequestAllOf.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryId, name, mimeType, parentFolderPath, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFileObjectRequestAllOf {\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    parentFolderPath: ").append(toIndentedString(parentFolderPath)).append("\n");
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

