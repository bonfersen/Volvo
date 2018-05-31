
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVehicleEventMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVehicleEventMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageGetVehicleEventMessages_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageGetVehicleEventMessagesTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleEventMessages", propOrder = {
    "apiMessageGetVehicleEventMessages1"
})
public class GetVehicleEventMessages {

    @XmlElement(name = "Api_MessageGetVehicleEventMessages_1", required = true, nillable = true)
    protected ApiMessageGetVehicleEventMessagesTO apiMessageGetVehicleEventMessages1;

    /**
     * Gets the value of the apiMessageGetVehicleEventMessages1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageGetVehicleEventMessagesTO }
     *     
     */
    public ApiMessageGetVehicleEventMessagesTO getApiMessageGetVehicleEventMessages1() {
        return apiMessageGetVehicleEventMessages1;
    }

    /**
     * Sets the value of the apiMessageGetVehicleEventMessages1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageGetVehicleEventMessagesTO }
     *     
     */
    public void setApiMessageGetVehicleEventMessages1(ApiMessageGetVehicleEventMessagesTO value) {
        this.apiMessageGetVehicleEventMessages1 = value;
    }

}
