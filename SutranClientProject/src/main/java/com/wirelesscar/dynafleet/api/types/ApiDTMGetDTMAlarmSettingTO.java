
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DTMGetDTMAlarmSettingTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DTMGetDTMAlarmSettingTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
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
@XmlType(name = "Api_DTMGetDTMAlarmSettingTO", propOrder = {
    "sessionId",
    "vehicleId"
})
public class ApiDTMGetDTMAlarmSettingTO {

    @XmlElement(required = true)
    protected ApiSessionId sessionId;
    @XmlElement(required = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSessionId }
     *     
     */
    public ApiSessionId getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSessionId }
     *     
     */
    public void setSessionId(ApiSessionId value) {
        this.sessionId = value;
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
