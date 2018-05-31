
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageDeleteFormMessageTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageDeleteFormMessageTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formMessageId" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageId"/>
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
@XmlType(name = "Api_FormMessageDeleteFormMessageTO", propOrder = {
    "formMessageId",
    "sessionId"
})
public class ApiFormMessageDeleteFormMessageTO {

    @XmlElement(required = true)
    protected ApiFormMessageId formMessageId;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the formMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageId }
     *     
     */
    public ApiFormMessageId getFormMessageId() {
        return formMessageId;
    }

    /**
     * Sets the value of the formMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageId }
     *     
     */
    public void setFormMessageId(ApiFormMessageId value) {
        this.formMessageId = value;
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
