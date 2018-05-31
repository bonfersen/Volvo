
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignOrderToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignOrderToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderAssignOrderToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderAssignOrderToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignOrderToVehicle", propOrder = {
    "apiOrderAssignOrderToVehicleTO1"
})
public class AssignOrderToVehicle {

    @XmlElement(name = "Api_OrderAssignOrderToVehicleTO_1", required = true, nillable = true)
    protected ApiOrderAssignOrderToVehicleTO apiOrderAssignOrderToVehicleTO1;

    /**
     * Gets the value of the apiOrderAssignOrderToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderAssignOrderToVehicleTO }
     *     
     */
    public ApiOrderAssignOrderToVehicleTO getApiOrderAssignOrderToVehicleTO1() {
        return apiOrderAssignOrderToVehicleTO1;
    }

    /**
     * Sets the value of the apiOrderAssignOrderToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderAssignOrderToVehicleTO }
     *     
     */
    public void setApiOrderAssignOrderToVehicleTO1(ApiOrderAssignOrderToVehicleTO value) {
        this.apiOrderAssignOrderToVehicleTO1 = value;
    }

}
