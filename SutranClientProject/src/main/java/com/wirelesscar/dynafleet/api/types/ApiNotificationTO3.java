
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_NotificationTO3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_NotificationTO3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletedAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedDTMAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedDriver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedFormMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedGeofencePlus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedPOI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedServicePlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deletedVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedDriver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedGeofencePlus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedOrderItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedPOI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedServicePlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newCDPDownloadSendstatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newDTMAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newDTMAlarmSetupSendstatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newDriverData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newDtjData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newFormMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newFormMessageSendStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newGeofenceData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newGeofencePlusData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newMessageSendStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newTrackingData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newTrackingSetUpSendstatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newVehiclePositionData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newVehicleEventMessages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newVehicleReportData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderMarkedAsRead" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_NotificationTO3", propOrder = {
    "deletedAlarm",
    "deletedCustomer",
    "deletedDTMAlarm",
    "deletedDriver",
    "deletedFormMessage",
    "deletedGeofencePlus",
    "deletedMessage",
    "deletedOrder",
    "deletedPOI",
    "deletedServicePlan",
    "deletedUser",
    "deletedVehicle",
    "modifiedCustomer",
    "modifiedDriver",
    "modifiedGeofencePlus",
    "modifiedOrder",
    "modifiedOrderItem",
    "modifiedPOI",
    "modifiedServicePlan",
    "modifiedUser",
    "modifiedVehicle",
    "newAlarm",
    "newCDPDownloadSendstatus",
    "newDTMAlarm",
    "newDTMAlarmSetupSendstatus",
    "newDriverData",
    "newDtjData",
    "newFormMessage",
    "newFormMessageSendStatus",
    "newGeofenceData",
    "newGeofencePlusData",
    "newMessage",
    "newMessageSendStatus",
    "newTrackingData",
    "newTrackingSetUpSendstatus",
    "newVehiclePositionData",
    "newVehicleEventMessages",
    "newVehicleReportData",
    "orderMarkedAsRead"
})
public class ApiNotificationTO3 {

    protected boolean deletedAlarm;
    protected boolean deletedCustomer;
    protected boolean deletedDTMAlarm;
    protected boolean deletedDriver;
    protected boolean deletedFormMessage;
    protected boolean deletedGeofencePlus;
    protected boolean deletedMessage;
    protected boolean deletedOrder;
    protected boolean deletedPOI;
    protected boolean deletedServicePlan;
    protected boolean deletedUser;
    protected boolean deletedVehicle;
    protected boolean modifiedCustomer;
    protected boolean modifiedDriver;
    protected boolean modifiedGeofencePlus;
    protected boolean modifiedOrder;
    protected boolean modifiedOrderItem;
    protected boolean modifiedPOI;
    protected boolean modifiedServicePlan;
    protected boolean modifiedUser;
    protected boolean modifiedVehicle;
    protected boolean newAlarm;
    protected boolean newCDPDownloadSendstatus;
    protected boolean newDTMAlarm;
    protected boolean newDTMAlarmSetupSendstatus;
    protected boolean newDriverData;
    protected boolean newDtjData;
    protected boolean newFormMessage;
    protected boolean newFormMessageSendStatus;
    protected boolean newGeofenceData;
    protected boolean newGeofencePlusData;
    protected boolean newMessage;
    protected boolean newMessageSendStatus;
    protected boolean newTrackingData;
    protected boolean newTrackingSetUpSendstatus;
    protected boolean newVehiclePositionData;
    protected boolean newVehicleEventMessages;
    protected boolean newVehicleReportData;
    protected boolean orderMarkedAsRead;

    /**
     * Gets the value of the deletedAlarm property.
     * 
     */
    public boolean isDeletedAlarm() {
        return deletedAlarm;
    }

    /**
     * Sets the value of the deletedAlarm property.
     * 
     */
    public void setDeletedAlarm(boolean value) {
        this.deletedAlarm = value;
    }

    /**
     * Gets the value of the deletedCustomer property.
     * 
     */
    public boolean isDeletedCustomer() {
        return deletedCustomer;
    }

    /**
     * Sets the value of the deletedCustomer property.
     * 
     */
    public void setDeletedCustomer(boolean value) {
        this.deletedCustomer = value;
    }

