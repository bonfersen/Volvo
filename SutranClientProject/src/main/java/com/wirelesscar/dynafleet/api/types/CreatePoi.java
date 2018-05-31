
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPoi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPoi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiCreatePoiTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiCreatePoiTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPoi", propOrder = {
    "apiPoiCreatePoiTO1"
})
public class CreatePoi {

    @XmlElement(name = "Api_PoiCreatePoiTO_1", required = true, nillable = true)
    protected ApiPoiCreatePoiTO apiPoiCreatePoiTO1;

    /**
     * Gets the value of the apiPoiCreatePoiTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiCreatePoiTO }
     *     
     */
    public ApiPoiCreatePoiTO getApiPoiCreatePoiTO1() {
        return apiPoiCreatePoiTO1;
    }

    /**
     * Sets the value of the apiPoiCreatePoiTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiCreatePoiTO }
     *     
     */
    public void setApiPoiCreatePoiTO1(ApiPoiCreatePoiTO value) {
        this.apiPoiCreatePoiTO1 = value;
    }

}
