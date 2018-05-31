
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_TransportCustomerDeleteCustomerTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_TransportCustomerDeleteCustomerTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCustomer", propOrder = {
    "apiTransportCustomerDeleteCustomerTO1"
})
public class DeleteCustomer {

    @XmlElement(name = "Api_TransportCustomerDeleteCustomerTO_1", required = true, nillable = true)
    protected ApiTransportCustomerDeleteCustomerTO apiTransportCustomerDeleteCustomerTO1;

    /**
     * Gets the value of the apiTransportCustomerDeleteCustomerTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTransportCustomerDeleteCustomerTO }
     *     
     */
    public ApiTransportCustomerDeleteCustomerTO getApiTransportCustomerDeleteCustomerTO1() {
        return apiTransportCustomerDeleteCustomerTO1;
    }

    /**
     * Sets the value of the apiTransportCustomerDeleteCustomerTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTransportCustomerDeleteCustomerTO }
     *     
     */
    public void setApiTransportCustomerDeleteCustomerTO1(ApiTransportCustomerDeleteCustomerTO value) {
        this.apiTransportCustomerDeleteCustomerTO1 = value;
    }

}
