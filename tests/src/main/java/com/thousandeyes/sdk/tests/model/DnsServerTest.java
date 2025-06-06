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


package com.thousandeyes.sdk.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.model.AlertRule;
import com.thousandeyes.sdk.tests.model.DnsQueryClass;
import com.thousandeyes.sdk.tests.model.Monitor;
import com.thousandeyes.sdk.tests.model.SharedWithAccount;
import com.thousandeyes.sdk.tests.model.TestDnsServer;
import com.thousandeyes.sdk.tests.model.TestDnsTransportProtocol;
import com.thousandeyes.sdk.tests.model.TestInterval;
import com.thousandeyes.sdk.tests.model.TestIpv6Policy;
import com.thousandeyes.sdk.tests.model.TestLabel;
import com.thousandeyes.sdk.tests.model.TestLinks;
import com.thousandeyes.sdk.tests.model.TestPathTraceMode;
import com.thousandeyes.sdk.tests.model.TestProbeMode;
import com.thousandeyes.sdk.tests.model.TestProtocol;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnsServerTest
 */
@JsonPropertyOrder({
  DnsServerTest.JSON_PROPERTY_INTERVAL,
  DnsServerTest.JSON_PROPERTY_ALERTS_ENABLED,
  DnsServerTest.JSON_PROPERTY_ENABLED,
  DnsServerTest.JSON_PROPERTY_ALERT_RULES,
  DnsServerTest.JSON_PROPERTY_CREATED_BY,
  DnsServerTest.JSON_PROPERTY_CREATED_DATE,
  DnsServerTest.JSON_PROPERTY_DESCRIPTION,
  DnsServerTest.JSON_PROPERTY_LIVE_SHARE,
  DnsServerTest.JSON_PROPERTY_MODIFIED_BY,
  DnsServerTest.JSON_PROPERTY_MODIFIED_DATE,
  DnsServerTest.JSON_PROPERTY_SAVED_EVENT,
  DnsServerTest.JSON_PROPERTY_TEST_ID,
  DnsServerTest.JSON_PROPERTY_TEST_NAME,
  DnsServerTest.JSON_PROPERTY_TYPE,
  DnsServerTest.JSON_PROPERTY_LINKS,
  DnsServerTest.JSON_PROPERTY_LABELS,
  DnsServerTest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  DnsServerTest.JSON_PROPERTY_BANDWIDTH_MEASUREMENTS,
  DnsServerTest.JSON_PROPERTY_DNS_SERVERS,
  DnsServerTest.JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL,
  DnsServerTest.JSON_PROPERTY_DOMAIN,
  DnsServerTest.JSON_PROPERTY_MTU_MEASUREMENTS,
  DnsServerTest.JSON_PROPERTY_NETWORK_MEASUREMENTS,
  DnsServerTest.JSON_PROPERTY_NUM_PATH_TRACES,
  DnsServerTest.JSON_PROPERTY_PATH_TRACE_MODE,
  DnsServerTest.JSON_PROPERTY_PROBE_MODE,
  DnsServerTest.JSON_PROPERTY_PROTOCOL,
  DnsServerTest.JSON_PROPERTY_RANDOMIZED_START_TIME,
  DnsServerTest.JSON_PROPERTY_RECURSIVE_QUERIES,
  DnsServerTest.JSON_PROPERTY_IPV6_POLICY,
  DnsServerTest.JSON_PROPERTY_FIXED_PACKET_RATE,
  DnsServerTest.JSON_PROPERTY_DNS_QUERY_CLASS,
  DnsServerTest.JSON_PROPERTY_BGP_MEASUREMENTS,
  DnsServerTest.JSON_PROPERTY_USE_PUBLIC_BGP,
  DnsServerTest.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DnsServerTest {
  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TestInterval interval = TestInterval.NUMBER_60;

  public static final String JSON_PROPERTY_ALERTS_ENABLED = "alertsEnabled";
  private Boolean alertsEnabled;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_ALERT_RULES = "alertRules";
  private List<AlertRule> alertRules = new ArrayList<>();

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

  public static final String JSON_PROPERTY_BANDWIDTH_MEASUREMENTS = "bandwidthMeasurements";
  private Boolean bandwidthMeasurements;

  public static final String JSON_PROPERTY_DNS_SERVERS = "dnsServers";
  private List<TestDnsServer> dnsServers = new ArrayList<>();

  public static final String JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL = "dnsTransportProtocol";
  private TestDnsTransportProtocol dnsTransportProtocol = TestDnsTransportProtocol.UDP;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_MTU_MEASUREMENTS = "mtuMeasurements";
  private Boolean mtuMeasurements;

  public static final String JSON_PROPERTY_NETWORK_MEASUREMENTS = "networkMeasurements";
  private Boolean networkMeasurements = true;

  public static final String JSON_PROPERTY_NUM_PATH_TRACES = "numPathTraces";
  private Integer numPathTraces = 3;

  public static final String JSON_PROPERTY_PATH_TRACE_MODE = "pathTraceMode";
  private TestPathTraceMode pathTraceMode = TestPathTraceMode.CLASSIC;

  public static final String JSON_PROPERTY_PROBE_MODE = "probeMode";
  private TestProbeMode probeMode = TestProbeMode.AUTO;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private TestProtocol protocol = TestProtocol.TCP;

  public static final String JSON_PROPERTY_RANDOMIZED_START_TIME = "randomizedStartTime";
  private Boolean randomizedStartTime = false;

  public static final String JSON_PROPERTY_RECURSIVE_QUERIES = "recursiveQueries";
  private Boolean recursiveQueries;

  public static final String JSON_PROPERTY_IPV6_POLICY = "ipv6Policy";
  private TestIpv6Policy ipv6Policy = TestIpv6Policy.USE_AGENT_POLICY;

  public static final String JSON_PROPERTY_FIXED_PACKET_RATE = "fixedPacketRate";
  private Integer fixedPacketRate;

  public static final String JSON_PROPERTY_DNS_QUERY_CLASS = "dnsQueryClass";
  private DnsQueryClass dnsQueryClass;

  public static final String JSON_PROPERTY_BGP_MEASUREMENTS = "bgpMeasurements";
  private Boolean bgpMeasurements = true;

  public static final String JSON_PROPERTY_USE_PUBLIC_BGP = "usePublicBgp";
  private Boolean usePublicBgp = true;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<Monitor> monitors = new ArrayList<>();

  public DnsServerTest() { 
  }

  @JsonCreator
  public DnsServerTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabel> labels, 
    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS) List<SharedWithAccount> sharedWithAccounts, 
    @JsonProperty(JSON_PROPERTY_MONITORS) List<Monitor> monitors
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
    this.monitors = monitors;
  }

  public DnsServerTest interval(TestInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TestInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public DnsServerTest alertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ALERTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public DnsServerTest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public DnsServerTest alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public DnsServerTest addAlertRulesItem(AlertRule alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * Contains list of enabled alert rule objects.
   * @return alertRules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertRule> getAlertRules() {
    return alertRules;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
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




  public DnsServerTest description(String description) {
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




  public DnsServerTest testName(String testName) {
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




  public DnsServerTest links(TestLinks links) {
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




  public DnsServerTest bandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bandwidth measurements, only applies to Enterprise agents assigned to the test.
   * @return bandwidthMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBandwidthMeasurements() {
    return bandwidthMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthMeasurements(Boolean bandwidthMeasurements) {
    this.bandwidthMeasurements = bandwidthMeasurements;
  }


  public DnsServerTest dnsServers(List<TestDnsServer> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public DnsServerTest addDnsServersItem(TestDnsServer dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

   /**
   * Get dnsServers
   * @return dnsServers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TestDnsServer> getDnsServers() {
    return dnsServers;
  }


  @JsonProperty(JSON_PROPERTY_DNS_SERVERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDnsServers(List<TestDnsServer> dnsServers) {
    this.dnsServers = dnsServers;
  }


  public DnsServerTest dnsTransportProtocol(TestDnsTransportProtocol dnsTransportProtocol) {
    this.dnsTransportProtocol = dnsTransportProtocol;
    return this;
  }

   /**
   * Get dnsTransportProtocol
   * @return dnsTransportProtocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestDnsTransportProtocol getDnsTransportProtocol() {
    return dnsTransportProtocol;
  }


  @JsonProperty(JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsTransportProtocol(TestDnsTransportProtocol dnsTransportProtocol) {
    this.dnsTransportProtocol = dnsTransportProtocol;
  }


  public DnsServerTest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The target record for the test, with the record type suffixed. If no record type is specified, the test defaults to an ANY record.
   * @return domain
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public DnsServerTest mtuMeasurements(Boolean mtuMeasurements) {
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


  public DnsServerTest networkMeasurements(Boolean networkMeasurements) {
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


  public DnsServerTest numPathTraces(Integer numPathTraces) {
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


  public DnsServerTest pathTraceMode(TestPathTraceMode pathTraceMode) {
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


  public DnsServerTest probeMode(TestProbeMode probeMode) {
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


  public DnsServerTest protocol(TestProtocol protocol) {
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

  public TestProtocol getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(TestProtocol protocol) {
    this.protocol = protocol;
  }


  public DnsServerTest randomizedStartTime(Boolean randomizedStartTime) {
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


  public DnsServerTest recursiveQueries(Boolean recursiveQueries) {
    this.recursiveQueries = recursiveQueries;
    return this;
  }

   /**
   * Set true to run query with RD (recursion desired) flag enabled.
   * @return recursiveQueries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURSIVE_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRecursiveQueries() {
    return recursiveQueries;
  }


  @JsonProperty(JSON_PROPERTY_RECURSIVE_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecursiveQueries(Boolean recursiveQueries) {
    this.recursiveQueries = recursiveQueries;
  }


  public DnsServerTest ipv6Policy(TestIpv6Policy ipv6Policy) {
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


  public DnsServerTest fixedPacketRate(Integer fixedPacketRate) {
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


  public DnsServerTest dnsQueryClass(DnsQueryClass dnsQueryClass) {
    this.dnsQueryClass = dnsQueryClass;
    return this;
  }

   /**
   * Get dnsQueryClass
   * @return dnsQueryClass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_QUERY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DnsQueryClass getDnsQueryClass() {
    return dnsQueryClass;
  }


  @JsonProperty(JSON_PROPERTY_DNS_QUERY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsQueryClass(DnsQueryClass dnsQueryClass) {
    this.dnsQueryClass = dnsQueryClass;
  }


  public DnsServerTest bgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  @JsonProperty(JSON_PROPERTY_BGP_MEASUREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }


  public DnsServerTest usePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
    return this;
  }

   /**
   * Indicate if all available public BGP monitors should be used, when ommited defaults to &#x60;bgpMeasurements&#x60; value.
   * @return usePublicBgp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePublicBgp() {
    return usePublicBgp;
  }


  @JsonProperty(JSON_PROPERTY_USE_PUBLIC_BGP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePublicBgp(Boolean usePublicBgp) {
    this.usePublicBgp = usePublicBgp;
  }


   /**
   * Contains list of enabled BGP monitors.
   * @return monitors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Monitor> getMonitors() {
    return monitors;
  }




  /**
   * Return true if this DnsServerTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsServerTest dnsServerTest = (DnsServerTest) o;
    return Objects.equals(this.interval, dnsServerTest.interval) &&
        Objects.equals(this.alertsEnabled, dnsServerTest.alertsEnabled) &&
        Objects.equals(this.enabled, dnsServerTest.enabled) &&
        Objects.equals(this.alertRules, dnsServerTest.alertRules) &&
        Objects.equals(this.createdBy, dnsServerTest.createdBy) &&
        Objects.equals(this.createdDate, dnsServerTest.createdDate) &&
        Objects.equals(this.description, dnsServerTest.description) &&
        Objects.equals(this.liveShare, dnsServerTest.liveShare) &&
        Objects.equals(this.modifiedBy, dnsServerTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, dnsServerTest.modifiedDate) &&
        Objects.equals(this.savedEvent, dnsServerTest.savedEvent) &&
        Objects.equals(this.testId, dnsServerTest.testId) &&
        Objects.equals(this.testName, dnsServerTest.testName) &&
        Objects.equals(this.type, dnsServerTest.type) &&
        Objects.equals(this.links, dnsServerTest.links) &&
        Objects.equals(this.labels, dnsServerTest.labels) &&
        Objects.equals(this.sharedWithAccounts, dnsServerTest.sharedWithAccounts) &&
        Objects.equals(this.bandwidthMeasurements, dnsServerTest.bandwidthMeasurements) &&
        Objects.equals(this.dnsServers, dnsServerTest.dnsServers) &&
        Objects.equals(this.dnsTransportProtocol, dnsServerTest.dnsTransportProtocol) &&
        Objects.equals(this.domain, dnsServerTest.domain) &&
        Objects.equals(this.mtuMeasurements, dnsServerTest.mtuMeasurements) &&
        Objects.equals(this.networkMeasurements, dnsServerTest.networkMeasurements) &&
        Objects.equals(this.numPathTraces, dnsServerTest.numPathTraces) &&
        Objects.equals(this.pathTraceMode, dnsServerTest.pathTraceMode) &&
        Objects.equals(this.probeMode, dnsServerTest.probeMode) &&
        Objects.equals(this.protocol, dnsServerTest.protocol) &&
        Objects.equals(this.randomizedStartTime, dnsServerTest.randomizedStartTime) &&
        Objects.equals(this.recursiveQueries, dnsServerTest.recursiveQueries) &&
        Objects.equals(this.ipv6Policy, dnsServerTest.ipv6Policy) &&
        Objects.equals(this.fixedPacketRate, dnsServerTest.fixedPacketRate) &&
        Objects.equals(this.dnsQueryClass, dnsServerTest.dnsQueryClass) &&
        Objects.equals(this.bgpMeasurements, dnsServerTest.bgpMeasurements) &&
        Objects.equals(this.usePublicBgp, dnsServerTest.usePublicBgp) &&
        Objects.equals(this.monitors, dnsServerTest.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, bandwidthMeasurements, dnsServers, dnsTransportProtocol, domain, mtuMeasurements, networkMeasurements, numPathTraces, pathTraceMode, probeMode, protocol, randomizedStartTime, recursiveQueries, ipv6Policy, fixedPacketRate, dnsQueryClass, bgpMeasurements, usePublicBgp, monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsServerTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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
    sb.append("    bandwidthMeasurements: ").append(toIndentedString(bandwidthMeasurements)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    dnsTransportProtocol: ").append(toIndentedString(dnsTransportProtocol)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    mtuMeasurements: ").append(toIndentedString(mtuMeasurements)).append("\n");
    sb.append("    networkMeasurements: ").append(toIndentedString(networkMeasurements)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    pathTraceMode: ").append(toIndentedString(pathTraceMode)).append("\n");
    sb.append("    probeMode: ").append(toIndentedString(probeMode)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    randomizedStartTime: ").append(toIndentedString(randomizedStartTime)).append("\n");
    sb.append("    recursiveQueries: ").append(toIndentedString(recursiveQueries)).append("\n");
    sb.append("    ipv6Policy: ").append(toIndentedString(ipv6Policy)).append("\n");
    sb.append("    fixedPacketRate: ").append(toIndentedString(fixedPacketRate)).append("\n");
    sb.append("    dnsQueryClass: ").append(toIndentedString(dnsQueryClass)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
    sb.append("    usePublicBgp: ").append(toIndentedString(usePublicBgp)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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

