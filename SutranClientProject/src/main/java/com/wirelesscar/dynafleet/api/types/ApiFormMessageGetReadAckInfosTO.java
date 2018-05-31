
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageGetReadAckInfosTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageGetReadAckInfosTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formMessageIdArray" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageIdArrayTO"/>
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
@XmlType(name = "Api_FormMessageGetReadAckInfosTO", propOrder = {
    "formMessageIdArray",
    "sessionId"
})
public class ApiFormMessageGetReadAckInfosTO {

    @XmlElement(required = true)
    protected ApiFormMessageIdArrayTO formMessageIdArray;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the formMessageIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageIdArrayTO }
     *     
     */
    public ApiFormMessageIdArrayTO getFormMessageIdArray() {
        return formMessageIdArray;
    }

    /**
     * Sets the value of the formMessageIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageIdArrayTO }
     *     
     */
    public void setFormMessageIdArray(ApiFormMessageIdArrayTO value) {
        this.formMessageIdArray = value;
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
