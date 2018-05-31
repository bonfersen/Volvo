
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendFormMessageToVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendFormMessageToVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageSendFormMessageToVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageSendFormMessageToVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendFormMessageToVehicle", propOrder = {
    "apiFormMessageSendFormMessageToVehicleTO1"
})
public class SendFormMessageToVehicle {

    @XmlElement(name = "Api_FormMessageSendFormMessageToVehicleTO_1", required = true, nillable = true)
    protected ApiFormMessageSendFormMessageToVehicleTO apiFormMessageSendFormMessageToVehicleTO1;

    /**
     * Gets the value of the apiFormMessageSendFormMessageToVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageSendFormMessageToVehicleTO }
     *     
     */
    public ApiFormMessageSendFormMessageToVehicleTO getApiFormMessageSendFormMessageToVehicleTO1() {
        return apiFormMessageSendFormMessageToVehicleTO1;
    }

    /**
     * Sets the value of the apiFormMessageSendFormMessageToVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageSendFormMessageToVehicleTO }
     *     
     */
    public void setApiFormMessageSendFormMessageToVehicleTO1(ApiFormMessageSendFormMessageToVehicleTO value) {
        this.apiFormMessageSendFormMessageToVehicleTO1 = value;
    }

}
