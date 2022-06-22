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
import com.ziqni.admin.client.model.FileObjectAllOf;
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.OptParamModels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FileObject
 */
@JsonPropertyOrder({
  FileObject.JSON_PROPERTY_ID,
  FileObject.JSON_PROPERTY_SPACE_NAME,
  FileObject.JSON_PROPERTY_CREATED,
  FileObject.JSON_PROPERTY_CUSTOM_FIELDS,
  FileObject.JSON_PROPERTY_TAGS,
  FileObject.JSON_PROPERTY_METADATA,
  FileObject.JSON_PROPERTY_REPOSITORY_ID,
  FileObject.JSON_PROPERTY_NAME,
  FileObject.JSON_PROPERTY_MIME_TYPE,
  FileObject.JSON_PROPERTY_PATH,
  FileObject.JSON_PROPERTY_PARENT_FOLDER_PATH,
  FileObject.JSON_PROPERTY_URI,
  FileObject.JSON_PROPERTY_SIZE,
  FileObject.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileObject {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SPACE_NAME = "spaceName";
  private String spaceName;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repositoryId";
  private String repositoryId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private String mimeType;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_PARENT_FOLDER_PATH = "parentFolderPath";
  private String parentFolderPath;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = null;


  public FileObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique system generated identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sc1samQmVr61KgaPQq7x", required = true, value = "A unique system generated identifier")
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


  public FileObject spaceName(String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

   /**
   * This is the space name which is linked to the account
   * @return spaceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Your_space_name", required = true, value = "This is the space name which is linked to the account")
  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSpaceName() {
    return spaceName;
  }


  @JsonProperty(JSON_PROPERTY_SPACE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpaceName(String spaceName) {
    this.spaceName = spaceName;
  }


  public FileObject created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO8601 timestamp for when a Model was created. All records are stored in UTC time zone")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public FileObject customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FileObject putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FileObject tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FileObject addTagsItem(String tagsItem) {
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
  @ApiModelProperty(value = "A list of id's used to tag models")
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


  public FileObject metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FileObject putMetadataItem(String key, String metadataItem) {
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


  public FileObject repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * The repository identifier this file belongs too
   * @return repositoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sample", required = true, value = "The repository identifier this file belongs too")
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRepositoryId() {
    return repositoryId;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }


  public FileObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the original file uploaded
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "First-upload-file-sample.png", required = true, value = "Name of the original file uploaded")
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


  public FileObject mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime type of the file. Valid mime types - text/csv or application/vmd.ms-excelor or application/x-directory for directories
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "application/vnd.png", required = true, value = "Mime type of the file. Valid mime types - text/csv or application/vmd.ms-excelor or application/x-directory for directories")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public FileObject path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The name of the attachment within the bucket
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/achievement-icons/images.png", required = true, value = "The name of the attachment within the bucket")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPath(String path) {
    this.path = path;
  }


  public FileObject parentFolderPath(String parentFolderPath) {
    this.parentFolderPath = parentFolderPath;
    return this;
  }

   /**
   * The folder name containing the attachment within the bucket
   * @return parentFolderPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/achievement-icons", required = true, value = "The folder name containing the attachment within the bucket")
  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParentFolderPath() {
    return parentFolderPath;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentFolderPath(String parentFolderPath) {
    this.parentFolderPath = parentFolderPath;
  }


  public FileObject uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The uniform resource identifier where the file can be viewed/downloaded
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://resource/location/file.ext", value = "The uniform resource identifier where the file can be viewed/downloaded")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public FileObject size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The size of the file")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public FileObject constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public FileObject addConstraintsItem(String constraintsItem) {
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
   * Return true if this FileObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObject fileObject = (FileObject) o;
    return Objects.equals(this.id, fileObject.id) &&
        Objects.equals(this.spaceName, fileObject.spaceName) &&
        Objects.equals(this.created, fileObject.created) &&
        Objects.equals(this.customFields, fileObject.customFields) &&
        Objects.equals(this.tags, fileObject.tags) &&
        Objects.equals(this.metadata, fileObject.metadata) &&
        Objects.equals(this.repositoryId, fileObject.repositoryId) &&
        Objects.equals(this.name, fileObject.name) &&
        Objects.equals(this.mimeType, fileObject.mimeType) &&
        Objects.equals(this.path, fileObject.path) &&
        Objects.equals(this.parentFolderPath, fileObject.parentFolderPath) &&
        Objects.equals(this.uri, fileObject.uri) &&
        Objects.equals(this.size, fileObject.size) &&
        Objects.equals(this.constraints, fileObject.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, customFields, tags, metadata, repositoryId, name, mimeType, path, parentFolderPath, uri, size, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    parentFolderPath: ").append(toIndentedString(parentFolderPath)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
