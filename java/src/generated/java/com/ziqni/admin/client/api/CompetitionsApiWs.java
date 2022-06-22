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
import com.ziqni.admin.client.model.BracketResponse;
import com.ziqni.admin.client.model.CloneCompetitionResponse;
import com.ziqni.admin.client.model.CompetitionLeaderboardResponse;
import com.ziqni.admin.client.model.CompetitionResponse;
import com.ziqni.admin.client.model.ContestReducedResponse;
import com.ziqni.admin.client.model.CreateCompetitionRequest;
import com.ziqni.admin.client.model.CreateSimpleCompetitionRequest;
import com.ziqni.admin.client.model.EntrantRequest;
import com.ziqni.admin.client.model.EntrantResponse;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.UpdateCompetitionRequest;
import com.ziqni.admin.client.model.UpdateCompetitionStatusRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class CompetitionsApiWs extends CompetitionsApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public CompetitionsApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * 
        * Create a new Competition in the Ziqni database
            * @param body Create a Competition in the Ziqni database (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createCompetitions(CreateCompetitionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createCompetitions", request);
        return result;
        }
        /**
        * 
        * Create a Simple Competition in the Ziqni database
            * @param body Create a Competition in the Ziqni database (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createSimpleCompetitions(CreateSimpleCompetitionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createSimpleCompetitions", request);
        return result;
        }
        /**
        * 
        * Returns a list of Competitions. This assumes that competitions have first been uploaded via a POST request or web console
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;CompetitionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CompetitionResponse> getCompetitions(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<CompetitionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCompetitions", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns all Contests for the Competition id provided in Brackets
            * @param id Unique identifier of the resource (required)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;BracketResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<BracketResponse> getCompetitionsBrackets(String id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<BracketResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCompetitionsBrackets", request);
        return result;
        }
        /**
        * 
        * Retrieve Competitions from Ziqni database by unique Competition ID&#39;s or any other POST body parameters using the POST method
            * @param body Retrieve Competitions from Ziqni database by unique Competition ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;CompetitionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CompetitionResponse> getCompetitionsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<CompetitionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCompetitionsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Clones a Competition for the identifier provided
            * @param id Unique identifier of the resource (required)
            * @return CompletableFuture&lt;CloneCompetitionResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CloneCompetitionResponse> getCompetitionsToClone(String id) {
        var request = new HashMap<String, Object>();
        
                

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<CloneCompetitionResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCompetitionsToClone", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns all Contests for the Competition id provided
            * @param id Unique identifier of the resource (required)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;ContestReducedResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ContestReducedResponse> getContestsForCompetitions(String id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<ContestReducedResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getContestsForCompetitions", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns a list of Leaderborads for the Competition id provided
            * @param id Unique identifier of the resource (required)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;CompetitionLeaderboardResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CompetitionLeaderboardResponse> getLeaderboardByCompetitionId(String id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<CompetitionLeaderboardResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getLeaderboardByCompetitionId", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns all Entries for the Competition id provided
            * @param id Unique identifier of the resource (required)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;EntrantResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<EntrantResponse> getListOfEntrants(String id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<EntrantResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getListOfEntrants", request);
        return result;
        }
        /**
        * 
        * Update an existing Competition in the Ziqni database
            * @param body Update a Competition in the Ziqni database. * A Competitions Id must exist in the Ziqni database for update (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateCompetitions(UpdateCompetitionRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateCompetitions", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Updates the status of the Entrants for a Competition id provided
            * @param body Updates the status of the Entrants (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateCompetitionsEntries(List<EntrantRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateCompetitionsEntries", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Manages the Competitions state
            * @param body Updates the state of the Competition (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateCompetitionsState(List<UpdateCompetitionStatusRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateCompetitionsState", request);
        return result;
        }
        }
