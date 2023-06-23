# ChangeConfigSecretResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `configResponse`                                                                                                         | [com.formance.formance_sdk.models.shared.ConfigResponse](../../models/shared/ConfigResponse.md)                          | :heavy_minus_sign:                                                                                                       | Secret successfully changed.                                                                                             |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `webhooksErrorResponse`                                                                                                  | [com.formance.formance_sdk.models.shared.WebhooksErrorResponse](../../models/shared/WebhooksErrorResponse.md)            | :heavy_minus_sign:                                                                                                       | Error                                                                                                                    |