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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MonitorsRequest
 */
@JsonPropertyOrder({
  MonitorsRequest.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class MonitorsRequest {
  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<String> monitors = new ArrayList<>();

  public MonitorsRequest() { 
  }

  public MonitorsRequest monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  public MonitorsRequest addMonitorsItem(String monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * Contains list of BGP monitor IDs (get &#x60;monitorId&#x60; from &#x60;/monitors&#x60; endpoint)
   * @return monitors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMonitors() {
    return monitors;
  }


  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }


  /**
   * Return true if this MonitorsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorsRequest monitorsRequest = (MonitorsRequest) o;
    return Objects.equals(this.monitors, monitorsRequest.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorsRequest {\n");
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

