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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateRabbitMqConnectionRequestAllOf
 */
@JsonPropertyOrder({
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_NAME,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_DESCRIPTION,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_PORT,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_VIRTUAL_HOST,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_URI,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_USER_NAME,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_PASSWORD,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_QUEUE_NAME,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_EXCHANGE,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_ROUTING_KEY,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_ADD_CONSTRAINTS,
  CreateRabbitMqConnectionRequestAllOf.JSON_PROPERTY_TRANSFORMER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRabbitMqConnectionRequestAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_VIRTUAL_HOST = "virtualHost";
  private String virtualHost;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

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

  public static final String JSON_PROPERTY_ADD_CONSTRAINTS = "addConstraints";
  private List<String> addConstraints = null;

  public static final String JSON_PROPERTY_TRANSFORMER_ID = "transformerId";
  private String transformerId;


  public CreateRabbitMqConnectionRequestAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the consumer
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RabbitMq Test", value = "The name of the consumer")
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


  public CreateRabbitMqConnectionRequestAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the consumer
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the consumer")
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


  public CreateRabbitMqConnectionRequestAllOf port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port number on which consumer will connect on rabbitmq broker
   * @return port
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The port number on which consumer will connect on rabbitmq broker")
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


  public CreateRabbitMqConnectionRequestAllOf virtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
    return this;
  }

   /**
   * The virtual host of the rabbitmq broker
   * @return virtualHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The virtual host of the rabbitmq broker")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualHost() {
    return virtualHost;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
  }


  public CreateRabbitMqConnectionRequestAllOf uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Broker endpoint
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Broker endpoint")
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


  public CreateRabbitMqConnectionRequestAllOf userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Consumer username for authentication
   * @return userName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consumer username for authentication")
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


  public CreateRabbitMqConnectionRequestAllOf password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Consumer password for authentication
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consumer password for authentication")
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


  public CreateRabbitMqConnectionRequestAllOf queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * Name of the queue
   * @return queueName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the queue")
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


  public CreateRabbitMqConnectionRequestAllOf exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Exchange to bind to
   * @return exchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exchange to bind to")
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


  public CreateRabbitMqConnectionRequestAllOf routingKey(String routingKey) {
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


  public CreateRabbitMqConnectionRequestAllOf addConstraints(List<String> addConstraints) {
    this.addConstraints = addConstraints;
    return this;
  }

  public CreateRabbitMqConnectionRequestAllOf addAddConstraintsItem(String addConstraintsItem) {
    if (this.addConstraints == null) {
      this.addConstraints = new ArrayList<>();
    }
    this.addConstraints.add(addConstraintsItem);
    return this;
  }

   /**
   * Additional constraints.  Supported values:  - ssl  - durable  - exclusive  - autoDelete
   * @return addConstraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional constraints.  Supported values:  - ssl  - durable  - exclusive  - autoDelete")
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


  public CreateRabbitMqConnectionRequestAllOf transformerId(String transformerId) {
    this.transformerId = transformerId;
    return this;
  }

   /**
   * Get transformerId
   * @return transformerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  /**
   * Return true if this CreateRabbitMqConnectionRequest_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRabbitMqConnectionRequestAllOf createRabbitMqConnectionRequestAllOf = (CreateRabbitMqConnectionRequestAllOf) o;
    return Objects.equals(this.name, createRabbitMqConnectionRequestAllOf.name) &&
        Objects.equals(this.description, createRabbitMqConnectionRequestAllOf.description) &&
        Objects.equals(this.port, createRabbitMqConnectionRequestAllOf.port) &&
        Objects.equals(this.virtualHost, createRabbitMqConnectionRequestAllOf.virtualHost) &&
        Objects.equals(this.uri, createRabbitMqConnectionRequestAllOf.uri) &&
        Objects.equals(this.userName, createRabbitMqConnectionRequestAllOf.userName) &&
        Objects.equals(this.password, createRabbitMqConnectionRequestAllOf.password) &&
        Objects.equals(this.queueName, createRabbitMqConnectionRequestAllOf.queueName) &&
        Objects.equals(this.exchange, createRabbitMqConnectionRequestAllOf.exchange) &&
        Objects.equals(this.routingKey, createRabbitMqConnectionRequestAllOf.routingKey) &&
        Objects.equals(this.addConstraints, createRabbitMqConnectionRequestAllOf.addConstraints) &&
        Objects.equals(this.transformerId, createRabbitMqConnectionRequestAllOf.transformerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, port, virtualHost, uri, userName, password, queueName, exchange, routingKey, addConstraints, transformerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRabbitMqConnectionRequestAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    virtualHost: ").append(toIndentedString(virtualHost)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    addConstraints: ").append(toIndentedString(addConstraints)).append("\n");
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
