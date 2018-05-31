
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createGeofencePlus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createGeofencePlus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_GeofencePlusCreateModifyTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofencePlusCreateModifyTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createGeofencePlus", propOrder = {
    "apiGeofencePlusCreateModifyTO1"
})
public class CreateGeofencePlus {

    @XmlElement(name = "Api_GeofencePlusCreateModifyTO_1", required = true, nillable = true)
    protected ApiGeofencePlusCreateModifyTO apiGeofencePlusCreateModifyTO1;

    /**
     * Gets the value of the apiGeofencePlusCreateModifyTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofencePlusCreateModifyTO }
     *     
     */
    public ApiGeofencePlusCreateModifyTO getApiGeofencePlusCreateModifyTO1() {
        return apiGeofencePlusCreateModifyTO1;
    }

    /**
     * Sets the value of the apiGeofencePlusCreateModifyTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofencePlusCreateModifyTO }
     *     
     */
    public void setApiGeofencePlusCreateModifyTO1(ApiGeofencePlusCreateModifyTO value) {
        this.apiGeofencePlusCreateModifyTO1 = value;
    }

}
