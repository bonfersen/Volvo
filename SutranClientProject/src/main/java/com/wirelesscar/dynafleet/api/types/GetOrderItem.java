
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetOrderItemTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetOrderItemTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderItem", propOrder = {
    "apiOrderGetOrderItemTO1"
})
public class GetOrderItem {

    @XmlElement(name = "Api_OrderGetOrderItemTO_1", required = true, nillable = true)
    protected ApiOrderGetOrderItemTO apiOrderGetOrderItemTO1;

    /**
     * Gets the value of the apiOrderGetOrderItemTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetOrderItemTO }
     *     
     */
    public ApiOrderGetOrderItemTO getApiOrderGetOrderItemTO1() {
        return apiOrderGetOrderItemTO1;
    }

    /**
     * Sets the value of the apiOrderGetOrderItemTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetOrderItemTO }
     *     
     */
    public void setApiOrderGetOrderItemTO1(ApiOrderGetOrderItemTO value) {
        this.apiOrderGetOrderItemTO1 = value;
    }

}
