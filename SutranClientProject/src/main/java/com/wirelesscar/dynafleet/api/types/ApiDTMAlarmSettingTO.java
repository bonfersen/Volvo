
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DTMAlarmSettingTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DTMAlarmSettingTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarmOn" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="latestSendStatusTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="sendStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Api_DTMAlarmSettingTO", propOrder = {
    "alarmOn",
    "latestSendStatusTime",
    "sendStatus",
    "vehicleId"
})
public class ApiDTMAlarmSettingTO {

    @XmlElement(required = true, nillable = true)
    protected ApiBoolean alarmOn;
    @XmlElement(required = true, nillable = true)
    protected ApiDate latestSendStatusTime;
    @XmlElement(required = true, nillable = true)
    protected String sendStatus;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the alarmOn property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getAlarmOn() {
        return alarmOn;
    }

    /**
     * Sets the value of the alarmOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setAlarmOn(ApiBoolean value) {
        this.alarmOn = value;
    }

    /**
     * Gets the value of the latestSendStatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getLatestSendStatusTime() {
        return latestSendStatusTime;
    }

    /**
     * Sets the value of the latestSendStatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setLatestSendStatusTime(ApiDate value) {
        this.latestSendStatusTime = value;
    }

    /**
     * Gets the value of the sendStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * Sets the value of the sendStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendStatus(String value) {
        this.sendStatus = value;
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
