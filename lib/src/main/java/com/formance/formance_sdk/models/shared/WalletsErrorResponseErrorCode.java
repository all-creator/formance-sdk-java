/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WalletsErrorResponseErrorCode {
    VALIDATION("VALIDATION"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    HOLD_CLOSED("HOLD_CLOSED");

    @JsonValue
    public final String value;

    private WalletsErrorResponseErrorCode(String value) {
        this.value = value;
    }
}
