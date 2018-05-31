
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPoisByType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPoisByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiGetPoisByTypeTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiGetPoisByTypeTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPoisByType", propOrder = {
    "apiPoiGetPoisByTypeTO1"
})
public class GetPoisByType {

    @XmlElement(name = "Api_PoiGetPoisByTypeTO_1", required = true, nillable = true)
    protected ApiPoiGetPoisByTypeTO apiPoiGetPoisByTypeTO1;

    /**
     * Gets the value of the apiPoiGetPoisByTypeTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiGetPoisByTypeTO }
     *     
     */
    public ApiPoiGetPoisByTypeTO getApiPoiGetPoisByTypeTO1() {
        return apiPoiGetPoisByTypeTO1;
    }

    /**
     * Sets the value of the apiPoiGetPoisByTypeTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiGetPoisByTypeTO }
     *     
     */
    public void setApiPoiGetPoisByTypeTO1(ApiPoiGetPoisByTypeTO value) {
        this.apiPoiGetPoisByTypeTO1 = value;
    }

}
