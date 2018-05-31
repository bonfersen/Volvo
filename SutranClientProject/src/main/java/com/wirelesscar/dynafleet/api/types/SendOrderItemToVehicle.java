
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendOrderItemToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendOrderItemToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderSendOrderItemToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderSendOrderItemToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendOrderItemToVehicle", propOrder = {
    "apiOrderSendOrderItemToVehicleTO1"
})
public class SendOrderItemToVehicle {

    @XmlElement(name = "Api_OrderSendOrderItemToVehicleTO_1", required = true, nillable = true)
    protected ApiOrderSendOrderItemToVehicleTO apiOrderSendOrderItemToVehicleTO1;

    /**
     * Gets the value of the apiOrderSendOrderItemToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderSendOrderItemToVehicleTO }
     *     
     */
    public ApiOrderSendOrderItemToVehicleTO getApiOrderSendOrderItemToVehicleTO1() {
        return apiOrderSendOrderItemToVehicleTO1;
    }

    /**
     * Sets the value of the apiOrderSendOrderItemToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderSendOrderItemToVehicleTO }
     *     
     */
    public void setApiOrderSendOrderItemToVehicleTO1(ApiOrderSendOrderItemToVehicleTO value) {
        this.apiOrderSendOrderItemToVehicleTO1 = value;
    }

}