    /**
     * Gets the value of the deletedDTMAlarm property.
     * 
     */
    public boolean isDeletedDTMAlarm() {
        return deletedDTMAlarm;
    }

    /**
     * Sets the value of the deletedDTMAlarm property.
     * 
     */
    public void setDeletedDTMAlarm(boolean value) {
        this.deletedDTMAlarm = value;
    }

    /**
     * Gets the value of the deletedDriver property.
     * 
     */
    public boolean isDeletedDriver() {
        return deletedDriver;
    }

    /**
     * Sets the value of the deletedDriver property.
     * 
     */
    public void setDeletedDriver(boolean value) {
        this.deletedDriver = value;
    }

    /**
     * Gets the value of the deletedFormMessage property.
     * 
     */
    public boolean isDeletedFormMessage() {
        return deletedFormMessage;
    }

    /**
     * Sets the value of the deletedFormMessage property.
     * 
     */
    public void setDeletedFormMessage(boolean value) {
        this.deletedFormMessage = value;
    }

    /**
     * Gets the value of the deletedGeofencePlus property.
     * 
     */
    public boolean isDeletedGeofencePlus() {
        return deletedGeofencePlus;
    }

    /**
     * Sets the value of the deletedGeofencePlus property.
     * 
     */
    public void setDeletedGeofencePlus(boolean value) {
        this.deletedGeofencePlus = value;
    }

    /**
     * Gets the value of the deletedMessage property.
     * 
     */
    public boolean isDeletedMessage() {
        return deletedMessage;
    }

    /**
     * Sets the value of the deletedMessage property.
     * 
     */
    public void setDeletedMessage(boolean value) {
        this.deletedMessage = value;
    }

    /**
     * Gets the value of the deletedOrder property.
     * 
     */
    public boolean isDeletedOrder() {
        return deletedOrder;
    }

    /**
     * Sets the value of the deletedOrder property.
     * 
     */
    public void setDeletedOrder(boolean value) {
        this.deletedOrder = value;
    }

    /**
     * Gets the value of the deletedPOI property.
     * 
     */
    public boolean isDeletedPOI() {
        return deletedPOI;
    }

    /**
     * Sets the value of the deletedPOI property.
     * 
     */
    public void setDeletedPOI(boolean value) {
        this.deletedPOI = value;
    }

    /**
     * Gets the value of the deletedServicePlan property.
     * 
     */
    public boolean isDeletedServicePlan() {
        return deletedServicePlan;
    }

    /**
     * Sets the value of the deletedServicePlan property.
     * 
     */
    public void setDeletedServicePlan(boolean value) {
        this.deletedServicePlan = value;
    }

    /**
     * Gets the value of the deletedUser property.
     * 
     */
    public boolean isDeletedUser() {
        return deletedUser;
    }

    /**
     * Sets the value of the deletedUser property.
     * 
     */
    public void setDeletedUser(boolean value) {
        this.deletedUser = value;
    }

    /**
     * Gets the value of the deletedVehicle property.
     * 
     */
    public boolean isDeletedVehicle() {
        return deletedVehicle;
    }

    /**
     * Sets the value of the deletedVehicle property.
     * 
     */
    public void setDeletedVehicle(boolean value) {
        this.deletedVehicle = value;
    }

    /**
     * Gets the value of the modifiedCustomer property.
     * 
     */
    public boolean isModifiedCustomer() {
        return modifiedCustomer;
    }

    /**
     * Sets the value of the modifiedCustomer property.
     * 
     */
    public void setModifiedCustomer(boolean value) {
        this.modifiedCustomer = value;
    }

    /**
     * Gets the value of the modifiedDriver property.
     * 
     */
    public boolean isModifiedDriver() {
        return modifiedDriver;
    }

    /**
     * Sets the value of the modifiedDriver property.
     * 
     */
    public void setModifiedDriver(boolean value) {
        this.modifiedDriver = value;
    }

    /**
     * Gets the value of the modifiedGeofencePlus property.
     * 
     */
    public boolean isModifiedGeofencePlus() {
        return modifiedGeofencePlus;
    }

