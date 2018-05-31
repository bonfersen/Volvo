
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DriverTimesTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DriverTimesTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="remainingDrivingTimeCurrentSession" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="remainingDrivingTimeToday" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="remainingDrivingTimeThisWeek" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="remainingDrivingTimeLastTwoWeeks" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="infringementTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="infringementDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextRestDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_DriverTimesTO", propOrder = {
    "driverId",
    "remainingDrivingTimeCurrentSession",
    "remainingDrivingTimeToday",
    "remainingDrivingTimeThisWeek",
    "remainingDrivingTimeLastTwoWeeks",
    "infringementTime",
    "infringementDescription",
    "nextRestDescription"
})
public class ApiDriverTimesTO {

    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiLong remainingDrivingTimeCurrentSession;
    @XmlElement(required = true, nillable = true)
    protected ApiLong remainingDrivingTimeToday;
    @XmlElement(required = true, nillable = true)
    protected ApiLong remainingDrivingTimeThisWeek;
    @XmlElement(required = true, nillable = true)
    protected ApiLong remainingDrivingTimeLastTwoWeeks;
    @XmlElement(required = true, nillable = true)
    protected String infringementTime;
    @XmlElement(required = true, nillable = true)
    protected String infringementDescription;
    @XmlElement(required = true, nillable = true)
    protected String nextRestDescription;

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
     * Gets the value of the remainingDrivingTimeCurrentSession property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRemainingDrivingTimeCurrentSession() {
        return remainingDrivingTimeCurrentSession;
    }

    /**
     * Sets the value of the remainingDrivingTimeCurrentSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRemainingDrivingTimeCurrentSession(ApiLong value) {
        this.remainingDrivingTimeCurrentSession = value;
    }

    /**
     * Gets the value of the remainingDrivingTimeToday property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRemainingDrivingTimeToday() {
        return remainingDrivingTimeToday;
    }

    /**
     * Sets the value of the remainingDrivingTimeToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRemainingDrivingTimeToday(ApiLong value) {
        this.remainingDrivingTimeToday = value;
    }

    /**
     * Gets the value of the remainingDrivingTimeThisWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRemainingDrivingTimeThisWeek() {
        return remainingDrivingTimeThisWeek;
    }

    /**
     * Sets the value of the remainingDrivingTimeThisWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRemainingDrivingTimeThisWeek(ApiLong value) {
        this.remainingDrivingTimeThisWeek = value;
    }

    /**
     * Gets the value of the remainingDrivingTimeLastTwoWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRemainingDrivingTimeLastTwoWeeks() {
        return remainingDrivingTimeLastTwoWeeks;
    }

    /**
     * Sets the value of the remainingDrivingTimeLastTwoWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRemainingDrivingTimeLastTwoWeeks(ApiLong value) {
        this.remainingDrivingTimeLastTwoWeeks = value;
    }

    /**
     * Gets the value of the infringementTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfringementTime() {
        return infringementTime;
    }

    /**
     * Sets the value of the infringementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfringementTime(String value) {
        this.infringementTime = value;
    }

    /**
     * Gets the value of the infringementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfringementDescription() {
        return infringementDescription;
    }

    /**
     * Sets the value of the infringementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfringementDescription(String value) {
        this.infringementDescription = value;
    }

    /**
     * Gets the value of the nextRestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextRestDescription() {
        return nextRestDescription;
    }

    /**
     * Sets the value of the nextRestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextRestDescription(String value) {
        this.nextRestDescription = value;
    }

}
