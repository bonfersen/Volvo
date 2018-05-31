
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FleetInfoTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FleetInfoTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerDisplayname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fleetId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="isDeleted" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_FleetInfoTO", propOrder = {
    "customerDisplayname",
    "displayName",
    "emailAlias",
    "fleetId",
    "isDeleted",
    "measureType"
})
public class ApiFleetInfoTO {

    @XmlElement(required = true, nillable = true)
    protected String customerDisplayname;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected String emailAlias;
    @XmlElement(required = true, nillable = true)
    protected ApiLong fleetId;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isDeleted;
    @XmlElement(required = true, nillable = true)
    protected String measureType;

    /**
     * Gets the value of the customerDisplayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDisplayname() {
        return customerDisplayname;
    }

    /**
     * Sets the value of the customerDisplayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDisplayname(String value) {
        this.customerDisplayname = value;
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
     * Gets the value of the fleetId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getFleetId() {
        return fleetId;
    }

    /**
     * Sets the value of the fleetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setFleetId(ApiLong value) {
        this.fleetId = value;
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
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

}
