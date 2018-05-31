
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeofencePlus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeofencePlus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_GeofenceGetGeofenceTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceGetGeofenceTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeofencePlus", propOrder = {
    "apiGeofenceGetGeofenceTO1"
})
public class GetGeofencePlus {

    @XmlElement(name = "Api_GeofenceGetGeofenceTO_1", required = true, nillable = true)
    protected ApiGeofenceGetGeofenceTO apiGeofenceGetGeofenceTO1;

    /**
     * Gets the value of the apiGeofenceGetGeofenceTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceGetGeofenceTO }
     *     
     */
    public ApiGeofenceGetGeofenceTO getApiGeofenceGetGeofenceTO1() {
        return apiGeofenceGetGeofenceTO1;
    }

    /**
     * Sets the value of the apiGeofenceGetGeofenceTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceGetGeofenceTO }
     *     
     */
    public void setApiGeofenceGetGeofenceTO1(ApiGeofenceGetGeofenceTO value) {
        this.apiGeofenceGetGeofenceTO1 = value;
    }

}
