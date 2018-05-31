
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormMessagesByForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFormMessagesByForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageGetFormMessagesByFormTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageGetFormMessagesByFormTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormMessagesByForm", propOrder = {
    "apiFormMessageGetFormMessagesByFormTO1"
})
public class GetFormMessagesByForm {

    @XmlElement(name = "Api_FormMessageGetFormMessagesByFormTO_1", required = true, nillable = true)
    protected ApiFormMessageGetFormMessagesByFormTO apiFormMessageGetFormMessagesByFormTO1;

    /**
     * Gets the value of the apiFormMessageGetFormMessagesByFormTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageGetFormMessagesByFormTO }
     *     
     */
    public ApiFormMessageGetFormMessagesByFormTO getApiFormMessageGetFormMessagesByFormTO1() {
        return apiFormMessageGetFormMessagesByFormTO1;
    }

    /**
     * Sets the value of the apiFormMessageGetFormMessagesByFormTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageGetFormMessagesByFormTO }
     *     
     */
    public void setApiFormMessageGetFormMessagesByFormTO1(ApiFormMessageGetFormMessagesByFormTO value) {
        this.apiFormMessageGetFormMessagesByFormTO1 = value;
    }

}
