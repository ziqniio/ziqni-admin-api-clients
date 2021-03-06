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

import com.ziqni.admin.client.ApiClient;
import com.ziqni.admin.client.ApiException;
import com.ziqni.admin.client.ApiResponse;
import com.ziqni.admin.client.Pair;

import com.ziqni.admin.client.model.ActionTypeResponse;
import com.ziqni.admin.client.model.CreateActionTypeRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.UpdateActionTypeRequest;

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
import java.util.Set;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActionTypesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ActionTypesApi() {
    this(new ApiClient());
  }

  public ActionTypesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
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
   * Create action types
   * Create new Action types in the Ziqni database
   * @param body Create Action Types in the Ziqni database (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> createActionTypes(List<CreateActionTypeRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createActionTypesRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createActionTypes", localVarResponse));
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
   * Create action types
   * Create new Action types in the Ziqni database
   * @param body Create Action Types in the Ziqni database (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> createActionTypesWithHttpInfo(List<CreateActionTypeRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createActionTypesRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createActionTypes", localVarResponse));
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

  public final static String[] createActionTypesOauthRoles = new String[]{  "AdminActions" };
  private HttpRequest.Builder createActionTypesRequestBuilder(List<CreateActionTypeRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createActionTypes");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,createActionTypesOauthRoles);


    String localVarPath = "/action-types";

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
  /**
   * Delete action types
   * Delete Action types for a given identifier specified
   * @param id The unique identifiers of the resources (optional
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> deleteActionTypes(List<String> id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteActionTypesRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteActionTypes", localVarResponse));
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
   * Delete action types
   * Delete Action types for a given identifier specified
   * @param id The unique identifiers of the resources (optional
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> deleteActionTypesWithHttpInfo(List<String> id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteActionTypesRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteActionTypes", localVarResponse));
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

  public final static String[] deleteActionTypesOauthRoles = new String[]{  "AdminActions" };
  private HttpRequest.Builder deleteActionTypesRequestBuilder(List<String> id) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,deleteActionTypesOauthRoles);


    String localVarPath = "/action-types";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "id", id));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete action types by query
   * Delete Action types from Ziqni database by unique Action types ID&#39;s or any other POST body parameters using the POST method
   * @param body Delete Action types from Ziqni database by unique Action types ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> deleteActionTypesByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteActionTypesByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteActionTypesByQuery", localVarResponse));
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
   * Delete action types by query
   * Delete Action types from Ziqni database by unique Action types ID&#39;s or any other POST body parameters using the POST method
   * @param body Delete Action types from Ziqni database by unique Action types ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> deleteActionTypesByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteActionTypesByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteActionTypesByQuery", localVarResponse));
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

  public final static String[] deleteActionTypesByQueryOauthRoles = new String[]{  "AdminActions" };
  private HttpRequest.Builder deleteActionTypesByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,deleteActionTypesByQueryOauthRoles);


    String localVarPath = "/action-types/delete";

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
  /**
   * Get action types
   * Returns a list of Action Types. This assumes that action types have first been uploaded via a POST request or web console
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;ActionTypeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ActionTypeResponse> getActionTypes(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getActionTypesRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getActionTypes", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ActionTypeResponse>() {})
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
   * Get action types
   * Returns a list of Action Types. This assumes that action types have first been uploaded via a POST request or web console
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ActionTypeResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ActionTypeResponse>> getActionTypesWithHttpInfo(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getActionTypesRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getActionTypes", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ActionTypeResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ActionTypeResponse>() {}))
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

  public final static String[] getActionTypesOauthRoles = new String[]{  "ViewActions" };
  private HttpRequest.Builder getActionTypesRequestBuilder(List<String> id, Integer limit, Integer skip) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getActionTypesOauthRoles);


    String localVarPath = "/action-types";

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
   * Get action types by query
   * Retrieve Action types from Ziqni database by unique Action type ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve Action types from Ziqni database by unique Action type ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ActionTypeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ActionTypeResponse> getActionTypesByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getActionTypesByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getActionTypesByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ActionTypeResponse>() {})
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
   * Get action types by query
   * Retrieve Action types from Ziqni database by unique Action type ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve Action types from Ziqni database by unique Action type ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ActionTypeResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ActionTypeResponse>> getActionTypesByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getActionTypesByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getActionTypesByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ActionTypeResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ActionTypeResponse>() {}))
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

  public final static String[] getActionTypesByQueryOauthRoles = new String[]{  "ViewActions" };
  private HttpRequest.Builder getActionTypesByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getActionTypesByQueryOauthRoles);


    String localVarPath = "/action-types/query";

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
  /**
   * Update action types
   * Update existing Action types in the Ziqni database
   * @param body Update Action types in the Ziqni database. (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> updateActionTypes(List<UpdateActionTypeRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateActionTypesRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateActionTypes", localVarResponse));
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
   * Update action types
   * Update existing Action types in the Ziqni database
   * @param body Update Action types in the Ziqni database. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> updateActionTypesWithHttpInfo(List<UpdateActionTypeRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateActionTypesRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateActionTypes", localVarResponse));
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

  public final static String[] updateActionTypesOauthRoles = new String[]{  "AdminActions" };
  private HttpRequest.Builder updateActionTypesRequestBuilder(List<UpdateActionTypeRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateActionTypes");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,updateActionTypesOauthRoles);


    String localVarPath = "/action-types";

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
}
