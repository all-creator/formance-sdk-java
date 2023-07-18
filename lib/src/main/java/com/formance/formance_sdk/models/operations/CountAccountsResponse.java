/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CountAccountsResponse {
    
    public String contentType;

    public CountAccountsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.ErrorResponse errorResponse;

    public CountAccountsResponse withErrorResponse(com.formance.formance_sdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public CountAccountsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;

    public CountAccountsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CountAccountsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CountAccountsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
