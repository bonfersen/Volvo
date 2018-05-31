
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_VehicleTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_VehicleTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentOdometerValue" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="currentOdometerValueDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dynafleetUnitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emissionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipmentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="euroClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedYearlyMileage" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="forwardAssistanceRequestToVAS" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="fuelQuality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gprsSettings" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossCombinationWeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gsmDataNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gsmPhoneNr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installationTestDone" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="installationTestResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDeleted" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="make" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketSegment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="particleFilterInstalled" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="registrationCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registrationDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="registrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roadSurface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servicePack" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_VehicleTO", propOrder = {
    "vin",
    "currentOdometerValue",
    "currentOdometerValueDate",
    "description",
    "displayName",
    "district",
    "dynafleetUnitNumber",
    "email",
    "emailAlias",
    "emissionType",
    "equipmentType",
    "euroClass",
    "expectedYearlyMileage",
    "forwardAssistanceRequestToVAS",
    "fuelQuality",
    "gprsSettings",
    "grossCombinationWeight",
    "gsmDataNr",
    "gsmPhoneNr",
    "installationTestDone",
    "installationTestResult",
    "isDeleted",
    "make",
    "marketSegment",
    "operator",
    "particleFilterInstalled",
    "registrationCountry",
    "registrationDate",
    "registrationNumber",
    "roadSurface",
    "servicePack",
    "vehicleId"
})
public class ApiVehicleTO {

    @XmlElement(name = "VIN", required = true, nillable = true)
    protected String vin;
    @XmlElement(required = true, nillable = true)
    protected ApiLong currentOdometerValue;
    @XmlElement(required = true, nillable = true)
    protected ApiDate currentOdometerValueDate;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected String district;
    @XmlElement(required = true, nillable = true)
    protected String dynafleetUnitNumber;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String emailAlias;
    @XmlElement(required = true, nillable = true)
    protected String emissionType;
    @XmlElement(required = true, nillable = true)
    protected String equipmentType;
    @XmlElement(required = true, nillable = true)
    protected String euroClass;
    @XmlElement(required = true, nillable = true)
    protected ApiLong expectedYearlyMileage;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean forwardAssistanceRequestToVAS;
    @XmlElement(required = true, nillable = true)
    protected String fuelQuality;
    @XmlElement(required = true, nillable = true)
    protected String gprsSettings;
    @XmlElement(required = true, nillable = true)
    protected String grossCombinationWeight;
    @XmlElement(required = true, nillable = true)
    protected String gsmDataNr;
    @XmlElement(required = true, nillable = true)
    protected String gsmPhoneNr;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean installationTestDone;
    @XmlElement(required = true, nillable = true)
    protected String installationTestResult;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isDeleted;
    @XmlElement(required = true, nillable = true)
    protected String make;
    @XmlElement(required = true, nillable = true)
    protected String marketSegment;
    @XmlElement(required = true, nillable = true)
    protected String operator;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean particleFilterInstalled;
    @XmlElement(required = true, nillable = true)
    protected String registrationCountry;
    @XmlElement(required = true, nillable = true)
    protected ApiDate registrationDate;
    @XmlElement(required = true, nillable = true)
    protected String registrationNumber;
    @XmlElement(required = true, nillable = true)
    protected String roadSurface;
    @XmlElement(required = true, nillable = true)
    protected String servicePack;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the currentOdometerValue property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCurrentOdometerValue() {
        return currentOdometerValue;
    }

