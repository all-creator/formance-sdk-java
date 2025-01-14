/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

/**
 * AggregateBalancesResponse - OK
 */
public class AggregateBalancesResponse {
    @JsonProperty("data")
    public java.util.Map<String, BigInteger> data;

    public AggregateBalancesResponse withData(java.util.Map<String, BigInteger> data) {
        this.data = data;
        return this;
    }
    
    public AggregateBalancesResponse(@JsonProperty("data") java.util.Map<String, BigInteger> data) {
        this.data = data;
  }
}
