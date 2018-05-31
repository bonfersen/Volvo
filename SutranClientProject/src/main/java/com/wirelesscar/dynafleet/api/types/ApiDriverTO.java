
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DriverTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DriverTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADRLicense" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADRLicenseExpirationDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="additionalDriverInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalLicense" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalLicenseExpirationDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="driverLicense" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverLicenseExpirationDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="drivingPattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employmentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDeleted" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medicalCheckup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passPortExpirationDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_DriverTO", propOrder = {
    "adrLicense",
    "adrLicenseExpirationDate",
    "additionalDriverInformation",
    "additionalLicense",
    "additionalLicenseExpirationDate",
    "address",
    "city",
    "country",
    "driverId",
    "driverLicense",
    "driverLicenseExpirationDate",
    "drivingPattern",
    "email",
    "employmentType",
    "firstName",
    "homePhone",
    "isDeleted",
    "lastName",
    "medicalCheckup",
    "mobile",
    "passPortExpirationDate",
    "passportNumber",
    "socialSecurityNumber",
    "zipCode"
})
public class ApiDriverTO {

    @XmlElement(name = "ADRLicense", required = true, nillable = true)
    protected String adrLicense;
    @XmlElement(name = "ADRLicenseExpirationDate", required = true, nillable = true)
    protected ApiDate adrLicenseExpirationDate;
    @XmlElement(required = true, nillable = true)
    protected String additionalDriverInformation;
    @XmlElement(required = true, nillable = true)
    protected String additionalLicense;
    @XmlElement(required = true, nillable = true)
    protected ApiDate additionalLicenseExpirationDate;
    @XmlElement(required = true, nillable = true)
    protected String address;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected String driverLicense;
    @XmlElement(required = true, nillable = true)
    protected ApiDate driverLicenseExpirationDate;
    @XmlElement(required = true, nillable = true)
    protected String drivingPattern;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String employmentType;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String homePhone;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isDeleted;
    @XmlElement(required = true, nillable = true)
    protected String lastName;
    @XmlElement(required = true, nillable = true)
    protected String medicalCheckup;
    @XmlElement(required = true, nillable = true)
    protected String mobile;
    @XmlElement(required = true, nillable = true)
    protected ApiDate passPortExpirationDate;
    @XmlElement(required = true, nillable = true)
    protected String passportNumber;
    @XmlElement(required = true, nillable = true)
    protected String socialSecurityNumber;
    @XmlElement(required = true, nillable = true)
    protected String zipCode;

    /**
     * Gets the value of the adrLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRLicense() {
        return adrLicense;
    }

    /**
     * Sets the value of the adrLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRLicense(String value) {
        this.adrLicense = value;
    }

    /**
     * Gets the value of the adrLicenseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getADRLicenseExpirationDate() {
        return adrLicenseExpirationDate;
    }

    /**
     * Sets the value of the adrLicenseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setADRLicenseExpirationDate(ApiDate value) {
        this.adrLicenseExpirationDate = value;
    }

    /**
     * Gets the value of the additionalDriverInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDriverInformation() {
        return additionalDriverInformation;
    }

    /**
     * Sets the value of the additionalDriverInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDriverInformation(String value) {
        this.additionalDriverInformation = value;
    }

    /**
     * Gets the value of the additionalLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalLicense() {
        return additionalLicense;
    }

    /**
     * Sets the value of the additionalLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalLicense(String value) {
        this.additionalLicense = value;
    }

    /**
     * Gets the value of the additionalLicenseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getAdditionalLicenseExpirationDate() {
        return additionalLicenseExpirationDate;
    }

    /**
     * Sets the value of the additionalLicenseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setAdditionalLicenseExpirationDate(ApiDate value) {
        this.additionalLicenseExpirationDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDriverId }
     *     
     */
    public ApiDriverId getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDriverId }
     *     
     */
    public void setDriverId(ApiDriverId value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the driverLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLicense() {
        return driverLicense;
    }

    /**
     * Sets the value of the driverLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLicense(String value) {
        this.driverLicense = value;
    }

    /**
     * Gets the value of the driverLicenseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getDriverLicenseExpirationDate() {
        return driverLicenseExpirationDate;
    }

    /**
     * Sets the value of the driverLicenseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setDriverLicenseExpirationDate(ApiDate value) {
        this.driverLicenseExpirationDate = value;
    }

    /**
     * Gets the value of the drivingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingPattern() {
        return drivingPattern;
    }

    /**
     * Sets the value of the drivingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingPattern(String value) {
        this.drivingPattern = value;
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
     * Gets the value of the employmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Sets the value of the employmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentType(String value) {
        this.employmentType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the medicalCheckup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCheckup() {
        return medicalCheckup;
    }

    /**
     * Sets the value of the medicalCheckup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCheckup(String value) {
        this.medicalCheckup = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the passPortExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getPassPortExpirationDate() {
        return passPortExpirationDate;
    }

    /**
     * Sets the value of the passPortExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setPassPortExpirationDate(ApiDate value) {
        this.passPortExpirationDate = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
