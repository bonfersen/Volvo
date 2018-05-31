
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DriverInfoV2TO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DriverInfoV2TO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="digitalTachoCardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardRegistredTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_DriverInfoV2TO", propOrder = {
    "displayName",
    "driverId",
    "digitalTachoCardId",
    "cardRegistredTo"
})
public class ApiDriverInfoV2TO {

    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected String digitalTachoCardId;
    @XmlElement(required = true, nillable = true)
    protected String cardRegistredTo;

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
     * Gets the value of the digitalTachoCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalTachoCardId() {
        return digitalTachoCardId;
    }

    /**
     * Sets the value of the digitalTachoCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalTachoCardId(String value) {
        this.digitalTachoCardId = value;
    }

    /**
     * Gets the value of the cardRegistredTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRegistredTo() {
        return cardRegistredTo;
    }

    /**
     * Sets the value of the cardRegistredTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRegistredTo(String value) {
        this.cardRegistredTo = value;
    }

}
