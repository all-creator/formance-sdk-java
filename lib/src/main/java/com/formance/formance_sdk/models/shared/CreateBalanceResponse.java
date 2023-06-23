/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBalanceResponse - Created balance
 */

public class CreateBalanceResponse {
    @JsonProperty("data")
    public Balance data;

    public CreateBalanceResponse withData(Balance data) {
        this.data = data;
        return this;
    }
    
    public CreateBalanceResponse(@JsonProperty("data") Balance data) {
        this.data = data;
  }
}