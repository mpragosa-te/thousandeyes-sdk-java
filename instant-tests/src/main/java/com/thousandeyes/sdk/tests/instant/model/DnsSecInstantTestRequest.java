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
import com.thousandeyes.sdk.tests.instant.model.DnsQueryClass;
import com.thousandeyes.sdk.tests.instant.model.TestAgent;
import com.thousandeyes.sdk.tests.instant.model.TestLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnsSecInstantTestRequest
 */
@JsonPropertyOrder({
  DnsSecInstantTestRequest.JSON_PROPERTY_CREATED_BY,
  DnsSecInstantTestRequest.JSON_PROPERTY_CREATED_DATE,
  DnsSecInstantTestRequest.JSON_PROPERTY_DESCRIPTION,
  DnsSecInstantTestRequest.JSON_PROPERTY_LIVE_SHARE,
  DnsSecInstantTestRequest.JSON_PROPERTY_MODIFIED_BY,
  DnsSecInstantTestRequest.JSON_PROPERTY_MODIFIED_DATE,
  DnsSecInstantTestRequest.JSON_PROPERTY_SAVED_EVENT,
  DnsSecInstantTestRequest.JSON_PROPERTY_TEST_ID,
  DnsSecInstantTestRequest.JSON_PROPERTY_TEST_NAME,
  DnsSecInstantTestRequest.JSON_PROPERTY_TYPE,
  DnsSecInstantTestRequest.JSON_PROPERTY_LINKS,
  DnsSecInstantTestRequest.JSON_PROPERTY_LABELS,
  DnsSecInstantTestRequest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  DnsSecInstantTestRequest.JSON_PROPERTY_DOMAIN,
  DnsSecInstantTestRequest.JSON_PROPERTY_DNS_QUERY_CLASS,
  DnsSecInstantTestRequest.JSON_PROPERTY_RANDOMIZED_START_TIME,
  DnsSecInstantTestRequest.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DnsSecInstantTestRequest {
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
  private List<String> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<String> sharedWithAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_DNS_QUERY_CLASS = "dnsQueryClass";
  private DnsQueryClass dnsQueryClass;

  public static final String JSON_PROPERTY_RANDOMIZED_START_TIME = "randomizedStartTime";
  private Boolean randomizedStartTime = false;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<TestAgent> agents = new ArrayList<>();

  public DnsSecInstantTestRequest() { 
  }

  @JsonCreator
  public DnsSecInstantTestRequest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type
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




  public DnsSecInstantTestRequest description(String description) {
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




  public DnsSecInstantTestRequest testName(String testName) {
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




  public DnsSecInstantTestRequest links(TestLinks links) {
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


  public DnsSecInstantTestRequest labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public DnsSecInstantTestRequest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * A list of test label identifiers (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint).
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public DnsSecInstantTestRequest sharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public DnsSecInstantTestRequest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * A list of account group identifiers that the test is shared with (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint).
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public DnsSecInstantTestRequest domain(String domain) {
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


  public DnsSecInstantTestRequest dnsQueryClass(DnsQueryClass dnsQueryClass) {
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


  public DnsSecInstantTestRequest randomizedStartTime(Boolean randomizedStartTime) {
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


  public DnsSecInstantTestRequest agents(List<TestAgent> agents) {
    this.agents = agents;
    return this;
  }

  public DnsSecInstantTestRequest addAgentsItem(TestAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * A list of objects with &#x60;agentId&#x60; (required) and &#x60;sourceIpAddress&#x60; (optional).
   * @return agents
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TestAgent> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgents(List<TestAgent> agents) {
    this.agents = agents;
  }


  /**
   * Return true if this DnsSecInstantTestRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsSecInstantTestRequest dnsSecInstantTestRequest = (DnsSecInstantTestRequest) o;
    return Objects.equals(this.createdBy, dnsSecInstantTestRequest.createdBy) &&
        Objects.equals(this.createdDate, dnsSecInstantTestRequest.createdDate) &&
        Objects.equals(this.description, dnsSecInstantTestRequest.description) &&
        Objects.equals(this.liveShare, dnsSecInstantTestRequest.liveShare) &&
        Objects.equals(this.modifiedBy, dnsSecInstantTestRequest.modifiedBy) &&
        Objects.equals(this.modifiedDate, dnsSecInstantTestRequest.modifiedDate) &&
        Objects.equals(this.savedEvent, dnsSecInstantTestRequest.savedEvent) &&
        Objects.equals(this.testId, dnsSecInstantTestRequest.testId) &&
        Objects.equals(this.testName, dnsSecInstantTestRequest.testName) &&
        Objects.equals(this.type, dnsSecInstantTestRequest.type) &&
        Objects.equals(this.links, dnsSecInstantTestRequest.links) &&
        Objects.equals(this.labels, dnsSecInstantTestRequest.labels) &&
        Objects.equals(this.sharedWithAccounts, dnsSecInstantTestRequest.sharedWithAccounts) &&
        Objects.equals(this.domain, dnsSecInstantTestRequest.domain) &&
        Objects.equals(this.dnsQueryClass, dnsSecInstantTestRequest.dnsQueryClass) &&
        Objects.equals(this.randomizedStartTime, dnsSecInstantTestRequest.randomizedStartTime) &&
        Objects.equals(this.agents, dnsSecInstantTestRequest.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, domain, dnsQueryClass, randomizedStartTime, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsSecInstantTestRequest {\n");
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
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    dnsQueryClass: ").append(toIndentedString(dnsQueryClass)).append("\n");
    sb.append("    randomizedStartTime: ").append(toIndentedString(randomizedStartTime)).append("\n");
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

