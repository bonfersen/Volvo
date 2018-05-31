
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCompletedOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCompletedOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetCompletedOrdersTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetCompletedOrdersTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCompletedOrders", propOrder = {
    "apiOrderGetCompletedOrdersTO1"
})
public class GetCompletedOrders {

    @XmlElement(name = "Api_OrderGetCompletedOrdersTO_1", required = true, nillable = true)
    protected ApiOrderGetCompletedOrdersTO apiOrderGetCompletedOrdersTO1;

    /**
     * Gets the value of the apiOrderGetCompletedOrdersTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetCompletedOrdersTO }
     *     
     */
    public ApiOrderGetCompletedOrdersTO getApiOrderGetCompletedOrdersTO1() {
        return apiOrderGetCompletedOrdersTO1;
    }

    /**
     * Sets the value of the apiOrderGetCompletedOrdersTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetCompletedOrdersTO }
     *     
     */
    public void setApiOrderGetCompletedOrdersTO1(ApiOrderGetCompletedOrdersTO value) {
        this.apiOrderGetCompletedOrdersTO1 = value;
    }

}
