
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServicePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_ServicePlanGetServicePlanTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_ServicePlanGetServicePlanTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServicePlan", propOrder = {
    "apiServicePlanGetServicePlanTO1"
})
public class GetServicePlan {

    @XmlElement(name = "Api_ServicePlanGetServicePlanTO_1", required = true, nillable = true)
    protected ApiServicePlanGetServicePlanTO apiServicePlanGetServicePlanTO1;

    /**
     * Gets the value of the apiServicePlanGetServicePlanTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiServicePlanGetServicePlanTO }
     *     
     */
    public ApiServicePlanGetServicePlanTO getApiServicePlanGetServicePlanTO1() {
        return apiServicePlanGetServicePlanTO1;
    }

    /**
     * Sets the value of the apiServicePlanGetServicePlanTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiServicePlanGetServicePlanTO }
     *     
     */
    public void setApiServicePlanGetServicePlanTO1(ApiServicePlanGetServicePlanTO value) {
        this.apiServicePlanGetServicePlanTO1 = value;
    }

}
