
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for login complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="login">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_LoginLoginTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_LoginLoginTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login", propOrder = {
    "apiLoginLoginTO1"
})
public class Login {

    @XmlElement(name = "Api_LoginLoginTO_1", required = true, nillable = true)
    protected ApiLoginLoginTO apiLoginLoginTO1;

    /**
     * Gets the value of the apiLoginLoginTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLoginLoginTO }
     *     
     */
    public ApiLoginLoginTO getApiLoginLoginTO1() {
        return apiLoginLoginTO1;
    }

    /**
     * Sets the value of the apiLoginLoginTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLoginLoginTO }
     *     
     */
    public void setApiLoginLoginTO1(ApiLoginLoginTO value) {
        this.apiLoginLoginTO1 = value;
    }

}
