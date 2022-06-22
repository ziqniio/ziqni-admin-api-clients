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

import com.ziqni.admin.client.ApiClient;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.ApiResponse;
import com.ziqni.admin.client.Pair;

import com.ziqni.admin.client.model.AwardResponse;
import com.ziqni.admin.client.model.ClaimAwardRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AwardsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;

  public AwardsApi() {
    this(new ApiClient());
  }

  public AwardsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Claim Awards that need to be actioned at
   * @param body Claim Awards (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> claimAwards(List<ClaimAwardRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = claimAwardsRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("claimAwards", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelApiResponse>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * 
   * Claim Awards that need to be actioned at
   * @param body Claim Awards (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> claimAwardsWithHttpInfo(List<ClaimAwardRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = claimAwardsRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("claimAwards", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ModelApiResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelApiResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder claimAwardsRequestBuilder(List<ClaimAwardRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling claimAwards");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/awards/claim";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Returns a list of Awards.
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;AwardResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AwardResponse> getAwards(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getAwardsRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getAwards", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AwardResponse>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * 
   * Returns a list of Awards.
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;AwardResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AwardResponse>> getAwardsWithHttpInfo(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getAwardsRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getAwards", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<AwardResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AwardResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getAwardsRequestBuilder(List<String> id, Integer limit, Integer skip) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/awards";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "id", id));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("_limit", limit));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("_skip", skip));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Retrieve Awards from Ziqni database by unique Awards ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve Awards from Ziqni database by unique Awards ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;AwardResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AwardResponse> getAwardsByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getAwardsByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getAwardsByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AwardResponse>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * 
   * Retrieve Awards from Ziqni database by unique Awards ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve Awards from Ziqni database by unique Awards ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;AwardResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AwardResponse>> getAwardsByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getAwardsByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getAwardsByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<AwardResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AwardResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getAwardsByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/awards/query";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
