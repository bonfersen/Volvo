
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_AlarmTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_AlarmTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarmId" type="{http://wirelesscar.com/dynafleet/api/types}Api_AlarmId"/>
 *         &lt;element name="alarmStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="position" type="{http://wirelesscar.com/dynafleet/api/types}Api_PositionTO"/>
 *         &lt;element name="sendStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendStatusChangedTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="sender" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
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
@XmlType(name = "Api_AlarmTO", propOrder = {
    "alarmId",
    "alarmStatus",
    "alarmType",
    "driverLanguageCode",
    "driverName",
    "driverPhoneNumber",
    "messageData",
    "position",
    "sendStatus",
    "sendStatusChangedTime",
    "sender",
    "timestamp"
})
public class ApiAlarmTO {

    @XmlElement(required = true, nillable = true)
    protected ApiAlarmId alarmId;
    @XmlElement(required = true, nillable = true)
    protected String alarmStatus;
    @XmlElement(required = true, nillable = true)
    protected String alarmType;
    @XmlElement(required = true, nillable = true)
    protected String driverLanguageCode;
    @XmlElement(required = true, nillable = true)
    protected String driverName;
    @XmlElement(required = true, nillable = true)
    protected String driverPhoneNumber;
    @XmlElement(required = true, nillable = true)
    protected String messageData;
    @XmlElement(required = true, nillable = true)
    protected ApiPositionTO position;
    @XmlElement(required = true, nillable = true)
    protected String sendStatus;
    @XmlElement(required = true, nillable = true)
    protected ApiDate sendStatusChangedTime;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId sender;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;

    /**
     * Gets the value of the alarmId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiAlarmId }
     *     
     */
    public ApiAlarmId getAlarmId() {
        return alarmId;
    }

    /**
     * Sets the value of the alarmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiAlarmId }
     *     
     */
    public void setAlarmId(ApiAlarmId value) {
        this.alarmId = value;
    }

    /**
     * Gets the value of the alarmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    /**
     * Sets the value of the alarmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmStatus(String value) {
        this.alarmStatus = value;
    }

    /**
     * Gets the value of the alarmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmType(String value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the driverLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverLanguageCode() {
        return driverLanguageCode;
    }

    /**
     * Sets the value of the driverLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverLanguageCode(String value) {
        this.driverLanguageCode = value;
    }

    /**
     * Gets the value of the driverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Sets the value of the driverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Gets the value of the driverPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    /**
     * Sets the value of the driverPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverPhoneNumber(String value) {
        this.driverPhoneNumber = value;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPositionTO }
     *     
     */
    public ApiPositionTO getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPositionTO }
     *     
     */
    public void setPosition(ApiPositionTO value) {
        this.position = value;
    }

    /**
     * Gets the value of the sendStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * Sets the value of the sendStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendStatus(String value) {
        this.sendStatus = value;
    }

    /**
     * Gets the value of the sendStatusChangedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getSendStatusChangedTime() {
        return sendStatusChangedTime;
    }

    /**
     * Sets the value of the sendStatusChangedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setSendStatusChangedTime(ApiDate value) {
        this.sendStatusChangedTime = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleId }
     *     
     */
    public ApiVehicleId getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleId }
     *     
     */
    public void setSender(ApiVehicleId value) {
        this.sender = value;
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
