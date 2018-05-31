
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPoi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPoi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiGetPoiTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiGetPoiTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPoi", propOrder = {
    "apiPoiGetPoiTO1"
})
public class GetPoi {

    @XmlElement(name = "Api_PoiGetPoiTO_1", required = true, nillable = true)
    protected ApiPoiGetPoiTO apiPoiGetPoiTO1;

    /**
     * Gets the value of the apiPoiGetPoiTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiGetPoiTO }
     *     
     */
    public ApiPoiGetPoiTO getApiPoiGetPoiTO1() {
        return apiPoiGetPoiTO1;
    }

    /**
     * Sets the value of the apiPoiGetPoiTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiGetPoiTO }
     *     
     */
    public void setApiPoiGetPoiTO1(ApiPoiGetPoiTO value) {
        this.apiPoiGetPoiTO1 = value;
    }

}
