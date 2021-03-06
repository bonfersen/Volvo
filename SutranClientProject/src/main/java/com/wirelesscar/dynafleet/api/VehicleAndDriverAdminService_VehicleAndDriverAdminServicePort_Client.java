
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
 * 2017-06-30T14:30:13.434-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class VehicleAndDriverAdminService_VehicleAndDriverAdminServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://wirelesscar.com/dynafleet/api", "DynafleetAPI");

    private VehicleAndDriverAdminService_VehicleAndDriverAdminServicePort_Client() {
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
        VehicleAndDriverAdminService port = ss.getVehicleAndDriverAdminServicePort();  
        
        {
        System.out.println("Invoking getVehicle...");
        com.wirelesscar.dynafleet.api.types.ApiVADAdminGetVehicleTO _getVehicle_apiVADAdminGetVehicleTO1 = new com.wirelesscar.dynafleet.api.types.ApiVADAdminGetVehicleTO();
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getVehicle_apiVADAdminGetVehicleTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getVehicle_apiVADAdminGetVehicleTO1SessionId.setId("Id1715248810");
        _getVehicle_apiVADAdminGetVehicleTO1.setSessionId(_getVehicle_apiVADAdminGetVehicleTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiVehicleId _getVehicle_apiVADAdminGetVehicleTO1VehicleId = new com.wirelesscar.dynafleet.api.types.ApiVehicleId();
        _getVehicle_apiVADAdminGetVehicleTO1VehicleId.setId(-810970883604465861l);
        _getVehicle_apiVADAdminGetVehicleTO1.setVehicleId(_getVehicle_apiVADAdminGetVehicleTO1VehicleId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiVehicleTO _getVehicle__return = port.getVehicle(_getVehicle_apiVADAdminGetVehicleTO1);
            System.out.println("getVehicle.result=" + _getVehicle__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getVehicles...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getVehicles_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getVehicles_apiSessionId1.setId("Id-551345528");
        try {
            com.wirelesscar.dynafleet.api.types.ApiVehicleInfoArrayTO _getVehicles__return = port.getVehicles(_getVehicles_apiSessionId1);
            System.out.println("getVehicles.result=" + _getVehicles__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getFleetInfo...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getFleetInfo_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getFleetInfo_apiSessionId1.setId("Id-1912683788");
        try {
            com.wirelesscar.dynafleet.api.types.ApiFleetInfoTO _getFleetInfo__return = port.getFleetInfo(_getFleetInfo_apiSessionId1);
            System.out.println("getFleetInfo.result=" + _getFleetInfo__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeletedVehicles...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDeletedVehicles_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDeletedVehicles_apiSessionId1.setId("Id1614313228");
        try {
            com.wirelesscar.dynafleet.api.types.ApiVehicleInfoArrayTO _getDeletedVehicles__return = port.getDeletedVehicles(_getDeletedVehicles_apiSessionId1);
            System.out.println("getDeletedVehicles.result=" + _getDeletedVehicles__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDrivers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDrivers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDrivers_apiSessionId1.setId("Id1723083287");
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverInfoArrayTO _getDrivers__return = port.getDrivers(_getDrivers_apiSessionId1);
            System.out.println("getDrivers.result=" + _getDrivers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getUsersAssignedToVehicle...");
        com.wirelesscar.dynafleet.api.types.ApiVADAdminGetUsersAssignedToVehicleTO _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1 = new com.wirelesscar.dynafleet.api.types.ApiVADAdminGetUsersAssignedToVehicleTO();
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1SessionId.setId("Id-210337653");
        _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1.setSessionId(_getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiVehicleId _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1VehicleId = new com.wirelesscar.dynafleet.api.types.ApiVehicleId();
        _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1VehicleId.setId(-9203205885623908121l);
        _getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1.setVehicleId(_getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1VehicleId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiUserIdArrayTO _getUsersAssignedToVehicle__return = port.getUsersAssignedToVehicle(_getUsersAssignedToVehicle_apiVADAdminGetUsersAssignedToVehicleTO1);
            System.out.println("getUsersAssignedToVehicle.result=" + _getUsersAssignedToVehicle__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getUsers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getUsers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getUsers_apiSessionId1.setId("Id-1329007143");
        try {
            com.wirelesscar.dynafleet.api.types.ApiUserArrayTO _getUsers__return = port.getUsers(_getUsers_apiSessionId1);
            System.out.println("getUsers.result=" + _getUsers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeletedUsers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDeletedUsers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDeletedUsers_apiSessionId1.setId("Id-172950809");
        try {
            com.wirelesscar.dynafleet.api.types.ApiUserInfoArrayTO _getDeletedUsers__return = port.getDeletedUsers(_getDeletedUsers_apiSessionId1);
            System.out.println("getDeletedUsers.result=" + _getDeletedUsers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getModifiedUsers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getModifiedUsers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getModifiedUsers_apiSessionId1.setId("Id1954910236");
        try {
            com.wirelesscar.dynafleet.api.types.ApiUserArrayTO _getModifiedUsers__return = port.getModifiedUsers(_getModifiedUsers_apiSessionId1);
            System.out.println("getModifiedUsers.result=" + _getModifiedUsers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getVehiclesV2...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getVehiclesV2_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getVehiclesV2_apiSessionId1.setId("Id977893243");
        try {
            com.wirelesscar.dynafleet.api.types.ApiVehicleInfoV2ArrayTO _getVehiclesV2__return = port.getVehiclesV2(_getVehiclesV2_apiSessionId1);
            System.out.println("getVehiclesV2.result=" + _getVehiclesV2__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getModifiedVehicles...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getModifiedVehicles_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getModifiedVehicles_apiSessionId1.setId("Id-654589417");
        try {
            com.wirelesscar.dynafleet.api.types.ApiVehicleArrayTO _getModifiedVehicles__return = port.getModifiedVehicles(_getModifiedVehicles_apiSessionId1);
            System.out.println("getModifiedVehicles.result=" + _getModifiedVehicles__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDriver...");
        com.wirelesscar.dynafleet.api.types.ApiVADAdminGetDriverTO _getDriver_apiVADAdminGetDriverTO1 = new com.wirelesscar.dynafleet.api.types.ApiVADAdminGetDriverTO();
        com.wirelesscar.dynafleet.api.types.ApiDriverId _getDriver_apiVADAdminGetDriverTO1DriverId = new com.wirelesscar.dynafleet.api.types.ApiDriverId();
        _getDriver_apiVADAdminGetDriverTO1DriverId.setId(6830740701151566423l);
        _getDriver_apiVADAdminGetDriverTO1.setDriverId(_getDriver_apiVADAdminGetDriverTO1DriverId);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDriver_apiVADAdminGetDriverTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDriver_apiVADAdminGetDriverTO1SessionId.setId("Id1386566075");
        _getDriver_apiVADAdminGetDriverTO1.setSessionId(_getDriver_apiVADAdminGetDriverTO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverTO _getDriver__return = port.getDriver(_getDriver_apiVADAdminGetDriverTO1);
            System.out.println("getDriver.result=" + _getDriver__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeletedDrivers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDeletedDrivers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDeletedDrivers_apiSessionId1.setId("Id-1196133505");
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverInfoArrayTO _getDeletedDrivers__return = port.getDeletedDrivers(_getDeletedDrivers_apiSessionId1);
            System.out.println("getDeletedDrivers.result=" + _getDeletedDrivers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getModifiedDrivers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getModifiedDrivers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getModifiedDrivers_apiSessionId1.setId("Id-480578317");
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverArrayTO _getModifiedDrivers__return = port.getModifiedDrivers(_getModifiedDrivers_apiSessionId1);
            System.out.println("getModifiedDrivers.result=" + _getModifiedDrivers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDriverTimes...");
        com.wirelesscar.dynafleet.api.types.ApiVADAdminGetDriverTimesTO _getDriverTimes_apiVADAdminGetDriverTimesTO1 = new com.wirelesscar.dynafleet.api.types.ApiVADAdminGetDriverTimesTO();
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDriverTimes_apiVADAdminGetDriverTimesTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDriverTimes_apiVADAdminGetDriverTimesTO1SessionId.setId("Id942103354");
        _getDriverTimes_apiVADAdminGetDriverTimesTO1.setSessionId(_getDriverTimes_apiVADAdminGetDriverTimesTO1SessionId);
        com.wirelesscar.dynafleet.api.types.ApiDriverIdArray _getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIds = new com.wirelesscar.dynafleet.api.types.ApiDriverIdArray();
        java.util.List<com.wirelesscar.dynafleet.api.types.ApiDriverId> _getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIdsArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiDriverId>();
        com.wirelesscar.dynafleet.api.types.ApiDriverId _getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIdsArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiDriverId();
        _getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIdsArrayVal1.setId(5402043289626639642l);
        _getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIdsArray.add(_getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIdsArrayVal1);
        _getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIds.getArray().addAll(_getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIdsArray);
        _getDriverTimes_apiVADAdminGetDriverTimesTO1.setDriverIds(_getDriverTimes_apiVADAdminGetDriverTimesTO1DriverIds);
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverTimesArrayTO _getDriverTimes__return = port.getDriverTimes(_getDriverTimes_apiVADAdminGetDriverTimesTO1);
            System.out.println("getDriverTimes.result=" + _getDriverTimes__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDriverV2...");
        com.wirelesscar.dynafleet.api.types.ApiVADAdminGetDriverV2TO _getDriverV2_apiVADAdminGetDriverV2TO1 = new com.wirelesscar.dynafleet.api.types.ApiVADAdminGetDriverV2TO();
        com.wirelesscar.dynafleet.api.types.ApiDriverId _getDriverV2_apiVADAdminGetDriverV2TO1DriverId = new com.wirelesscar.dynafleet.api.types.ApiDriverId();
        _getDriverV2_apiVADAdminGetDriverV2TO1DriverId.setId(-732751068607387485l);
        _getDriverV2_apiVADAdminGetDriverV2TO1.setDriverId(_getDriverV2_apiVADAdminGetDriverV2TO1DriverId);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDriverV2_apiVADAdminGetDriverV2TO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDriverV2_apiVADAdminGetDriverV2TO1SessionId.setId("Id-2135680548");
        _getDriverV2_apiVADAdminGetDriverV2TO1.setSessionId(_getDriverV2_apiVADAdminGetDriverV2TO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverV2TO _getDriverV2__return = port.getDriverV2(_getDriverV2_apiVADAdminGetDriverV2TO1);
            System.out.println("getDriverV2.result=" + _getDriverV2__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDriversV2...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDriversV2_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDriversV2_apiSessionId1.setId("Id6095316");
        try {
            com.wirelesscar.dynafleet.api.types.ApiDriverInfoV2ArrayTO _getDriversV2__return = port.getDriversV2(_getDriversV2_apiSessionId1);
            System.out.println("getDriversV2.result=" + _getDriversV2__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
