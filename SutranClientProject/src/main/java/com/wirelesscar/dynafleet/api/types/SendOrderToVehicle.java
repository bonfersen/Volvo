
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendOrderToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendOrderToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderSendOrderToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderSendOrderToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendOrderToVehicle", propOrder = {
    "apiOrderSendOrderToVehicleTO1"
})
public class SendOrderToVehicle {

    @XmlElement(name = "Api_OrderSendOrderToVehicleTO_1", required = true, nillable = true)
    protected ApiOrderSendOrderToVehicleTO apiOrderSendOrderToVehicleTO1;

    /**
     * Gets the value of the apiOrderSendOrderToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderSendOrderToVehicleTO }
     *     
     */
    public ApiOrderSendOrderToVehicleTO getApiOrderSendOrderToVehicleTO1() {
        return apiOrderSendOrderToVehicleTO1;
    }

    /**
     * Sets the value of the apiOrderSendOrderToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderSendOrderToVehicleTO }
     *     
     */
    public void setApiOrderSendOrderToVehicleTO1(ApiOrderSendOrderToVehicleTO value) {
        this.apiOrderSendOrderToVehicleTO1 = value;
    }

}
