
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DTMAlarmSetupSendstatusTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DTMAlarmSetupSendstatusTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latestSendstatusTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="sendstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Api_DTMAlarmSetupSendstatusTO", propOrder = {
    "latestSendstatusTime",
    "sendstatus",
    "vehicleId"
})
public class ApiDTMAlarmSetupSendstatusTO {

    @XmlElement(required = true, nillable = true)
    protected ApiDate latestSendstatusTime;
    @XmlElement(required = true, nillable = true)
    protected String sendstatus;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the latestSendstatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getLatestSendstatusTime() {
        return latestSendstatusTime;
    }

    /**
     * Sets the value of the latestSendstatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setLatestSendstatusTime(ApiDate value) {
        this.latestSendstatusTime = value;
    }

    /**
     * Gets the value of the sendstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendstatus() {
        return sendstatus;
    }

    /**
     * Sets the value of the sendstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendstatus(String value) {
        this.sendstatus = value;
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
