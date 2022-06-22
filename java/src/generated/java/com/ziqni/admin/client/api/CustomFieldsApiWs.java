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
import com.ziqni.admin.client.model.CreateCustomFieldRequest;
import com.ziqni.admin.client.model.CustomFieldResponse;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.UpdateCustomFieldRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class CustomFieldsApiWs extends CustomFieldsApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public CustomFieldsApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * Create custom fields
        * Create new Custom fields in the Ziqni database
            * @param body Create Custom fields in the Ziqni database (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createCustomFields(List<CreateCustomFieldRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createCustomFields", request);
        return result;
        }
        /**
        * Delete custom fields
        * Delete the Custom fields for a given identifier specified
            * @param id The unique identifiers of the resources (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteCustomFields(List<String> id) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteCustomFields", request);
        return result;
        }
        /**
        * Delete custom fields by query
        * Delete Custom fields from Ziqni database by unique Custom field ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete Custom fields from Ziqni database by unique Custom field ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteCustomFieldsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteCustomFieldsByQuery", request);
        return result;
        }
        /**
        * Get custom fields
        * Returns a list of Custom fields. This assumes that custom fields have first been uploaded via a POST request or web console
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;CustomFieldResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CustomFieldResponse> getCustomFields(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<CustomFieldResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCustomFields", request);
        return result;
        }
        /**
        * Get custom fields by query
        * Retrieve Custom fields from Ziqni database by unique Custom field ID&#39;s or any other POST body parameters using the POST method
            * @param body Retrieve Custom fields from Ziqni database by unique Custom field ID&#39;s or any other Post body parameters using the POST method (optional)
            * @return CompletableFuture&lt;CustomFieldResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CustomFieldResponse> getCustomFieldsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<CustomFieldResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCustomFieldsByQuery", request);
        return result;
        }
        /**
        * Update custom fields
        * Update existing Custom fields in the Ziqni database
            * @param body Update Custom fields details in the Ziqni database (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateCustomFields(List<UpdateCustomFieldRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateCustomFields", request);
        return result;
        }
        }
