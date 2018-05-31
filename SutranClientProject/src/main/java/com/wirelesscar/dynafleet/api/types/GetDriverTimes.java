
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDriverTimes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDriverTimes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApiVADAdminGetDriverTimesTO_1" type="{http://wirelesscar.com/dynafleet/api/types}ApiVADAdminGetDriverTimesTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDriverTimes", propOrder = {
    "apiVADAdminGetDriverTimesTO1"
})
public class GetDriverTimes {

    @XmlElement(name = "ApiVADAdminGetDriverTimesTO_1", required = true, nillable = true)
    protected ApiVADAdminGetDriverTimesTO apiVADAdminGetDriverTimesTO1;

    /**
     * Gets the value of the apiVADAdminGetDriverTimesTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVADAdminGetDriverTimesTO }
     *     
     */
    public ApiVADAdminGetDriverTimesTO getApiVADAdminGetDriverTimesTO1() {
        return apiVADAdminGetDriverTimesTO1;
    }

    /**
     * Sets the value of the apiVADAdminGetDriverTimesTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVADAdminGetDriverTimesTO }
     *     
     */
    public void setApiVADAdminGetDriverTimesTO1(ApiVADAdminGetDriverTimesTO value) {
        this.apiVADAdminGetDriverTimesTO1 = value;
    }

}
