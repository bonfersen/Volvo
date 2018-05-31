
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_TrackingGetVehiclePositionTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_TrackingGetVehiclePositionTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPositions" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
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
@XmlType(name = "Api_TrackingGetVehiclePositionTO", propOrder = {
    "numberOfPositions",
    "sessionId",
    "vehicleId"
})
public class ApiTrackingGetVehiclePositionTO {

    @XmlElement(required = true)
    protected ApiLong numberOfPositions;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;
    @XmlElement(required = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the numberOfPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getNumberOfPositions() {
        return numberOfPositions;
    }

    /**
     * Sets the value of the numberOfPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setNumberOfPositions(ApiLong value) {
        this.numberOfPositions = value;
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
