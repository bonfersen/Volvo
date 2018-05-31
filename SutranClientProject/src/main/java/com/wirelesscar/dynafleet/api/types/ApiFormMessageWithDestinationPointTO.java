
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageWithDestinationPointTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageWithDestinationPointTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formId" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormId"/>
 *         &lt;element name="isRead" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="messageData" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageFieldTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageId"/>
 *         &lt;element name="point" type="{http://wirelesscar.com/dynafleet/api/types}Api_PointTO"/>
 *         &lt;element name="sendstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendstatusLastChangeTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="timestamp" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="userId" type="{http://wirelesscar.com/dynafleet/api/types}Api_UserId"/>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_FormMessageWithDestinationPointTO", propOrder = {
    "formId",
    "isRead",
    "messageData",
    "messageId",
    "point",
    "sendstatus",
    "sendstatusLastChangeTime",
    "timestamp",
    "userId",
    "vehicleId"
})
public class ApiFormMessageWithDestinationPointTO {

    @XmlElement(required = true)
    protected ApiFormId formId;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isRead;
    protected List<ApiFormMessageFieldTO> messageData;
    @XmlElement(required = true, nillable = true)
    protected ApiFormMessageId messageId;
    @XmlElement(required = true)
    protected ApiPointTO point;
    @XmlElement(required = true, nillable = true)
    protected String sendstatus;
    @XmlElement(required = true, nillable = true)
    protected ApiDate sendstatusLastChangeTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;
    @XmlElement(required = true, nillable = true)
    protected ApiUserId userId;
    @XmlElement(required = true)
    protected ApiVehicleId vehicleId;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiFormMessageFieldTO }
     * 
     * 
     */
    public List<ApiFormMessageFieldTO> getMessageData() {
        if (messageData == null) {
            messageData = new ArrayList<ApiFormMessageFieldTO>();
        }
        return this.messageData;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageId }
     *     
     */
    public ApiFormMessageId getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageId }
     *     
     */
    public void setMessageId(ApiFormMessageId value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPointTO }
     *     
     */
    public ApiPointTO getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPointTO }
     *     
     */
    public void setPoint(ApiPointTO value) {
        this.point = value;
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

    /**
     * Gets the value of the sendstatusLastChangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getSendstatusLastChangeTime() {
        return sendstatusLastChangeTime;
    }

    /**
     * Sets the value of the sendstatusLastChangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setSendstatusLastChangeTime(ApiDate value) {
        this.sendstatusLastChangeTime = value;
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

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiUserId }
     *     
     */
    public ApiUserId getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiUserId }
     *     
     */
    public void setUserId(ApiUserId value) {
        this.userId = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleId }
     *     
     */
    public ApiVehicleId getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleId }
     *     
     */
    public void setVehicleId(ApiVehicleId value) {
        this.vehicleId = value;
    }

}
