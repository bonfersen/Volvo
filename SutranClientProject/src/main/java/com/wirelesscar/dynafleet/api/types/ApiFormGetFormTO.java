
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormGetFormTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormGetFormTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formId" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormId"/>
 *         &lt;element name="messageForm" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
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
@XmlType(name = "Api_FormGetFormTO", propOrder = {
    "formId",
    "messageForm",
    "sessionId"
})
public class ApiFormGetFormTO {

    @XmlElement(required = true)
    protected ApiFormId formId;
    @XmlElement(required = true)
    protected ApiBoolean messageForm;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormId }
     *     
     */
    public ApiFormId getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormId }
     *     
     */
    public void setFormId(ApiFormId value) {
        this.formId = value;
    }

    /**
     * Gets the value of the messageForm property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getMessageForm() {
        return messageForm;
    }

    /**
     * Sets the value of the messageForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setMessageForm(ApiBoolean value) {
        this.messageForm = value;
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
