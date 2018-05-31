
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetCustomerOrderTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetCustomerOrderTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerOrder", propOrder = {
    "apiOrderGetCustomerOrderTO1"
})
public class GetCustomerOrder {

    @XmlElement(name = "Api_OrderGetCustomerOrderTO_1", required = true, nillable = true)
    protected ApiOrderGetCustomerOrderTO apiOrderGetCustomerOrderTO1;

    /**
     * Gets the value of the apiOrderGetCustomerOrderTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetCustomerOrderTO }
     *     
     */
    public ApiOrderGetCustomerOrderTO getApiOrderGetCustomerOrderTO1() {
        return apiOrderGetCustomerOrderTO1;
    }

    /**
     * Sets the value of the apiOrderGetCustomerOrderTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetCustomerOrderTO }
     *     
     */
    public void setApiOrderGetCustomerOrderTO1(ApiOrderGetCustomerOrderTO value) {
        this.apiOrderGetCustomerOrderTO1 = value;
    }

}
