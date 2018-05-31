
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetOrderTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetOrderTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrder", propOrder = {
    "apiOrderGetOrderTO1"
})
public class GetOrder {

    @XmlElement(name = "Api_OrderGetOrderTO_1", required = true, nillable = true)
    protected ApiOrderGetOrderTO apiOrderGetOrderTO1;

    /**
     * Gets the value of the apiOrderGetOrderTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetOrderTO }
     *     
     */
    public ApiOrderGetOrderTO getApiOrderGetOrderTO1() {
        return apiOrderGetOrderTO1;
    }

    /**
     * Sets the value of the apiOrderGetOrderTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetOrderTO }
     *     
     */
    public void setApiOrderGetOrderTO1(ApiOrderGetOrderTO value) {
        this.apiOrderGetOrderTO1 = value;
    }

}
