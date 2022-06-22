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
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.Response;
import com.ziqni.admin.client.model.RuleOperandLookupRequest;
import com.ziqni.admin.client.model.RuleOperandLookupResponse;
import com.ziqni.admin.client.model.RuleResponse;
import com.ziqni.admin.client.model.UpdateRuleRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class RulesApiWs extends RulesApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public RulesApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Delete Rules from Ziqni database by unique Rules ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete Rules from Ziqni database by unique Rules ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteRulesByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteRulesByQuery", request);
        return result;
        }
        /**
        * 
        * Returns a list of rules. This assumes that rules have first been created during achievement, competition or contest setup
            * @param context The context to retrieve, either achievement, competition or contest (required)
            * @return CompletableFuture&lt;Response&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<Response> getRuleSchemas(String context) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("context", context);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<Response> result = this.streamingClient.sendWithApiCallback("/aapi/getRuleSchemas", request);
        return result;
        }
        /**
        * 
        * Returns a list of rules. This assumes that rules have first been created during achievement, competition or contest setup. The id is the ID of the entity the rules describe
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;RuleResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<RuleResponse> getRules(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<RuleResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getRules", request);
        return result;
        }
        /**
        * 
        * Retrieve Rules from Ziqni database by unique Rewards ID&#39;s or any other POST body parameters using the POST method
            * @param body Retrieve Rules from Ziqni database by unique Rewards ID&#39;s or any other Post body parameters using the POST method (optional)
            * @return CompletableFuture&lt;RuleResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<RuleResponse> getRulesByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<RuleResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getRulesByQuery", request);
        return result;
        }
        /**
        * 
        * Search or get rule operand values
            * @param body Search for operand values and human readable text options (required)
            * @return CompletableFuture&lt;RuleOperandLookupResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<RuleOperandLookupResponse> lookupOperandsRules(List<RuleOperandLookupRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<RuleOperandLookupResponse> result = this.streamingClient.sendWithApiCallback("/aapi/lookupOperandsRules", request);
        return result;
        }
        /**
        * 
        * Update existing rules
            * @param body Update rules for a given Achievement, Competition or Contest identifier. (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateRules(List<UpdateRuleRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateRules", request);
        return result;
        }
        /**
        * 
        * Validate rules
            * @param body Validate rules (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> validateRules(List<UpdateRuleRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/validateRules", request);
        return result;
        }
        }
