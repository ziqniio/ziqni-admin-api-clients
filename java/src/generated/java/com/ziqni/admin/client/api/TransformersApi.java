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

import com.ziqni.admin.client.model.CreateTransformerRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.TransformerResponse;
import com.ziqni.admin.client.model.UpdateTransformerRequest;

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
public class TransformersApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public TransformersApi() {
    this(new ApiClient());
  }

  public TransformersApi(ApiClient apiClient) {
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
   * 
   * Create a new Transformer in the Ziqni system
   * @param body Create a Transformer in the Ziqni system (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> createTransformers(List<CreateTransformerRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createTransformersRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createTransformers", localVarResponse));
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
   * Create a new Transformer in the Ziqni system
   * @param body Create a Transformer in the Ziqni system (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> createTransformersWithHttpInfo(List<CreateTransformerRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createTransformersRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createTransformers", localVarResponse));
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

  private HttpRequest.Builder createTransformersRequestBuilder(List<CreateTransformerRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTransformers");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    // Inject Oauth token into the request - ZIQNI 27-06-2022
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,new String[]{  "AdminTransformers" });


    String localVarPath = "/transformers";

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
   * 
   * Delete the Transformers for a given identifier specified
   * @param id The unique identifiers of the resources (optional
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> deleteTransformers(List<String> id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTransformersRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTransformers", localVarResponse));
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
   * Delete the Transformers for a given identifier specified
   * @param id The unique identifiers of the resources (optional
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> deleteTransformersWithHttpInfo(List<String> id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTransformersRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTransformers", localVarResponse));
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

  private HttpRequest.Builder deleteTransformersRequestBuilder(List<String> id) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    // Inject Oauth token into the request - ZIQNI 27-06-2022
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,new String[]{  "AdminTransformers" });


    String localVarPath = "/transformers";

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
   * NOT AVAILABLE IN CURRENT RELEASE
   * Delete a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other POST body parameters using the POST method
   * @param body Delete a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> deleteTransformersByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTransformersByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTransformersByQuery", localVarResponse));
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
   * NOT AVAILABLE IN CURRENT RELEASE
   * Delete a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other POST body parameters using the POST method
   * @param body Delete a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> deleteTransformersByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTransformersByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTransformersByQuery", localVarResponse));
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

  private HttpRequest.Builder deleteTransformersByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    // Inject Oauth token into the request - ZIQNI 27-06-2022
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,new String[]{  "AdminTransformers" });


    String localVarPath = "/transformers/delete";

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
   * 
   * Returns a list of Transformers. This assumes that transformers have first been uploaded via a POST request or web console
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;TransformerResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TransformerResponse> getTransformers(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTransformersRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTransformers", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TransformerResponse>() {})
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
   * Returns a list of Transformers. This assumes that transformers have first been uploaded via a POST request or web console
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TransformerResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TransformerResponse>> getTransformersWithHttpInfo(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTransformersRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTransformers", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<TransformerResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TransformerResponse>() {}))
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

  private HttpRequest.Builder getTransformersRequestBuilder(List<String> id, Integer limit, Integer skip) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    // Inject Oauth token into the request - ZIQNI 27-06-2022
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,new String[]{  "AdminTransformers" });


    String localVarPath = "/transformers";

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
   * Retrieve a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other Post body parameters using the POST method (optional)
   * @return CompletableFuture&lt;TransformerResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TransformerResponse> getTransformersByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTransformersByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTransformersByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TransformerResponse>() {})
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
   * Retrieve a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve a Transformer or a list of Transformers from Ziqni by unique Transformer ID&#39;s or any other Post body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TransformerResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TransformerResponse>> getTransformersByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTransformersByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTransformersByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<TransformerResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TransformerResponse>() {}))
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

  private HttpRequest.Builder getTransformersByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    // Inject Oauth token into the request - ZIQNI 27-06-2022
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,new String[]{  "AdminTransformers" });


    String localVarPath = "/transformers/query";

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
   * 
   * Update an existing Transformer in the Ziqni system
   * @param body Update Transformer details in the Ziqni system (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> updateTransformers(List<UpdateTransformerRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateTransformersRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateTransformers", localVarResponse));
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
   * Update an existing Transformer in the Ziqni system
   * @param body Update Transformer details in the Ziqni system (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> updateTransformersWithHttpInfo(List<UpdateTransformerRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateTransformersRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateTransformers", localVarResponse));
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

  private HttpRequest.Builder updateTransformersRequestBuilder(List<UpdateTransformerRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateTransformers");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    // Inject Oauth token into the request - ZIQNI 27-06-2022
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,new String[]{  "AdminTransformers" });


    String localVarPath = "/transformers";

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
