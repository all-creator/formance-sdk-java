/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksErrorResponse - Error
 */

public class WebhooksErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public String details;

    public WebhooksErrorResponse withDetails(String details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("errorCode")
    public WebhooksErrorsEnum errorCode;

    public WebhooksErrorResponse withErrorCode(WebhooksErrorsEnum errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    
    @JsonProperty("errorMessage")
    public String errorMessage;

    public WebhooksErrorResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    public WebhooksErrorResponse(@JsonProperty("errorCode") WebhooksErrorsEnum errorCode, @JsonProperty("errorMessage") String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
  }
}