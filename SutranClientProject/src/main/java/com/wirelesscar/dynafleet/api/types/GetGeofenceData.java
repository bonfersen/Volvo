
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeofenceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeofenceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_GeofenceGetGeofenceData" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceGetGeofenceDataTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeofenceData", propOrder = {
    "apiGeofenceGetGeofenceData"
})
public class GetGeofenceData {

    @XmlElement(name = "Api_GeofenceGetGeofenceData", required = true, nillable = true)
    protected ApiGeofenceGetGeofenceDataTO apiGeofenceGetGeofenceData;

    /**
     * Gets the value of the apiGeofenceGetGeofenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceGetGeofenceDataTO }
     *     
     */
    public ApiGeofenceGetGeofenceDataTO getApiGeofenceGetGeofenceData() {
        return apiGeofenceGetGeofenceData;
    }

    /**
     * Sets the value of the apiGeofenceGetGeofenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceGetGeofenceDataTO }
     *     
     */
    public void setApiGeofenceGetGeofenceData(ApiGeofenceGetGeofenceDataTO value) {
        this.apiGeofenceGetGeofenceData = value;
    }

}
