
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDriverV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDriverV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_VADAdminGetDriverV2TO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_VADAdminGetDriverV2TO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDriverV2", propOrder = {
    "apiVADAdminGetDriverV2TO1"
})
public class GetDriverV2 {

    @XmlElement(name = "Api_VADAdminGetDriverV2TO_1", required = true, nillable = true)
    protected ApiVADAdminGetDriverV2TO apiVADAdminGetDriverV2TO1;

    /**
     * Gets the value of the apiVADAdminGetDriverV2TO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVADAdminGetDriverV2TO }
     *     
     */
    public ApiVADAdminGetDriverV2TO getApiVADAdminGetDriverV2TO1() {
        return apiVADAdminGetDriverV2TO1;
    }

    /**
     * Sets the value of the apiVADAdminGetDriverV2TO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVADAdminGetDriverV2TO }
     *     
     */
    public void setApiVADAdminGetDriverV2TO1(ApiVADAdminGetDriverV2TO value) {
        this.apiVADAdminGetDriverV2TO1 = value;
    }

}
