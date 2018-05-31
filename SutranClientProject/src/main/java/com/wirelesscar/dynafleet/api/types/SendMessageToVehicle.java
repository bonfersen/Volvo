
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessageToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessageToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageSendMessageToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageSendMessageToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessageToVehicle", propOrder = {
    "apiMessageSendMessageToVehicleTO1"
})
public class SendMessageToVehicle {

    @XmlElement(name = "Api_MessageSendMessageToVehicleTO_1", required = true, nillable = true)
    protected ApiMessageSendMessageToVehicleTO apiMessageSendMessageToVehicleTO1;

    /**
     * Gets the value of the apiMessageSendMessageToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageSendMessageToVehicleTO }
     *     
     */
    public ApiMessageSendMessageToVehicleTO getApiMessageSendMessageToVehicleTO1() {
        return apiMessageSendMessageToVehicleTO1;
    }

    /**
     * Sets the value of the apiMessageSendMessageToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageSendMessageToVehicleTO }
     *     
     */
    public void setApiMessageSendMessageToVehicleTO1(ApiMessageSendMessageToVehicleTO value) {
        this.apiMessageSendMessageToVehicleTO1 = value;
    }

}