    /**
     * Sets the value of the modifiedGeofencePlus property.
     * 
     */
    public void setModifiedGeofencePlus(boolean value) {
        this.modifiedGeofencePlus = value;
    }

    /**
     * Gets the value of the modifiedOrder property.
     * 
     */
    public boolean isModifiedOrder() {
        return modifiedOrder;
    }

    /**
     * Sets the value of the modifiedOrder property.
     * 
     */
    public void setModifiedOrder(boolean value) {
        this.modifiedOrder = value;
    }

    /**
     * Gets the value of the modifiedOrderItem property.
     * 
     */
    public boolean isModifiedOrderItem() {
        return modifiedOrderItem;
    }

    /**
     * Sets the value of the modifiedOrderItem property.
     * 
     */
    public void setModifiedOrderItem(boolean value) {
        this.modifiedOrderItem = value;
    }

    /**
     * Gets the value of the modifiedPOI property.
     * 
     */
    public boolean isModifiedPOI() {
        return modifiedPOI;
    }

    /**
     * Sets the value of the modifiedPOI property.
     * 
     */
    public void setModifiedPOI(boolean value) {
        this.modifiedPOI = value;
    }

    /**
     * Gets the value of the modifiedServicePlan property.
     * 
     */
    public boolean isModifiedServicePlan() {
        return modifiedServicePlan;
    }

    /**
     * Sets the value of the modifiedServicePlan property.
     * 
     */
    public void setModifiedServicePlan(boolean value) {
        this.modifiedServicePlan = value;
    }

    /**
     * Gets the value of the modifiedUser property.
     * 
     */
    public boolean isModifiedUser() {
        return modifiedUser;
    }

    /**
     * Sets the value of the modifiedUser property.
     * 
     */
    public void setModifiedUser(boolean value) {
        this.modifiedUser = value;
    }

    /**
     * Gets the value of the modifiedVehicle property.
     * 
     */
    public boolean isModifiedVehicle() {
        return modifiedVehicle;
    }

    /**
     * Sets the value of the modifiedVehicle property.
     * 
     */
    public void setModifiedVehicle(boolean value) {
        this.modifiedVehicle = value;
    }

    /**
     * Gets the value of the newAlarm property.
     * 
     */
    public boolean isNewAlarm() {
        return newAlarm;
    }

    /**
     * Sets the value of the newAlarm property.
     * 
     */
    public void setNewAlarm(boolean value) {
        this.newAlarm = value;
    }

    /**
     * Gets the value of the newCDPDownloadSendstatus property.
     * 
     */
    public boolean isNewCDPDownloadSendstatus() {
        return newCDPDownloadSendstatus;
    }

    /**
     * Sets the value of the newCDPDownloadSendstatus property.
     * 
     */
    public void setNewCDPDownloadSendstatus(boolean value) {
        this.newCDPDownloadSendstatus = value;
    }

    /**
     * Gets the value of the newDTMAlarm property.
     * 
     */
    public boolean isNewDTMAlarm() {
        return newDTMAlarm;
    }

    /**
     * Sets the value of the newDTMAlarm property.
     * 
     */
    public void setNewDTMAlarm(boolean value) {
        this.newDTMAlarm = value;
    }

    /**
     * Gets the value of the newDTMAlarmSetupSendstatus property.
     * 
     */
    public boolean isNewDTMAlarmSetupSendstatus() {
        return newDTMAlarmSetupSendstatus;
    }

    /**
     * Sets the value of the newDTMAlarmSetupSendstatus property.
     * 
     */
    public void setNewDTMAlarmSetupSendstatus(boolean value) {
        this.newDTMAlarmSetupSendstatus = value;
    }

    /**
     * Gets the value of the newDriverData property.
     * 
     */
    public boolean isNewDriverData() {
        return newDriverData;
    }

    /**
     * Sets the value of the newDriverData property.
     * 
     */
    public void setNewDriverData(boolean value) {
        this.newDriverData = value;
    }

    /**
     * Gets the value of the newDtjData property.
     * 
     */
    public boolean isNewDtjData() {
        return newDtjData;
    }

    /**
     * Sets the value of the newDtjData property.
     * 
     */
    public void setNewDtjData(boolean value) {
        this.newDtjData = value;
    }

