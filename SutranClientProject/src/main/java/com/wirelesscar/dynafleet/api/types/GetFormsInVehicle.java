
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormsInVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFormsInVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormGetFormsInVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormGetFormsInVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormsInVehicle", propOrder = {
    "apiFormGetFormsInVehicleTO1"
})
public class GetFormsInVehicle {

    @XmlElement(name = "Api_FormGetFormsInVehicleTO_1", required = true, nillable = true)
    protected ApiFormGetFormsInVehicleTO apiFormGetFormsInVehicleTO1;

    /**
     * Gets the value of the apiFormGetFormsInVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormGetFormsInVehicleTO }
     *     
     */
    public ApiFormGetFormsInVehicleTO getApiFormGetFormsInVehicleTO1() {
        return apiFormGetFormsInVehicleTO1;
    }

    /**
     * Sets the value of the apiFormGetFormsInVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormGetFormsInVehicleTO }
     *     
     */
    public void setApiFormGetFormsInVehicleTO1(ApiFormGetFormsInVehicleTO value) {
        this.apiFormGetFormsInVehicleTO1 = value;
    }

}
