
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.tempuri;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2018-05-30T22:48:28.232-05:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "FleetMgmtService",
                      portName = "basicHttps",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "https://fm.servicesvolvobuses.com/Tmix.Cap.FleetMgmt.Library.Wcf.External/1.4/FleetMgmtService.svc?wsdl",
                      endpointInterface = "org.tempuri.IExternalFleetMgmtService")
                      
public class IExternalFleetMgmtServiceImpl implements IExternalFleetMgmtService {

    private static final Logger LOG = Logger.getLogger(IExternalFleetMgmtServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getVehicleEvents(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  vehicleIds ,)org.contract.ArrayOfEventTypeType  events ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public org.contract.ArrayOfEventDataType getVehicleEvents(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint vehicleIds,org.contract.ArrayOfEventTypeType events,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetVehicleEventsFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getVehicleEvents");
        System.out.println(session);
        System.out.println(vehicleIds);
        System.out.println(events);
        System.out.println(from);
        System.out.println(to);
        try {
            org.contract.ArrayOfEventDataType _return = new org.contract.ArrayOfEventDataType();
            java.util.List<org.contract.EventDataType> _returnEventData = new java.util.ArrayList<org.contract.EventDataType>();
            org.contract.EventDataType _returnEventDataVal1 = new org.contract.EventDataType();
            javax.xml.bind.JAXBElement<java.lang.Integer> _returnEventDataVal1DriverId = null;
            _returnEventDataVal1.setDriverId(_returnEventDataVal1DriverId);
            org.contract.EventTypeType _returnEventDataVal1EventType = org.contract.EventTypeType.PANIC_ALARM_DEACTIVATE;
            _returnEventDataVal1.setEventType(_returnEventDataVal1EventType);
            javax.xml.bind.JAXBElement<org.contract.PositionType> _returnEventDataVal1Position = null;
            _returnEventDataVal1.setPosition(_returnEventDataVal1Position);
            _returnEventDataVal1.setTestMode(Boolean.valueOf(false));
            _returnEventDataVal1.setTimestamp(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-30T22:48:28.241-05:00"));
            javax.xml.bind.JAXBElement<java.lang.Integer> _returnEventDataVal1VehicleId = null;
            _returnEventDataVal1.setVehicleId(_returnEventDataVal1VehicleId);
            _returnEventData.add(_returnEventDataVal1);
            _return.getEventData().addAll(_returnEventData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetVehicleEventsFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetVehicleEvents_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#logout(java.lang.String  session )*
     */
    public void logout(java.lang.String session) throws IExternalFleetMgmtServiceLogoutFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation logout");
        System.out.println(session);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceLogoutFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_Logout_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getStandardFuelConsumption(java.lang.String  session )*
     */
    public org.contract.ArrayOfStandardFuelConsumptionDataType getStandardFuelConsumption(java.lang.String session) throws IExternalFleetMgmtServiceGetStandardFuelConsumptionFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getStandardFuelConsumption");
        System.out.println(session);
        try {
            org.contract.ArrayOfStandardFuelConsumptionDataType _return = new org.contract.ArrayOfStandardFuelConsumptionDataType();
            java.util.List<org.contract.StandardFuelConsumptionDataType> _returnStandardFuelConsumptionData = new java.util.ArrayList<org.contract.StandardFuelConsumptionDataType>();
            org.contract.StandardFuelConsumptionDataType _returnStandardFuelConsumptionDataVal1 = new org.contract.StandardFuelConsumptionDataType();
            javax.xml.bind.JAXBElement<java.lang.String> _returnStandardFuelConsumptionDataVal1EngineModel = null;
            _returnStandardFuelConsumptionDataVal1.setEngineModel(_returnStandardFuelConsumptionDataVal1EngineModel);
            _returnStandardFuelConsumptionDataVal1.setFuelConsumption(Double.valueOf(0.1961199254408693));
            javax.xml.bind.JAXBElement<java.lang.String> _returnStandardFuelConsumptionDataVal1Model = null;
            _returnStandardFuelConsumptionDataVal1.setModel(_returnStandardFuelConsumptionDataVal1Model);
            _returnStandardFuelConsumptionDataVal1.setSpeed(Double.valueOf(0.6155953185353801));
            _returnStandardFuelConsumptionData.add(_returnStandardFuelConsumptionDataVal1);
            _return.getStandardFuelConsumptionData().addAll(_returnStandardFuelConsumptionData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetStandardFuelConsumptionFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetStandardFuelConsumption_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getDriverSpeedIntervals(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  driverIds ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public org.contract.ArrayOfDriverIntervalDataType getDriverSpeedIntervals(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint driverIds,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetDriverSpeedIntervalsFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getDriverSpeedIntervals");
        System.out.println(session);
        System.out.println(driverIds);
        System.out.println(from);
        System.out.println(to);
        try {
            org.contract.ArrayOfDriverIntervalDataType _return = new org.contract.ArrayOfDriverIntervalDataType();
            java.util.List<org.contract.DriverIntervalDataType> _returnDriverIntervalData = new java.util.ArrayList<org.contract.DriverIntervalDataType>();
            org.contract.DriverIntervalDataType _returnDriverIntervalDataVal1 = new org.contract.DriverIntervalDataType();
            _returnDriverIntervalDataVal1.setDistance(Double.valueOf(0.46309666052197884));
            _returnDriverIntervalDataVal1.setFuel(Double.valueOf(0.7195234294439188));
            _returnDriverIntervalDataVal1.setIntervalFrom(Double.valueOf(0.20389854072579183));
            _returnDriverIntervalDataVal1.setIntervalTo(Double.valueOf(0.5368083867228001));
            _returnDriverIntervalDataVal1.setTime(Integer.valueOf(1150743447));
            _returnDriverIntervalDataVal1.setDriverId(Integer.valueOf(-122336642));
            _returnDriverIntervalData.add(_returnDriverIntervalDataVal1);
            _return.getDriverIntervalData().addAll(_returnDriverIntervalData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetDriverSpeedIntervalsFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetDriverSpeedIntervals_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getDriverParameters(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  driverIds ,)org.contract.ArrayOfParameterTypeType  parameters ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public org.contract.ArrayOfDriverParameterDataType getDriverParameters(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint driverIds,org.contract.ArrayOfParameterTypeType parameters,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetDriverParametersFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getDriverParameters");
        System.out.println(session);
        System.out.println(driverIds);
        System.out.println(parameters);
        System.out.println(from);
        System.out.println(to);
        try {
            org.contract.ArrayOfDriverParameterDataType _return = new org.contract.ArrayOfDriverParameterDataType();
            java.util.List<org.contract.DriverParameterDataType> _returnDriverParameterData = new java.util.ArrayList<org.contract.DriverParameterDataType>();
            org.contract.DriverParameterDataType _returnDriverParameterDataVal1 = new org.contract.DriverParameterDataType();
            javax.xml.bind.JAXBElement<org.contract.ArrayOfParameterDoubleDataType> _returnDriverParameterDataVal1DoubleData = null;
            _returnDriverParameterDataVal1.setDoubleData(_returnDriverParameterDataVal1DoubleData);
            javax.xml.bind.JAXBElement<org.contract.ArrayOfParameterIntegerDataType> _returnDriverParameterDataVal1IntegerData = null;
            _returnDriverParameterDataVal1.setIntegerData(_returnDriverParameterDataVal1IntegerData);
            _returnDriverParameterDataVal1.setDriverId(Integer.valueOf(537453632));
            _returnDriverParameterData.add(_returnDriverParameterDataVal1);
            _return.getDriverParameterData().addAll(_returnDriverParameterData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetDriverParametersFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetDriverParameters_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getVehiclePositions(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  vehicleIds ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP getVehiclePositions(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint vehicleIds,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetVehiclePositionsFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getVehiclePositions");
        System.out.println(session);
        System.out.println(vehicleIds);
        System.out.println(from);
        System.out.println(to);
        try {
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP _return = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP();
            java.util.List<com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP> _returnKeyValueOfintArrayOfTimedPositionfi2YCEuP = new java.util.ArrayList<com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP>();
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP _returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1 = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP();
            _returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1.setKey(-814393451);
            org.contract.ArrayOfTimedPositionType _returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1Value = new org.contract.ArrayOfTimedPositionType();
            java.util.List<org.contract.TimedPositionType> _returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1ValueTimedPosition = new java.util.ArrayList<org.contract.TimedPositionType>();
            _returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1Value.getTimedPosition().addAll(_returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1ValueTimedPosition);
            _returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1.setValue(_returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1Value);
            _returnKeyValueOfintArrayOfTimedPositionfi2YCEuP.add(_returnKeyValueOfintArrayOfTimedPositionfi2YCEuPVal1);
            _return.getKeyValueOfintArrayOfTimedPositionfi2YCEuP().addAll(_returnKeyValueOfintArrayOfTimedPositionfi2YCEuP);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetVehiclePositionsFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetVehiclePositions_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getDriverEvents(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  driverIds ,)org.contract.ArrayOfEventTypeType  events ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public org.contract.ArrayOfEventDataType getDriverEvents(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint driverIds,org.contract.ArrayOfEventTypeType events,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetDriverEventsFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getDriverEvents");
        System.out.println(session);
        System.out.println(driverIds);
        System.out.println(events);
        System.out.println(from);
        System.out.println(to);
        try {
            org.contract.ArrayOfEventDataType _return = new org.contract.ArrayOfEventDataType();
            java.util.List<org.contract.EventDataType> _returnEventData = new java.util.ArrayList<org.contract.EventDataType>();
            org.contract.EventDataType _returnEventDataVal1 = new org.contract.EventDataType();
            javax.xml.bind.JAXBElement<java.lang.Integer> _returnEventDataVal1DriverId = null;
            _returnEventDataVal1.setDriverId(_returnEventDataVal1DriverId);
            org.contract.EventTypeType _returnEventDataVal1EventType = org.contract.EventTypeType.PANIC_ALARM_ACTIVATE;
            _returnEventDataVal1.setEventType(_returnEventDataVal1EventType);
            javax.xml.bind.JAXBElement<org.contract.PositionType> _returnEventDataVal1Position = null;
            _returnEventDataVal1.setPosition(_returnEventDataVal1Position);
            _returnEventDataVal1.setTestMode(Boolean.valueOf(true));
            _returnEventDataVal1.setTimestamp(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-05-30T22:48:28.245-05:00"));
            javax.xml.bind.JAXBElement<java.lang.Integer> _returnEventDataVal1VehicleId = null;
            _returnEventDataVal1.setVehicleId(_returnEventDataVal1VehicleId);
            _returnEventData.add(_returnEventDataVal1);
            _return.getEventData().addAll(_returnEventData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetDriverEventsFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetDriverEvents_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getDrivers(java.lang.String  session )*
     */
    public org.contract.ArrayOfDriverType getDrivers(java.lang.String session) throws IExternalFleetMgmtServiceGetDriversFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getDrivers");
        System.out.println(session);
        try {
            org.contract.ArrayOfDriverType _return = new org.contract.ArrayOfDriverType();
            java.util.List<org.contract.DriverType> _returnDriver = new java.util.ArrayList<org.contract.DriverType>();
            org.contract.DriverType _returnDriverVal1 = new org.contract.DriverType();
            _returnDriverVal1.setCompanyId(Long.valueOf(-5172684725349490951l));
            javax.xml.bind.JAXBElement<java.lang.String> _returnDriverVal1Description = null;
            _returnDriverVal1.setDescription(_returnDriverVal1Description);
            javax.xml.bind.JAXBElement<java.lang.String> _returnDriverVal1EmployeeNumber = null;
            _returnDriverVal1.setEmployeeNumber(_returnDriverVal1EmployeeNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnDriverVal1GivenName = null;
            _returnDriverVal1.setGivenName(_returnDriverVal1GivenName);
            _returnDriverVal1.setId(Integer.valueOf(79008121));
            javax.xml.bind.JAXBElement<java.lang.String> _returnDriverVal1Surname = null;
            _returnDriverVal1.setSurname(_returnDriverVal1Surname);
            _returnDriver.add(_returnDriverVal1);
            _return.getDriver().addAll(_returnDriver);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetDriversFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetDrivers_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getCompanies(java.lang.String  session )*
     */
    public org.contract.ArrayOfCompanyType getCompanies(java.lang.String session) throws IExternalFleetMgmtServiceGetCompaniesFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getCompanies");
        System.out.println(session);
        try {
            org.contract.ArrayOfCompanyType _return = new org.contract.ArrayOfCompanyType();
            java.util.List<org.contract.CompanyType> _returnCompany = new java.util.ArrayList<org.contract.CompanyType>();
            org.contract.CompanyType _returnCompanyVal1 = new org.contract.CompanyType();
            javax.xml.bind.JAXBElement<java.lang.String> _returnCompanyVal1Description = null;
            _returnCompanyVal1.setDescription(_returnCompanyVal1Description);
            _returnCompanyVal1.setId(Long.valueOf(2911759853658798363l));
            javax.xml.bind.JAXBElement<java.lang.String> _returnCompanyVal1Name = null;
            _returnCompanyVal1.setName(_returnCompanyVal1Name);
            _returnCompany.add(_returnCompanyVal1);
            _return.getCompany().addAll(_returnCompany);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetCompaniesFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetCompanies_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getVehicleSpeedIntervals(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  vehicleIds ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public org.contract.ArrayOfVehicleIntervalDataType getVehicleSpeedIntervals(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint vehicleIds,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getVehicleSpeedIntervals");
        System.out.println(session);
        System.out.println(vehicleIds);
        System.out.println(from);
        System.out.println(to);
        try {
            org.contract.ArrayOfVehicleIntervalDataType _return = new org.contract.ArrayOfVehicleIntervalDataType();
            java.util.List<org.contract.VehicleIntervalDataType> _returnVehicleIntervalData = new java.util.ArrayList<org.contract.VehicleIntervalDataType>();
            org.contract.VehicleIntervalDataType _returnVehicleIntervalDataVal1 = new org.contract.VehicleIntervalDataType();
            _returnVehicleIntervalDataVal1.setDistance(Double.valueOf(0.7542642207584014));
            _returnVehicleIntervalDataVal1.setFuel(Double.valueOf(0.707579993118503));
            _returnVehicleIntervalDataVal1.setIntervalFrom(Double.valueOf(0.3139644400341779));
            _returnVehicleIntervalDataVal1.setIntervalTo(Double.valueOf(0.5273026948680725));
            _returnVehicleIntervalDataVal1.setTime(Integer.valueOf(1933801678));
            _returnVehicleIntervalDataVal1.setVehicleId(Integer.valueOf(347560895));
            _returnVehicleIntervalData.add(_returnVehicleIntervalDataVal1);
            _return.getVehicleIntervalData().addAll(_returnVehicleIntervalData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetVehicleSpeedIntervalsFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetVehicleSpeedIntervals_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#login(java.lang.String  username ,)java.lang.String  password )*
     */
    public java.lang.String login(java.lang.String username,java.lang.String password) throws IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation login");
        System.out.println(username);
        System.out.println(password);
        try {
            java.lang.String _return = "_return970250237";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceLoginFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_Login_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getVehicles(java.lang.String  session )*
     */
    public org.contract.ArrayOfVehicleType getVehicles(java.lang.String session) throws IExternalFleetMgmtServiceGetVehiclesFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getVehicles");
        System.out.println(session);
        try {
            org.contract.ArrayOfVehicleType _return = new org.contract.ArrayOfVehicleType();
            java.util.List<org.contract.VehicleType> _returnVehicle = new java.util.ArrayList<org.contract.VehicleType>();
            org.contract.VehicleType _returnVehicleVal1 = new org.contract.VehicleType();
            javax.xml.bind.JAXBElement<java.lang.String> _returnVehicleVal1ChassiId = null;
            _returnVehicleVal1.setChassiId(_returnVehicleVal1ChassiId);
            _returnVehicleVal1.setCompanyId(Long.valueOf(-7496640040352391429l));
            javax.xml.bind.JAXBElement<java.lang.String> _returnVehicleVal1Description = null;
            _returnVehicleVal1.setDescription(_returnVehicleVal1Description);
            _returnVehicleVal1.setId(Integer.valueOf(-2001060481));
            javax.xml.bind.JAXBElement<org.contract.VehicleLimitsType> _returnVehicleVal1Limits = null;
            _returnVehicleVal1.setLimits(_returnVehicleVal1Limits);
            javax.xml.bind.JAXBElement<java.lang.String> _returnVehicleVal1Name = null;
            _returnVehicleVal1.setName(_returnVehicleVal1Name);
            javax.xml.bind.JAXBElement<org.contract.VehicleTypeType> _returnVehicleVal1Type = null;
            _returnVehicleVal1.setType(_returnVehicleVal1Type);
            javax.xml.bind.JAXBElement<java.lang.String> _returnVehicleVal1Vin = null;
            _returnVehicleVal1.setVin(_returnVehicleVal1Vin);
            _returnVehicle.add(_returnVehicleVal1);
            _return.getVehicle().addAll(_returnVehicle);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetVehiclesFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetVehicles_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getVehicleParameters(java.lang.String  session ,)com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint  vehicleIds ,)org.contract.ArrayOfParameterTypeType  parameters ,)javax.xml.datatype.XMLGregorianCalendar  from ,)javax.xml.datatype.XMLGregorianCalendar  to )*
     */
    public org.contract.ArrayOfVehicleParameterDataType getVehicleParameters(java.lang.String session,com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint vehicleIds,org.contract.ArrayOfParameterTypeType parameters,javax.xml.datatype.XMLGregorianCalendar from,javax.xml.datatype.XMLGregorianCalendar to) throws IExternalFleetMgmtServiceGetVehicleParametersFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getVehicleParameters");
        System.out.println(session);
        System.out.println(vehicleIds);
        System.out.println(parameters);
        System.out.println(from);
        System.out.println(to);
        try {
            org.contract.ArrayOfVehicleParameterDataType _return = new org.contract.ArrayOfVehicleParameterDataType();
            java.util.List<org.contract.VehicleParameterDataType> _returnVehicleParameterData = new java.util.ArrayList<org.contract.VehicleParameterDataType>();
            org.contract.VehicleParameterDataType _returnVehicleParameterDataVal1 = new org.contract.VehicleParameterDataType();
            javax.xml.bind.JAXBElement<org.contract.ArrayOfParameterDoubleDataType> _returnVehicleParameterDataVal1DoubleData = null;
            _returnVehicleParameterDataVal1.setDoubleData(_returnVehicleParameterDataVal1DoubleData);
            javax.xml.bind.JAXBElement<org.contract.ArrayOfParameterIntegerDataType> _returnVehicleParameterDataVal1IntegerData = null;
            _returnVehicleParameterDataVal1.setIntegerData(_returnVehicleParameterDataVal1IntegerData);
            _returnVehicleParameterDataVal1.setVehicleId(Integer.valueOf(-378444318));
            _returnVehicleParameterData.add(_returnVehicleParameterDataVal1);
            _return.getVehicleParameterData().addAll(_returnVehicleParameterData);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetVehicleParametersFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetVehicleParameters_FleetMgmtExceptionFault_FaultMessage...");
    }

    /* (non-Javadoc)
     * @see org.tempuri.IExternalFleetMgmtService#getUsers(java.lang.String  session )*
     */
    public org.contract.ArrayOfUserType getUsers(java.lang.String session) throws IExternalFleetMgmtServiceGetUsersFleetMgmtExceptionFaultFaultMessage    { 
        LOG.info("Executing operation getUsers");
        System.out.println(session);
        try {
            org.contract.ArrayOfUserType _return = new org.contract.ArrayOfUserType();
            java.util.List<org.contract.UserType> _returnUser = new java.util.ArrayList<org.contract.UserType>();
            org.contract.UserType _returnUserVal1 = new org.contract.UserType();
            _returnUserVal1.setCompanyId(Long.valueOf(7210647942585626461l));
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1Description = null;
            _returnUserVal1.setDescription(_returnUserVal1Description);
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1EmailAddress = null;
            _returnUserVal1.setEmailAddress(_returnUserVal1EmailAddress);
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1GivenName = null;
            _returnUserVal1.setGivenName(_returnUserVal1GivenName);
            _returnUserVal1.setId(Integer.valueOf(-1692795613));
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1Language = null;
            _returnUserVal1.setLanguage(_returnUserVal1Language);
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1PhoneNumber = null;
            _returnUserVal1.setPhoneNumber(_returnUserVal1PhoneNumber);
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1Surname = null;
            _returnUserVal1.setSurname(_returnUserVal1Surname);
            javax.xml.bind.JAXBElement<java.lang.String> _returnUserVal1UserName = null;
            _returnUserVal1.setUserName(_returnUserVal1UserName);
            _returnUser.add(_returnUserVal1);
            _return.getUser().addAll(_returnUser);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IExternalFleetMgmtServiceGetUsersFleetMgmtExceptionFaultFaultMessage("IExternalFleetMgmtService_GetUsers_FleetMgmtExceptionFault_FaultMessage...");
    }

}