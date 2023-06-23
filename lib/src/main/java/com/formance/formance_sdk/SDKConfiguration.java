/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk;

import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.models.shared.Security;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class SDKConfiguration {
	public HTTPClient defaultClient;
	public HTTPClient securityClient;
	public Security security;
	public String serverUrl;
	public int serverIdx = 0;
	List<Map<String, String>> serverDefaults = new ArrayList<Map<String, String>>(){{
		add(new HashMap<String, String>());
		add(new HashMap<String, String>(){{
			put("organization", "");
		}});
	}};
	public String language = "java";
	public String openapiDocVersion = "v1.0.20230623";
	public String sdkVersion = "v1.0.20230623-beta.1";
	public String genVersion = "2.43.2";
	
	public Map<String, String> getServerVariableDefaults() {
		return serverDefaults.get(this.serverIdx);
	}
}