    /**
     * Sets the value of the currentOdometerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCurrentOdometerValue(ApiLong value) {
        this.currentOdometerValue = value;
    }

    /**
     * Gets the value of the currentOdometerValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getCurrentOdometerValueDate() {
        return currentOdometerValueDate;
    }

    /**
     * Sets the value of the currentOdometerValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setCurrentOdometerValueDate(ApiDate value) {
        this.currentOdometerValueDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the dynafleetUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynafleetUnitNumber() {
        return dynafleetUnitNumber;
    }

    /**
     * Sets the value of the dynafleetUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynafleetUnitNumber(String value) {
        this.dynafleetUnitNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAlias() {
        return emailAlias;
    }

    /**
     * Sets the value of the emailAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAlias(String value) {
        this.emailAlias = value;
    }

    /**
     * Gets the value of the emissionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissionType() {
        return emissionType;
    }

    /**
     * Sets the value of the emissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissionType(String value) {
        this.emissionType = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the euroClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuroClass() {
        return euroClass;
    }

    /**
     * Sets the value of the euroClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuroClass(String value) {
        this.euroClass = value;
    }

    /**
     * Gets the value of the expectedYearlyMileage property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getExpectedYearlyMileage() {
        return expectedYearlyMileage;
    }

    /**
     * Sets the value of the expectedYearlyMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setExpectedYearlyMileage(ApiLong value) {
        this.expectedYearlyMileage = value;
    }

    /**
     * Gets the value of the forwardAssistanceRequestToVAS property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getForwardAssistanceRequestToVAS() {
        return forwardAssistanceRequestToVAS;
    }

    /**
     * Sets the value of the forwardAssistanceRequestToVAS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setForwardAssistanceRequestToVAS(ApiBoolean value) {
        this.forwardAssistanceRequestToVAS = value;
    }

    /**
     * Gets the value of the fuelQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelQuality() {
        return fuelQuality;
    }

    /**
     * Sets the value of the fuelQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelQuality(String value) {
        this.fuelQuality = value;
    }

    /**
     * Gets the value of the gprsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsSettings() {
        return gprsSettings;
    }

    /**
     * Sets the value of the gprsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsSettings(String value) {
        this.gprsSettings = value;
    }

    /**
     * Gets the value of the grossCombinationWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossCombinationWeight() {
        return grossCombinationWeight;
    }

    /**
     * Sets the value of the grossCombinationWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossCombinationWeight(String value) {
        this.grossCombinationWeight = value;
    }

    /**
     * Gets the value of the gsmDataNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmDataNr() {
        return gsmDataNr;
    }

    /**
     * Sets the value of the gsmDataNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmDataNr(String value) {
        this.gsmDataNr = value;
    }

    /**
     * Gets the value of the gsmPhoneNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmPhoneNr() {
        return gsmPhoneNr;
    }

    /**
     * Sets the value of the gsmPhoneNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmPhoneNr(String value) {
        this.gsmPhoneNr = value;
    }

    /**
     * Gets the value of the installationTestDone property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getInstallationTestDone() {
        return installationTestDone;
    }

    /**
     * Sets the value of the installationTestDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setInstallationTestDone(ApiBoolean value) {
        this.installationTestDone = value;
    }

    /**
     * Gets the value of the installationTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationTestResult() {
        return installationTestResult;
    }

    /**
     * Sets the value of the installationTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationTestResult(String value) {
        this.installationTestResult = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setIsDeleted(ApiBoolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the marketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSegment() {
        return marketSegment;
    }

    /**
     * Sets the value of the marketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSegment(String value) {
        this.marketSegment = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the particleFilterInstalled property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getParticleFilterInstalled() {
        return particleFilterInstalled;
    }

    /**
     * Sets the value of the particleFilterInstalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setParticleFilterInstalled(ApiBoolean value) {
        this.particleFilterInstalled = value;
    }

    /**
     * Gets the value of the registrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationCountry() {
        return registrationCountry;
    }

    /**
     * Sets the value of the registrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationCountry(String value) {
        this.registrationCountry = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setRegistrationDate(ApiDate value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the roadSurface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadSurface() {
        return roadSurface;
    }

    /**
     * Sets the value of the roadSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadSurface(String value) {
        this.roadSurface = value;
    }

    /**
     * Gets the value of the servicePack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePack() {
        return servicePack;
    }

    /**
     * Sets the value of the servicePack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePack(String value) {
        this.servicePack = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleId }
     *     
     */
    public ApiVehicleId getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleId }
     *     
     */
    public void setVehicleId(ApiVehicleId value) {
        this.vehicleId = value;
    }

}
