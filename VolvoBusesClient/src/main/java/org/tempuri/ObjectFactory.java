
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.contract.ArrayOfCompanyType;
import org.contract.ArrayOfDriverIntervalDataType;
import org.contract.ArrayOfDriverParameterDataType;
import org.contract.ArrayOfDriverType;
import org.contract.ArrayOfEventDataType;
import org.contract.ArrayOfEventTypeType;
import org.contract.ArrayOfParameterTypeType;
import org.contract.ArrayOfStandardFuelConsumptionDataType;
import org.contract.ArrayOfUserType;
import org.contract.ArrayOfVehicleIntervalDataType;
import org.contract.ArrayOfVehicleParameterDataType;
import org.contract.ArrayOfVehicleType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetVehicleParametersSession_QNAME = new QName("http://tempuri.org/", "session");
    private final static QName _GetVehicleParametersVehicleIds_QNAME = new QName("http://tempuri.org/", "vehicleIds");
    private final static QName _GetVehicleParametersParameters_QNAME = new QName("http://tempuri.org/", "parameters");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _GetDriverSpeedIntervalsResponseGetDriverSpeedIntervalsResult_QNAME = new QName("http://tempuri.org/", "GetDriverSpeedIntervalsResult");
    private final static QName _GetVehicleParametersResponseGetVehicleParametersResult_QNAME = new QName("http://tempuri.org/", "GetVehicleParametersResult");
    private final static QName _GetUsersResponseGetUsersResult_QNAME = new QName("http://tempuri.org/", "GetUsersResult");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _GetVehicleSpeedIntervalsResponseGetVehicleSpeedIntervalsResult_QNAME = new QName("http://tempuri.org/", "GetVehicleSpeedIntervalsResult");
    private final static QName _GetDriverParametersDriverIds_QNAME = new QName("http://tempuri.org/", "driverIds");
    private final static QName _GetVehiclePositionsResponseGetVehiclePositionsResult_QNAME = new QName("http://tempuri.org/", "GetVehiclePositionsResult");
    private final static QName _GetDriverEventsResponseGetDriverEventsResult_QNAME = new QName("http://tempuri.org/", "GetDriverEventsResult");
    private final static QName _GetCompaniesResponseGetCompaniesResult_QNAME = new QName("http://tempuri.org/", "GetCompaniesResult");
    private final static QName _GetDriverParametersResponseGetDriverParametersResult_QNAME = new QName("http://tempuri.org/", "GetDriverParametersResult");
    private final static QName _GetStandardFuelConsumptionResponseGetStandardFuelConsumptionResult_QNAME = new QName("http://tempuri.org/", "GetStandardFuelConsumptionResult");
    private final static QName _GetDriversResponseGetDriversResult_QNAME = new QName("http://tempuri.org/", "GetDriversResult");
    private final static QName _GetDriverEventsEvents_QNAME = new QName("http://tempuri.org/", "events");
    private final static QName _GetVehiclesResponseGetVehiclesResult_QNAME = new QName("http://tempuri.org/", "GetVehiclesResult");
    private final static QName _GetVehicleEventsResponseGetVehicleEventsResult_QNAME = new QName("http://tempuri.org/", "GetVehicleEventsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GetDriverEvents }
     * 
     */
    public GetDriverEvents createGetDriverEvents() {
        return new GetDriverEvents();
    }

    /**
     * Create an instance of {@link GetCompanies }
     * 
     */
    public GetCompanies createGetCompanies() {
        return new GetCompanies();
    }

    /**
     * Create an instance of {@link GetCompaniesResponse }
     * 
     */
    public GetCompaniesResponse createGetCompaniesResponse() {
        return new GetCompaniesResponse();
    }

    /**
     * Create an instance of {@link GetVehicleParameters }
     * 
     */
    public GetVehicleParameters createGetVehicleParameters() {
        return new GetVehicleParameters();
    }

    /**
     * Create an instance of {@link GetVehicles }
     * 
     */
    public GetVehicles createGetVehicles() {
        return new GetVehicles();
    }

    /**
     * Create an instance of {@link GetVehicleEvents }
     * 
     */
    public GetVehicleEvents createGetVehicleEvents() {
        return new GetVehicleEvents();
    }

    /**
     * Create an instance of {@link GetVehicleSpeedIntervalsResponse }
     * 
     */
    public GetVehicleSpeedIntervalsResponse createGetVehicleSpeedIntervalsResponse() {
        return new GetVehicleSpeedIntervalsResponse();
    }

    /**
     * Create an instance of {@link GetVehicleParametersResponse }
     * 
     */
    public GetVehicleParametersResponse createGetVehicleParametersResponse() {
        return new GetVehicleParametersResponse();
    }

    /**
     * Create an instance of {@link GetVehiclesResponse }
     * 
     */
    public GetVehiclesResponse createGetVehiclesResponse() {
        return new GetVehiclesResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetDriverSpeedIntervals }
     * 
     */
    public GetDriverSpeedIntervals createGetDriverSpeedIntervals() {
        return new GetDriverSpeedIntervals();
    }

    /**
     * Create an instance of {@link GetStandardFuelConsumptionResponse }
     * 
     */
    public GetStandardFuelConsumptionResponse createGetStandardFuelConsumptionResponse() {
        return new GetStandardFuelConsumptionResponse();
    }

    /**
     * Create an instance of {@link GetDrivers }
     * 
     */
    public GetDrivers createGetDrivers() {
        return new GetDrivers();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetVehicleSpeedIntervals }
     * 
     */
    public GetVehicleSpeedIntervals createGetVehicleSpeedIntervals() {
        return new GetVehicleSpeedIntervals();
    }

    /**
     * Create an instance of {@link GetDriverEventsResponse }
     * 
     */
    public GetDriverEventsResponse createGetDriverEventsResponse() {
        return new GetDriverEventsResponse();
    }

    /**
     * Create an instance of {@link GetDriversResponse }
     * 
     */
    public GetDriversResponse createGetDriversResponse() {
        return new GetDriversResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetDriverSpeedIntervalsResponse }
     * 
     */
    public GetDriverSpeedIntervalsResponse createGetDriverSpeedIntervalsResponse() {
        return new GetDriverSpeedIntervalsResponse();
    }

    /**
     * Create an instance of {@link GetDriverParametersResponse }
     * 
     */
    public GetDriverParametersResponse createGetDriverParametersResponse() {
        return new GetDriverParametersResponse();
    }

    /**
     * Create an instance of {@link GetStandardFuelConsumption }
     * 
     */
    public GetStandardFuelConsumption createGetStandardFuelConsumption() {
        return new GetStandardFuelConsumption();
    }

    /**
     * Create an instance of {@link GetDriverParameters }
     * 
     */
    public GetDriverParameters createGetDriverParameters() {
        return new GetDriverParameters();
    }

    /**
     * Create an instance of {@link GetVehicleEventsResponse }
     * 
     */
    public GetVehicleEventsResponse createGetVehicleEventsResponse() {
        return new GetVehicleEventsResponse();
    }

    /**
     * Create an instance of {@link GetVehiclePositionsResponse }
     * 
     */
    public GetVehiclePositionsResponse createGetVehiclePositionsResponse() {
        return new GetVehiclePositionsResponse();
    }

    /**
     * Create an instance of {@link GetVehiclePositions }
     * 
     */
    public GetVehiclePositions createGetVehiclePositions() {
        return new GetVehiclePositions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetVehicleParameters.class)
    public JAXBElement<String> createGetVehicleParametersSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetVehicleParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "vehicleIds", scope = GetVehicleParameters.class)
    public JAXBElement<ArrayOfint> createGetVehicleParametersVehicleIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetVehicleParametersVehicleIds_QNAME, ArrayOfint.class, GetVehicleParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameters", scope = GetVehicleParameters.class)
    public JAXBElement<ArrayOfParameterTypeType> createGetVehicleParametersParameters(ArrayOfParameterTypeType value) {
        return new JAXBElement<ArrayOfParameterTypeType>(_GetVehicleParametersParameters_QNAME, ArrayOfParameterTypeType.class, GetVehicleParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<String> createLoginResponseLoginResult(String value) {
        return new JAXBElement<String>(_LoginResponseLoginResult_QNAME, String.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = Logout.class)
    public JAXBElement<String> createLogoutSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, Logout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverIntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDriverSpeedIntervalsResult", scope = GetDriverSpeedIntervalsResponse.class)
    public JAXBElement<ArrayOfDriverIntervalDataType> createGetDriverSpeedIntervalsResponseGetDriverSpeedIntervalsResult(ArrayOfDriverIntervalDataType value) {
        return new JAXBElement<ArrayOfDriverIntervalDataType>(_GetDriverSpeedIntervalsResponseGetDriverSpeedIntervalsResult_QNAME, ArrayOfDriverIntervalDataType.class, GetDriverSpeedIntervalsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetStandardFuelConsumption.class)
    public JAXBElement<String> createGetStandardFuelConsumptionSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetStandardFuelConsumption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetCompanies.class)
    public JAXBElement<String> createGetCompaniesSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetVehicleParametersResult", scope = GetVehicleParametersResponse.class)
    public JAXBElement<ArrayOfVehicleParameterDataType> createGetVehicleParametersResponseGetVehicleParametersResult(ArrayOfVehicleParameterDataType value) {
        return new JAXBElement<ArrayOfVehicleParameterDataType>(_GetVehicleParametersResponseGetVehicleParametersResult_QNAME, ArrayOfVehicleParameterDataType.class, GetVehicleParametersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetDrivers.class)
    public JAXBElement<String> createGetDriversSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetDrivers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUsersResult", scope = GetUsersResponse.class)
    public JAXBElement<ArrayOfUserType> createGetUsersResponseGetUsersResult(ArrayOfUserType value) {
        return new JAXBElement<ArrayOfUserType>(_GetUsersResponseGetUsersResult_QNAME, ArrayOfUserType.class, GetUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetUsers.class)
    public JAXBElement<String> createGetUsersSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetVehicleSpeedIntervals.class)
    public JAXBElement<String> createGetVehicleSpeedIntervalsSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetVehicleSpeedIntervals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "vehicleIds", scope = GetVehicleSpeedIntervals.class)
    public JAXBElement<ArrayOfint> createGetVehicleSpeedIntervalsVehicleIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetVehicleParametersVehicleIds_QNAME, ArrayOfint.class, GetVehicleSpeedIntervals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Login.class)
    public JAXBElement<String> createLoginUsername(String value) {
        return new JAXBElement<String>(_LoginUsername_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleIntervalDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetVehicleSpeedIntervalsResult", scope = GetVehicleSpeedIntervalsResponse.class)
    public JAXBElement<ArrayOfVehicleIntervalDataType> createGetVehicleSpeedIntervalsResponseGetVehicleSpeedIntervalsResult(ArrayOfVehicleIntervalDataType value) {
        return new JAXBElement<ArrayOfVehicleIntervalDataType>(_GetVehicleSpeedIntervalsResponseGetVehicleSpeedIntervalsResult_QNAME, ArrayOfVehicleIntervalDataType.class, GetVehicleSpeedIntervalsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetDriverParameters.class)
    public JAXBElement<String> createGetDriverParametersSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetDriverParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "driverIds", scope = GetDriverParameters.class)
    public JAXBElement<ArrayOfint> createGetDriverParametersDriverIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetDriverParametersDriverIds_QNAME, ArrayOfint.class, GetDriverParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameters", scope = GetDriverParameters.class)
    public JAXBElement<ArrayOfParameterTypeType> createGetDriverParametersParameters(ArrayOfParameterTypeType value) {
        return new JAXBElement<ArrayOfParameterTypeType>(_GetVehicleParametersParameters_QNAME, ArrayOfParameterTypeType.class, GetDriverParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetVehiclePositions.class)
    public JAXBElement<String> createGetVehiclePositionsSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetVehiclePositions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "vehicleIds", scope = GetVehiclePositions.class)
    public JAXBElement<ArrayOfint> createGetVehiclePositionsVehicleIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetVehicleParametersVehicleIds_QNAME, ArrayOfint.class, GetVehiclePositions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetDriverSpeedIntervals.class)
    public JAXBElement<String> createGetDriverSpeedIntervalsSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetDriverSpeedIntervals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "driverIds", scope = GetDriverSpeedIntervals.class)
    public JAXBElement<ArrayOfint> createGetDriverSpeedIntervalsDriverIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetDriverParametersDriverIds_QNAME, ArrayOfint.class, GetDriverSpeedIntervals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetVehiclePositionsResult", scope = GetVehiclePositionsResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP> createGetVehiclePositionsResponseGetVehiclePositionsResult(ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP value) {
        return new JAXBElement<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP>(_GetVehiclePositionsResponseGetVehiclePositionsResult_QNAME, ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.class, GetVehiclePositionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEventDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDriverEventsResult", scope = GetDriverEventsResponse.class)
    public JAXBElement<ArrayOfEventDataType> createGetDriverEventsResponseGetDriverEventsResult(ArrayOfEventDataType value) {
        return new JAXBElement<ArrayOfEventDataType>(_GetDriverEventsResponseGetDriverEventsResult_QNAME, ArrayOfEventDataType.class, GetDriverEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCompaniesResult", scope = GetCompaniesResponse.class)
    public JAXBElement<ArrayOfCompanyType> createGetCompaniesResponseGetCompaniesResult(ArrayOfCompanyType value) {
        return new JAXBElement<ArrayOfCompanyType>(_GetCompaniesResponseGetCompaniesResult_QNAME, ArrayOfCompanyType.class, GetCompaniesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetVehicles.class)
    public JAXBElement<String> createGetVehiclesSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetVehicles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverParameterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDriverParametersResult", scope = GetDriverParametersResponse.class)
    public JAXBElement<ArrayOfDriverParameterDataType> createGetDriverParametersResponseGetDriverParametersResult(ArrayOfDriverParameterDataType value) {
        return new JAXBElement<ArrayOfDriverParameterDataType>(_GetDriverParametersResponseGetDriverParametersResult_QNAME, ArrayOfDriverParameterDataType.class, GetDriverParametersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStandardFuelConsumptionDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStandardFuelConsumptionResult", scope = GetStandardFuelConsumptionResponse.class)
    public JAXBElement<ArrayOfStandardFuelConsumptionDataType> createGetStandardFuelConsumptionResponseGetStandardFuelConsumptionResult(ArrayOfStandardFuelConsumptionDataType value) {
        return new JAXBElement<ArrayOfStandardFuelConsumptionDataType>(_GetStandardFuelConsumptionResponseGetStandardFuelConsumptionResult_QNAME, ArrayOfStandardFuelConsumptionDataType.class, GetStandardFuelConsumptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDriverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDriversResult", scope = GetDriversResponse.class)
    public JAXBElement<ArrayOfDriverType> createGetDriversResponseGetDriversResult(ArrayOfDriverType value) {
        return new JAXBElement<ArrayOfDriverType>(_GetDriversResponseGetDriversResult_QNAME, ArrayOfDriverType.class, GetDriversResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetDriverEvents.class)
    public JAXBElement<String> createGetDriverEventsSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetDriverEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "driverIds", scope = GetDriverEvents.class)
    public JAXBElement<ArrayOfint> createGetDriverEventsDriverIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetDriverParametersDriverIds_QNAME, ArrayOfint.class, GetDriverEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEventTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "events", scope = GetDriverEvents.class)
    public JAXBElement<ArrayOfEventTypeType> createGetDriverEventsEvents(ArrayOfEventTypeType value) {
        return new JAXBElement<ArrayOfEventTypeType>(_GetDriverEventsEvents_QNAME, ArrayOfEventTypeType.class, GetDriverEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVehicleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetVehiclesResult", scope = GetVehiclesResponse.class)
    public JAXBElement<ArrayOfVehicleType> createGetVehiclesResponseGetVehiclesResult(ArrayOfVehicleType value) {
        return new JAXBElement<ArrayOfVehicleType>(_GetVehiclesResponseGetVehiclesResult_QNAME, ArrayOfVehicleType.class, GetVehiclesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "session", scope = GetVehicleEvents.class)
    public JAXBElement<String> createGetVehicleEventsSession(String value) {
        return new JAXBElement<String>(_GetVehicleParametersSession_QNAME, String.class, GetVehicleEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "vehicleIds", scope = GetVehicleEvents.class)
    public JAXBElement<ArrayOfint> createGetVehicleEventsVehicleIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetVehicleParametersVehicleIds_QNAME, ArrayOfint.class, GetVehicleEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEventTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "events", scope = GetVehicleEvents.class)
    public JAXBElement<ArrayOfEventTypeType> createGetVehicleEventsEvents(ArrayOfEventTypeType value) {
        return new JAXBElement<ArrayOfEventTypeType>(_GetDriverEventsEvents_QNAME, ArrayOfEventTypeType.class, GetVehicleEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEventDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetVehicleEventsResult", scope = GetVehicleEventsResponse.class)
    public JAXBElement<ArrayOfEventDataType> createGetVehicleEventsResponseGetVehicleEventsResult(ArrayOfEventDataType value) {
        return new JAXBElement<ArrayOfEventDataType>(_GetVehicleEventsResponseGetVehicleEventsResult_QNAME, ArrayOfEventDataType.class, GetVehicleEventsResponse.class, value);
    }

}
