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
import com.ziqni.admin.client.model.AchievementReducedResponse;
import com.ziqni.admin.client.model.CompetitionReducedResponse;
import com.ziqni.admin.client.model.ContestReducedResponse;
import com.ziqni.admin.client.model.CreateProductRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.ProductResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.UpdateProductRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.util.*;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
    public class ProductsApiWs extends ProductsApi {
    private final ApiClient apiClient;
    private final ObjectMapper memberVarObjectMapper;
    private final Duration memberVarReadTimeout;
    private final StreamingClient streamingClient;

    public ProductsApiWs(ApiClient apiClient, StreamingClient streamingClient, Duration readTimeout) {
        this.apiClient = apiClient;
        this.memberVarObjectMapper = apiClient.getObjectMapper();
        this.streamingClient = streamingClient;
        this.memberVarReadTimeout = null;
    }

        /**
        * Create products
        * Create new Products in the Ziqni database
            * @param body Create Products in the Ziqni database. An array can contain a maximum of 10,000 products in one request (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> createProducts(List<CreateProductRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/createProducts", request);
        return result;
        }
        /**
        * Delete products
        * Delete Products for a given identifier specified
            * @param id The unique identifiers of the resources (optional
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteProducts(List<String> id) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteProducts", request);
        return result;
        }
        /**
        * Delete products by query
        * Delete Products from Ziqni database by unique Product ID&#39;s or any other POST body parameters using the POST method
            * @param body Delete Products from Ziqni database by unique Product ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> deleteProductsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/deleteProductsByQuery", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns a list of Achievements for the Product id provided
            * @param id Unique identifier of the resource (required)
            * @param achievementId Id of an Achievement (optional)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;AchievementReducedResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<AchievementReducedResponse> getAchievementsForProducts(String id, String achievementId, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("achievementId", achievementId);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<AchievementReducedResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getAchievementsForProducts", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns a list of Competitions for the Product id provided
            * @param id Unique identifier of the resource (required)
            * @param competitionId Id of a Competition (optional)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;CompetitionReducedResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<CompetitionReducedResponse> getCompetitionsForProducts(String id, String competitionId, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("competitionId", competitionId);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<CompetitionReducedResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getCompetitionsForProducts", request);
        return result;
        }
        /**
        * NOT AVAILABLE IN CURRENT RELEASE
        * Returns a list of Contests for the Product id provided
            * @param id Unique identifier of the resource (required)
            * @param contestId Id of a Contest (optional)
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;ContestReducedResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ContestReducedResponse> getContestsForProducts(String id, String contestId, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("contestId", contestId);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        var pathParam = new HashMap<String, Object>();
        pathParam.put("id", id);
        request.put("path",pathParam);
        

        CompletableFuture<ContestReducedResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getContestsForProducts", request);
        return result;
        }
        /**
        * Get products
        * Returns a list of Products. This assumes that products have first been uploaded via a POST request or web console
            * @param id The unique identifiers of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;ProductResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ProductResponse> getProducts(List<String> id, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("id", id);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ProductResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getProducts", request);
        return result;
        }
        /**
        * Get products by query
        * Retrieve Products from Ziqni database by unique Product ID&#39;s or any other POST body parameters using the POST method
            * @param body Retrieve Products from Ziqni database by unique Product ID&#39;s or any other POST body parameters using the POST method (optional)
            * @return CompletableFuture&lt;ProductResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ProductResponse> getProductsByQuery(QueryRequest body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ProductResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getProductsByQuery", request);
        return result;
        }
        /**
        * Get products by reference ids
        * Returns a list of Products. This assumes that products have first been uploaded via a POST request or web console
            * @param refIds The reference ids  of the resources (optional
            * @param limit Limit the returned total records found (optional)
            * @param skip Skip the returned records found and return the next batch of records (optional)
            * @return CompletableFuture&lt;ProductResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ProductResponse> getProductsByRefId(List<String> refIds, Integer limit, Integer skip) {
        var request = new HashMap<String, Object>();
        var queryParam = new HashMap<String, Object>();
        queryParam.put("refIds", refIds);
queryParam.put("limit", limit);
queryParam.put("skip", skip);
        request.put("query",queryParam);

        
                
        

        CompletableFuture<ProductResponse> result = this.streamingClient.sendWithApiCallback("/aapi/getProductsByRefId", request);
        return result;
        }
        /**
        * Update products
        * Update existing Products in the Ziqni database
            * @param body Update a Product or multiple Products in the Ziqni database. * Product Ref Id can not be changed after creation * A products Id must exist in the Ziqni database to update the product (required)
            * @return CompletableFuture&lt;ModelApiResponse&gt;
        * @throws ApiException if fails to make API call
        */
        public CompletableFuture<ModelApiResponse> updateProducts(List<UpdateProductRequest> body) {
        var request = new HashMap<String, Object>();
        
                

        
                
        request.put("body",body);

        CompletableFuture<ModelApiResponse> result = this.streamingClient.sendWithApiCallback("/aapi/updateProducts", request);
        return result;
        }
        }
