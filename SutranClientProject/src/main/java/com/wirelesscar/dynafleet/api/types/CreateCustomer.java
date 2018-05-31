
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_TransportCustomerCreateCustomerTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_TransportCustomerCreateCustomerTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomer", propOrder = {
    "apiTransportCustomerCreateCustomerTO1"
})
public class CreateCustomer {

    @XmlElement(name = "Api_TransportCustomerCreateCustomerTO_1", required = true, nillable = true)
    protected ApiTransportCustomerCreateCustomerTO apiTransportCustomerCreateCustomerTO1;

    /**
     * Gets the value of the apiTransportCustomerCreateCustomerTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTransportCustomerCreateCustomerTO }
     *     
     */
    public ApiTransportCustomerCreateCustomerTO getApiTransportCustomerCreateCustomerTO1() {
        return apiTransportCustomerCreateCustomerTO1;
    }

    /**
     * Sets the value of the apiTransportCustomerCreateCustomerTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTransportCustomerCreateCustomerTO }
     *     
     */
    public void setApiTransportCustomerCreateCustomerTO1(ApiTransportCustomerCreateCustomerTO value) {
        this.apiTransportCustomerCreateCustomerTO1 = value;
    }

}
