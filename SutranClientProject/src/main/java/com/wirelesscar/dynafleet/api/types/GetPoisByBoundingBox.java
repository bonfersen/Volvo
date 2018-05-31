
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPoisByBoundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPoisByBoundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiGetPoisByBoundingBoxTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiGetPoisByBoundingBoxTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPoisByBoundingBox", propOrder = {
    "apiPoiGetPoisByBoundingBoxTO1"
})
public class GetPoisByBoundingBox {

    @XmlElement(name = "Api_PoiGetPoisByBoundingBoxTO_1", required = true, nillable = true)
    protected ApiPoiGetPoisByBoundingBoxTO apiPoiGetPoisByBoundingBoxTO1;

    /**
     * Gets the value of the apiPoiGetPoisByBoundingBoxTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiGetPoisByBoundingBoxTO }
     *     
     */
    public ApiPoiGetPoisByBoundingBoxTO getApiPoiGetPoisByBoundingBoxTO1() {
        return apiPoiGetPoisByBoundingBoxTO1;
    }

    /**
     * Sets the value of the apiPoiGetPoisByBoundingBoxTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiGetPoisByBoundingBoxTO }
     *     
     */
    public void setApiPoiGetPoisByBoundingBoxTO1(ApiPoiGetPoisByBoundingBoxTO value) {
        this.apiPoiGetPoisByBoundingBoxTO1 = value;
    }

}
