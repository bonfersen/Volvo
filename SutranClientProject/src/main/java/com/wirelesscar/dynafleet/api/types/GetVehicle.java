
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_VADAdminGetVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_VADAdminGetVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicle", propOrder = {
    "apiVADAdminGetVehicleTO1"
})
public class GetVehicle {

    @XmlElement(name = "Api_VADAdminGetVehicleTO_1", required = true, nillable = true)
    protected ApiVADAdminGetVehicleTO apiVADAdminGetVehicleTO1;

    /**
     * Gets the value of the apiVADAdminGetVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVADAdminGetVehicleTO }
     *     
     */
    public ApiVADAdminGetVehicleTO getApiVADAdminGetVehicleTO1() {
        return apiVADAdminGetVehicleTO1;
    }

    /**
     * Sets the value of the apiVADAdminGetVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVADAdminGetVehicleTO }
     *     
     */
    public void setApiVADAdminGetVehicleTO1(ApiVADAdminGetVehicleTO value) {
        this.apiVADAdminGetVehicleTO1 = value;
    }

}
