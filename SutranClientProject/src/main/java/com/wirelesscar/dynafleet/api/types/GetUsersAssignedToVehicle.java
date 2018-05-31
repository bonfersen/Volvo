
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUsersAssignedToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUsersAssignedToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_VADAdminGetUsersAssignedToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_VADAdminGetUsersAssignedToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsersAssignedToVehicle", propOrder = {
    "apiVADAdminGetUsersAssignedToVehicleTO1"
})
public class GetUsersAssignedToVehicle {

    @XmlElement(name = "Api_VADAdminGetUsersAssignedToVehicleTO_1", required = true, nillable = true)
    protected ApiVADAdminGetUsersAssignedToVehicleTO apiVADAdminGetUsersAssignedToVehicleTO1;

    /**
     * Gets the value of the apiVADAdminGetUsersAssignedToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVADAdminGetUsersAssignedToVehicleTO }
     *     
     */
    public ApiVADAdminGetUsersAssignedToVehicleTO getApiVADAdminGetUsersAssignedToVehicleTO1() {
        return apiVADAdminGetUsersAssignedToVehicleTO1;
    }

    /**
     * Sets the value of the apiVADAdminGetUsersAssignedToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVADAdminGetUsersAssignedToVehicleTO }
     *     
     */
    public void setApiVADAdminGetUsersAssignedToVehicleTO1(ApiVADAdminGetUsersAssignedToVehicleTO value) {
        this.apiVADAdminGetUsersAssignedToVehicleTO1 = value;
    }

}
