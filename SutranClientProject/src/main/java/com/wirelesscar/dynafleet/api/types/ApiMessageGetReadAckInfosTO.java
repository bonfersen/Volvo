
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_MessageGetReadAckInfosTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_MessageGetReadAckInfosTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageIdArray" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageIdArrayTO"/>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_MessageGetReadAckInfosTO", propOrder = {
    "messageIdArray",
    "sessionId"
})
public class ApiMessageGetReadAckInfosTO {

    @XmlElement(required = true)
    protected ApiMessageIdArrayTO messageIdArray;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the messageIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageIdArrayTO }
     *     
     */
    public ApiMessageIdArrayTO getMessageIdArray() {
        return messageIdArray;
    }

    /**
     * Sets the value of the messageIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageIdArrayTO }
     *     
     */
    public void setMessageIdArray(ApiMessageIdArrayTO value) {
        this.messageIdArray = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSessionId }
     *     
     */
    public ApiSessionId getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSessionId }
     *     
     */
    public void setSessionId(ApiSessionId value) {
        this.sessionId = value;
    }

}
