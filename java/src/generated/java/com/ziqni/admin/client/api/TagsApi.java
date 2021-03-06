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

import com.ziqni.admin.client.model.CreateTagRequest;
import com.ziqni.admin.client.model.ModelApiResponse;
import com.ziqni.admin.client.model.QueryRequest;
import com.ziqni.admin.client.model.TagResponse;
import com.ziqni.admin.client.model.UpdateTagRequest;

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
public class TagsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public TagsApi() {
    this(new ApiClient());
  }

  public TagsApi(ApiClient apiClient) {
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
   * Create tags
   * Create new Tags in the Ziqni database
   * @param body Create Tags in the Ziqni database (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> createTags(List<CreateTagRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createTagsRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createTags", localVarResponse));
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
   * Create tags
   * Create new Tags in the Ziqni database
   * @param body Create Tags in the Ziqni database (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> createTagsWithHttpInfo(List<CreateTagRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = createTagsRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("createTags", localVarResponse));
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

  public final static String[] createTagsOauthRoles = new String[]{  "ManageTags" };
  private HttpRequest.Builder createTagsRequestBuilder(List<CreateTagRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createTags");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,createTagsOauthRoles);


    String localVarPath = "/tags";

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
   * Delete tags
   * Delete Tags for a given identifier specified
   * @param id The unique identifiers of the resources (optional
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> deleteTags(List<String> id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTagsRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTags", localVarResponse));
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
   * Delete tags
   * Delete Tags for a given identifier specified
   * @param id The unique identifiers of the resources (optional
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> deleteTagsWithHttpInfo(List<String> id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTagsRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTags", localVarResponse));
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

  public final static String[] deleteTagsOauthRoles = new String[]{  "AdminTags" };
  private HttpRequest.Builder deleteTagsRequestBuilder(List<String> id) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,deleteTagsOauthRoles);


    String localVarPath = "/tags";

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
   * Delete tags by query
   * Delete Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method
   * @param body Delete Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> deleteTagsByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTagsByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTagsByQuery", localVarResponse));
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
   * Delete tags by query
   * Delete Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method
   * @param body Delete Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> deleteTagsByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = deleteTagsByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("deleteTagsByQuery", localVarResponse));
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

  public final static String[] deleteTagsByQueryOauthRoles = new String[]{  "AdminTags" };
  private HttpRequest.Builder deleteTagsByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,deleteTagsByQueryOauthRoles);


    String localVarPath = "/tags/delete";

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
   * Get tags
   * Returns a list of Tags. This assumes that tags have first been uploaded via a POST request or web console
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;TagResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TagResponse> getTags(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTagsRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTags", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TagResponse>() {})
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
   * Get tags
   * Returns a list of Tags. This assumes that tags have first been uploaded via a POST request or web console
   * @param id The unique identifiers of the resources (optional
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TagResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TagResponse>> getTagsWithHttpInfo(List<String> id, Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTagsRequestBuilder(id, limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTags", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<TagResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TagResponse>() {}))
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

  public final static String[] getTagsOauthRoles = new String[]{  "ViewTags" };
  private HttpRequest.Builder getTagsRequestBuilder(List<String> id, Integer limit, Integer skip) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getTagsOauthRoles);


    String localVarPath = "/tags";

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
   * Get tags by query
   * Retrieve Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;TagResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<TagResponse> getTagsByQuery(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTagsByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTagsByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TagResponse>() {})
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
   * Get tags by query
   * Retrieve Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method
   * @param body Retrieve Tags from Ziqni database by unique Tags ID&#39;s or any other POST body parameters using the POST method (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;TagResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<TagResponse>> getTagsByQueryWithHttpInfo(QueryRequest body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getTagsByQueryRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getTagsByQuery", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<TagResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TagResponse>() {}))
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

  public final static String[] getTagsByQueryOauthRoles = new String[]{  "ViewTags" };
  private HttpRequest.Builder getTagsByQueryRequestBuilder(QueryRequest body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getTagsByQueryOauthRoles);


    String localVarPath = "/tags/query";

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
   * Update tags
   * Update existing Tags in the Ziqni database
   * @param body Update a Tag in the Ziqni database. (required)
   * @return CompletableFuture&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ModelApiResponse> updateTags(List<UpdateTagRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateTagsRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateTags", localVarResponse));
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
   * Update tags
   * Update existing Tags in the Ziqni database
   * @param body Update a Tag in the Ziqni database. (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ModelApiResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ModelApiResponse>> updateTagsWithHttpInfo(List<UpdateTagRequest> body) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = updateTagsRequestBuilder(body);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("updateTags", localVarResponse));
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

  public final static String[] updateTagsOauthRoles = new String[]{  "ManageTags" };
  private HttpRequest.Builder updateTagsRequestBuilder(List<UpdateTagRequest> body) throws ApiException {
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateTags");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,updateTagsOauthRoles);


    String localVarPath = "/tags";

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
