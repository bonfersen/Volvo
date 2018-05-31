
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageWithDestinationPointTO"/>
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
@XmlType(name = "Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO", propOrder = {
    "message",
    "sessionId"
})
public class ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO {

    @XmlElement(required = true)
    protected ApiFormMessageWithDestinationPointTO message;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageWithDestinationPointTO }
     *     
     */
    public ApiFormMessageWithDestinationPointTO getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageWithDestinationPointTO }
     *     
     */
    public void setMessage(ApiFormMessageWithDestinationPointTO value) {
        this.message = value;
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
