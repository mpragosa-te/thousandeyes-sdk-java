/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be an Account Admin.  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant;

import com.thousandeyes.sdk.tests.instant.model.AgentToAgentInstantTestRequest;
import com.thousandeyes.sdk.tests.instant.model.AgentToAgentInstantTestResponse;
import com.thousandeyes.sdk.tests.instant.model.Error;
import com.thousandeyes.sdk.tests.instant.model.ExpandInstantTestOptions;
import java.net.URI;
import com.thousandeyes.sdk.tests.instant.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.instant.model.ValidationError;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.common.ContentTypes.AUTHORIZATION;
import static com.github.tomakehurst.wiremock.common.ContentTypes.CONTENT_TYPE;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.NativeApiClient;


/**
 * Request and Response model deserialization tests for AgentToAgentInstantTestsApi
 */
@WireMockTest
public class AgentToAgentInstantTestsApiTest {
    private static final String TOKEN = "valid-token";
    private static final String BEARER_TOKEN = "Bearer %s".formatted(TOKEN);
    private static AgentToAgentInstantTestsApi api;
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

    @BeforeAll
    public static void setup(WireMockRuntimeInfo wireMockRuntimeInfo) {
        ApiClient client = NativeApiClient.builder()
                                .baseUri(wireMockRuntimeInfo.getHttpBaseUrl())
                                .bearerToken(TOKEN)
                                .build();
        api = new AgentToAgentInstantTestsApi(client);
    }
    
    /**
     * Create agent-to-agent instant test
     * <p>
     * Creates and runs a new agent-to-agent instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Test
    public void createAgentToAgentInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException, ApiException
    {

        var requestBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "randomizedStartTime" : false,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ]
                }
                                 """;
        var requestBodyContentType = "application/json";
        AgentToAgentInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AgentToAgentInstantTestRequest.class);
        assertNotNull(mappedRequest);

        var responseBodyJson = """
                {
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "description" : "ThousandEyes Test",
                  "type" : "agent-to-agent",
                  "mss" : 100,
                  "dscpId" : "0",
                  "protocol" : "tcp",
                  "fixedPacketRate" : 50,
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "throughputRate" : 10,
                  "modifiedBy" : "user@user.com",
                  "testName" : "ThousandEyes Test",
                  "direction" : "to-target",
                  "throughputMeasurements" : false,
                  "numPathTraces" : 3,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "throughputDuration" : 10000,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "randomizedStartTime" : false,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "targetAgentId" : "2954",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ]
                }
                                  """;
        var statusCode = 201;
        var responseContentType = "application/json";
        AgentToAgentInstantTestResponse mappedResponse = 
                mapper.readValue(responseBodyJson, AgentToAgentInstantTestResponse.class);
        assertNotNull(mappedResponse);

        var path = "/tests/agent-to-agent/instant";
        stubFor(post(urlPathTemplate(path))
                        .withHeader(AUTHORIZATION, equalTo(BEARER_TOKEN))
                        .withHeader(CONTENT_TYPE, equalTo(requestBodyContentType))
                        .withRequestBody(equalToJson(requestBodyJson))
                        .willReturn(aResponse()
                                            .withHeader(CONTENT_TYPE, responseContentType)
                                            .withBody(responseBodyJson)
                                            .withStatus(statusCode)));

        var apiResponse = api.createAgentToAgentInstantTest(mappedRequest, null, null);
        assertEquals(mappedResponse, apiResponse);
    }
    
}
