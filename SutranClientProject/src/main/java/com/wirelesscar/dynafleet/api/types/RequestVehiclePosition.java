
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestVehiclePosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestVehiclePosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_TrackingRequestVehiclePositionTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_TrackingRequestVehiclePositionTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestVehiclePosition", propOrder = {
    "apiTrackingRequestVehiclePositionTO1"
})
public class RequestVehiclePosition {

    @XmlElement(name = "Api_TrackingRequestVehiclePositionTO_1", required = true, nillable = true)
    protected ApiTrackingRequestVehiclePositionTO apiTrackingRequestVehiclePositionTO1;

    /**
     * Gets the value of the apiTrackingRequestVehiclePositionTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTrackingRequestVehiclePositionTO }
     *     
     */
    public ApiTrackingRequestVehiclePositionTO getApiTrackingRequestVehiclePositionTO1() {
        return apiTrackingRequestVehiclePositionTO1;
    }

    /**
     * Sets the value of the apiTrackingRequestVehiclePositionTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTrackingRequestVehiclePositionTO }
     *     
     */
    public void setApiTrackingRequestVehiclePositionTO1(ApiTrackingRequestVehiclePositionTO value) {
        this.apiTrackingRequestVehiclePositionTO1 = value;
    }

}
