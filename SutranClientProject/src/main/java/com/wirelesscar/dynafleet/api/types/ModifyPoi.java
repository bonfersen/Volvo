
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyPoi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyPoi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_PoiModifyPoiTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiModifyPoiTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyPoi", propOrder = {
    "apiPoiModifyPoiTO1"
})
public class ModifyPoi {

    @XmlElement(name = "Api_PoiModifyPoiTO_1", required = true, nillable = true)
    protected ApiPoiModifyPoiTO apiPoiModifyPoiTO1;

    /**
     * Gets the value of the apiPoiModifyPoiTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiModifyPoiTO }
     *     
     */
    public ApiPoiModifyPoiTO getApiPoiModifyPoiTO1() {
        return apiPoiModifyPoiTO1;
    }

    /**
     * Sets the value of the apiPoiModifyPoiTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiModifyPoiTO }
     *     
     */
    public void setApiPoiModifyPoiTO1(ApiPoiModifyPoiTO value) {
        this.apiPoiModifyPoiTO1 = value;
    }

}
