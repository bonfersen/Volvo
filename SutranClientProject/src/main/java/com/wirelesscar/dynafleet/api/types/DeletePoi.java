
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePoi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePoi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiDeletePoiTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiDeletePoiTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePoi", propOrder = {
    "apiPoiDeletePoiTO1"
})
public class DeletePoi {

    @XmlElement(name = "Api_PoiDeletePoiTO_1", required = true, nillable = true)
    protected ApiPoiDeletePoiTO apiPoiDeletePoiTO1;

    /**
     * Gets the value of the apiPoiDeletePoiTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiDeletePoiTO }
     *     
     */
    public ApiPoiDeletePoiTO getApiPoiDeletePoiTO1() {
        return apiPoiDeletePoiTO1;
    }

    /**
     * Sets the value of the apiPoiDeletePoiTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiDeletePoiTO }
     *     
     */
    public void setApiPoiDeletePoiTO1(ApiPoiDeletePoiTO value) {
        this.apiPoiDeletePoiTO1 = value;
    }

}
