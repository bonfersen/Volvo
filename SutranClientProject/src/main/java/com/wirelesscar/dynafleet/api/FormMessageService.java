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
 * 2017-06-30T14:30:13.669-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://wirelesscar.com/dynafleet/api", name = "FormMessageService")
@XmlSeeAlso({com.wirelesscar.dynafleet.api.types.ObjectFactory.class})
public interface FormMessageService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getFormMessagesByForm", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFormMessagesByForm")
    @WebMethod
    @ResponseWrapper(localName = "getFormMessagesByFormResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFormMessagesByFormResponse")
    public com.wirelesscar.dynafleet.api.types.ApiFormMessageArrayTO getFormMessagesByForm(
        @WebParam(name = "Api_FormMessageGetFormMessagesByFormTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageGetFormMessagesByFormTO apiFormMessageGetFormMessagesByFormTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getDeletedFormMessages", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDeletedFormMessages")
    @WebMethod
    @ResponseWrapper(localName = "getDeletedFormMessagesResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDeletedFormMessagesResponse")
    public com.wirelesscar.dynafleet.api.types.ApiFormMessageIdArrayTO getDeletedFormMessages(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "sendFormMessageWithDestinationPointToVehicle", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendFormMessageWithDestinationPointToVehicle")
    @WebMethod
    @ResponseWrapper(localName = "sendFormMessageWithDestinationPointToVehicleResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendFormMessageWithDestinationPointToVehicleResponse")
    public com.wirelesscar.dynafleet.api.types.ApiFormMessageId sendFormMessageWithDestinationPointToVehicle(
        @WebParam(name = "Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "deleteFormMessages", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteFormMessages")
    @WebMethod
    @ResponseWrapper(localName = "deleteFormMessagesResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteFormMessagesResponse")
    public void deleteFormMessages(
        @WebParam(name = "Api_FormMessageDeleteFormMessagesTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageDeleteFormMessagesTO apiFormMessageDeleteFormMessagesTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getNewFormMessages", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewFormMessages")
    @WebMethod
    @ResponseWrapper(localName = "getNewFormMessagesResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewFormMessagesResponse")
    public com.wirelesscar.dynafleet.api.types.ApiFormMessageArrayTO getNewFormMessages(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getNewFormMessageSendstatus", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewFormMessageSendstatus")
    @WebMethod
    @ResponseWrapper(localName = "getNewFormMessageSendstatusResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewFormMessageSendstatusResponse")
    public com.wirelesscar.dynafleet.api.types.ApiSendstatusArrayTO getNewFormMessageSendstatus(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getFormMessagesInInbox", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFormMessagesInInbox")
    @WebMethod
    @ResponseWrapper(localName = "getFormMessagesInInboxResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFormMessagesInInboxResponse")
    public com.wirelesscar.dynafleet.api.types.ApiFormMessageArrayTO getFormMessagesInInbox(
        @WebParam(name = "Api_FormMessageGetFormMessagesInInboxTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageGetFormMessagesInInboxTO apiFormMessageGetFormMessagesInInboxTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "sendFormMessageToVehicle", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendFormMessageToVehicle")
    @WebMethod
    @ResponseWrapper(localName = "sendFormMessageToVehicleResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.SendFormMessageToVehicleResponse")
    public com.wirelesscar.dynafleet.api.types.ApiFormMessageId sendFormMessageToVehicle(
        @WebParam(name = "Api_FormMessageSendFormMessageToVehicleTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageSendFormMessageToVehicleTO apiFormMessageSendFormMessageToVehicleTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "deleteFormMessage", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteFormMessage")
    @WebMethod
    @ResponseWrapper(localName = "deleteFormMessageResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.DeleteFormMessageResponse")
    public void deleteFormMessage(
        @WebParam(name = "Api_FormMessageDeleteFormMessageTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageDeleteFormMessageTO apiFormMessageDeleteFormMessageTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getFormMessageReadAckInfos", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFormMessageReadAckInfos")
    @WebMethod
    @ResponseWrapper(localName = "getFormMessageReadAckInfosResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetFormMessageReadAckInfosResponse")
    public com.wirelesscar.dynafleet.api.types.ApiReadAckInfoArrayTO getFormMessageReadAckInfos(
        @WebParam(name = "Api_FormMessageGetReadAckInfosTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiFormMessageGetReadAckInfosTO apiFormMessageGetReadAckInfosTO1
    ) throws DynafleetAPIException;
}
