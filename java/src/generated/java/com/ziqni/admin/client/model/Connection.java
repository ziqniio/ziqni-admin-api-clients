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
import com.ziqni.admin.client.model.KafkaConnection;
import com.ziqni.admin.client.model.RabbitMqConnection;
import com.ziqni.admin.client.model.SqsConnection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.ziqni.admin.client.JSON;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = Connection.ConnectionDeserializer.class)
@JsonSerialize(using = Connection.ConnectionSerializer.class)
public class Connection extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Connection.class.getName());

    public static class ConnectionSerializer extends StdSerializer<Connection> {
        public ConnectionSerializer(Class<Connection> t) {
            super(t);
        }

        public ConnectionSerializer() {
            this(null);
        }

        @Override
        public void serialize(Connection value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ConnectionDeserializer extends StdDeserializer<Connection> {
        public ConnectionDeserializer() {
            this(Connection.class);
        }

        public ConnectionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Connection deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize KafkaConnection
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (KafkaConnection.class.equals(Integer.class) || KafkaConnection.class.equals(Long.class) || KafkaConnection.class.equals(Float.class) || KafkaConnection.class.equals(Double.class) || KafkaConnection.class.equals(Boolean.class) || KafkaConnection.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((KafkaConnection.class.equals(Integer.class) || KafkaConnection.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((KafkaConnection.class.equals(Float.class) || KafkaConnection.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (KafkaConnection.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (KafkaConnection.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(KafkaConnection.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'KafkaConnection'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'KafkaConnection'", e);
            }

            // deserialize RabbitMqConnection
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RabbitMqConnection.class.equals(Integer.class) || RabbitMqConnection.class.equals(Long.class) || RabbitMqConnection.class.equals(Float.class) || RabbitMqConnection.class.equals(Double.class) || RabbitMqConnection.class.equals(Boolean.class) || RabbitMqConnection.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RabbitMqConnection.class.equals(Integer.class) || RabbitMqConnection.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RabbitMqConnection.class.equals(Float.class) || RabbitMqConnection.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RabbitMqConnection.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RabbitMqConnection.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RabbitMqConnection.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RabbitMqConnection'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RabbitMqConnection'", e);
            }

            // deserialize SqsConnection
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SqsConnection.class.equals(Integer.class) || SqsConnection.class.equals(Long.class) || SqsConnection.class.equals(Float.class) || SqsConnection.class.equals(Double.class) || SqsConnection.class.equals(Boolean.class) || SqsConnection.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SqsConnection.class.equals(Integer.class) || SqsConnection.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SqsConnection.class.equals(Float.class) || SqsConnection.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SqsConnection.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SqsConnection.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SqsConnection.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SqsConnection'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SqsConnection'", e);
            }

            if (match == 1) {
                Connection ret = new Connection();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Connection: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Connection getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Connection cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public Connection() {
        super("oneOf", Boolean.FALSE);
    }

    public Connection(KafkaConnection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Connection(RabbitMqConnection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Connection(SqsConnection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("KafkaConnection", KafkaConnection.class);
        schemas.put("RabbitMqConnection", RabbitMqConnection.class);
        schemas.put("SqsConnection", SqsConnection.class);
        JSON.registerDescendants(Connection.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Connection.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * KafkaConnection, RabbitMqConnection, SqsConnection
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(KafkaConnection.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RabbitMqConnection.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SqsConnection.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be KafkaConnection, RabbitMqConnection, SqsConnection");
    }

    /**
     * Get the actual instance, which can be the following:
     * KafkaConnection, RabbitMqConnection, SqsConnection
     *
     * @return The actual instance (KafkaConnection, RabbitMqConnection, SqsConnection)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `KafkaConnection`. If the actual instanct is not `KafkaConnection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KafkaConnection`
     * @throws ClassCastException if the instance is not `KafkaConnection`
     */
    public KafkaConnection getKafkaConnection() throws ClassCastException {
        return (KafkaConnection)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RabbitMqConnection`. If the actual instanct is not `RabbitMqConnection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RabbitMqConnection`
     * @throws ClassCastException if the instance is not `RabbitMqConnection`
     */
    public RabbitMqConnection getRabbitMqConnection() throws ClassCastException {
        return (RabbitMqConnection)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SqsConnection`. If the actual instanct is not `SqsConnection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SqsConnection`
     * @throws ClassCastException if the instance is not `SqsConnection`
     */
    public SqsConnection getSqsConnection() throws ClassCastException {
        return (SqsConnection)super.getActualInstance();
    }

}

