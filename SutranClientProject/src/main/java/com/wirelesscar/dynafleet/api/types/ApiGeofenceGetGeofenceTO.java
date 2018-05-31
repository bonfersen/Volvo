
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofenceGetGeofenceTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofenceGetGeofenceTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geofenceId" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceId"/>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofenceGetGeofenceTO", propOrder = {
    "geofenceId",
    "sessionId"
})
public class ApiGeofenceGetGeofenceTO {

    @XmlElement(required = true)
    protected ApiGeofenceId geofenceId;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the geofenceId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceId }
     *     
     */
    public ApiGeofenceId getGeofenceId() {
        return geofenceId;
    }

    /**
     * Sets the value of the geofenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceId }
     *     
     */
    public void setGeofenceId(ApiGeofenceId value) {
        this.geofenceId = value;
    }

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

}
