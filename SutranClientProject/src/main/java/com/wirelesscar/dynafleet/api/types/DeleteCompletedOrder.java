
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCompletedOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCompletedOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderDeleteCompletedOrderTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderDeleteCompletedOrderTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCompletedOrder", propOrder = {
    "apiOrderDeleteCompletedOrderTO1"
})
public class DeleteCompletedOrder {

    @XmlElement(name = "Api_OrderDeleteCompletedOrderTO_1", required = true, nillable = true)
    protected ApiOrderDeleteCompletedOrderTO apiOrderDeleteCompletedOrderTO1;

    /**
     * Gets the value of the apiOrderDeleteCompletedOrderTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderDeleteCompletedOrderTO }
     *     
     */
    public ApiOrderDeleteCompletedOrderTO getApiOrderDeleteCompletedOrderTO1() {
        return apiOrderDeleteCompletedOrderTO1;
    }

    /**
     * Sets the value of the apiOrderDeleteCompletedOrderTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderDeleteCompletedOrderTO }
     *     
     */
    public void setApiOrderDeleteCompletedOrderTO1(ApiOrderDeleteCompletedOrderTO value) {
        this.apiOrderDeleteCompletedOrderTO1 = value;
    }

}
