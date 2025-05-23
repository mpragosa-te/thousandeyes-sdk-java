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


package com.thousandeyes.sdk.tests.instant.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.instant.model.AgentResponse;
import com.thousandeyes.sdk.tests.instant.model.SharedWithAccount;
import com.thousandeyes.sdk.tests.instant.model.SipTestProtocol;
import com.thousandeyes.sdk.tests.instant.model.TestIpv6Policy;
import com.thousandeyes.sdk.tests.instant.model.TestLabel;
import com.thousandeyes.sdk.tests.instant.model.TestLinks;
import com.thousandeyes.sdk.tests.instant.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.instant.model.TestProbeMode;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SipServerInstantTestResponse
 */
@JsonPropertyOrder({
  SipServerInstantTestResponse.JSON_PROPERTY_CREATED_BY,
  SipServerInstantTestResponse.JSON_PROPERTY_CREATED_DATE,
  SipServerInstantTestResponse.JSON_PROPERTY_DESCRIPTION,
  SipServerInstantTestResponse.JSON_PROPERTY_LIVE_SHARE,
  SipServerInstantTestResponse.JSON_PROPERTY_MODIFIED_BY,
  SipServerInstantTestResponse.JSON_PROPERTY_MODIFIED_DATE,
  SipServerInstantTestResponse.JSON_PROPERTY_SAVED_EVENT,
  SipServerInstantTestResponse.JSON_PROPERTY_TEST_ID,
  SipServerInstantTestResponse.JSON_PROPERTY_TEST_NAME,
  SipServerInstantTestResponse.JSON_PROPERTY_TYPE,
  SipServerInstantTestResponse.JSON_PROPERTY_LINKS,
  SipServerInstantTestResponse.JSON_PROPERTY_LABELS,
  SipServerInstantTestResponse.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  SipServerInstantTestResponse.JSON_PROPERTY_MTU_MEASUREMENTS,
  SipServerInstantTestResponse.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  SipServerInstantTestResponse.JSON_PROPERTY_NUM_PATH_TRACES,
  SipServerInstantTestResponse.JSON_PROPERTY_OPTIONS_REGEX,
  SipServerInstantTestResponse.JSON_PROPERTY_PATH_TRACE_MODE,
  SipServerInstantTestResponse.JSON_PROPERTY_PROBE_MODE,
  SipServerInstantTestResponse.JSON_PROPERTY_RANDOMIZED_START_TIME,
  SipServerInstantTestResponse.JSON_PROPERTY_REGISTER_ENABLED,
  SipServerInstantTestResponse.JSON_PROPERTY_SIP_TARGET_TIME,
  SipServerInstantTestResponse.JSON_PROPERTY_SIP_TIME_LIMIT,
  SipServerInstantTestResponse.JSON_PROPERTY_FIXED_PACKET_RATE,
  SipServerInstantTestResponse.JSON_PROPERTY_IPV6_POLICY,
  SipServerInstantTestResponse.JSON_PROPERTY_AUTH_USER,
  SipServerInstantTestResponse.JSON_PROPERTY_PASSWORD,
  SipServerInstantTestResponse.JSON_PROPERTY_PORT,
  SipServerInstantTestResponse.JSON_PROPERTY_PROTOCOL,
  SipServerInstantTestResponse.JSON_PROPERTY_SIP_REGISTRAR,
  SipServerInstantTestResponse.JSON_PROPERTY_USER,
  SipServerInstantTestResponse.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SipServerInstantTestResponse {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestLinks links;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabel> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<SharedWithAccount> sharedWithAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_OPTIONS_REGEX = "optionsRegex";
  private String optionsRegex;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_RANDOMIZED_START_TIME = "randomizedStartTime";
  private Boolean randomizedStartTime = false;

  public static final String JSON_PROPERTY_REGISTER_ENABLED = "registerEnabled";
  private Boolean registerEnabled = false;

  public static final String JSON_PROPERTY_SIP_TARGET_TIME = "sipTargetTime";
  private Integer sipTargetTime;

  public static final String JSON_PROPERTY_SIP_TIME_LIMIT = "sipTimeLimit";
  private Integer sipTimeLimit = 5;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_AUTH_USER = "authUser";
  private String authUser;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port = 49153;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private SipTestProtocol protocol = SipTestProtocol.TCP;

  public static final String JSON_PROPERTY_SIP_REGISTRAR = "sipRegistrar";
  private String sipRegistrar;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<AgentResponse> agents = new ArrayList<>();

  public SipServerInstantTestResponse() { 
  }

  @JsonCreator
  public SipServerInstantTestResponse(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabel> labels, 
    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS) List<SharedWithAccount> sharedWithAccounts
  ) {
  this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
  }

   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public SipServerInstantTestResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.  **Note**: **Saved Events** are now called **Private Snapshots** in the user interface. This change does not affect API. 
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public SipServerInstantTestResponse testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public SipServerInstantTestResponse links(TestLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestLinks links) {
    this.links = links;
  }


   /**
   * Labels to which the test is assigned. This field is not returned for Instant Tests.
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestLabel> getLabels() {
    return labels;
  }




   /**
   * Get sharedWithAccounts
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SharedWithAccount> getSharedWithAccounts() {
    return sharedWithAccounts;
  }




  public SipServerInstantTestResponse mtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
    return this;
  }

   /**
   * Set &#x60;true&#x60; to measure MTU sizes on network from agents to the target.
   * @return mtuMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMtuMeasurements() {
    return mtuMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_MTU_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMtuMeasurements(Boolean mtuMeasurements) {
    this.mtuMeasurements = mtuMeasurements;
  }


  public SipServerInstantTestResponse networkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
    return this;
  }

   /**
   * Enable or disable network measurements. Set to true to enable or false to disable network measurements.
   * @return networkMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNetworkMeasurements() {
    return networkMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkMeasurements(Boolean networkMeasurements) {
    this.networkMeasurements = networkMeasurements;
  }


  public SipServerInstantTestResponse numPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 1
   * maximum: 10
   * @return numPathTraces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PATH_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public SipServerInstantTestResponse optionsRegex(String optionsRegex) {
    this.optionsRegex = optionsRegex;
    return this;
  }

   /**
   * Options regex, this field does not require escaping.
   * @return optionsRegex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptionsRegex() {
    return optionsRegex;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionsRegex(String optionsRegex) {
    this.optionsRegex = optionsRegex;
  }


  public SipServerInstantTestResponse pathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
    return this;
  }

   /**
   * Get pathTraceMode
   * @return pathTraceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPathTraceMode getPathTraceMode() {
    return pathTraceMode;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TRACE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathTraceMode(TestPathTraceMode pathTraceMode) {
    this.pathTraceMode = pathTraceMode;
  }


  public SipServerInstantTestResponse probeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
    return this;
  }

   /**
   * Get probeMode
   * @return probeMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestProbeMode getProbeMode() {
    return probeMode;
  }


  @JsonProperty(JSON_PROPERTY_PROBE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProbeMode(TestProbeMode probeMode) {
    this.probeMode = probeMode;
  }


  public SipServerInstantTestResponse randomizedStartTime(Boolean randomizedStartTime) {
    this.randomizedStartTime = randomizedStartTime;
    return this;
  }

   /**
   * Indicates whether agents should randomize the start time in each test round.
   * @return randomizedStartTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANDOMIZED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRandomizedStartTime() {
    return randomizedStartTime;
  }


  @JsonProperty(JSON_PROPERTY_RANDOMIZED_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRandomizedStartTime(Boolean randomizedStartTime) {
    this.randomizedStartTime = randomizedStartTime;
  }


  public SipServerInstantTestResponse registerEnabled(Boolean registerEnabled) {
    this.registerEnabled = registerEnabled;
    return this;
  }

   /**
   * Set to true to perform SIP registration on the test target with the SIP REGISTER command.
   * @return registerEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRegisterEnabled() {
    return registerEnabled;
  }


  @JsonProperty(JSON_PROPERTY_REGISTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisterEnabled(Boolean registerEnabled) {
    this.registerEnabled = registerEnabled;
  }


  public SipServerInstantTestResponse sipTargetTime(Integer sipTargetTime) {
    this.sipTargetTime = sipTargetTime;
    return this;
  }

   /**
   * Target time for test completion in milliseconds.
   * minimum: 100
   * maximum: 5000
   * @return sipTargetTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSipTargetTime() {
    return sipTargetTime;
  }


  @JsonProperty(JSON_PROPERTY_SIP_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipTargetTime(Integer sipTargetTime) {
    this.sipTargetTime = sipTargetTime;
  }


  public SipServerInstantTestResponse sipTimeLimit(Integer sipTimeLimit) {
    this.sipTimeLimit = sipTimeLimit;
    return this;
  }

   /**
   * Time limit in milliseconds.
   * minimum: 5
   * maximum: 10
   * @return sipTimeLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSipTimeLimit() {
    return sipTimeLimit;
  }


  @JsonProperty(JSON_PROPERTY_SIP_TIME_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipTimeLimit(Integer sipTimeLimit) {
    this.sipTimeLimit = sipTimeLimit;
  }


  public SipServerInstantTestResponse fixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
    return this;
  }

   /**
   * Sets packets rate sent to measure the network in packets per second.
   * minimum: 0
   * maximum: 100
   * @return fixedPacketRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFixedPacketRate() {
    return fixedPacketRate;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_PACKET_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedPacketRate(Integer fixedPacketRate) {
    this.fixedPacketRate = fixedPacketRate;
  }


  public SipServerInstantTestResponse ipv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
    return this;
  }

   /**
   * Get ipv6Policy
   * @return ipv6Policy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestIpv6Policy getIpv6Policy() {
    return ipv6Policy;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Policy(TestIpv6Policy ipv6Policy) {
    this.ipv6Policy = ipv6Policy;
  }


  public SipServerInstantTestResponse authUser(String authUser) {
    this.authUser = authUser;
    return this;
  }

   /**
   * Username for authentication with SIP server.
   * @return authUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthUser() {
    return authUser;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthUser(String authUser) {
    this.authUser = authUser;
  }


  public SipServerInstantTestResponse password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for Basic/NTLM authentication.
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public SipServerInstantTestResponse port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Target port.
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public SipServerInstantTestResponse protocol(SipTestProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SipTestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(SipTestProtocol protocol) {
    this.protocol = protocol;
  }


  public SipServerInstantTestResponse sipRegistrar(String sipRegistrar) {
    this.sipRegistrar = sipRegistrar;
    return this;
  }

   /**
   * SIP server to be tested, specified by domain name or IP address.
   * @return sipRegistrar
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIP_REGISTRAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipRegistrar() {
    return sipRegistrar;
  }


  @JsonProperty(JSON_PROPERTY_SIP_REGISTRAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSipRegistrar(String sipRegistrar) {
    this.sipRegistrar = sipRegistrar;
  }


  public SipServerInstantTestResponse user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Username for SIP registration, should be unique within a ThousandEyes account group.
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  public SipServerInstantTestResponse agents(List<AgentResponse> agents) {
    this.agents = agents;
    return this;
  }

  public SipServerInstantTestResponse addAgentsItem(AgentResponse agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Contains list of agents.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentResponse> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<AgentResponse> agents) {
    this.agents = agents;
  }


  /**
   * Return true if this SipServerInstantTestResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServerInstantTestResponse sipServerInstantTestResponse = (SipServerInstantTestResponse) o;
    return Objects.equals(this.createdBy, sipServerInstantTestResponse.createdBy) &&
        Objects.equals(this.createdDate, sipServerInstantTestResponse.createdDate) &&
        Objects.equals(this.description, sipServerInstantTestResponse.description) &&
        Objects.equals(this.liveShare, sipServerInstantTestResponse.liveShare) &&
        Objects.equals(this.modifiedBy, sipServerInstantTestResponse.modifiedBy) &&
        Objects.equals(this.modifiedDate, sipServerInstantTestResponse.modifiedDate) &&
        Objects.equals(this.savedEvent, sipServerInstantTestResponse.savedEvent) &&
        Objects.equals(this.testId, sipServerInstantTestResponse.testId) &&
        Objects.equals(this.testName, sipServerInstantTestResponse.testName) &&
        Objects.equals(this.type, sipServerInstantTestResponse.type) &&
        Objects.equals(this.links, sipServerInstantTestResponse.links) &&
        Objects.equals(this.labels, sipServerInstantTestResponse.labels) &&
        Objects.equals(this.sharedWithAccounts, sipServerInstantTestResponse.sharedWithAccounts) &&
        Objects.equals(this.mtuMeasurements, sipServerInstantTestResponse.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, sipServerInstantTestResponse.networkMeasurements) &&
        Objects.equals(this.numPathTraces, sipServerInstantTestResponse.numPathTraces) &&
        Objects.equals(this.optionsRegex, sipServerInstantTestResponse.optionsRegex) &&
        Objects.equals(this.pathTraceMode, sipServerInstantTestResponse.pathTraceMode) &&
        Objects.equals(this.probeMode, sipServerInstantTestResponse.probeMode) &&
        Objects.equals(this.randomizedStartTime, sipServerInstantTestResponse.randomizedStartTime) &&
        Objects.equals(this.registerEnabled, sipServerInstantTestResponse.registerEnabled) &&
        Objects.equals(this.sipTargetTime, sipServerInstantTestResponse.sipTargetTime) &&
        Objects.equals(this.sipTimeLimit, sipServerInstantTestResponse.sipTimeLimit) &&
        Objects.equals(this.fixedPacketRate, sipServerInstantTestResponse.fixedPacketRate) &&
        Objects.equals(this.ipv6Policy, sipServerInstantTestResponse.ipv6Policy) &&
        Objects.equals(this.authUser, sipServerInstantTestResponse.authUser) &&
        Objects.equals(this.password, sipServerInstantTestResponse.password) &&
        Objects.equals(this.port, sipServerInstantTestResponse.port) &&
        Objects.equals(this.protocol, sipServerInstantTestResponse.protocol) &&
        Objects.equals(this.sipRegistrar, sipServerInstantTestResponse.sipRegistrar) &&
        Objects.equals(this.user, sipServerInstantTestResponse.user) &&
        Objects.equals(this.agents, sipServerInstantTestResponse.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, mtuMeasurements, networkMeasurements, numPathTraces, optionsRegex, pathTraceMode, probeMode, randomizedStartTime, registerEnabled, sipTargetTime, sipTimeLimit, fixedPacketRate, ipv6Policy, authUser, password, port, protocol, sipRegistrar, user, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerInstantTestResponse {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    optionsRegex: ").append(toIndentedString(optionsRegex)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    randomizedStartTime: ").append(toIndentedString(randomizedStartTime)).append("\n");
    sb.append("    registerEnabled: ").append(toIndentedString(registerEnabled)).append("\n");
    sb.append("    sipTargetTime: ").append(toIndentedString(sipTargetTime)).append("\n");
    sb.append("    sipTimeLimit: ").append(toIndentedString(sipTimeLimit)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    sipRegistrar: ").append(toIndentedString(sipRegistrar)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

