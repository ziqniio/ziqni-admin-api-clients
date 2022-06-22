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
import com.ziqni.admin.client.model.AccountMessageResponse;
import com.ziqni.admin.client.model.ProfileResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class UserApiWs extends UserApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public UserApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * 
        * Returns the current users user. This assumes that a user has first been uploaded via a POST request or web console
            * @param includeSpaces Include Spaces (optional)
            * @return CompletableFuture&lt;ProfileResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ProfileResponse> getUser(Boolean includeSpaces) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("includeSpaces", includeSpaces);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ProfileResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getUser", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns a list of the Users messages
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;AccountMessageResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<AccountMessageResponse> getUserMessages(Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<AccountMessageResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getUserMessages", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns a Users message for the identifier provided
            * @param id Unique identifier of the resource (required)
            * @return CompletableFuture&lt;AccountMessageResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<AccountMessageResponse> getUserMessagesById(String id) {
        var request = new HashMap<String, Object>();
        
                

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<AccountMessageResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getUserMessagesById", request);
        return result;
        }
        }
