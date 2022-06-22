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

package com.ziqni.admin.client.api;

import com.ziqni.admin.client.StreamingClient;
import com.ziqni.admin.client.ApiClient;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.ApiResponse;
import com.ziqni.admin.client.Pair;
import com.ziqni.admin.client.model.ComputeEngineResponse;
import com.ziqni.admin.client.model.CreateComputeEngineRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.UpdateComputeEngineRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class ComputeEngineApiWs extends ComputeEngineApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public ComputeEngineApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * 
        * Create a new Compute Engine in the Ziqni system
            * @param body Create a Compute Engine in the Ziqni system (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createComputeEngines(CreateComputeEngineRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createComputeEngines", request);
        return result;
        }
        /**
        * 
        * Delete the Compute Engine for a given identifier specified
            * @param id Unique identifier of the resource (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteComputeEnginesById(String id) {
        var request = new HashMap<String, Object>();
        
                

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteComputeEnginesById", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete an Compute Engine or a list of Compute Engines from Ziqni by query
            * @param body Delete an  Compute Engine or a list of Compute Engines from Ziqni by unique Compute Engine ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteComputeEnginesByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteComputeEnginesByQuery", request);
        return result;
        }
        /**
        * 
        * Returns a list of Compute Engines. This assumes that api keys have first been created via a POST request or web console
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;ComputeEngineResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ComputeEngineResponse> getComputeEngines(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ComputeEngineResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getComputeEngines", request);
        return result;
        }
        /**
        * 
        * Returns an Compute Engine by identifier provided. This assumes that compute engines have first been created via a POST request or web console
            * @param id Unique identifier of the resource (required)
            * @return CompletableFuture&lt;ComputeEngineResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ComputeEngineResponse> getComputeEnginesById(String id) {
        var request = new HashMap<String, Object>();
        
                

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<ComputeEngineResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getComputeEnginesById", request);
        return result;
        }
        /**
        * 
        * Retrieve an Compute Engine or a list of Compute Engines by query
            * @param body Retrieve an  Compute Engine or a list of Compute Engines from Ziqni by unique Copute Engine ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ComputeEngineResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ComputeEngineResponse> getComputeEnginesByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ComputeEngineResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getComputeEnginesByQuery", request);
        return result;
        }
        /**
        * 
        * Update an existing Compute Engine in the Ziqni system
            * @param body Update an Compute Engine in the Ziqni system. * Any Put body Parameters that are excluded in the Request body field will be considered as empty and updated with an empty field (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateComputeEngines(UpdateComputeEngineRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateComputeEngines", request);
        return result;
        }
        }