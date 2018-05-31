
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_SendstatusTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_SendstatusTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changedTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="messageId" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageId"/>
 *         &lt;element name="sendstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_SendstatusTO", propOrder = {
    "changedTime",
    "messageId",
    "sendstatus"
})
public class ApiSendstatusTO {

    @XmlElement(required = true, nillable = true)
    protected ApiDate changedTime;
    @XmlElement(required = true, nillable = true)
    protected ApiMessageId messageId;
    @XmlElement(required = true, nillable = true)
    protected String sendstatus;

    /**
     * Gets the value of the changedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getChangedTime() {
        return changedTime;
    }

    /**
     * Sets the value of the changedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setChangedTime(ApiDate value) {
        this.changedTime = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageId }
     *     
     */
    public ApiMessageId getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageId }
     *     
     */
    public void setMessageId(ApiMessageId value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the sendstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendstatus() {
        return sendstatus;
    }

    /**
     * Sets the value of the sendstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendstatus(String value) {
        this.sendstatus = value;
    }

}
