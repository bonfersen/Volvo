
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderDeleteOrderItemTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderDeleteOrderItemTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteOrderItem", propOrder = {
    "apiOrderDeleteOrderItemTO1"
})
public class DeleteOrderItem {

    @XmlElement(name = "Api_OrderDeleteOrderItemTO_1", required = true, nillable = true)
    protected ApiOrderDeleteOrderItemTO apiOrderDeleteOrderItemTO1;

    /**
     * Gets the value of the apiOrderDeleteOrderItemTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderDeleteOrderItemTO }
     *     
     */
    public ApiOrderDeleteOrderItemTO getApiOrderDeleteOrderItemTO1() {
        return apiOrderDeleteOrderItemTO1;
    }

    /**
     * Sets the value of the apiOrderDeleteOrderItemTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderDeleteOrderItemTO }
     *     
     */
    public void setApiOrderDeleteOrderItemTO1(ApiOrderDeleteOrderItemTO value) {
        this.apiOrderDeleteOrderItemTO1 = value;
    }

}
