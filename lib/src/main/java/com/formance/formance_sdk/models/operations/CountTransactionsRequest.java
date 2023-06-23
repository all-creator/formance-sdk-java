/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class CountTransactionsRequest {
    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=account")
    public String account;

    public CountTransactionsRequest withAccount(String account) {
        this.account = account;
        return this;
    }
    
    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destination")
    public String destination;

    public CountTransactionsRequest withDestination(String destination) {
        this.destination = destination;
        return this;
    }
    
    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    public OffsetDateTime endTime;

    public CountTransactionsRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public CountTransactionsRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public CountTransactionsMetadata metadata;

    public CountTransactionsRequest withMetadata(CountTransactionsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Filter transactions by reference field.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reference")
    public String reference;

    public CountTransactionsRequest withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    public String source;

    public CountTransactionsRequest withSource(String source) {
        this.source = source;
        return this;
    }
    
    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    public OffsetDateTime startTime;

    public CountTransactionsRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
    public CountTransactionsRequest(@JsonProperty("ledger") String ledger) {
        this.ledger = ledger;
  }
}