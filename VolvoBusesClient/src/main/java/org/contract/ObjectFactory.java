
package org.contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.contract package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Vehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Vehicle");
    private final static QName _DriverIntervalData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "DriverIntervalData");
    private final static QName _ArrayOfDriverParameterData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfDriverParameterData");
    private final static QName _IntervalData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "IntervalData");
    private final static QName _Company_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Company");
    private final static QName _EventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EventType");
    private final static QName _ArrayOfVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfVehicle");
    private final static QName _ArrayOfStandardFuelConsumptionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfStandardFuelConsumptionData");
    private final static QName _FuelType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "FuelType");
    private final static QName _EventData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EventData");
    private final static QName _ArrayOfCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfCompany");
    private final static QName _EmissionProfileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EmissionProfileType");
    private final static QName _VehicleParameterData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "VehicleParameterData");
    private final static QName _TimedPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "TimedPosition");
    private final static QName _ArrayOfParameterType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfParameterType");
    private final static QName _ArrayOfParameterIntegerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfParameterIntegerData");
    private final static QName _ArrayOfEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfEventType");
    private final static QName _Position_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Position");
    private final static QName _ArrayOfDriver_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfDriver");
    private final static QName _ParameterData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ParameterData");
    private final static QName _ArrayOfUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfUser");
    private final static QName _ArrayOfVehicleParameterData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfVehicleParameterData");
    private final static QName _ParameterIntegerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ParameterIntegerData");
    private final static QName _VehicleIntervalData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "VehicleIntervalData");
    private final static QName _ArrayOfDriverIntervalData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfDriverIntervalData");
    private final static QName _ParameterDoubleData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ParameterDoubleData");
    private final static QName _StandardFuelConsumptionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "StandardFuelConsumptionData");
    private final static QName _VehicleLimits_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "VehicleLimits");
    private final static QName _ArrayOfTimedPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfTimedPosition");
    private final static QName _User_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "User");
    private final static QName _Driver_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Driver");
    private final static QName _ArrayOfVehicleIntervalData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfVehicleIntervalData");
    private final static QName _ArrayOfParameterDoubleData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfParameterDoubleData");
    private final static QName _Location_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Location");
    private final static QName _ParameterType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ParameterType");
    private final static QName _DriverParameterData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "DriverParameterData");
    private final static QName _VehicleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "VehicleType");
    private final static QName _ArrayOfEventData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ArrayOfEventData");
    private final static QName _TimedPositionTypeTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Timestamp");
    private final static QName _StandardFuelConsumptionDataTypeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Model");
    private final static QName _StandardFuelConsumptionDataTypeEngineModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EngineModel");
    private final static QName _VehicleTypeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Type");
    private final static QName _VehicleTypeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Description");
    private final static QName _VehicleTypeLimits_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Limits");
    private final static QName _VehicleTypeVin_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Vin");
    private final static QName _VehicleTypeChassiId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ChassiId");
    private final static QName _VehicleTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Name");
    private final static QName _ParameterDataTypeIntegerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "IntegerData");
    private final static QName _ParameterDataTypeDoubleData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "DoubleData");
    private final static QName _DriverTypeEmployeeNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EmployeeNumber");
    private final static QName _DriverTypeGivenName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "GivenName");
    private final static QName _DriverTypeSurname_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Surname");
    private final static QName _VehicleLimitsTypeRpmEconomyLower_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "RpmEconomyLower");
    private final static QName _VehicleLimitsTypeRpmEconomyUpper_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "RpmEconomyUpper");
    private final static QName _VehicleLimitsTypeHarshInclination_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "HarshInclination");
    private final static QName _VehicleLimitsTypeFuelDrain_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "FuelDrain");
    private final static QName _VehicleLimitsTypeHarshAcceleration_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "HarshAcceleration");
    private final static QName _VehicleLimitsTypeExcessiveIdling_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ExcessiveIdling");
    private final static QName _VehicleLimitsTypeOverspeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Overspeed");
    private final static QName _VehicleLimitsTypeHarshBraking_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "HarshBraking");
    private final static QName _VehicleLimitsTypeHarshCurving_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "HarshCurving");
    private final static QName _VehicleLimitsTypeOverweight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Overweight");
    private final static QName _UserTypeUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "UserName");
    private final static QName _UserTypeLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Language");
    private final static QName _UserTypePhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "PhoneNumber");
    private final static QName _UserTypeEmailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EmailAddress");
    private final static QName _LocationTypeVDop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "VDop");
    private final static QName _LocationTypeLatitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Latitude");
    private final static QName _LocationTypeHDop_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "HDop");
    private final static QName _LocationTypeLongitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Longitude");
    private final static QName _LocationTypeAltitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Altitude");
    private final static QName _VehicleTypeTypeChassiMultiplex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "ChassiMultiplex");
    private final static QName _VehicleTypeTypeBody_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Body");
    private final static QName _VehicleTypeTypeEngine_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Engine");
    private final static QName _VehicleTypeTypeFuelTank_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "FuelTank");
    private final static QName _VehicleTypeTypeNeutralGear_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "NeutralGear");
    private final static QName _VehicleTypeTypeOverRev_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "OverRev");
    private final static QName _VehicleTypeTypeTopGear_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "TopGear");
    private final static QName _VehicleTypeTypeRsl_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Rsl");
    private final static QName _VehicleTypeTypeWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Weight");
    private final static QName _VehicleTypeTypeEmissionProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "EmissionProfile");
    private final static QName _EventDataTypeDriverId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "DriverId");
    private final static QName _EventDataTypeVehicleId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "VehicleId");
    private final static QName _PositionTypeSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Speed");
    private final static QName _PositionTypeHeading_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", "Heading");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.contract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfUserType }
     * 
     */
    public ArrayOfUserType createArrayOfUserType() {
        return new ArrayOfUserType();
    }

    /**
     * Create an instance of {@link ArrayOfEventTypeType }
     * 
     */
    public ArrayOfEventTypeType createArrayOfEventTypeType() {
        return new ArrayOfEventTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfCompanyType }
     * 
     */
    public ArrayOfCompanyType createArrayOfCompanyType() {
        return new ArrayOfCompanyType();
    }

    /**
     * Create an instance of {@link ArrayOfParameterTypeType }
     * 
     */
    public ArrayOfParameterTypeType createArrayOfParameterTypeType() {
        return new ArrayOfParameterTypeType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleIntervalDataType }
     * 
     */
    public ArrayOfVehicleIntervalDataType createArrayOfVehicleIntervalDataType() {
        return new ArrayOfVehicleIntervalDataType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleParameterDataType }
     * 
     */
    public ArrayOfVehicleParameterDataType createArrayOfVehicleParameterDataType() {
        return new ArrayOfVehicleParameterDataType();
    }

    /**
     * Create an instance of {@link ArrayOfVehicleType }
     * 
     */
    public ArrayOfVehicleType createArrayOfVehicleType() {
        return new ArrayOfVehicleType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardFuelConsumptionDataType }
     * 
     */
    public ArrayOfStandardFuelConsumptionDataType createArrayOfStandardFuelConsumptionDataType() {
        return new ArrayOfStandardFuelConsumptionDataType();
    }

    /**
     * Create an instance of {@link ArrayOfEventDataType }
     * 
     */
    public ArrayOfEventDataType createArrayOfEventDataType() {
        return new ArrayOfEventDataType();
    }

    /**
     * Create an instance of {@link ArrayOfDriverType }
     * 
     */
    public ArrayOfDriverType createArrayOfDriverType() {
        return new ArrayOfDriverType();
    }

    /**
     * Create an instance of {@link ArrayOfDriverIntervalDataType }
     * 
     */
    public ArrayOfDriverIntervalDataType createArrayOfDriverIntervalDataType() {
        return new ArrayOfDriverIntervalDataType();
    }

    /**
     * Create an instance of {@link ArrayOfDriverParameterDataType }
     * 
     */
    public ArrayOfDriverParameterDataType createArrayOfDriverParameterDataType() {
        return new ArrayOfDriverParameterDataType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link DriverType }
     * 
     */
    public DriverType createDriverType() {
        return new DriverType();
    }

    /**
     * Create an instance of {@link EventDataType }
     * 
     */
    public EventDataType createEventDataType() {
        return new EventDataType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link ParameterIntegerDataType }
     * 
     */
    public ParameterIntegerDataType createParameterIntegerDataType() {
        return new ParameterIntegerDataType();
    }

    /**
     * Create an instance of {@link DriverIntervalDataType }
     * 
     */
    public DriverIntervalDataType createDriverIntervalDataType() {
        return new DriverIntervalDataType();
    }

    /**
     * Create an instance of {@link VehicleIntervalDataType }
     * 
     */
    public VehicleIntervalDataType createVehicleIntervalDataType() {
        return new VehicleIntervalDataType();
    }

    /**
     * Create an instance of {@link ParameterDoubleDataType }
     * 
     */
    public ParameterDoubleDataType createParameterDoubleDataType() {
        return new ParameterDoubleDataType();
    }

    /**
     * Create an instance of {@link StandardFuelConsumptionDataType }
     * 
     */
    public StandardFuelConsumptionDataType createStandardFuelConsumptionDataType() {
        return new StandardFuelConsumptionDataType();
    }

    /**
     * Create an instance of {@link VehicleLimitsType }
     * 
     */
    public VehicleLimitsType createVehicleLimitsType() {
        return new VehicleLimitsType();
    }

    /**
     * Create an instance of {@link ArrayOfTimedPositionType }
     * 
     */
    public ArrayOfTimedPositionType createArrayOfTimedPositionType() {
        return new ArrayOfTimedPositionType();
    }

    /**
     * Create an instance of {@link IntervalDataType }
     * 
     */
    public IntervalDataType createIntervalDataType() {
        return new IntervalDataType();
    }

    /**
     * Create an instance of {@link ArrayOfParameterIntegerDataType }
     * 
     */
    public ArrayOfParameterIntegerDataType createArrayOfParameterIntegerDataType() {
        return new ArrayOfParameterIntegerDataType();
    }

    /**
     * Create an instance of {@link DriverParameterDataType }
     * 
     */
    public DriverParameterDataType createDriverParameterDataType() {
        return new DriverParameterDataType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link VehicleTypeType }
     * 
     */
    public VehicleTypeType createVehicleTypeType() {
        return new VehicleTypeType();
    }

    /**
     * Create an instance of {@link ParameterDataType }
     * 
     */
    public ParameterDataType createParameterDataType() {
        return new ParameterDataType();
    }

    /**
     * Create an instance of {@link ArrayOfParameterDoubleDataType }
     * 
     */
    public ArrayOfParameterDoubleDataType createArrayOfParameterDoubleDataType() {
        return new ArrayOfParameterDoubleDataType();
    }

    /**
     * Create an instance of {@link VehicleParameterDataType }
     * 
     */
    public VehicleParameterDataType createVehicleParameterDataType() {
        return new VehicleParameterDataType();
    }

    /**
     * Create an instance of {@link TimedPositionType }
     * 
     */
    public TimedPositionType createTimedPositionType() {
        return new TimedPositionType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Vehicle")
    public JAXBElement<VehicleType> createVehicle(VehicleType value) {
        return new JAXBElement<VehicleType>(_Vehicle_QNAME, VehicleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverIntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "DriverIntervalData")
    public JAXBElement<DriverIntervalDataType> createDriverIntervalData(DriverIntervalDataType value) {
        return new JAXBElement<DriverIntervalDataType>(_DriverIntervalData_QNAME, DriverIntervalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfDriverParameterData")
    public JAXBElement<ArrayOfDriverParameterDataType> createArrayOfDriverParameterData(ArrayOfDriverParameterDataType value) {
        return new JAXBElement<ArrayOfDriverParameterDataType>(_ArrayOfDriverParameterData_QNAME, ArrayOfDriverParameterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "IntervalData")
    public JAXBElement<IntervalDataType> createIntervalData(IntervalDataType value) {
        return new JAXBElement<IntervalDataType>(_IntervalData_QNAME, IntervalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Company")
    public JAXBElement<CompanyType> createCompany(CompanyType value) {
        return new JAXBElement<CompanyType>(_Company_QNAME, CompanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EventType")
    public JAXBElement<EventTypeType> createEventType(EventTypeType value) {
        return new JAXBElement<EventTypeType>(_EventType_QNAME, EventTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfVehicle")
    public JAXBElement<ArrayOfVehicleType> createArrayOfVehicle(ArrayOfVehicleType value) {
        return new JAXBElement<ArrayOfVehicleType>(_ArrayOfVehicle_QNAME, ArrayOfVehicleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStandardFuelConsumptionDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfStandardFuelConsumptionData")
    public JAXBElement<ArrayOfStandardFuelConsumptionDataType> createArrayOfStandardFuelConsumptionData(ArrayOfStandardFuelConsumptionDataType value) {
        return new JAXBElement<ArrayOfStandardFuelConsumptionDataType>(_ArrayOfStandardFuelConsumptionData_QNAME, ArrayOfStandardFuelConsumptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "FuelType")
    public JAXBElement<FuelTypeType> createFuelType(FuelTypeType value) {
        return new JAXBElement<FuelTypeType>(_FuelType_QNAME, FuelTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EventData")
    public JAXBElement<EventDataType> createEventData(EventDataType value) {
        return new JAXBElement<EventDataType>(_EventData_QNAME, EventDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfCompany")
    public JAXBElement<ArrayOfCompanyType> createArrayOfCompany(ArrayOfCompanyType value) {
        return new JAXBElement<ArrayOfCompanyType>(_ArrayOfCompany_QNAME, ArrayOfCompanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmissionProfileTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EmissionProfileType")
    public JAXBElement<EmissionProfileTypeType> createEmissionProfileType(EmissionProfileTypeType value) {
        return new JAXBElement<EmissionProfileTypeType>(_EmissionProfileType_QNAME, EmissionProfileTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "VehicleParameterData")
    public JAXBElement<VehicleParameterDataType> createVehicleParameterData(VehicleParameterDataType value) {
        return new JAXBElement<VehicleParameterDataType>(_VehicleParameterData_QNAME, VehicleParameterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimedPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "TimedPosition")
    public JAXBElement<TimedPositionType> createTimedPosition(TimedPositionType value) {
        return new JAXBElement<TimedPositionType>(_TimedPosition_QNAME, TimedPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfParameterType")
    public JAXBElement<ArrayOfParameterTypeType> createArrayOfParameterType(ArrayOfParameterTypeType value) {
        return new JAXBElement<ArrayOfParameterTypeType>(_ArrayOfParameterType_QNAME, ArrayOfParameterTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterIntegerDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfParameterIntegerData")
    public JAXBElement<ArrayOfParameterIntegerDataType> createArrayOfParameterIntegerData(ArrayOfParameterIntegerDataType value) {
        return new JAXBElement<ArrayOfParameterIntegerDataType>(_ArrayOfParameterIntegerData_QNAME, ArrayOfParameterIntegerDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEventTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfEventType")
    public JAXBElement<ArrayOfEventTypeType> createArrayOfEventType(ArrayOfEventTypeType value) {
        return new JAXBElement<ArrayOfEventTypeType>(_ArrayOfEventType_QNAME, ArrayOfEventTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Position")
    public JAXBElement<PositionType> createPosition(PositionType value) {
        return new JAXBElement<PositionType>(_Position_QNAME, PositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfDriver")
    public JAXBElement<ArrayOfDriverType> createArrayOfDriver(ArrayOfDriverType value) {
        return new JAXBElement<ArrayOfDriverType>(_ArrayOfDriver_QNAME, ArrayOfDriverType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ParameterData")
    public JAXBElement<ParameterDataType> createParameterData(ParameterDataType value) {
        return new JAXBElement<ParameterDataType>(_ParameterData_QNAME, ParameterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfUser")
    public JAXBElement<ArrayOfUserType> createArrayOfUser(ArrayOfUserType value) {
        return new JAXBElement<ArrayOfUserType>(_ArrayOfUser_QNAME, ArrayOfUserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfVehicleParameterData")
    public JAXBElement<ArrayOfVehicleParameterDataType> createArrayOfVehicleParameterData(ArrayOfVehicleParameterDataType value) {
        return new JAXBElement<ArrayOfVehicleParameterDataType>(_ArrayOfVehicleParameterData_QNAME, ArrayOfVehicleParameterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterIntegerDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ParameterIntegerData")
    public JAXBElement<ParameterIntegerDataType> createParameterIntegerData(ParameterIntegerDataType value) {
        return new JAXBElement<ParameterIntegerDataType>(_ParameterIntegerData_QNAME, ParameterIntegerDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleIntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "VehicleIntervalData")
    public JAXBElement<VehicleIntervalDataType> createVehicleIntervalData(VehicleIntervalDataType value) {
        return new JAXBElement<VehicleIntervalDataType>(_VehicleIntervalData_QNAME, VehicleIntervalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverIntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfDriverIntervalData")
    public JAXBElement<ArrayOfDriverIntervalDataType> createArrayOfDriverIntervalData(ArrayOfDriverIntervalDataType value) {
        return new JAXBElement<ArrayOfDriverIntervalDataType>(_ArrayOfDriverIntervalData_QNAME, ArrayOfDriverIntervalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterDoubleDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ParameterDoubleData")
    public JAXBElement<ParameterDoubleDataType> createParameterDoubleData(ParameterDoubleDataType value) {
        return new JAXBElement<ParameterDoubleDataType>(_ParameterDoubleData_QNAME, ParameterDoubleDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardFuelConsumptionDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "StandardFuelConsumptionData")
    public JAXBElement<StandardFuelConsumptionDataType> createStandardFuelConsumptionData(StandardFuelConsumptionDataType value) {
        return new JAXBElement<StandardFuelConsumptionDataType>(_StandardFuelConsumptionData_QNAME, StandardFuelConsumptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleLimitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "VehicleLimits")
    public JAXBElement<VehicleLimitsType> createVehicleLimits(VehicleLimitsType value) {
        return new JAXBElement<VehicleLimitsType>(_VehicleLimits_QNAME, VehicleLimitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimedPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfTimedPosition")
    public JAXBElement<ArrayOfTimedPositionType> createArrayOfTimedPosition(ArrayOfTimedPositionType value) {
        return new JAXBElement<ArrayOfTimedPositionType>(_ArrayOfTimedPosition_QNAME, ArrayOfTimedPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "User")
    public JAXBElement<UserType> createUser(UserType value) {
        return new JAXBElement<UserType>(_User_QNAME, UserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Driver")
    public JAXBElement<DriverType> createDriver(DriverType value) {
        return new JAXBElement<DriverType>(_Driver_QNAME, DriverType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleIntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfVehicleIntervalData")
    public JAXBElement<ArrayOfVehicleIntervalDataType> createArrayOfVehicleIntervalData(ArrayOfVehicleIntervalDataType value) {
        return new JAXBElement<ArrayOfVehicleIntervalDataType>(_ArrayOfVehicleIntervalData_QNAME, ArrayOfVehicleIntervalDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterDoubleDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfParameterDoubleData")
    public JAXBElement<ArrayOfParameterDoubleDataType> createArrayOfParameterDoubleData(ArrayOfParameterDoubleDataType value) {
        return new JAXBElement<ArrayOfParameterDoubleDataType>(_ArrayOfParameterDoubleData_QNAME, ArrayOfParameterDoubleDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ParameterType")
    public JAXBElement<ParameterTypeType> createParameterType(ParameterTypeType value) {
        return new JAXBElement<ParameterTypeType>(_ParameterType_QNAME, ParameterTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "DriverParameterData")
    public JAXBElement<DriverParameterDataType> createDriverParameterData(DriverParameterDataType value) {
        return new JAXBElement<DriverParameterDataType>(_DriverParameterData_QNAME, DriverParameterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "VehicleType")
    public JAXBElement<VehicleTypeType> createVehicleType(VehicleTypeType value) {
        return new JAXBElement<VehicleTypeType>(_VehicleType_QNAME, VehicleTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEventDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ArrayOfEventData")
    public JAXBElement<ArrayOfEventDataType> createArrayOfEventData(ArrayOfEventDataType value) {
        return new JAXBElement<ArrayOfEventDataType>(_ArrayOfEventData_QNAME, ArrayOfEventDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Timestamp", scope = TimedPositionType.class)
    public JAXBElement<XMLGregorianCalendar> createTimedPositionTypeTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimedPositionTypeTimestamp_QNAME, XMLGregorianCalendar.class, TimedPositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Model", scope = StandardFuelConsumptionDataType.class)
    public JAXBElement<String> createStandardFuelConsumptionDataTypeModel(String value) {
        return new JAXBElement<String>(_StandardFuelConsumptionDataTypeModel_QNAME, String.class, StandardFuelConsumptionDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EngineModel", scope = StandardFuelConsumptionDataType.class)
    public JAXBElement<String> createStandardFuelConsumptionDataTypeEngineModel(String value) {
        return new JAXBElement<String>(_StandardFuelConsumptionDataTypeEngineModel_QNAME, String.class, StandardFuelConsumptionDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Type", scope = VehicleType.class)
    public JAXBElement<VehicleTypeType> createVehicleTypeType(VehicleTypeType value) {
        return new JAXBElement<VehicleTypeType>(_VehicleTypeType_QNAME, VehicleTypeType.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Description", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeDescription(String value) {
        return new JAXBElement<String>(_VehicleTypeDescription_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleLimitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Limits", scope = VehicleType.class)
    public JAXBElement<VehicleLimitsType> createVehicleTypeLimits(VehicleLimitsType value) {
        return new JAXBElement<VehicleLimitsType>(_VehicleTypeLimits_QNAME, VehicleLimitsType.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Vin", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeVin(String value) {
        return new JAXBElement<String>(_VehicleTypeVin_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ChassiId", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeChassiId(String value) {
        return new JAXBElement<String>(_VehicleTypeChassiId_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Name", scope = VehicleType.class)
    public JAXBElement<String> createVehicleTypeName(String value) {
        return new JAXBElement<String>(_VehicleTypeName_QNAME, String.class, VehicleType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterIntegerDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "IntegerData", scope = ParameterDataType.class)
    public JAXBElement<ArrayOfParameterIntegerDataType> createParameterDataTypeIntegerData(ArrayOfParameterIntegerDataType value) {
        return new JAXBElement<ArrayOfParameterIntegerDataType>(_ParameterDataTypeIntegerData_QNAME, ArrayOfParameterIntegerDataType.class, ParameterDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterDoubleDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "DoubleData", scope = ParameterDataType.class)
    public JAXBElement<ArrayOfParameterDoubleDataType> createParameterDataTypeDoubleData(ArrayOfParameterDoubleDataType value) {
        return new JAXBElement<ArrayOfParameterDoubleDataType>(_ParameterDataTypeDoubleData_QNAME, ArrayOfParameterDoubleDataType.class, ParameterDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Description", scope = DriverType.class)
    public JAXBElement<String> createDriverTypeDescription(String value) {
        return new JAXBElement<String>(_VehicleTypeDescription_QNAME, String.class, DriverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EmployeeNumber", scope = DriverType.class)
    public JAXBElement<String> createDriverTypeEmployeeNumber(String value) {
        return new JAXBElement<String>(_DriverTypeEmployeeNumber_QNAME, String.class, DriverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "GivenName", scope = DriverType.class)
    public JAXBElement<String> createDriverTypeGivenName(String value) {
        return new JAXBElement<String>(_DriverTypeGivenName_QNAME, String.class, DriverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Surname", scope = DriverType.class)
    public JAXBElement<String> createDriverTypeSurname(String value) {
        return new JAXBElement<String>(_DriverTypeSurname_QNAME, String.class, DriverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "RpmEconomyLower", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeRpmEconomyLower(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeRpmEconomyLower_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "RpmEconomyUpper", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeRpmEconomyUpper(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeRpmEconomyUpper_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "HarshInclination", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeHarshInclination(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeHarshInclination_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "FuelDrain", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeFuelDrain(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeFuelDrain_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "HarshAcceleration", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeHarshAcceleration(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeHarshAcceleration_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ExcessiveIdling", scope = VehicleLimitsType.class)
    public JAXBElement<Integer> createVehicleLimitsTypeExcessiveIdling(Integer value) {
        return new JAXBElement<Integer>(_VehicleLimitsTypeExcessiveIdling_QNAME, Integer.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Overspeed", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeOverspeed(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeOverspeed_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "HarshBraking", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeHarshBraking(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeHarshBraking_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "HarshCurving", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeHarshCurving(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeHarshCurving_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Overweight", scope = VehicleLimitsType.class)
    public JAXBElement<Double> createVehicleLimitsTypeOverweight(Double value) {
        return new JAXBElement<Double>(_VehicleLimitsTypeOverweight_QNAME, Double.class, VehicleLimitsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Description", scope = CompanyType.class)
    public JAXBElement<String> createCompanyTypeDescription(String value) {
        return new JAXBElement<String>(_VehicleTypeDescription_QNAME, String.class, CompanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Name", scope = CompanyType.class)
    public JAXBElement<String> createCompanyTypeName(String value) {
        return new JAXBElement<String>(_VehicleTypeName_QNAME, String.class, CompanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Description", scope = UserType.class)
    public JAXBElement<String> createUserTypeDescription(String value) {
        return new JAXBElement<String>(_VehicleTypeDescription_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "UserName", scope = UserType.class)
    public JAXBElement<String> createUserTypeUserName(String value) {
        return new JAXBElement<String>(_UserTypeUserName_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Language", scope = UserType.class)
    public JAXBElement<String> createUserTypeLanguage(String value) {
        return new JAXBElement<String>(_UserTypeLanguage_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "GivenName", scope = UserType.class)
    public JAXBElement<String> createUserTypeGivenName(String value) {
        return new JAXBElement<String>(_DriverTypeGivenName_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "PhoneNumber", scope = UserType.class)
    public JAXBElement<String> createUserTypePhoneNumber(String value) {
        return new JAXBElement<String>(_UserTypePhoneNumber_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Surname", scope = UserType.class)
    public JAXBElement<String> createUserTypeSurname(String value) {
        return new JAXBElement<String>(_DriverTypeSurname_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EmailAddress", scope = UserType.class)
    public JAXBElement<String> createUserTypeEmailAddress(String value) {
        return new JAXBElement<String>(_UserTypeEmailAddress_QNAME, String.class, UserType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "VDop", scope = LocationType.class)
    public JAXBElement<Double> createLocationTypeVDop(Double value) {
        return new JAXBElement<Double>(_LocationTypeVDop_QNAME, Double.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Latitude", scope = LocationType.class)
    public JAXBElement<Double> createLocationTypeLatitude(Double value) {
        return new JAXBElement<Double>(_LocationTypeLatitude_QNAME, Double.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "HDop", scope = LocationType.class)
    public JAXBElement<Double> createLocationTypeHDop(Double value) {
        return new JAXBElement<Double>(_LocationTypeHDop_QNAME, Double.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Longitude", scope = LocationType.class)
    public JAXBElement<Double> createLocationTypeLongitude(Double value) {
        return new JAXBElement<Double>(_LocationTypeLongitude_QNAME, Double.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Altitude", scope = LocationType.class)
    public JAXBElement<Double> createLocationTypeAltitude(Double value) {
        return new JAXBElement<Double>(_LocationTypeAltitude_QNAME, Double.class, LocationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "ChassiMultiplex", scope = VehicleTypeType.class)
    public JAXBElement<String> createVehicleTypeTypeChassiMultiplex(String value) {
        return new JAXBElement<String>(_VehicleTypeTypeChassiMultiplex_QNAME, String.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Model", scope = VehicleTypeType.class)
    public JAXBElement<String> createVehicleTypeTypeModel(String value) {
        return new JAXBElement<String>(_StandardFuelConsumptionDataTypeModel_QNAME, String.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Body", scope = VehicleTypeType.class)
    public JAXBElement<String> createVehicleTypeTypeBody(String value) {
        return new JAXBElement<String>(_VehicleTypeTypeBody_QNAME, String.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Engine", scope = VehicleTypeType.class)
    public JAXBElement<String> createVehicleTypeTypeEngine(String value) {
        return new JAXBElement<String>(_VehicleTypeTypeEngine_QNAME, String.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "FuelTank", scope = VehicleTypeType.class)
    public JAXBElement<Double> createVehicleTypeTypeFuelTank(Double value) {
        return new JAXBElement<Double>(_VehicleTypeTypeFuelTank_QNAME, Double.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "NeutralGear", scope = VehicleTypeType.class)
    public JAXBElement<Integer> createVehicleTypeTypeNeutralGear(Integer value) {
        return new JAXBElement<Integer>(_VehicleTypeTypeNeutralGear_QNAME, Integer.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "OverRev", scope = VehicleTypeType.class)
    public JAXBElement<Double> createVehicleTypeTypeOverRev(Double value) {
        return new JAXBElement<Double>(_VehicleTypeTypeOverRev_QNAME, Double.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "TopGear", scope = VehicleTypeType.class)
    public JAXBElement<Integer> createVehicleTypeTypeTopGear(Integer value) {
        return new JAXBElement<Integer>(_VehicleTypeTypeTopGear_QNAME, Integer.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Rsl", scope = VehicleTypeType.class)
    public JAXBElement<Double> createVehicleTypeTypeRsl(Double value) {
        return new JAXBElement<Double>(_VehicleTypeTypeRsl_QNAME, Double.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuelTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "FuelType", scope = VehicleTypeType.class)
    public JAXBElement<FuelTypeType> createVehicleTypeTypeFuelType(FuelTypeType value) {
        return new JAXBElement<FuelTypeType>(_FuelType_QNAME, FuelTypeType.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Weight", scope = VehicleTypeType.class)
    public JAXBElement<Double> createVehicleTypeTypeWeight(Double value) {
        return new JAXBElement<Double>(_VehicleTypeTypeWeight_QNAME, Double.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmissionProfileTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "EmissionProfile", scope = VehicleTypeType.class)
    public JAXBElement<EmissionProfileTypeType> createVehicleTypeTypeEmissionProfile(EmissionProfileTypeType value) {
        return new JAXBElement<EmissionProfileTypeType>(_VehicleTypeTypeEmissionProfile_QNAME, EmissionProfileTypeType.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Name", scope = VehicleTypeType.class)
    public JAXBElement<String> createVehicleTypeTypeName(String value) {
        return new JAXBElement<String>(_VehicleTypeName_QNAME, String.class, VehicleTypeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "DriverId", scope = EventDataType.class)
    public JAXBElement<Integer> createEventDataTypeDriverId(Integer value) {
        return new JAXBElement<Integer>(_EventDataTypeDriverId_QNAME, Integer.class, EventDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Position", scope = EventDataType.class)
    public JAXBElement<PositionType> createEventDataTypePosition(PositionType value) {
        return new JAXBElement<PositionType>(_Position_QNAME, PositionType.class, EventDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "VehicleId", scope = EventDataType.class)
    public JAXBElement<Integer> createEventDataTypeVehicleId(Integer value) {
        return new JAXBElement<Integer>(_EventDataTypeVehicleId_QNAME, Integer.class, EventDataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Speed", scope = PositionType.class)
    public JAXBElement<Double> createPositionTypeSpeed(Double value) {
        return new JAXBElement<Double>(_PositionTypeSpeed_QNAME, Double.class, PositionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", name = "Heading", scope = PositionType.class)
    public JAXBElement<Double> createPositionTypeHeading(Double value) {
        return new JAXBElement<Double>(_PositionTypeHeading_QNAME, Double.class, PositionType.class, value);
    }

}
