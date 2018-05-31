
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeNewOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeNewOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderStoreNewOrderTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderStoreNewOrderTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeNewOrder", propOrder = {
    "apiOrderStoreNewOrderTO1"
})
public class StoreNewOrder {

    @XmlElement(name = "Api_OrderStoreNewOrderTO_1", required = true, nillable = true)
    protected ApiOrderStoreNewOrderTO apiOrderStoreNewOrderTO1;

    /**
     * Gets the value of the apiOrderStoreNewOrderTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderStoreNewOrderTO }
     *     
     */
    public ApiOrderStoreNewOrderTO getApiOrderStoreNewOrderTO1() {
        return apiOrderStoreNewOrderTO1;
    }

    /**
     * Sets the value of the apiOrderStoreNewOrderTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderStoreNewOrderTO }
     *     
     */
    public void setApiOrderStoreNewOrderTO1(ApiOrderStoreNewOrderTO value) {
        this.apiOrderStoreNewOrderTO1 = value;
    }

}
