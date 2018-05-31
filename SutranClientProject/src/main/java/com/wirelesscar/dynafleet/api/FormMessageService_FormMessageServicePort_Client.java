
package com.wirelesscar.dynafleet.api;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.401-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class FormMessageService_FormMessageServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://wirelesscar.com/dynafleet/api", "DynafleetAPI");

    private FormMessageService_FormMessageServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DynafleetAPI.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DynafleetAPI ss = new DynafleetAPI(wsdlURL, SERVICE_NAME);
        FormMessageService port = ss.getFormMessageServicePort();  
        
        {
        System.out.println("Invoking getFormMessagesByForm...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageGetFormMessagesByFormTO _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageGetFormMessagesByFormTO();
        com.wirelesscar.dynafleet.api.types.ApiFormId _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1FormId = new com.wirelesscar.dynafleet.api.types.ApiFormId();
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1FormId.setId(-3247564722226723357l);
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1.setFormId(_getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1FormId);
        com.wirelesscar.dynafleet.api.types.ApiDate _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1From = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1From.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.409-05:00"));
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1.setFrom(_getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1From);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1SessionId.setId("Id284242968");
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1.setSessionId(_getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiDate _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1To = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1To.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.409-05:00"));
        _getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1.setTo(_getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1To);
        try {
            com.wirelesscar.dynafleet.api.types.ApiFormMessageArrayTO _getFormMessagesByForm__return = port.getFormMessagesByForm(_getFormMessagesByForm_apiFormMessageGetFormMessagesByFormTO1);
            System.out.println("getFormMessagesByForm.result=" + _getFormMessagesByForm__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeletedFormMessages...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDeletedFormMessages_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDeletedFormMessages_apiSessionId1.setId("Id-1555868345");
        try {
            com.wirelesscar.dynafleet.api.types.ApiFormMessageIdArrayTO _getDeletedFormMessages__return = port.getDeletedFormMessages(_getDeletedFormMessages_apiSessionId1);
            System.out.println("getDeletedFormMessages.result=" + _getDeletedFormMessages__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking sendFormMessageWithDestinationPointToVehicle...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageWithDestinationPointTO _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message = new com.wirelesscar.dynafleet.api.types.ApiFormMessageWithDestinationPointTO();
        com.wirelesscar.dynafleet.api.types.ApiFormId _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageFormId = new com.wirelesscar.dynafleet.api.types.ApiFormId();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageFormId.setId(-7978776436695015756l);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setFormId(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageFormId);
        com.wirelesscar.dynafleet.api.types.ApiBoolean _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageIsRead = new com.wirelesscar.dynafleet.api.types.ApiBoolean();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageIsRead.setValue(false);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setIsRead(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageIsRead);
        java.util.List<com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO> _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageData = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO>();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1.setFieldData("FieldData910941625");
        com.wirelesscar.dynafleet.api.types.ApiLong _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1FormFieldIndex = new com.wirelesscar.dynafleet.api.types.ApiLong();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1FormFieldIndex.setValue(-7498909621545555672l);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1.setFormFieldIndex(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1FormFieldIndex);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageData.add(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageDataVal1);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.getMessageData().addAll(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageData);
        com.wirelesscar.dynafleet.api.types.ApiFormMessageId _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageId = new com.wirelesscar.dynafleet.api.types.ApiFormMessageId();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageId.setId(-4434594125426025082l);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setMessageId(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageMessageId);
        com.wirelesscar.dynafleet.api.types.ApiPointTO _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePoint = new com.wirelesscar.dynafleet.api.types.ApiPointTO();
        com.wirelesscar.dynafleet.api.types.ApiDouble _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePointLatitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePointLatitude.setValue(0.07403459090998654);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePoint.setLatitude(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePointLatitude);
        com.wirelesscar.dynafleet.api.types.ApiDouble _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePointLongitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePointLongitude.setValue(0.7369751553572745);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePoint.setLongitude(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePointLongitude);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setPoint(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessagePoint);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setSendstatus("Sendstatus-1828179384");
        com.wirelesscar.dynafleet.api.types.ApiDate _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageSendstatusLastChangeTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageSendstatusLastChangeTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.410-05:00"));
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setSendstatusLastChangeTime(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageSendstatusLastChangeTime);
        com.wirelesscar.dynafleet.api.types.ApiDate _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageTimestamp = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageTimestamp.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.411-05:00"));
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setTimestamp(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageTimestamp);
        com.wirelesscar.dynafleet.api.types.ApiUserId _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageUserId = new com.wirelesscar.dynafleet.api.types.ApiUserId();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageUserId.setId(Long.valueOf(-5831399008747738790l));
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setUserId(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageUserId);
        com.wirelesscar.dynafleet.api.types.ApiVehicleId _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageVehicleId = new com.wirelesscar.dynafleet.api.types.ApiVehicleId();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageVehicleId.setId(-318748438160727541l);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message.setVehicleId(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1MessageVehicleId);
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1.setMessage(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1Message);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1SessionId.setId("Id-1142001274");
        _sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1.setSessionId(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiFormMessageId _sendFormMessageWithDestinationPointToVehicle__return = port.sendFormMessageWithDestinationPointToVehicle(_sendFormMessageWithDestinationPointToVehicle_apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1);
            System.out.println("sendFormMessageWithDestinationPointToVehicle.result=" + _sendFormMessageWithDestinationPointToVehicle__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteFormMessages...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageDeleteFormMessagesTO _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageDeleteFormMessagesTO();
        java.util.List<com.wirelesscar.dynafleet.api.types.ApiFormMessageId> _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1FormMessageIdList = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiFormMessageId>();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageId _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1FormMessageIdListVal1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageId();
        _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1FormMessageIdListVal1.setId(1371222176257068297l);
        _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1FormMessageIdList.add(_deleteFormMessages_apiFormMessageDeleteFormMessagesTO1FormMessageIdListVal1);
        _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1.getFormMessageIdList().addAll(_deleteFormMessages_apiFormMessageDeleteFormMessagesTO1FormMessageIdList);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1SessionId.setId("Id-662370597");
        _deleteFormMessages_apiFormMessageDeleteFormMessagesTO1.setSessionId(_deleteFormMessages_apiFormMessageDeleteFormMessagesTO1SessionId);
        try {
            port.deleteFormMessages(_deleteFormMessages_apiFormMessageDeleteFormMessagesTO1);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNewFormMessages...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getNewFormMessages_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getNewFormMessages_apiSessionId1.setId("Id948115489");
        try {
            com.wirelesscar.dynafleet.api.types.ApiFormMessageArrayTO _getNewFormMessages__return = port.getNewFormMessages(_getNewFormMessages_apiSessionId1);
            System.out.println("getNewFormMessages.result=" + _getNewFormMessages__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNewFormMessageSendstatus...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getNewFormMessageSendstatus_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getNewFormMessageSendstatus_apiSessionId1.setId("Id532224152");
        try {
            com.wirelesscar.dynafleet.api.types.ApiSendstatusArrayTO _getNewFormMessageSendstatus__return = port.getNewFormMessageSendstatus(_getNewFormMessageSendstatus_apiSessionId1);
            System.out.println("getNewFormMessageSendstatus.result=" + _getNewFormMessageSendstatus__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFormMessagesInInbox...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageGetFormMessagesInInboxTO _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageGetFormMessagesInInboxTO();
        com.wirelesscar.dynafleet.api.types.ApiDate _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1FromDate = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1FromDate.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.413-05:00"));
        _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1.setFromDate(_getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1FromDate);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1SessionId.setId("Id1796848417");
        _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1.setSessionId(_getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiDate _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1ToDate = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1ToDate.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.413-05:00"));
        _getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1.setToDate(_getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1ToDate);
        try {
            com.wirelesscar.dynafleet.api.types.ApiFormMessageArrayTO _getFormMessagesInInbox__return = port.getFormMessagesInInbox(_getFormMessagesInInbox_apiFormMessageGetFormMessagesInInboxTO1);
            System.out.println("getFormMessagesInInbox.result=" + _getFormMessagesInInbox__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking sendFormMessageToVehicle...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageSendFormMessageToVehicleTO _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageSendFormMessageToVehicleTO();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageTO _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message = new com.wirelesscar.dynafleet.api.types.ApiFormMessageTO();
        com.wirelesscar.dynafleet.api.types.ApiFormId _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageFormId = new com.wirelesscar.dynafleet.api.types.ApiFormId();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageFormId.setId(7303043642353249902l);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setFormId(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageFormId);
        com.wirelesscar.dynafleet.api.types.ApiBoolean _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageIsRead = new com.wirelesscar.dynafleet.api.types.ApiBoolean();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageIsRead.setValue(true);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setIsRead(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageIsRead);
        java.util.List<com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO> _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageData = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO>();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageFieldTO();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1.setFieldData("FieldData-330537551");
        com.wirelesscar.dynafleet.api.types.ApiLong _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1FormFieldIndex = new com.wirelesscar.dynafleet.api.types.ApiLong();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1FormFieldIndex.setValue(-4390180448968658758l);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1.setFormFieldIndex(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1FormFieldIndex);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageData.add(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageDataVal1);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.getMessageData().addAll(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageData);
        com.wirelesscar.dynafleet.api.types.ApiFormMessageId _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageId = new com.wirelesscar.dynafleet.api.types.ApiFormMessageId();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageId.setId(2514497454328942341l);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setMessageId(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageMessageId);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setSendstatus("Sendstatus320730714");
        com.wirelesscar.dynafleet.api.types.ApiDate _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageSendstatusLastChangeTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageSendstatusLastChangeTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.414-05:00"));
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setSendstatusLastChangeTime(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageSendstatusLastChangeTime);
        com.wirelesscar.dynafleet.api.types.ApiDate _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageTimestamp = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageTimestamp.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.414-05:00"));
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setTimestamp(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageTimestamp);
        com.wirelesscar.dynafleet.api.types.ApiUserId _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageUserId = new com.wirelesscar.dynafleet.api.types.ApiUserId();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageUserId.setId(Long.valueOf(8105791271990030079l));
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setUserId(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageUserId);
        com.wirelesscar.dynafleet.api.types.ApiVehicleId _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageVehicleId = new com.wirelesscar.dynafleet.api.types.ApiVehicleId();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageVehicleId.setId(-7984326759024207007l);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message.setVehicleId(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1MessageVehicleId);
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1.setMessage(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1Message);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1SessionId.setId("Id2073930732");
        _sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1.setSessionId(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiFormMessageId _sendFormMessageToVehicle__return = port.sendFormMessageToVehicle(_sendFormMessageToVehicle_apiFormMessageSendFormMessageToVehicleTO1);
            System.out.println("sendFormMessageToVehicle.result=" + _sendFormMessageToVehicle__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteFormMessage...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageDeleteFormMessageTO _deleteFormMessage_apiFormMessageDeleteFormMessageTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageDeleteFormMessageTO();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageId _deleteFormMessage_apiFormMessageDeleteFormMessageTO1FormMessageId = new com.wirelesscar.dynafleet.api.types.ApiFormMessageId();
        _deleteFormMessage_apiFormMessageDeleteFormMessageTO1FormMessageId.setId(-939266550417873977l);
        _deleteFormMessage_apiFormMessageDeleteFormMessageTO1.setFormMessageId(_deleteFormMessage_apiFormMessageDeleteFormMessageTO1FormMessageId);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _deleteFormMessage_apiFormMessageDeleteFormMessageTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _deleteFormMessage_apiFormMessageDeleteFormMessageTO1SessionId.setId("Id1735061160");
        _deleteFormMessage_apiFormMessageDeleteFormMessageTO1.setSessionId(_deleteFormMessage_apiFormMessageDeleteFormMessageTO1SessionId);
        try {
            port.deleteFormMessage(_deleteFormMessage_apiFormMessageDeleteFormMessageTO1);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFormMessageReadAckInfos...");
        com.wirelesscar.dynafleet.api.types.ApiFormMessageGetReadAckInfosTO _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageGetReadAckInfosTO();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageIdArrayTO _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArray = new com.wirelesscar.dynafleet.api.types.ApiFormMessageIdArrayTO();
        java.util.List<com.wirelesscar.dynafleet.api.types.ApiFormMessageId> _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArrayArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiFormMessageId>();
        com.wirelesscar.dynafleet.api.types.ApiFormMessageId _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArrayArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiFormMessageId();
        _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArrayArrayVal1.setId(1592694185700443437l);
        _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArrayArray.add(_getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArrayArrayVal1);
        _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArray.getArray().addAll(_getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArrayArray);
        _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1.setFormMessageIdArray(_getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1FormMessageIdArray);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1SessionId.setId("Id2081445866");
        _getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1.setSessionId(_getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiReadAckInfoArrayTO _getFormMessageReadAckInfos__return = port.getFormMessageReadAckInfos(_getFormMessageReadAckInfos_apiFormMessageGetReadAckInfosTO1);
            System.out.println("getFormMessageReadAckInfos.result=" + _getFormMessageReadAckInfos__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
