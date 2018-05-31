
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPoisByTypeAndBoundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPoisByTypeAndBoundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiGetPoisByTypeAndBoundingBoxTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiGetPoisByTypeAndBoundingBoxTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPoisByTypeAndBoundingBox", propOrder = {
    "apiPoiGetPoisByTypeAndBoundingBoxTO1"
})
public class GetPoisByTypeAndBoundingBox {

    @XmlElement(name = "Api_PoiGetPoisByTypeAndBoundingBoxTO_1", required = true, nillable = true)
    protected ApiPoiGetPoisByTypeAndBoundingBoxTO apiPoiGetPoisByTypeAndBoundingBoxTO1;

    /**
     * Gets the value of the apiPoiGetPoisByTypeAndBoundingBoxTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiGetPoisByTypeAndBoundingBoxTO }
     *     
     */
    public ApiPoiGetPoisByTypeAndBoundingBoxTO getApiPoiGetPoisByTypeAndBoundingBoxTO1() {
        return apiPoiGetPoisByTypeAndBoundingBoxTO1;
    }

    /**
     * Sets the value of the apiPoiGetPoisByTypeAndBoundingBoxTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiGetPoisByTypeAndBoundingBoxTO }
     *     
     */
    public void setApiPoiGetPoisByTypeAndBoundingBoxTO1(ApiPoiGetPoisByTypeAndBoundingBoxTO value) {
        this.apiPoiGetPoisByTypeAndBoundingBoxTO1 = value;
    }

}
