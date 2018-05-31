
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessageWithDestinationPointToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessageWithDestinationPointToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageSendMessageWithDestinationPointToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageSendMessageWithDestinationPointToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessageWithDestinationPointToVehicle", propOrder = {
    "apiMessageSendMessageWithDestinationPointToVehicleTO1"
})
public class SendMessageWithDestinationPointToVehicle {

    @XmlElement(name = "Api_MessageSendMessageWithDestinationPointToVehicleTO_1", required = true, nillable = true)
    protected ApiMessageSendMessageWithDestinationPointToVehicleTO apiMessageSendMessageWithDestinationPointToVehicleTO1;

    /**
     * Gets the value of the apiMessageSendMessageWithDestinationPointToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageSendMessageWithDestinationPointToVehicleTO }
     *     
     */
    public ApiMessageSendMessageWithDestinationPointToVehicleTO getApiMessageSendMessageWithDestinationPointToVehicleTO1() {
        return apiMessageSendMessageWithDestinationPointToVehicleTO1;
    }

    /**
     * Sets the value of the apiMessageSendMessageWithDestinationPointToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageSendMessageWithDestinationPointToVehicleTO }
     *     
     */
    public void setApiMessageSendMessageWithDestinationPointToVehicleTO1(ApiMessageSendMessageWithDestinationPointToVehicleTO value) {
        this.apiMessageSendMessageWithDestinationPointToVehicleTO1 = value;
    }

}
