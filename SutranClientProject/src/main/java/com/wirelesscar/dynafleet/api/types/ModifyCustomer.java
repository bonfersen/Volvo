
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_TransportCustomerModifyCustomerTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_TransportCustomerModifyCustomerTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyCustomer", propOrder = {
    "apiTransportCustomerModifyCustomerTO1"
})
public class ModifyCustomer {

    @XmlElement(name = "Api_TransportCustomerModifyCustomerTO_1", required = true, nillable = true)
    protected ApiTransportCustomerModifyCustomerTO apiTransportCustomerModifyCustomerTO1;

    /**
     * Gets the value of the apiTransportCustomerModifyCustomerTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTransportCustomerModifyCustomerTO }
     *     
     */
    public ApiTransportCustomerModifyCustomerTO getApiTransportCustomerModifyCustomerTO1() {
        return apiTransportCustomerModifyCustomerTO1;
    }

    /**
     * Sets the value of the apiTransportCustomerModifyCustomerTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTransportCustomerModifyCustomerTO }
     *     
     */
    public void setApiTransportCustomerModifyCustomerTO1(ApiTransportCustomerModifyCustomerTO value) {
        this.apiTransportCustomerModifyCustomerTO1 = value;
    }

}
