
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_TransportCustomerGetCustomerTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_TransportCustomerGetCustomerTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomer", propOrder = {
    "apiTransportCustomerGetCustomerTO1"
})
public class GetCustomer {

    @XmlElement(name = "Api_TransportCustomerGetCustomerTO_1", required = true, nillable = true)
    protected ApiTransportCustomerGetCustomerTO apiTransportCustomerGetCustomerTO1;

    /**
     * Gets the value of the apiTransportCustomerGetCustomerTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTransportCustomerGetCustomerTO }
     *     
     */
    public ApiTransportCustomerGetCustomerTO getApiTransportCustomerGetCustomerTO1() {
        return apiTransportCustomerGetCustomerTO1;
    }

    /**
     * Sets the value of the apiTransportCustomerGetCustomerTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTransportCustomerGetCustomerTO }
     *     
     */
    public void setApiTransportCustomerGetCustomerTO1(ApiTransportCustomerGetCustomerTO value) {
        this.apiTransportCustomerGetCustomerTO1 = value;
    }

}
