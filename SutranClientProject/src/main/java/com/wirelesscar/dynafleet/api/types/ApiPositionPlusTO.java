
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_PositionPlusTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_PositionPlusTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="longitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="positionTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
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
@XmlType(name = "Api_PositionPlusTO", propOrder = {
    "latitude",
    "longitude",
    "positionTime",
    "vehicleInformationId"
})
public class ApiPositionPlusTO {

    @XmlElement(required = true, nillable = true)
    protected ApiDouble latitude;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble longitude;
    @XmlElement(required = true, nillable = true)
    protected ApiDate positionTime;
    @XmlElement(required = true, nillable = true)
    protected ApiLong vehicleInformationId;

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
     * Gets the value of the positionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getPositionTime() {
        return positionTime;
    }

    /**
     * Sets the value of the positionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setPositionTime(ApiDate value) {
        this.positionTime = value;
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
