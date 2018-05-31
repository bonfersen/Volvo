
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DTMAlarmTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DTMAlarmTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTMAlarmId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="DTMAlarmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverActivityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="estimatedTimeOfRuleBreak" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="isDeleted" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="timestamp" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
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
@XmlType(name = "Api_DTMAlarmTO", propOrder = {
    "dtmAlarmId",
    "dtmAlarmType",
    "driverActivityType",
    "driverId",
    "estimatedTimeOfRuleBreak",
    "isDeleted",
    "timestamp",
    "vehicleId"
})
public class ApiDTMAlarmTO {

    @XmlElement(name = "DTMAlarmId", required = true, nillable = true)
    protected ApiLong dtmAlarmId;
    @XmlElement(name = "DTMAlarmType", required = true, nillable = true)
    protected String dtmAlarmType;
    @XmlElement(required = true, nillable = true)
    protected String driverActivityType;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate estimatedTimeOfRuleBreak;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isDeleted;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the dtmAlarmId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDTMAlarmId() {
        return dtmAlarmId;
    }

    /**
     * Sets the value of the dtmAlarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDTMAlarmId(ApiLong value) {
        this.dtmAlarmId = value;
    }

    /**
     * Gets the value of the dtmAlarmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTMAlarmType() {
        return dtmAlarmType;
    }

    /**
     * Sets the value of the dtmAlarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTMAlarmType(String value) {
        this.dtmAlarmType = value;
    }

    /**
     * Gets the value of the driverActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverActivityType() {
        return driverActivityType;
    }

    /**
     * Sets the value of the driverActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverActivityType(String value) {
        this.driverActivityType = value;
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
     * Gets the value of the estimatedTimeOfRuleBreak property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getEstimatedTimeOfRuleBreak() {
        return estimatedTimeOfRuleBreak;
    }

    /**
     * Sets the value of the estimatedTimeOfRuleBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setEstimatedTimeOfRuleBreak(ApiDate value) {
        this.estimatedTimeOfRuleBreak = value;
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
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setTimestamp(ApiDate value) {
        this.timestamp = value;
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
