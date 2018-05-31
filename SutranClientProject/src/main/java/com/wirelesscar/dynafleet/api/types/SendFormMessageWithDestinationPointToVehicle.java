
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendFormMessageWithDestinationPointToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendFormMessageWithDestinationPointToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendFormMessageWithDestinationPointToVehicle", propOrder = {
    "apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1"
})
public class SendFormMessageWithDestinationPointToVehicle {

    @XmlElement(name = "Api_FormMessageSendFormMessageWithDestinationPointToVehicleTO_1", required = true, nillable = true)
    protected ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1;

    /**
     * Gets the value of the apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO }
     *     
     */
    public ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO getApiFormMessageSendFormMessageWithDestinationPointToVehicleTO1() {
        return apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1;
    }

    /**
     * Sets the value of the apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO }
     *     
     */
    public void setApiFormMessageSendFormMessageWithDestinationPointToVehicleTO1(ApiFormMessageSendFormMessageWithDestinationPointToVehicleTO value) {
        this.apiFormMessageSendFormMessageWithDestinationPointToVehicleTO1 = value;
    }

}
