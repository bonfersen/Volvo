
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_OrderStatusTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_OrderStatusTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderItemStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="vehicleStatus" type="{http://wirelesscar.com/dynafleet/api/types}Api_TrackingDataTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_OrderStatusTO", propOrder = {
    "orderItemStatus",
    "timestamp",
    "vehicleStatus"
})
public class ApiOrderStatusTO {

    @XmlElement(required = true, nillable = true)
    protected String orderItemStatus;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;
    @XmlElement(required = true, nillable = true)
    protected ApiTrackingDataTO vehicleStatus;

    /**
     * Gets the value of the orderItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemStatus() {
        return orderItemStatus;
    }

    /**
     * Sets the value of the orderItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemStatus(String value) {
        this.orderItemStatus = value;
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
     * Gets the value of the vehicleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTrackingDataTO }
     *     
     */
    public ApiTrackingDataTO getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Sets the value of the vehicleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTrackingDataTO }
     *     
     */
    public void setVehicleStatus(ApiTrackingDataTO value) {
        this.vehicleStatus = value;
    }

}
