package com.wirelesscar.dynafleet.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.662-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://wirelesscar.com/dynafleet/api", name = "OrderService")
@XmlSeeAlso({com.wirelesscar.dynafleet.api.types.ObjectFactory.class})
public interface OrderService {

    @RequestWrapper(localName = "sendOrderItemToVehicle", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendOrderItemToVehicle")
    @WebMethod
    @ResponseWrapper(localName = "sendOrderItemToVehicleResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendOrderItemToVehicleResponse")
    public void sendOrderItemToVehicle(
        @WebParam(name = "Api_OrderSendOrderItemToVehicleTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderSendOrderItemToVehicleTO apiOrderSendOrderItemToVehicleTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getCustomerOrder", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCustomerOrder")
    @WebMethod
    @ResponseWrapper(localName = "getCustomerOrderResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCustomerOrderResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderArrayTO getCustomerOrder(
        @WebParam(name = "Api_OrderGetCustomerOrderTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetCustomerOrderTO apiOrderGetCustomerOrderTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "sendOrderToVehicle", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendOrderToVehicle")
    @WebMethod
    @ResponseWrapper(localName = "sendOrderToVehicleResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendOrderToVehicleResponse")
    public void sendOrderToVehicle(
        @WebParam(name = "Api_OrderSendOrderToVehicleTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderSendOrderToVehicleTO apiOrderSendOrderToVehicleTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "deleteCompletedOrder", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteCompletedOrder")
    @WebMethod
    @ResponseWrapper(localName = "deleteCompletedOrderResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteCompletedOrderResponse")
    public void deleteCompletedOrder(
        @WebParam(name = "Api_OrderDeleteCompletedOrderTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderDeleteCompletedOrderTO apiOrderDeleteCompletedOrderTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getElapsedTimeFromStatus", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetElapsedTimeFromStatus")
    @WebMethod
    @ResponseWrapper(localName = "getElapsedTimeFromStatusResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetElapsedTimeFromStatusResponse")
    public com.wirelesscar.dynafleet.api.types.ApiLong getElapsedTimeFromStatus(
        @WebParam(name = "Api_OrderGetElapsedTimeFromStatusTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetElapsedTimeFromStatusTO apiOrderGetElapsedTimeFromStatusTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "storeNewOrder", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.StoreNewOrder")
    @WebMethod
    @ResponseWrapper(localName = "storeNewOrderResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.StoreNewOrderResponse")
    public java.lang.String storeNewOrder(
        @WebParam(name = "Api_OrderStoreNewOrderTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderStoreNewOrderTO apiOrderStoreNewOrderTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "assignOrderToUser", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.AssignOrderToUser")
    @WebMethod
    @ResponseWrapper(localName = "assignOrderToUserResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.AssignOrderToUserResponse")
    public void assignOrderToUser(
        @WebParam(name = "Api_OrderAssignOrderToUserTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderAssignOrderToUserTO apiOrderAssignOrderToUserTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "assignOrderToVehicle", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.AssignOrderToVehicle")
    @WebMethod
    @ResponseWrapper(localName = "assignOrderToVehicleResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.AssignOrderToVehicleResponse")
    public void assignOrderToVehicle(
        @WebParam(name = "Api_OrderAssignOrderToVehicleTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderAssignOrderToVehicleTO apiOrderAssignOrderToVehicleTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "markOrderAsRead", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.MarkOrderAsRead")
    @WebMethod
    @ResponseWrapper(localName = "markOrderAsReadResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.MarkOrderAsReadResponse")
    public void markOrderAsRead(
        @WebParam(name = "Api_OrderMarkOrderAsReadTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderMarkOrderAsReadTO apiOrderMarkOrderAsReadTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getCreatedOrders", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCreatedOrders")
    @WebMethod
    @ResponseWrapper(localName = "getCreatedOrdersResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCreatedOrdersResponse")
    public java.util.List<java.lang.String> getCreatedOrders(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getCustomerOrders", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCustomerOrders")
    @WebMethod
    @ResponseWrapper(localName = "getCustomerOrdersResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCustomerOrdersResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderArrayTO getCustomerOrders(
        @WebParam(name = "Api_OrderGetCustomerOrdersTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetCustomerOrdersTO apiOrderGetCustomerOrdersTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addOrderItem", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.AddOrderItem")
    @WebMethod
    @ResponseWrapper(localName = "addOrderItemResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.AddOrderItemResponse")
    public com.wirelesscar.dynafleet.api.types.ApiLong addOrderItem(
        @WebParam(name = "Api_OrderAddOrderItemTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderAddOrderItemTO apiOrderAddOrderItemTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getDeletedOrders", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDeletedOrders")
    @WebMethod
    @ResponseWrapper(localName = "getDeletedOrdersResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDeletedOrdersResponse")
    public java.util.List<java.lang.String> getDeletedOrders(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "markOrderAsCompleted", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.MarkOrderAsCompleted")
    @WebMethod
    @ResponseWrapper(localName = "markOrderAsCompletedResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.MarkOrderAsCompletedResponse")
    public void markOrderAsCompleted(
        @WebParam(name = "Api_OrderMarkOrderAsCompletedTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderMarkOrderAsCompletedTO apiOrderMarkOrderAsCompletedTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getCompletedOrders", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCompletedOrders")
    @WebMethod
    @ResponseWrapper(localName = "getCompletedOrdersResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCompletedOrdersResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderArrayTO getCompletedOrders(
        @WebParam(name = "Api_OrderGetCompletedOrdersTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetCompletedOrdersTO apiOrderGetCompletedOrdersTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getOrderItem", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetOrderItem")
    @WebMethod
    @ResponseWrapper(localName = "getOrderItemResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetOrderItemResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderItemTO getOrderItem(
        @WebParam(name = "Api_OrderGetOrderItemTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetOrderItemTO apiOrderGetOrderItemTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getOrdersMarkedAsRead", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetOrdersMarkedAsRead")
    @WebMethod
    @ResponseWrapper(localName = "getOrdersMarkedAsReadResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetOrdersMarkedAsReadResponse")
    public java.util.List<java.lang.String> getOrdersMarkedAsRead(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getFuelConsumptionFromStatus", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFuelConsumptionFromStatus")
    @WebMethod
    @ResponseWrapper(localName = "getFuelConsumptionFromStatusResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFuelConsumptionFromStatusResponse")
    public com.wirelesscar.dynafleet.api.types.ApiLong getFuelConsumptionFromStatus(
        @WebParam(name = "Api_OrderGetFuelConsumptionFromStatusTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetFuelConsumptionFromStatusTO apiOrderGetFuelConsumptionFromStatusTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getModifiedOrderItems", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetModifiedOrderItems")
    @WebMethod
    @ResponseWrapper(localName = "getModifiedOrderItemsResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetModifiedOrderItemsResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderItemArrayTO getModifiedOrderItems(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getCoveredDistanceFromStatus", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCoveredDistanceFromStatus")
    @WebMethod
    @ResponseWrapper(localName = "getCoveredDistanceFromStatusResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetCoveredDistanceFromStatusResponse")
    public com.wirelesscar.dynafleet.api.types.ApiLong getCoveredDistanceFromStatus(
        @WebParam(name = "Api_OrderGetCoveredDistanceFromStatusTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetCoveredDistanceFromStatusTO apiOrderGetCoveredDistanceFromStatusTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getOrder", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetOrder")
    @WebMethod
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetOrderResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderTO getOrder(
        @WebParam(name = "Api_OrderGetOrderTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetOrderTO apiOrderGetOrderTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "deleteOrderItem", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteOrderItem")
    @WebMethod
    @ResponseWrapper(localName = "deleteOrderItemResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteOrderItemResponse")
    public void deleteOrderItem(
        @WebParam(name = "Api_OrderDeleteOrderItemTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderDeleteOrderItemTO apiOrderDeleteOrderItemTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getMinimumOrder", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetMinimumOrder")
    @WebMethod
    @ResponseWrapper(localName = "getMinimumOrderResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetMinimumOrderResponse")
    public com.wirelesscar.dynafleet.api.types.ApiOrderTO getMinimumOrder(
        @WebParam(name = "Api_OrderGetMinimumOrderTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiOrderGetMinimumOrderTO apiOrderGetMinimumOrderTO1
    ) throws DynafleetAPIException;
}
