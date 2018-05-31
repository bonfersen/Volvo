
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_OrderTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_OrderTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedUserId" type="{http://wirelesscar.com/dynafleet/api/types}Api_UserId"/>
 *         &lt;element name="assignedVehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *         &lt;element name="completedTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="createTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="deletedTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="driverDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="isRead" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="lastModifyTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="orderCustomerRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderItems" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderItemTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_OrderTO", propOrder = {
    "assignedUserId",
    "assignedVehicleId",
    "completedTime",
    "createTime",
    "customerDescription",
    "customerId",
    "deletedTime",
    "driverDescription",
    "driverId",
    "isRead",
    "lastModifyTime",
    "orderCustomerRef",
    "orderItems",
    "orderNumber",
    "userDescription",
    "vehicleDescription"
})
public class ApiOrderTO {

    @XmlElement(required = true, nillable = true)
    protected ApiUserId assignedUserId;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId assignedVehicleId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate completedTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate createTime;
    @XmlElement(required = true, nillable = true)
    protected String customerDescription;
    @XmlElement(required = true)
    protected ApiLong customerId;
    @XmlElement(required = true, nillable = true)
    protected ApiDate deletedTime;
    @XmlElement(required = true, nillable = true)
    protected String driverDescription;
    @XmlElement(required = true, nillable = true)
    protected ApiLong driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isRead;
    @XmlElement(required = true, nillable = true)
    protected ApiDate lastModifyTime;
    @XmlElement(required = true, nillable = true)
    protected String orderCustomerRef;
    @XmlElement(nillable = true)
    protected List<ApiOrderItemTO> orderItems;
    @XmlElement(required = true)
    protected String orderNumber;
    @XmlElement(required = true, nillable = true)
    protected String userDescription;
    @XmlElement(required = true, nillable = true)
    protected String vehicleDescription;

    /**
     * Gets the value of the assignedUserId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiUserId }
     *     
     */
    public ApiUserId getAssignedUserId() {
        return assignedUserId;
    }

    /**
     * Sets the value of the assignedUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiUserId }
     *     
     */
    public void setAssignedUserId(ApiUserId value) {
        this.assignedUserId = value;
    }

    /**
     * Gets the value of the assignedVehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleId }
     *     
     */
    public ApiVehicleId getAssignedVehicleId() {
        return assignedVehicleId;
    }

    /**
     * Sets the value of the assignedVehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleId }
     *     
     */
    public void setAssignedVehicleId(ApiVehicleId value) {
        this.assignedVehicleId = value;
    }

    /**
     * Gets the value of the completedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getCompletedTime() {
        return completedTime;
    }

    /**
     * Sets the value of the completedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setCompletedTime(ApiDate value) {
        this.completedTime = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setCreateTime(ApiDate value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the customerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDescription() {
        return customerDescription;
    }

    /**
     * Sets the value of the customerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDescription(String value) {
        this.customerDescription = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCustomerId(ApiLong value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the deletedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getDeletedTime() {
        return deletedTime;
    }

    /**
     * Sets the value of the deletedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setDeletedTime(ApiDate value) {
        this.deletedTime = value;
    }

    /**
     * Gets the value of the driverDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverDescription() {
        return driverDescription;
    }

    /**
     * Sets the value of the driverDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverDescription(String value) {
        this.driverDescription = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDriverId(ApiLong value) {
        this.driverId = value;
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
     * Gets the value of the lastModifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * Sets the value of the lastModifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setLastModifyTime(ApiDate value) {
        this.lastModifyTime = value;
    }

    /**
     * Gets the value of the orderCustomerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCustomerRef() {
        return orderCustomerRef;
    }

    /**
     * Sets the value of the orderCustomerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCustomerRef(String value) {
        this.orderCustomerRef = value;
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiOrderItemTO }
     * 
     * 
     */
    public List<ApiOrderItemTO> getOrderItems() {
        if (orderItems == null) {
            orderItems = new ArrayList<ApiOrderItemTO>();
        }
        return this.orderItems;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the userDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDescription() {
        return userDescription;
    }

    /**
     * Sets the value of the userDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDescription(String value) {
        this.userDescription = value;
    }

    /**
     * Gets the value of the vehicleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDescription(String value) {
        this.vehicleDescription = value;
    }

}
