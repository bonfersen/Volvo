
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormMessagesInInbox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFormMessagesInInbox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageGetFormMessagesInInboxTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageGetFormMessagesInInboxTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormMessagesInInbox", propOrder = {
    "apiFormMessageGetFormMessagesInInboxTO1"
})
public class GetFormMessagesInInbox {

    @XmlElement(name = "Api_FormMessageGetFormMessagesInInboxTO_1", required = true, nillable = true)
    protected ApiFormMessageGetFormMessagesInInboxTO apiFormMessageGetFormMessagesInInboxTO1;

    /**
     * Gets the value of the apiFormMessageGetFormMessagesInInboxTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageGetFormMessagesInInboxTO }
     *     
     */
    public ApiFormMessageGetFormMessagesInInboxTO getApiFormMessageGetFormMessagesInInboxTO1() {
        return apiFormMessageGetFormMessagesInInboxTO1;
    }

    /**
     * Sets the value of the apiFormMessageGetFormMessagesInInboxTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageGetFormMessagesInInboxTO }
     *     
     */
    public void setApiFormMessageGetFormMessagesInInboxTO1(ApiFormMessageGetFormMessagesInInboxTO value) {
        this.apiFormMessageGetFormMessagesInInboxTO1 = value;
    }

}
