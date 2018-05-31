
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteFormMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteFormMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageDeleteFormMessageTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageDeleteFormMessageTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteFormMessage", propOrder = {
    "apiFormMessageDeleteFormMessageTO1"
})
public class DeleteFormMessage {

    @XmlElement(name = "Api_FormMessageDeleteFormMessageTO_1", required = true, nillable = true)
    protected ApiFormMessageDeleteFormMessageTO apiFormMessageDeleteFormMessageTO1;

    /**
     * Gets the value of the apiFormMessageDeleteFormMessageTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageDeleteFormMessageTO }
     *     
     */
    public ApiFormMessageDeleteFormMessageTO getApiFormMessageDeleteFormMessageTO1() {
        return apiFormMessageDeleteFormMessageTO1;
    }

    /**
     * Sets the value of the apiFormMessageDeleteFormMessageTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageDeleteFormMessageTO }
     *     
     */
    public void setApiFormMessageDeleteFormMessageTO1(ApiFormMessageDeleteFormMessageTO value) {
        this.apiFormMessageDeleteFormMessageTO1 = value;
    }

}
