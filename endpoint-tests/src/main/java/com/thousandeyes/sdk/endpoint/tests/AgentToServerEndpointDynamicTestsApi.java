/*
 * Endpoint Tests API
 *  Manage endpoint agent dynamic and scheduled tests using the Endpoint Tests API. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.endpoint.tests;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.endpoint.tests.model.DynamicTest;
import com.thousandeyes.sdk.endpoint.tests.model.DynamicTestRequest;
import com.thousandeyes.sdk.endpoint.tests.model.DynamicTests;
import com.thousandeyes.sdk.endpoint.tests.model.EndpointDynamicTestUpdate;
import com.thousandeyes.sdk.endpoint.tests.model.Error;
import java.net.URI;
import com.thousandeyes.sdk.endpoint.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.tests.model.ValidationError;

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
public class AgentToServerEndpointDynamicTestsApi {
  private final ApiClient apiClient;

  public AgentToServerEndpointDynamicTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create endpoint dynamic test
   * Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param dynamicTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTest
   * @throws ApiException if fails to make API call
   */
  public DynamicTest createAgentToServerEndpointDynamicTest(DynamicTestRequest dynamicTestRequest, String aid) throws ApiException {
    ApiResponse<DynamicTest> response = createAgentToServerEndpointDynamicTestWithHttpInfo(dynamicTestRequest, aid);
    return response.getData();
  }

  /**
   * Create endpoint dynamic test
   * Create a new endpoint dynamic test in ThousandEyes using properties specified in the POST data. Please note that only Account Admins have the authorization to create new tests; regular users are restricted from using POST-based methods. 
   * @param dynamicTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTest> createAgentToServerEndpointDynamicTestWithHttpInfo(DynamicTestRequest dynamicTestRequest, String aid) throws ApiException {
    createAgentToServerEndpointDynamicTestValidateRequest(dynamicTestRequest);

    var requestBuilder = createAgentToServerEndpointDynamicTestRequestBuilder(dynamicTestRequest, aid);

    return apiClient.send(requestBuilder.build(), DynamicTest.class);
  }

  private void createAgentToServerEndpointDynamicTestValidateRequest(DynamicTestRequest dynamicTestRequest) throws ApiException {
      // verify the required parameter 'dynamicTestRequest' is set
      if (dynamicTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'dynamicTestRequest' when calling createAgentToServerEndpointDynamicTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createAgentToServerEndpointDynamicTestRequestBuilder(DynamicTestRequest dynamicTestRequest, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/endpoint/tests/dynamic-tests/agent-to-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(dynamicTestRequest);
    return requestBuilder;
  }
  /**
   * Delete agent to server dynamic test
   * Deletes an agent to server endpoint dynamic test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAgentToServerEndpointDynamicTest(String testId, String aid) throws ApiException {
    deleteAgentToServerEndpointDynamicTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete agent to server dynamic test
   * Deletes an agent to server endpoint dynamic test.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAgentToServerEndpointDynamicTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteAgentToServerEndpointDynamicTestValidateRequest(testId);

    var requestBuilder = deleteAgentToServerEndpointDynamicTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAgentToServerEndpointDynamicTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteAgentToServerEndpointDynamicTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAgentToServerEndpointDynamicTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/endpoint/tests/dynamic-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Retrieve endpoint dynamic test
   * Returns details of an endpoint dynamic test, including test type, name, intervals, targets.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTest
   * @throws ApiException if fails to make API call
   */
  public DynamicTest getAgentToServerEndpointDynamicTest(String testId, String aid) throws ApiException {
    ApiResponse<DynamicTest> response = getAgentToServerEndpointDynamicTestWithHttpInfo(testId, aid);
    return response.getData();
  }

  /**
   * Retrieve endpoint dynamic test
   * Returns details of an endpoint dynamic test, including test type, name, intervals, targets.
   * @param testId Unique ID of endpoint test. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTest> getAgentToServerEndpointDynamicTestWithHttpInfo(String testId, String aid) throws ApiException {
    getAgentToServerEndpointDynamicTestValidateRequest(testId);

    var requestBuilder = getAgentToServerEndpointDynamicTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), DynamicTest.class);
  }

  private void getAgentToServerEndpointDynamicTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getAgentToServerEndpointDynamicTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getAgentToServerEndpointDynamicTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/tests/dynamic-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
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
  /**
   * List endpoint dynamic tests
   * Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTests
   * @throws ApiException if fails to make API call
   */
  public DynamicTests getAgentToServerEndpointDynamicTests(String aid) throws ApiException {
    ApiResponse<DynamicTests> response = getAgentToServerEndpointDynamicTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List endpoint dynamic tests
   * Returns a list of all endpoint dynamic tests configured in ThousandEyes. This list does not contain saved events.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTests> getAgentToServerEndpointDynamicTestsWithHttpInfo(String aid) throws ApiException {
    getAgentToServerEndpointDynamicTestsValidateRequest();

    var requestBuilder = getAgentToServerEndpointDynamicTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), DynamicTests.class);
  }

  private void getAgentToServerEndpointDynamicTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAgentToServerEndpointDynamicTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/endpoint/tests/dynamic-tests/agent-to-server";
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
  /**
   * Update agent to server dynamic test
   * Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointDynamicTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return DynamicTest
   * @throws ApiException if fails to make API call
   */
  public DynamicTest updateAgentToServerEndpointDynamicTest(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate, String aid) throws ApiException {
    ApiResponse<DynamicTest> response = updateAgentToServerEndpointDynamicTestWithHttpInfo(testId, endpointDynamicTestUpdate, aid);
    return response.getData();
  }

  /**
   * Update agent to server dynamic test
   * Updates an agent to server endpoint dynamic test. Includes support for  enabling and disabling the test.
   * @param testId Unique ID of endpoint test. (required)
   * @param endpointDynamicTestUpdate  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;DynamicTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DynamicTest> updateAgentToServerEndpointDynamicTestWithHttpInfo(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate, String aid) throws ApiException {
    updateAgentToServerEndpointDynamicTestValidateRequest(testId, endpointDynamicTestUpdate);

    var requestBuilder = updateAgentToServerEndpointDynamicTestRequestBuilder(testId, endpointDynamicTestUpdate, aid);

    return apiClient.send(requestBuilder.build(), DynamicTest.class);
  }

  private void updateAgentToServerEndpointDynamicTestValidateRequest(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateAgentToServerEndpointDynamicTest");
      }
      // verify the required parameter 'endpointDynamicTestUpdate' is set
      if (endpointDynamicTestUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'endpointDynamicTestUpdate' when calling updateAgentToServerEndpointDynamicTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAgentToServerEndpointDynamicTestRequestBuilder(String testId, EndpointDynamicTestUpdate endpointDynamicTestUpdate, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PATCH");

    String path = "/endpoint/tests/dynamic-tests/agent-to-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(endpointDynamicTestUpdate);
    return requestBuilder;
  }
}
