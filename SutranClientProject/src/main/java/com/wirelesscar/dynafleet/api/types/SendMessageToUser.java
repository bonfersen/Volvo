
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessageToUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessageToUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageSendMessageToUserTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageSendMessageToUserTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessageToUser", propOrder = {
    "apiMessageSendMessageToUserTO1"
})
public class SendMessageToUser {

    @XmlElement(name = "Api_MessageSendMessageToUserTO_1", required = true, nillable = true)
    protected ApiMessageSendMessageToUserTO apiMessageSendMessageToUserTO1;

    /**
     * Gets the value of the apiMessageSendMessageToUserTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageSendMessageToUserTO }
     *     
     */
    public ApiMessageSendMessageToUserTO getApiMessageSendMessageToUserTO1() {
        return apiMessageSendMessageToUserTO1;
    }

    /**
     * Sets the value of the apiMessageSendMessageToUserTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageSendMessageToUserTO }
     *     
     */
    public void setApiMessageSendMessageToUserTO1(ApiMessageSendMessageToUserTO value) {
        this.apiMessageSendMessageToUserTO1 = value;
    }

}
