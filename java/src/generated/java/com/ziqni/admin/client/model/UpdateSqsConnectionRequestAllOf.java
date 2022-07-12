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
 * UpdateSqsConnectionRequestAllOf
 */
@JsonPropertyOrder({
  UpdateSqsConnectionRequestAllOf.JSON_PROPERTY_NAME,
  UpdateSqsConnectionRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  UpdateSqsConnectionRequestAllOf.JSON_PROPERTY_URI,
  UpdateSqsConnectionRequestAllOf.JSON_PROPERTY_ACESS_KEY,
  UpdateSqsConnectionRequestAllOf.JSON_PROPERTY_SECRET_KEY,
  UpdateSqsConnectionRequestAllOf.JSON_PROPERTY_TRANSFORMER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSqsConnectionRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_ACESS_KEY = "acessKey";
  private String acessKey;

  public static final String JSON_PROPERTY_SECRET_KEY = "secretKey";
  private String secretKey;

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;


  public UpdateSqsConnectionRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the consumer
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQS Test", value = "The name of the consumer")
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


  public UpdateSqsConnectionRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the consumer
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQS Test", value = "The description of the consumer")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateSqsConnectionRequestAllOf uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The SQS endpoint.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://sqs.us-west-1.amazonaws.com/123456789123/test_queue_233", value = "The SQS endpoint.")
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


  public UpdateSqsConnectionRequestAllOf acessKey(String acessKey) {
    this.acessKey = acessKey;
    return this;
  }

   /**
   * The access key of the IAM user
   * @return acessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AKIAQFGYH45678TYH", value = "The access key of the IAM user")
  @JsonProperty(JSON_PROPERTY_ACESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcessKey() {
    return acessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcessKey(String acessKey) {
    this.acessKey = acessKey;
  }


  public UpdateSqsConnectionRequestAllOf secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * The secret key of IAM user
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "swVAJR8makGqWG8+OIKlJEykP5Es2Mgcbo3G09Qk", value = "The secret key of IAM user")
  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretKey() {
    return secretKey;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public UpdateSqsConnectionRequestAllOf transformerId(String transformerId) {
    this.transformerId = transformerId;
    return this;
  }

   /**
   * The transformer to use, if empty the default system transformer will be used
   * @return transformerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transformer to use, if empty the default system transformer will be used")
  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransformerId() {
    return transformerId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransformerId(String transformerId) {
    this.transformerId = transformerId;
  }


  /**
   * Return true if this UpdateSqsConnectionRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSqsConnectionRequestAllOf updateSqsConnectionRequestAllOf = (UpdateSqsConnectionRequestAllOf) o;
    return Objects.equals(this.name, updateSqsConnectionRequestAllOf.name) &&
        Objects.equals(this.description, updateSqsConnectionRequestAllOf.description) &&
        Objects.equals(this.uri, updateSqsConnectionRequestAllOf.uri) &&
        Objects.equals(this.acessKey, updateSqsConnectionRequestAllOf.acessKey) &&
        Objects.equals(this.secretKey, updateSqsConnectionRequestAllOf.secretKey) &&
        Objects.equals(this.transformerId, updateSqsConnectionRequestAllOf.transformerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, uri, acessKey, secretKey, transformerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSqsConnectionRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    acessKey: ").append(toIndentedString(acessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    transformerId: ").append(toIndentedString(transformerId)).append("\n");
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

