
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageGetFormMessagesInInboxTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageGetFormMessagesInInboxTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *         &lt;element name="toDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_FormMessageGetFormMessagesInInboxTO", propOrder = {
    "fromDate",
    "sessionId",
    "toDate"
})
public class ApiFormMessageGetFormMessagesInInboxTO {

    @XmlElement(required = true)
    protected ApiDate fromDate;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;
    @XmlElement(required = true)
    protected ApiDate toDate;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setFromDate(ApiDate value) {
        this.fromDate = value;
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

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setToDate(ApiDate value) {
        this.toDate = value;
    }

}
