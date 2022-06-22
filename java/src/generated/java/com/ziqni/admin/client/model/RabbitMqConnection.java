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
import com.ziqni.admin.client.model.ModelDefault;
import com.ziqni.admin.client.model.OptParamModels;
import com.ziqni.admin.client.model.RabbitMqConnectionAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RabbitMqConnection
 */
@JsonPropertyOrder({
  RabbitMqConnection.JSON_PROPERTY_ID,
  RabbitMqConnection.JSON_PROPERTY_SPACE_NAME,
  RabbitMqConnection.JSON_PROPERTY_CREATED,
  RabbitMqConnection.JSON_PROPERTY_CUSTOM_FIELDS,
  RabbitMqConnection.JSON_PROPERTY_TAGS,
  RabbitMqConnection.JSON_PROPERTY_METADATA,
  RabbitMqConnection.JSON_PROPERTY_NAME,
  RabbitMqConnection.JSON_PROPERTY_DESCRIPTION,
  RabbitMqConnection.JSON_PROPERTY_URI,
  RabbitMqConnection.JSON_PROPERTY_VIRTUAL_HOST,
  RabbitMqConnection.JSON_PROPERTY_PORT,
  RabbitMqConnection.JSON_PROPERTY_USER_NAME,
  RabbitMqConnection.JSON_PROPERTY_PASSWORD,
  RabbitMqConnection.JSON_PROPERTY_QUEUE_NAME,
  RabbitMqConnection.JSON_PROPERTY_EXCHANGE,
  RabbitMqConnection.JSON_PROPERTY_ROUTING_KEY,
  RabbitMqConnection.JSON_PROPERTY_LAST_KNOWN_STATUS,
  RabbitMqConnection.JSON_PROPERTY_LAST_KNOWN_STATUS_CODE,
  RabbitMqConnection.JSON_PROPERTY_CONSTRAINTS,
  RabbitMqConnection.JSON_PROPERTY_TRANSFORMER_ID,
  RabbitMqConnection.JSON_PROPERTY_CONNECTION_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RabbitMqConnection {
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

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_VIRTUAL_HOST = "virtualHost";
  private String virtualHost;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_QUEUE_NAME = "queueName";
  private String queueName;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  private String exchange;

  public static final String JSON_PROPERTY_ROUTING_KEY = "routingKey";
  private String routingKey;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS = "lastKnownStatus";
  private String lastKnownStatus;

  public static final String JSON_PROPERTY_LAST_KNOWN_STATUS_CODE = "lastKnownStatusCode";
  private Integer lastKnownStatusCode;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<String> constraints = new ArrayList<>();

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private String connectionType;


  public RabbitMqConnection id(String id) {
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


  public RabbitMqConnection spaceName(String spaceName) {
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


  public RabbitMqConnection created(OffsetDateTime created) {
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


  public RabbitMqConnection customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public RabbitMqConnection putCustomFieldsItem(String key, Object customFieldsItem) {
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


  public RabbitMqConnection tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RabbitMqConnection addTagsItem(String tagsItem) {
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


  public RabbitMqConnection metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public RabbitMqConnection putMetadataItem(String key, String metadataItem) {
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


  public RabbitMqConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the consumer
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RabbitMq Test", required = true, value = "The name of the consumer")
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


  public RabbitMqConnection description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the consumer
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RabbitMq Test", value = "The description of the consumer")
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


  public RabbitMqConnection uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The SQS endpoint.
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "some-rabbitmq.broker.com", required = true, value = "The SQS endpoint.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public RabbitMqConnection virtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
    return this;
  }

   /**
   * The virtual host of the rabbitmq broker
   * @return virtualHost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "sc1samQmVr61KgaPQq7x", required = true, value = "The virtual host of the rabbitmq broker")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVirtualHost() {
    return virtualHost;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVirtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
  }


  public RabbitMqConnection port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port number on which consumer will connect on rabbitmq broker
   * @return port
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5672", required = true, value = "The port number on which consumer will connect on rabbitmq broker")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public RabbitMqConnection userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Consumer username for authentication
   * @return userName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testUser", required = true, value = "Consumer username for authentication")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public RabbitMqConnection password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Consumer password for authentication
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SomePassword", required = true, value = "Consumer password for authentication")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public RabbitMqConnection queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * Name of the queue
   * @return queueName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "test-queue", required = true, value = "Name of the queue")
  @JsonProperty(JSON_PROPERTY_QUEUE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueueName() {
    return queueName;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }


  public RabbitMqConnection exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Exchange to connect to
   * @return exchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exchange to connect to")
  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExchange() {
    return exchange;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  public RabbitMqConnection routingKey(String routingKey) {
    this.routingKey = routingKey;
    return this;
  }

   /**
   * Routing key to use
   * @return routingKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Routing key to use")
  @JsonProperty(JSON_PROPERTY_ROUTING_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoutingKey() {
    return routingKey;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingKey(String routingKey) {
    this.routingKey = routingKey;
  }


  public RabbitMqConnection lastKnownStatus(String lastKnownStatus) {
    this.lastKnownStatus = lastKnownStatus;
    return this;
  }

   /**
   * Last known status of the connection
   * @return lastKnownStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Stopped", required = true, value = "Last known status of the connection")
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastKnownStatus() {
    return lastKnownStatus;
  }


  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastKnownStatus(String lastKnownStatus) {
    this.lastKnownStatus = lastKnownStatus;
  }


  public RabbitMqConnection lastKnownStatusCode(Integer lastKnownStatusCode) {
    this.lastKnownStatusCode = lastKnownStatusCode;
    return this;
  }

   /**
   * Status code correspoding to the last known status
   * @return lastKnownStatusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Status code correspoding to the last known status")
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLastKnownStatusCode() {
    return lastKnownStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastKnownStatusCode(Integer lastKnownStatusCode) {
    this.lastKnownStatusCode = lastKnownStatusCode;
  }


  public RabbitMqConnection constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public RabbitMqConnection addConstraintsItem(String constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Additional constraints
   * @return constraints
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "- useSsl", required = true, value = "Additional constraints")
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


  public RabbitMqConnection transformerId(String transformerId) {
    this.transformerId = transformerId;
    return this;
  }

   /**
   * The transformer to use, if empty the default system transformer will be used
   * @return transformerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The transformer to use, if empty the default system transformer will be used")
  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransformerId() {
    return transformerId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFORMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransformerId(String transformerId) {
    this.transformerId = transformerId;
  }


  public RabbitMqConnection connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * The type of connection
   * @return connectionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of connection")
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionType() {
    return connectionType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }


  /**
   * Return true if this RabbitMqConnection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RabbitMqConnection rabbitMqConnection = (RabbitMqConnection) o;
    return Objects.equals(this.id, rabbitMqConnection.id) &&
        Objects.equals(this.spaceName, rabbitMqConnection.spaceName) &&
        Objects.equals(this.created, rabbitMqConnection.created) &&
        Objects.equals(this.customFields, rabbitMqConnection.customFields) &&
        Objects.equals(this.tags, rabbitMqConnection.tags) &&
        Objects.equals(this.metadata, rabbitMqConnection.metadata) &&
        Objects.equals(this.name, rabbitMqConnection.name) &&
        Objects.equals(this.description, rabbitMqConnection.description) &&
        Objects.equals(this.uri, rabbitMqConnection.uri) &&
        Objects.equals(this.virtualHost, rabbitMqConnection.virtualHost) &&
        Objects.equals(this.port, rabbitMqConnection.port) &&
        Objects.equals(this.userName, rabbitMqConnection.userName) &&
        Objects.equals(this.password, rabbitMqConnection.password) &&
        Objects.equals(this.queueName, rabbitMqConnection.queueName) &&
        Objects.equals(this.exchange, rabbitMqConnection.exchange) &&
        Objects.equals(this.routingKey, rabbitMqConnection.routingKey) &&
        Objects.equals(this.lastKnownStatus, rabbitMqConnection.lastKnownStatus) &&
        Objects.equals(this.lastKnownStatusCode, rabbitMqConnection.lastKnownStatusCode) &&
        Objects.equals(this.constraints, rabbitMqConnection.constraints) &&
        Objects.equals(this.transformerId, rabbitMqConnection.transformerId) &&
        Objects.equals(this.connectionType, rabbitMqConnection.connectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spaceName, created, customFields, tags, metadata, name, description, uri, virtualHost, port, userName, password, queueName, exchange, routingKey, lastKnownStatus, lastKnownStatusCode, constraints, transformerId, connectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RabbitMqConnection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceName: ").append(toIndentedString(spaceName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    virtualHost: ").append(toIndentedString(virtualHost)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    lastKnownStatus: ").append(toIndentedString(lastKnownStatus)).append("\n");
    sb.append("    lastKnownStatusCode: ").append(toIndentedString(lastKnownStatusCode)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    transformerId: ").append(toIndentedString(transformerId)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
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

