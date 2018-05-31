
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_ReadAckInfoTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_ReadAckInfoTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageId"/>
 *         &lt;element name="readAt" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="readByDriverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_ReadAckInfoTO", propOrder = {
    "messageId",
    "readAt",
    "readByDriverId"
})
public class ApiReadAckInfoTO {

    @XmlElement(required = true, nillable = true)
    protected ApiMessageId messageId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate readAt;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId readByDriverId;

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
     * Gets the value of the readAt property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getReadAt() {
        return readAt;
    }

    /**
     * Sets the value of the readAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setReadAt(ApiDate value) {
        this.readAt = value;
    }

    /**
     * Gets the value of the readByDriverId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDriverId }
     *     
     */
    public ApiDriverId getReadByDriverId() {
        return readByDriverId;
    }

    /**
     * Sets the value of the readByDriverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDriverId }
     *     
     */
    public void setReadByDriverId(ApiDriverId value) {
        this.readByDriverId = value;
    }

}
