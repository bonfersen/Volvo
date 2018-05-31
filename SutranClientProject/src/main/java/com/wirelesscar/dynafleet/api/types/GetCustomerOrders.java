
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetCustomerOrdersTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetCustomerOrdersTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerOrders", propOrder = {
    "apiOrderGetCustomerOrdersTO1"
})
public class GetCustomerOrders {

    @XmlElement(name = "Api_OrderGetCustomerOrdersTO_1", required = true, nillable = true)
    protected ApiOrderGetCustomerOrdersTO apiOrderGetCustomerOrdersTO1;

    /**
     * Gets the value of the apiOrderGetCustomerOrdersTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetCustomerOrdersTO }
     *     
     */
    public ApiOrderGetCustomerOrdersTO getApiOrderGetCustomerOrdersTO1() {
        return apiOrderGetCustomerOrdersTO1;
    }

    /**
     * Sets the value of the apiOrderGetCustomerOrdersTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetCustomerOrdersTO }
     *     
     */
    public void setApiOrderGetCustomerOrdersTO1(ApiOrderGetCustomerOrdersTO value) {
        this.apiOrderGetCustomerOrdersTO1 = value;
    }

}
