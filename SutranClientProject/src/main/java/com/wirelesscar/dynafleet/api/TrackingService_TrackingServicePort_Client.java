
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
 * 2017-06-30T14:30:13.391-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class TrackingService_TrackingServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://wirelesscar.com/dynafleet/api", "DynafleetAPI");

    private TrackingService_TrackingServicePort_Client() {
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
        TrackingService port = ss.getTrackingServicePort();  
        
        {
        System.out.println("Invoking getLastKnownPositions...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getLastKnownPositions_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getLastKnownPositions_apiSessionId1.setId("Id-1106108822");
        try {
            com.wirelesscar.dynafleet.api.types.ApiLastKnownPositionArrayTO _getLastKnownPositions__return = port.getLastKnownPositions(_getLastKnownPositions_apiSessionId1);
            System.out.println("getLastKnownPositions.result=" + _getLastKnownPositions__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNewPositions...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getNewPositions_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getNewPositions_apiSessionId1.setId("Id-1502708653");
        try {
            com.wirelesscar.dynafleet.api.types.ApiPositionPlusArrayTO _getNewPositions__return = port.getNewPositions(_getNewPositions_apiSessionId1);
            System.out.println("getNewPositions.result=" + _getNewPositions__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNewTrackingData...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getNewTrackingData_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getNewTrackingData_apiSessionId1.setId("Id-486773638");
        try {
            com.wirelesscar.dynafleet.api.types.ApiTrackingDataArrayTO _getNewTrackingData__return = port.getNewTrackingData(_getNewTrackingData_apiSessionId1);
            System.out.println("getNewTrackingData.result=" + _getNewTrackingData__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getVehiclePositions...");
        com.wirelesscar.dynafleet.api.types.ApiTrackingGetVehiclePositionTO _getVehiclePositions_apiTrackingGetVehiclePositionTO1 = new com.wirelesscar.dynafleet.api.types.ApiTrackingGetVehiclePositionTO();
        com.wirelesscar.dynafleet.api.types.ApiLong _getVehiclePositions_apiTrackingGetVehiclePositionTO1NumberOfPositions = new com.wirelesscar.dynafleet.api.types.ApiLong();
        _getVehiclePositions_apiTrackingGetVehiclePositionTO1NumberOfPositions.setValue(-1911638024833348637l);
        _getVehiclePositions_apiTrackingGetVehiclePositionTO1.setNumberOfPositions(_getVehiclePositions_apiTrackingGetVehiclePositionTO1NumberOfPositions);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getVehiclePositions_apiTrackingGetVehiclePositionTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getVehiclePositions_apiTrackingGetVehiclePositionTO1SessionId.setId("Id-1564535472");
        _getVehiclePositions_apiTrackingGetVehiclePositionTO1.setSessionId(_getVehiclePositions_apiTrackingGetVehiclePositionTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiVehicleId _getVehiclePositions_apiTrackingGetVehiclePositionTO1VehicleId = new com.wirelesscar.dynafleet.api.types.ApiVehicleId();
        _getVehiclePositions_apiTrackingGetVehiclePositionTO1VehicleId.setId(4919415592904419135l);
        _getVehiclePositions_apiTrackingGetVehiclePositionTO1.setVehicleId(_getVehiclePositions_apiTrackingGetVehiclePositionTO1VehicleId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPositionArrayTO _getVehiclePositions__return = port.getVehiclePositions(_getVehiclePositions_apiTrackingGetVehiclePositionTO1);
            System.out.println("getVehiclePositions.result=" + _getVehiclePositions__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNewTrackingDataWithETAInfo...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getNewTrackingDataWithETAInfo_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getNewTrackingDataWithETAInfo_apiSessionId1.setId("Id250962905");
        try {
            com.wirelesscar.dynafleet.api.types.ApiTrackingDataWithETAInfoArrayTO _getNewTrackingDataWithETAInfo__return = port.getNewTrackingDataWithETAInfo(_getNewTrackingDataWithETAInfo_apiSessionId1);
            System.out.println("getNewTrackingDataWithETAInfo.result=" + _getNewTrackingDataWithETAInfo__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking requestVehiclePosition...");
        com.wirelesscar.dynafleet.api.types.ApiTrackingRequestVehiclePositionTO _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1 = new com.wirelesscar.dynafleet.api.types.ApiTrackingRequestVehiclePositionTO();
        com.wirelesscar.dynafleet.api.types.ApiSessionId _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1SessionId.setId("Id1648584211");
        _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1.setSessionId(_requestVehiclePosition_apiTrackingRequestVehiclePositionTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiVehicleId _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1VehicleId = new com.wirelesscar.dynafleet.api.types.ApiVehicleId();
        _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1VehicleId.setId(-7599063819902874001l);
        _requestVehiclePosition_apiTrackingRequestVehiclePositionTO1.setVehicleId(_requestVehiclePosition_apiTrackingRequestVehiclePositionTO1VehicleId);
        try {
            port.requestVehiclePosition(_requestVehiclePosition_apiTrackingRequestVehiclePositionTO1);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNewTrackingDataV2...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getNewTrackingDataV2_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getNewTrackingDataV2_apiSessionId1.setId("Id1179137663");
        try {
            com.wirelesscar.dynafleet.api.types.ApiTrackingDataV2ArrayTO _getNewTrackingDataV2__return = port.getNewTrackingDataV2(_getNewTrackingDataV2_apiSessionId1);
            System.out.println("getNewTrackingDataV2.result=" + _getNewTrackingDataV2__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}