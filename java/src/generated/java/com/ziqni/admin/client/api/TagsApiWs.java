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
import com.ziqni.admin.client.model.CreateTagRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.TagResponse;
import com.ziqni.admin.client.model.UpdateTagRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class TagsApiWs extends TagsApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public TagsApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * Create tags
        * Create new Tags in the Ziqni database
            * @param body Create Tags in the Ziqni database (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createTags(List<CreateTagRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createTags", request);
        return result;
        }
        /**
        * Delete tags
        * Delete Tags for a given identifier specified
            * @param id The unique identifiers of the resources (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteTags(List<String> id) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteTags", request);
        return result;
        }
        /**
        * Delete tags by query
        * Delete Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteTagsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteTagsByQuery", request);
        return result;
        }
        /**
        * Get tags
        * Returns a list of Tags. This assumes that tags have first been uploaded via a POST request or web console
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;TagResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<TagResponse> getTags(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<TagResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getTags", request);
        return result;
        }
        /**
        * Get tags by query
        * Retrieve Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method
            * @param body Retrieve Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;TagResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<TagResponse> getTagsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<TagResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getTagsByQuery", request);
        return result;
        }
        /**
        * Update tags
        * Update existing Tags in the Ziqni database
            * @param body Update a Tag in the Ziqni database. (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateTags(List<UpdateTagRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateTags", request);
        return result;
        }
        }
