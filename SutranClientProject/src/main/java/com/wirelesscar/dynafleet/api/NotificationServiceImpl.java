
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.wirelesscar.dynafleet.api;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.640-05:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "DynafleetAPI",
                      portName = "NotificationServicePort",
                      targetNamespace = "http://wirelesscar.com/dynafleet/api",
                      wsdlLocation = "https://api-preprod.dynafleetonline.com/wsdl",
                      endpointInterface = "com.wirelesscar.dynafleet.api.NotificationService")
                      
public class NotificationServiceImpl implements NotificationService {

    private static final Logger LOG = Logger.getLogger(NotificationServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.NotificationService#checkNotificationFlags(com.wirelesscar.dynafleet.api.types.ApiSessionId  apiSessionId1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiNotificationTO checkNotificationFlags(com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1) throws DynafleetAPIException    { 
        LOG.info("Executing operation checkNotificationFlags");
        System.out.println(apiSessionId1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiNotificationTO _return = new com.wirelesscar.dynafleet.api.types.ApiNotificationTO();
            _return.setDeletedAlarm(true);
            _return.setDeletedCustomer(false);
            _return.setDeletedDTMAlarm(true);
            _return.setDeletedDriver(true);
            _return.setDeletedFormMessage(true);
            _return.setDeletedMessage(true);
            _return.setDeletedOrder(true);
            _return.setDeletedPOI(true);
            _return.setDeletedServicePlan(true);
            _return.setDeletedUser(false);
            _return.setDeletedVehicle(false);
            _return.setModifiedCustomer(false);
            _return.setModifiedDriver(true);
            _return.setModifiedOrder(false);
            _return.setModifiedOrderItem(true);
            _return.setModifiedPOI(true);
            _return.setModifiedServicePlan(true);
            _return.setModifiedUser(true);
            _return.setModifiedVehicle(true);
            _return.setNewAlarm(true);
            _return.setNewCDPDownloadSendstatus(true);
            _return.setNewDTMAlarm(false);
            _return.setNewDTMAlarmSetupSendstatus(true);
            _return.setNewDriverData(true);
            _return.setNewDtjData(false);
            _return.setNewFormMessage(true);
            _return.setNewFormMessageSendStatus(false);
            _return.setNewMessage(true);
            _return.setNewMessageSendStatus(true);
            _return.setNewTrackingData(true);
            _return.setNewTrackingSetUpSendstatus(false);
            _return.setNewVehicleReportData(true);
            _return.setOrderMarkedAsRead(false);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.NotificationService#checkNotificationFlags3(com.wirelesscar.dynafleet.api.types.ApiSessionId  apiSessionId1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiNotificationTO3 checkNotificationFlags3(com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1) throws DynafleetAPIException    { 
        LOG.info("Executing operation checkNotificationFlags3");
        System.out.println(apiSessionId1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiNotificationTO3 _return = new com.wirelesscar.dynafleet.api.types.ApiNotificationTO3();
            _return.setDeletedAlarm(false);
            _return.setDeletedCustomer(false);
            _return.setDeletedDTMAlarm(true);
            _return.setDeletedDriver(true);
            _return.setDeletedFormMessage(false);
            _return.setDeletedGeofencePlus(false);
            _return.setDeletedMessage(false);
            _return.setDeletedOrder(true);
            _return.setDeletedPOI(true);
            _return.setDeletedServicePlan(true);
            _return.setDeletedUser(true);
            _return.setDeletedVehicle(false);
            _return.setModifiedCustomer(true);
            _return.setModifiedDriver(false);
            _return.setModifiedGeofencePlus(false);
            _return.setModifiedOrder(true);
            _return.setModifiedOrderItem(true);
            _return.setModifiedPOI(true);
            _return.setModifiedServicePlan(true);
            _return.setModifiedUser(false);
            _return.setModifiedVehicle(false);
            _return.setNewAlarm(true);
            _return.setNewCDPDownloadSendstatus(false);
            _return.setNewDTMAlarm(true);
            _return.setNewDTMAlarmSetupSendstatus(false);
            _return.setNewDriverData(false);
            _return.setNewDtjData(false);
            _return.setNewFormMessage(false);
            _return.setNewFormMessageSendStatus(false);
            _return.setNewGeofenceData(false);
            _return.setNewGeofencePlusData(false);
            _return.setNewMessage(true);
            _return.setNewMessageSendStatus(true);
            _return.setNewTrackingData(true);
            _return.setNewTrackingSetUpSendstatus(true);
            _return.setNewVehiclePositionData(false);
            _return.setNewVehicleEventMessages(true);
            _return.setNewVehicleReportData(true);
            _return.setOrderMarkedAsRead(true);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.NotificationService#checkNotificationFlags2(com.wirelesscar.dynafleet.api.types.ApiSessionId  apiSessionId1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiNotificationTO2 checkNotificationFlags2(com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1) throws DynafleetAPIException    { 
        LOG.info("Executing operation checkNotificationFlags2");
        System.out.println(apiSessionId1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiNotificationTO2 _return = new com.wirelesscar.dynafleet.api.types.ApiNotificationTO2();
            _return.setDeletedAlarm(true);
            _return.setDeletedCustomer(false);
            _return.setDeletedDTMAlarm(true);
            _return.setDeletedDriver(true);
            _return.setDeletedFormMessage(true);
            _return.setDeletedGeofencePlus(false);
            _return.setDeletedMessage(false);
            _return.setDeletedOrder(false);
            _return.setDeletedPOI(true);
            _return.setDeletedServicePlan(true);
            _return.setDeletedUser(true);
            _return.setDeletedVehicle(false);
            _return.setModifiedCustomer(true);
            _return.setModifiedDriver(false);
            _return.setModifiedGeofencePlus(false);
            _return.setModifiedOrder(true);
            _return.setModifiedOrderItem(false);
            _return.setModifiedPOI(false);
            _return.setModifiedServicePlan(true);
            _return.setModifiedUser(false);
            _return.setModifiedVehicle(false);
            _return.setNewAlarm(false);
            _return.setNewCDPDownloadSendstatus(true);
            _return.setNewDTMAlarm(true);
            _return.setNewDTMAlarmSetupSendstatus(true);
            _return.setNewDriverData(false);
            _return.setNewDtjData(false);
            _return.setNewFormMessage(true);
            _return.setNewFormMessageSendStatus(false);
            _return.setNewGeofencePlusData(true);
            _return.setNewMessage(true);
            _return.setNewMessageSendStatus(false);
            _return.setNewTrackingData(true);
            _return.setNewTrackingSetUpSendstatus(false);
            _return.setNewVehiclePositionData(false);
            _return.setNewVehicleReportData(false);
            _return.setOrderMarkedAsRead(false);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

}
