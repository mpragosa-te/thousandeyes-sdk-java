/*
 * Tests API
 * This API allows you to list, create, edit, and delete Network and Application Synthetics tests. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Tests;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestsApi {
  private final ApiClient apiClient;

  public TestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * List configured tests
   * Returns configured tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return Tests
   * @throws ApiException if fails to make API call
   */
  public Tests getTests(String aid) throws ApiException {
    ApiResponse<Tests> response = getTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List configured tests
   * Returns configured tests and saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Tests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Tests> getTestsWithHttpInfo(String aid) throws ApiException {
    getTestsValidateRequest();

    var requestBuilder = getTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), Tests.class);
  }

  private void getTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
}
