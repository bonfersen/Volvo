
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDTMAlarmsForVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDTMAlarmsForVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_DTMGetDTMAlarmsForVehicleTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_DTMGetDTMAlarmsForVehicleTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDTMAlarmsForVehicle", propOrder = {
    "apiDTMGetDTMAlarmsForVehicleTO1"
})
public class GetDTMAlarmsForVehicle {

    @XmlElement(name = "Api_DTMGetDTMAlarmsForVehicleTO_1", required = true, nillable = true)
    protected ApiDTMGetDTMAlarmsForVehicleTO apiDTMGetDTMAlarmsForVehicleTO1;

    /**
     * Gets the value of the apiDTMGetDTMAlarmsForVehicleTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDTMGetDTMAlarmsForVehicleTO }
     *     
     */
    public ApiDTMGetDTMAlarmsForVehicleTO getApiDTMGetDTMAlarmsForVehicleTO1() {
        return apiDTMGetDTMAlarmsForVehicleTO1;
    }

    /**
     * Sets the value of the apiDTMGetDTMAlarmsForVehicleTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDTMGetDTMAlarmsForVehicleTO }
     *     
     */
    public void setApiDTMGetDTMAlarmsForVehicleTO1(ApiDTMGetDTMAlarmsForVehicleTO value) {
        this.apiDTMGetDTMAlarmsForVehicleTO1 = value;
    }

}
