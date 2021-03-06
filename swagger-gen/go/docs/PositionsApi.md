# \PositionsApi

All URIs are relative to *https://api-testnet.bybit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PositionsChangeMargin**](PositionsApi.md#PositionsChangeMargin) | **Post** /position/change-position-margin | Update margin.
[**PositionsMyPosition**](PositionsApi.md#PositionsMyPosition) | **Get** /position/list | Get my position list.
[**PositionsMyPositionV2**](PositionsApi.md#PositionsMyPositionV2) | **Get** /v2/private/position/list | Get my position list.
[**PositionsSaveLeverage**](PositionsApi.md#PositionsSaveLeverage) | **Post** /user/leverage/save | Change user leverage.
[**PositionsTradingStop**](PositionsApi.md#PositionsTradingStop) | **Post** /open-api/position/trading-stop | Set Trading-Stop Condition.
[**PositionsUserLeverage**](PositionsApi.md#PositionsUserLeverage) | **Get** /user/leverage | Get user leverage setting.


# **PositionsChangeMargin**
> interface{} PositionsChangeMargin(ctx, symbol, margin)
Update margin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**| Contract type which you want update its margin | 
  **margin** | **string**| New margin you want set | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature), [timestamp](../README.md#timestamp)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionsMyPosition**
> interface{} PositionsMyPosition(ctx, )
Get my position list.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature), [timestamp](../README.md#timestamp)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionsMyPositionV2**
> interface{} PositionsMyPositionV2(ctx, optional)
Get my position list.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PositionsMyPositionV2Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PositionsMyPositionV2Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**| Contract type which you want update its margin | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature), [timestamp](../README.md#timestamp)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionsSaveLeverage**
> interface{} PositionsSaveLeverage(ctx, symbol, leverage)
Change user leverage.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**| A symbol which you want change its leverage | 
  **leverage** | **string**| New leverage you want set | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature), [timestamp](../README.md#timestamp)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionsTradingStop**
> interface{} PositionsTradingStop(ctx, symbol, optional)
Set Trading-Stop Condition.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**| Contract type | 
 **optional** | ***PositionsTradingStopOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PositionsTradingStopOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **takeProfit** | **optional.String**| Not less than 0, 0 means cancel TP | 
 **stopLoss** | **optional.String**| Not less than 0, 0 means cancel SL | 
 **trailingStop** | **optional.String**| Not less than 0, 0 means cancel TS | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature), [timestamp](../README.md#timestamp)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PositionsUserLeverage**
> interface{} PositionsUserLeverage(ctx, )
Get user leverage setting.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature), [timestamp](../README.md#timestamp)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

