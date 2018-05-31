
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVehiclePositions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVehiclePositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_TrackingGetVehiclePositionTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_TrackingGetVehiclePositionTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehiclePositions", propOrder = {
    "apiTrackingGetVehiclePositionTO1"
})
public class GetVehiclePositions {

    @XmlElement(name = "Api_TrackingGetVehiclePositionTO_1", required = true, nillable = true)
    protected ApiTrackingGetVehiclePositionTO apiTrackingGetVehiclePositionTO1;

    /**
     * Gets the value of the apiTrackingGetVehiclePositionTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTrackingGetVehiclePositionTO }
     *     
     */
    public ApiTrackingGetVehiclePositionTO getApiTrackingGetVehiclePositionTO1() {
        return apiTrackingGetVehiclePositionTO1;
    }

    /**
     * Sets the value of the apiTrackingGetVehiclePositionTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTrackingGetVehiclePositionTO }
     *     
     */
    public void setApiTrackingGetVehiclePositionTO1(ApiTrackingGetVehiclePositionTO value) {
        this.apiTrackingGetVehiclePositionTO1 = value;
    }

}
