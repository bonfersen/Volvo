
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMinimumOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMinimumOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetMinimumOrderTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetMinimumOrderTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMinimumOrder", propOrder = {
    "apiOrderGetMinimumOrderTO1"
})
public class GetMinimumOrder {

    @XmlElement(name = "Api_OrderGetMinimumOrderTO_1", required = true, nillable = true)
    protected ApiOrderGetMinimumOrderTO apiOrderGetMinimumOrderTO1;

    /**
     * Gets the value of the apiOrderGetMinimumOrderTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetMinimumOrderTO }
     *     
     */
    public ApiOrderGetMinimumOrderTO getApiOrderGetMinimumOrderTO1() {
        return apiOrderGetMinimumOrderTO1;
    }

    /**
     * Sets the value of the apiOrderGetMinimumOrderTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetMinimumOrderTO }
     *     
     */
    public void setApiOrderGetMinimumOrderTO1(ApiOrderGetMinimumOrderTO value) {
        this.apiOrderGetMinimumOrderTO1 = value;
    }

}
