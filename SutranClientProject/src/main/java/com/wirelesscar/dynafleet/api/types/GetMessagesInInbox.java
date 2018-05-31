
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMessagesInInbox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMessagesInInbox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageGetMessagesInInboxTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageGetMessagesInInboxTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessagesInInbox", propOrder = {
    "apiMessageGetMessagesInInboxTO1"
})
public class GetMessagesInInbox {

    @XmlElement(name = "Api_MessageGetMessagesInInboxTO_1", required = true, nillable = true)
    protected ApiMessageGetMessagesInInboxTO apiMessageGetMessagesInInboxTO1;

    /**
     * Gets the value of the apiMessageGetMessagesInInboxTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageGetMessagesInInboxTO }
     *     
     */
    public ApiMessageGetMessagesInInboxTO getApiMessageGetMessagesInInboxTO1() {
        return apiMessageGetMessagesInInboxTO1;
    }

    /**
     * Sets the value of the apiMessageGetMessagesInInboxTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageGetMessagesInInboxTO }
     *     
     */
    public void setApiMessageGetMessagesInInboxTO1(ApiMessageGetMessagesInInboxTO value) {
        this.apiMessageGetMessagesInInboxTO1 = value;
    }

}
