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

package com.ziqni.admin.client.api;

import com.ziqni.admin.client.StreamingClient;
import com.ziqni.admin.client.ApiClient;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.ApiResponse;
import com.ziqni.admin.client.Pair;
import com.ziqni.admin.client.model.CreateKafkaConnectionRequest;
import com.ziqni.admin.client.model.CreateRabbitMqConnectionRequest;
import com.ziqni.admin.client.model.CreateSqsConnectionRequest;
import com.ziqni.admin.client.model.KafkaConnectionResponse;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.RabbitMqConnectionResponse;
import com.ziqni.admin.client.model.SqsConnectionResponse;
import com.ziqni.admin.client.model.UpdateConnectionStateRequest;
import com.ziqni.admin.client.model.UpdateKafkaConnectionRequest;
import com.ziqni.admin.client.model.UpdateRabbitMqConnectionRequest;
import com.ziqni.admin.client.model.UpdateSqsConnectionRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class ConsumersApiWs extends ConsumersApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public ConsumersApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Create a new Kafka Consumer Connection in the Ziqni system
            * @param body Create a Kafka Consumer Connection in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createKafkaConnections(CreateKafkaConnectionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createKafkaConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Create a new RabbitMq Consumer Connection in the Ziqni system
            * @param body Create a RabbitMq Consumer Connection in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createRabbitMQConnections(CreateRabbitMqConnectionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createRabbitMQConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Create a new SQS Consumer Connection in the Ziqni system
            * @param body Create a SQS Consumer Connection in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createSqsConnections(CreateSqsConnectionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createSqsConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete the Kafka Consumer Connection for a given identifier specified
            * @param id The unique identifiers of the resources (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteKafkaConnections(List<String> id) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteKafkaConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete a Kafka Connection or a list of Kafka Connections from Ziqni by unique Connection ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete a Kafka Connection or a list of Kafka Connections from Ziqni by unique Connection ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteKafkaConnectionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteKafkaConnectionsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete the RabbitMq Consumer Connection for a given identifier specified
            * @param id The unique identifiers of the resources (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteRabbitMQConnections(List<String> id) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteRabbitMQConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete a RabbitMQ Connection or a list of RabbitMQ Connections from Ziqni by unique Connection ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete a RabbitMQ Connection or a list of RabbitMQ Connections from Ziqni by unique Connection ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteRabbitMQConnectionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteRabbitMQConnectionsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete the SQS Consumer Connection for a given identifier specified
            * @param id The unique identifiers of the resources (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteSqsConnections(List<String> id) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteSqsConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete a SQS Connection or a list of SQS Connections from Ziqni by unique Connection ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete a SQS Connection or a list of SQS Connections from Ziqni by unique Connection ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteSqsConnectionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteSqsConnectionsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Return a list of Kafka Consumer Connections
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;KafkaConnectionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<KafkaConnectionResponse> getKafkaConnections(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<KafkaConnectionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getKafkaConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Retrieve a Kafka Connection or a list of Kafka Connections from Ziqni by unique Connection ID&#39;s or any other Post body parameters using the POST method
            * @param body Retrieve a Kafka Connection or a list of Kafka Connections from Ziqni by unique Connection ID&#39;s or any other Post body parameters using the POST method (optional)
            * @return CompletableFuture&lt;KafkaConnectionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<KafkaConnectionResponse> getKafkaConnectionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<KafkaConnectionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getKafkaConnectionsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Return a list of RabbitMq Consumer Connections
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;RabbitMqConnectionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<RabbitMqConnectionResponse> getRabbitMQConnections(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<RabbitMqConnectionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getRabbitMQConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Retrieve a RabbitMQ Connection or a list of RabbitMQ Connections from Ziqni by unique Connection ID&#39;s or any other Post body parameters using the POST method
            * @param body Retrieve a RabbitMQ Connection or a list of RabbitMQ Connections from Ziqni by unique Connection ID&#39;s or any other Post body parameters using the POST method (optional)
            * @return CompletableFuture&lt;RabbitMqConnectionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<RabbitMqConnectionResponse> getRabbitMQConnectionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<RabbitMqConnectionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getRabbitMQConnectionsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Return a list of SQS Consumer Connections
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;SqsConnectionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<SqsConnectionResponse> getSqsConnections(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<SqsConnectionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getSqsConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Retrieve a SQS Connection or a list of SQS Connections from Ziqni by unique Connection ID&#39;s or any other Post body parameters using the POST method
            * @param body Retrieve a SQS Connection or a list of SQS Connections from Ziqni by unique Connection ID&#39;s or any other Post body parameters using the POST method (optional)
            * @return CompletableFuture&lt;SqsConnectionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<SqsConnectionResponse> getSqsConnectionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<SqsConnectionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getSqsConnectionsByQuery", request);
        return result;
        }
        /**
        * Update connection status
        * Update the state of a Consumer using the POST method
            * @param body Update the state of a Consumer using the POST method (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateConnectionsState(List<UpdateConnectionStateRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateConnectionsState", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Update an existing Kafka Consumer Connection in the Ziqni system
            * @param body Update the Kafka Consumer Connection details in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateKafkaConnections(UpdateKafkaConnectionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateKafkaConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Update the state of a Kafka Connection using the POST method
            * @param body Update the state of a Kafka Connection using the POST method (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateKafkaConnectionsState(List<UpdateConnectionStateRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateKafkaConnectionsState", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Update an existing RabbitMq Consumer Connection in the Ziqni system
            * @param body Update the RabbitMq Consumer Connection details in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateRabbitMQConnections(UpdateRabbitMqConnectionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateRabbitMQConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Update the state of a RabbitMQ Connection using the POST method
            * @param body Update the state of a RabbitMQ Connection using the POST method (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateRabbitMQConnectionsState(List<UpdateConnectionStateRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateRabbitMQConnectionsState", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Update an existing SQS Consumer Connection in the Ziqni system
            * @param body Update the SQS Consumer Connection details in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateSqsConnections(UpdateSqsConnectionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateSqsConnections", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Update the state of an SQS Connection using the POST method
            * @param body Update the state of an SQS Connection using the POST method (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateSqsConnectionsState(List<UpdateConnectionStateRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateSqsConnectionsState", request);
        return result;
        }
        }
