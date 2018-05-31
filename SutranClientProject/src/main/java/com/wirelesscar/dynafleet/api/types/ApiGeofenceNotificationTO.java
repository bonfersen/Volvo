
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofenceNotificationTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofenceNotificationTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="eventTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="geofenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geofenceId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="latitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="longitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="triggerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleInformationId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofenceNotificationTO", propOrder = {
    "driverId",
    "eventTime",
    "geofenceName",
    "geofenceId",
    "latitude",
    "longitude",
    "message",
    "triggerType",
    "vehicleInformationId"
})
public class ApiGeofenceNotificationTO {

    @XmlElement(required = true, nillable = true)
    protected ApiLong driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate eventTime;
    @XmlElement(required = true, nillable = true)
    protected String geofenceName;
    @XmlElement(required = true, nillable = true)
    protected ApiLong geofenceId;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble latitude;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble longitude;
    @XmlElement(required = true, nillable = true)
    protected String message;
    @XmlElement(required = true, nillable = true)
    protected String triggerType;
    @XmlElement(required = true, nillable = true)
    protected ApiLong vehicleInformationId;

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDriverId(ApiLong value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setEventTime(ApiDate value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the geofenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeofenceName() {
        return geofenceName;
    }

    /**
     * Sets the value of the geofenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeofenceName(String value) {
        this.geofenceName = value;
    }

    /**
     * Gets the value of the geofenceId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getGeofenceId() {
        return geofenceId;
    }

    /**
     * Sets the value of the geofenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setGeofenceId(ApiLong value) {
        this.geofenceId = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLatitude(ApiDouble value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLongitude(ApiDouble value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerType(String value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the vehicleInformationId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getVehicleInformationId() {
        return vehicleInformationId;
    }

    /**
     * Sets the value of the vehicleInformationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setVehicleInformationId(ApiLong value) {
        this.vehicleInformationId = value;
    }

}
