
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteFormMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteFormMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageDeleteFormMessagesTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageDeleteFormMessagesTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteFormMessages", propOrder = {
    "apiFormMessageDeleteFormMessagesTO1"
})
public class DeleteFormMessages {

    @XmlElement(name = "Api_FormMessageDeleteFormMessagesTO_1", required = true, nillable = true)
    protected ApiFormMessageDeleteFormMessagesTO apiFormMessageDeleteFormMessagesTO1;

    /**
     * Gets the value of the apiFormMessageDeleteFormMessagesTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageDeleteFormMessagesTO }
     *     
     */
    public ApiFormMessageDeleteFormMessagesTO getApiFormMessageDeleteFormMessagesTO1() {
        return apiFormMessageDeleteFormMessagesTO1;
    }

    /**
     * Sets the value of the apiFormMessageDeleteFormMessagesTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageDeleteFormMessagesTO }
     *     
     */
    public void setApiFormMessageDeleteFormMessagesTO1(ApiFormMessageDeleteFormMessagesTO value) {
        this.apiFormMessageDeleteFormMessagesTO1 = value;
    }

}
