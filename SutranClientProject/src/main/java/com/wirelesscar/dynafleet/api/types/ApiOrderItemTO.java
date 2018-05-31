
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_OrderItemTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_OrderItemTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="completionTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="createTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="deletedTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="lastModifyTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="lastSendStatusTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="orderFormFields" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderFormFieldTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderItemNumber" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="orderItemStatusList" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderStatusTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plannedFrom" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="plannedTo" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="poiId" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiId"/>
 *         &lt;element name="sendStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_OrderItemTO", propOrder = {
    "activityType",
    "completionTime",
    "createTime",
    "deletedTime",
    "lastModifyTime",
    "lastSendStatusTime",
    "orderFormFields",
    "orderItemNumber",
    "orderItemStatusList",
    "orderNumber",
    "plannedFrom",
    "plannedTo",
    "poiId",
    "sendStatus",
    "templateId"
})
public class ApiOrderItemTO {

    @XmlElement(required = true)
    protected String activityType;
    @XmlElement(required = true, nillable = true)
    protected ApiDate completionTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate createTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate deletedTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate lastModifyTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate lastSendStatusTime;
    protected List<ApiOrderFormFieldTO> orderFormFields;
    @XmlElement(required = true, nillable = true)
    protected ApiLong orderItemNumber;
    @XmlElement(nillable = true)
    protected List<ApiOrderStatusTO> orderItemStatusList;
    @XmlElement(required = true, nillable = true)
    protected String orderNumber;
    @XmlElement(required = true)
    protected ApiDate plannedFrom;
    @XmlElement(required = true)
    protected ApiDate plannedTo;
    @XmlElement(required = true)
    protected ApiPoiId poiId;
    @XmlElement(required = true, nillable = true)
    protected String sendStatus;
    @XmlElement(required = true)
    protected ApiLong templateId;

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setCompletionTime(ApiDate value) {
        this.completionTime = value;
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
     * Gets the value of the lastSendStatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getLastSendStatusTime() {
        return lastSendStatusTime;
    }

    /**
     * Sets the value of the lastSendStatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setLastSendStatusTime(ApiDate value) {
        this.lastSendStatusTime = value;
    }

    /**
     * Gets the value of the orderFormFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderFormFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderFormFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiOrderFormFieldTO }
     * 
     * 
     */
    public List<ApiOrderFormFieldTO> getOrderFormFields() {
        if (orderFormFields == null) {
            orderFormFields = new ArrayList<ApiOrderFormFieldTO>();
        }
        return this.orderFormFields;
    }

    /**
     * Gets the value of the orderItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getOrderItemNumber() {
        return orderItemNumber;
    }

    /**
     * Sets the value of the orderItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setOrderItemNumber(ApiLong value) {
        this.orderItemNumber = value;
    }

    /**
     * Gets the value of the orderItemStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiOrderStatusTO }
     * 
     * 
     */
    public List<ApiOrderStatusTO> getOrderItemStatusList() {
        if (orderItemStatusList == null) {
            orderItemStatusList = new ArrayList<ApiOrderStatusTO>();
        }
        return this.orderItemStatusList;
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
     * Gets the value of the plannedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getPlannedFrom() {
        return plannedFrom;
    }

    /**
     * Sets the value of the plannedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setPlannedFrom(ApiDate value) {
        this.plannedFrom = value;
    }

    /**
     * Gets the value of the plannedTo property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getPlannedTo() {
        return plannedTo;
    }

    /**
     * Sets the value of the plannedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setPlannedTo(ApiDate value) {
        this.plannedTo = value;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiId }
     *     
     */
    public ApiPoiId getPoiId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiId }
     *     
     */
    public void setPoiId(ApiPoiId value) {
        this.poiId = value;
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
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTemplateId(ApiLong value) {
        this.templateId = value;
    }

}
