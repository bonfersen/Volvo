
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignOrderToUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignOrderToUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderAssignOrderToUserTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderAssignOrderToUserTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignOrderToUser", propOrder = {
    "apiOrderAssignOrderToUserTO1"
})
public class AssignOrderToUser {

    @XmlElement(name = "Api_OrderAssignOrderToUserTO_1", required = true, nillable = true)
    protected ApiOrderAssignOrderToUserTO apiOrderAssignOrderToUserTO1;

    /**
     * Gets the value of the apiOrderAssignOrderToUserTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderAssignOrderToUserTO }
     *     
     */
    public ApiOrderAssignOrderToUserTO getApiOrderAssignOrderToUserTO1() {
        return apiOrderAssignOrderToUserTO1;
    }

    /**
     * Sets the value of the apiOrderAssignOrderToUserTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderAssignOrderToUserTO }
     *     
     */
    public void setApiOrderAssignOrderToUserTO1(ApiOrderAssignOrderToUserTO value) {
        this.apiOrderAssignOrderToUserTO1 = value;
    }

}
