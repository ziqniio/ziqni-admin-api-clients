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


package com.ziqni.admin.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The scoring strategy type. SUMMARY: * \&quot;TotalCumulative\&quot;: The basic strategy where all the points sum up and are shown in the Leaderboard. Depending on the Rules, all the points are Cumulative. * \&quot;SumBest\&quot;: This strategy requires a value to indicate how many highest points will be calculated and shown on the leaderboard * \&quot;LimitedTo\&quot;: This strategy requires a value to indicate how many events will be summed up and shown in the leaderboard. * \&quot;FirstTo\&quot;: This strategy requires a value to indicate how many points have to be received to complete the mission. 
 */
public enum StrategyType {
  
  TOTALCUMULATIVE("TotalCumulative"),
  
  SUMBEST("SumBest"),
  
  LIMITEDTO("LimitedTo"),
  
  FIRSTTO("FirstTo");

  private String value;

  StrategyType(String value) {
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
  public static StrategyType fromValue(String value) {
    for (StrategyType b : StrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

