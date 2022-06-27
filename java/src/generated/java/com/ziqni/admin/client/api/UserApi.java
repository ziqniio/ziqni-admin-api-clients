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

import com.ziqni.admin.client.model.AccountMessageResponse;
import com.ziqni.admin.client.model.ProfileResponse;

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
public class UserApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public UserApi() {
    this(new ApiClient());
  }

  public UserApi(ApiClient apiClient) {
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
   * Returns the current users user. This assumes that a user has first been uploaded via a POST request or web console
   * @param includeSpaces Include Spaces (optional)
   * @return CompletableFuture&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ProfileResponse> getUser(Boolean includeSpaces) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getUserRequestBuilder(includeSpaces);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getUser", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ProfileResponse>() {})
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
   * Returns the current users user. This assumes that a user has first been uploaded via a POST request or web console
   * @param includeSpaces Include Spaces (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;ProfileResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ProfileResponse>> getUserWithHttpInfo(Boolean includeSpaces) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getUserRequestBuilder(includeSpaces);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getUser", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<ProfileResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ProfileResponse>() {}))
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

  public final static String[] getUserOauthRoles = new String[]{  "ViewUser" };
  private HttpRequest.Builder getUserRequestBuilder(Boolean includeSpaces) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getUserOauthRoles);


    String localVarPath = "/user";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("includeSpaces", includeSpaces));

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
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a list of the Users messages
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;AccountMessageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AccountMessageResponse> getUserMessages(Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getUserMessagesRequestBuilder(limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getUserMessages", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AccountMessageResponse>() {})
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
   * Returns a list of the Users messages
   * @param limit Limit the returned total records found (optional)
   * @param skip Skip the returned records found and return the next batch of records (optional)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountMessageResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AccountMessageResponse>> getUserMessagesWithHttpInfo(Integer limit, Integer skip) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getUserMessagesRequestBuilder(limit, skip);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getUserMessages", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<AccountMessageResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AccountMessageResponse>() {}))
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

  public final static String[] getUserMessagesOauthRoles = new String[]{  "ViewUser" };
  private HttpRequest.Builder getUserMessagesRequestBuilder(Integer limit, Integer skip) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getUserMessagesOauthRoles);


    String localVarPath = "/user/inbox";

    List<Pair> localVarQueryParams = new ArrayList<>();
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
   * NOT AVAILABLE IN CURRENT RELEASE
   * Returns a Users message for the identifier provided
   * @param id Unique identifier of the resource (required)
   * @return CompletableFuture&lt;AccountMessageResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<AccountMessageResponse> getUserMessagesById(String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getUserMessagesByIdRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getUserMessagesById", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AccountMessageResponse>() {})
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
   * Returns a Users message for the identifier provided
   * @param id Unique identifier of the resource (required)
   * @return CompletableFuture&lt;ApiResponse&lt;AccountMessageResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<AccountMessageResponse>> getUserMessagesByIdWithHttpInfo(String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getUserMessagesByIdRequestBuilder(id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getUserMessagesById", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<AccountMessageResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AccountMessageResponse>() {}))
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

  public final static String[] getUserMessagesByIdOauthRoles = new String[]{  "ViewUser" };
  private HttpRequest.Builder getUserMessagesByIdRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserMessagesById");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    //
    com.ziqni.admin.client.configuration.HandleOauthHeaderInjection.injectOauthToken(localVarRequestBuilder,getUserMessagesByIdOauthRoles);


    String localVarPath = "/user/inbox/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

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
}
