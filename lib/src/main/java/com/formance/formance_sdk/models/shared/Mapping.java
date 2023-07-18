/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mapping {
    @JsonProperty("contracts")
    public Contract[] contracts;

    public Mapping withContracts(Contract[] contracts) {
        this.contracts = contracts;
        return this;
    }
    
    public Mapping(@JsonProperty("contracts") Contract[] contracts) {
        this.contracts = contracts;
  }
}