    /**
     * Gets the value of the newFormMessage property.
     * 
     */
    public boolean isNewFormMessage() {
        return newFormMessage;
    }

    /**
     * Sets the value of the newFormMessage property.
     * 
     */
    public void setNewFormMessage(boolean value) {
        this.newFormMessage = value;
    }

    /**
     * Gets the value of the newFormMessageSendStatus property.
     * 
     */
    public boolean isNewFormMessageSendStatus() {
        return newFormMessageSendStatus;
    }

    /**
     * Sets the value of the newFormMessageSendStatus property.
     * 
     */
    public void setNewFormMessageSendStatus(boolean value) {
        this.newFormMessageSendStatus = value;
    }

    /**
     * Gets the value of the newGeofenceData property.
     * 
     */
    public boolean isNewGeofenceData() {
        return newGeofenceData;
    }

    /**
     * Sets the value of the newGeofenceData property.
     * 
     */
    public void setNewGeofenceData(boolean value) {
        this.newGeofenceData = value;
    }

    /**
     * Gets the value of the newGeofencePlusData property.
     * 
     */
    public boolean isNewGeofencePlusData() {
        return newGeofencePlusData;
    }

    /**
     * Sets the value of the newGeofencePlusData property.
     * 
     */
    public void setNewGeofencePlusData(boolean value) {
        this.newGeofencePlusData = value;
    }

    /**
     * Gets the value of the newMessage property.
     * 
     */
    public boolean isNewMessage() {
        return newMessage;
    }

    /**
     * Sets the value of the newMessage property.
     * 
     */
    public void setNewMessage(boolean value) {
        this.newMessage = value;
    }

    /**
     * Gets the value of the newMessageSendStatus property.
     * 
     */
    public boolean isNewMessageSendStatus() {
        return newMessageSendStatus;
    }

    /**
     * Sets the value of the newMessageSendStatus property.
     * 
     */
    public void setNewMessageSendStatus(boolean value) {
        this.newMessageSendStatus = value;
    }

    /**
     * Gets the value of the newTrackingData property.
     * 
     */
    public boolean isNewTrackingData() {
        return newTrackingData;
    }

    /**
     * Sets the value of the newTrackingData property.
     * 
     */
    public void setNewTrackingData(boolean value) {
        this.newTrackingData = value;
    }

    /**
     * Gets the value of the newTrackingSetUpSendstatus property.
     * 
     */
    public boolean isNewTrackingSetUpSendstatus() {
        return newTrackingSetUpSendstatus;
    }

    /**
     * Sets the value of the newTrackingSetUpSendstatus property.
     * 
     */
    public void setNewTrackingSetUpSendstatus(boolean value) {
        this.newTrackingSetUpSendstatus = value;
    }

    /**
     * Gets the value of the newVehiclePositionData property.
     * 
     */
    public boolean isNewVehiclePositionData() {
        return newVehiclePositionData;
    }

    /**
     * Sets the value of the newVehiclePositionData property.
     * 
     */
    public void setNewVehiclePositionData(boolean value) {
        this.newVehiclePositionData = value;
    }

    /**
     * Gets the value of the newVehicleEventMessages property.
     * 
     */
    public boolean isNewVehicleEventMessages() {
        return newVehicleEventMessages;
    }

    /**
     * Sets the value of the newVehicleEventMessages property.
     * 
     */
    public void setNewVehicleEventMessages(boolean value) {
        this.newVehicleEventMessages = value;
    }

    /**
     * Gets the value of the newVehicleReportData property.
     * 
     */
    public boolean isNewVehicleReportData() {
        return newVehicleReportData;
    }

    /**
     * Sets the value of the newVehicleReportData property.
     * 
     */
    public void setNewVehicleReportData(boolean value) {
        this.newVehicleReportData = value;
    }

    /**
     * Gets the value of the orderMarkedAsRead property.
     * 
     */
    public boolean isOrderMarkedAsRead() {
        return orderMarkedAsRead;
    }

    /**
     * Sets the value of the orderMarkedAsRead property.
     * 
     */
    public void setOrderMarkedAsRead(boolean value) {
        this.orderMarkedAsRead = value;
    }

}
