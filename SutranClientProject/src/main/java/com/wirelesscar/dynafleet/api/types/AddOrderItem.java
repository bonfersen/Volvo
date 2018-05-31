
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderAddOrderItemTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderAddOrderItemTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOrderItem", propOrder = {
    "apiOrderAddOrderItemTO1"
})
public class AddOrderItem {

    @XmlElement(name = "Api_OrderAddOrderItemTO_1", required = true, nillable = true)
    protected ApiOrderAddOrderItemTO apiOrderAddOrderItemTO1;

    /**
     * Gets the value of the apiOrderAddOrderItemTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderAddOrderItemTO }
     *     
     */
    public ApiOrderAddOrderItemTO getApiOrderAddOrderItemTO1() {
        return apiOrderAddOrderItemTO1;
    }

    /**
     * Sets the value of the apiOrderAddOrderItemTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderAddOrderItemTO }
     *     
     */
    public void setApiOrderAddOrderItemTO1(ApiOrderAddOrderItemTO value) {
        this.apiOrderAddOrderItemTO1 = value;
    }

}
