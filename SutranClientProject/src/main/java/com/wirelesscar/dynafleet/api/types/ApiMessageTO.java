
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_MessageTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_MessageTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromUserId" type="{http://wirelesscar.com/dynafleet/api/types}Api_UserId"/>
 *         &lt;element name="fromVehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *         &lt;element name="isRead" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="messageData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageId" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageId"/>
 *         &lt;element name="timestamp" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_MessageTO", propOrder = {
    "fromUserId",
    "fromVehicleId",
    "isRead",
    "messageData",
    "messageId",
    "timestamp"
})
public class ApiMessageTO {

    @XmlElement(required = true, nillable = true)
    protected ApiUserId fromUserId;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId fromVehicleId;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isRead;
    @XmlElement(required = true, nillable = true)
    protected String messageData;
    @XmlElement(required = true, nillable = true)
    protected ApiMessageId messageId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;

    /**
     * Gets the value of the fromUserId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiUserId }
     *     
     */
    public ApiUserId getFromUserId() {
        return fromUserId;
    }

    /**
     * Sets the value of the fromUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiUserId }
     *     
     */
    public void setFromUserId(ApiUserId value) {
        this.fromUserId = value;
    }

    /**
     * Gets the value of the fromVehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleId }
     *     
     */
    public ApiVehicleId getFromVehicleId() {
        return fromVehicleId;
    }

    /**
     * Sets the value of the fromVehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleId }
     *     
     */
    public void setFromVehicleId(ApiVehicleId value) {
        this.fromVehicleId = value;
    }

    /**
     * Gets the value of the isRead property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getIsRead() {
        return isRead;
    }

    /**
     * Sets the value of the isRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setIsRead(ApiBoolean value) {
        this.isRead = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageData(String value) {
        this.messageData = value;
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
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setTimestamp(ApiDate value) {
        this.timestamp = value;
    }

}
