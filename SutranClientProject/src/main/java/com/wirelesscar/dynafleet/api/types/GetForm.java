
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormGetFormTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormGetFormTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForm", propOrder = {
    "apiFormGetFormTO1"
})
public class GetForm {

    @XmlElement(name = "Api_FormGetFormTO_1", required = true, nillable = true)
    protected ApiFormGetFormTO apiFormGetFormTO1;

    /**
     * Gets the value of the apiFormGetFormTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormGetFormTO }
     *     
     */
    public ApiFormGetFormTO getApiFormGetFormTO1() {
        return apiFormGetFormTO1;
    }

    /**
     * Sets the value of the apiFormGetFormTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormGetFormTO }
     *     
     */
    public void setApiFormGetFormTO1(ApiFormGetFormTO value) {
        this.apiFormGetFormTO1 = value;
    }

}
