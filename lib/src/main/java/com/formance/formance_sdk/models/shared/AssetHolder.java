/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class AssetHolder {
    @JsonProperty("assets")
    public java.util.Map<String, BigInteger> assets;

    public AssetHolder withAssets(java.util.Map<String, BigInteger> assets) {
        this.assets = assets;
        return this;
    }
    
    public AssetHolder(@JsonProperty("assets") java.util.Map<String, BigInteger> assets) {
        this.assets = assets;
  }
}
