
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_LastKnownPositionTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_LastKnownPositionTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *         &lt;element name="positionDateTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="latitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="longitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="altitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="heading" type="{http://wirelesscar.com/dynafleet/api/types}Api_Float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_LastKnownPositionTO", propOrder = {
    "vehicleId",
    "positionDateTime",
    "latitude",
    "longitude",
    "altitude",
    "heading"
})
public class ApiLastKnownPositionTO {

    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate positionDateTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble latitude;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble longitude;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble altitude;
    @XmlElement(required = true, nillable = true)
    protected ApiFloat heading;

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

    /**
     * Gets the value of the positionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getPositionDateTime() {
        return positionDateTime;
    }

    /**
     * Sets the value of the positionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setPositionDateTime(ApiDate value) {
        this.positionDateTime = value;
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
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setAltitude(ApiDouble value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFloat }
     *     
     */
    public ApiFloat getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFloat }
     *     
     */
    public void setHeading(ApiFloat value) {
        this.heading = value;
    }

}
