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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ExpandInstantTestOptions
 */
public enum ExpandInstantTestOptions {
  
  AGENT("agent"),
  
  LABEL("label"),
  
  SHARED_WITH_ACCOUNT("shared-with-account"),
  
  UNKNOWN("unknown");

  private String value;

  ExpandInstantTestOptions(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExpandInstantTestOptions fromValue(String value) {
    for (ExpandInstantTestOptions b : ExpandInstantTestOptions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
  }

}

