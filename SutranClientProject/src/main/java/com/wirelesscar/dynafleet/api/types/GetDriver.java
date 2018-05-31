
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_VADAdminGetDriverTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_VADAdminGetDriverTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDriver", propOrder = {
    "apiVADAdminGetDriverTO1"
})
public class GetDriver {

    @XmlElement(name = "Api_VADAdminGetDriverTO_1", required = true, nillable = true)
    protected ApiVADAdminGetDriverTO apiVADAdminGetDriverTO1;

    /**
     * Gets the value of the apiVADAdminGetDriverTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVADAdminGetDriverTO }
     *     
     */
    public ApiVADAdminGetDriverTO getApiVADAdminGetDriverTO1() {
        return apiVADAdminGetDriverTO1;
    }

    /**
     * Sets the value of the apiVADAdminGetDriverTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVADAdminGetDriverTO }
     *     
     */
    public void setApiVADAdminGetDriverTO1(ApiVADAdminGetDriverTO value) {
        this.apiVADAdminGetDriverTO1 = value;
    }

}
