
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeofencesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeofencesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceArrayTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeofencesResponse", propOrder = {
    "result"
})
public class GetGeofencesResponse {

    @XmlElement(required = true, nillable = true)
    protected ApiGeofenceArrayTO result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceArrayTO }
     *     
     */
    public ApiGeofenceArrayTO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceArrayTO }
     *     
     */
    public void setResult(ApiGeofenceArrayTO value) {
        this.result = value;
    }

}
