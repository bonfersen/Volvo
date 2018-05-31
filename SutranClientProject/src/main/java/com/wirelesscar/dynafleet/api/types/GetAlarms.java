
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlarms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAlarms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_AlarmGetAlarmsTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_AlarmGetAlarmsTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlarms", propOrder = {
    "apiAlarmGetAlarmsTO1"
})
public class GetAlarms {

    @XmlElement(name = "Api_AlarmGetAlarmsTO_1", required = true, nillable = true)
    protected ApiAlarmGetAlarmsTO apiAlarmGetAlarmsTO1;

    /**
     * Gets the value of the apiAlarmGetAlarmsTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiAlarmGetAlarmsTO }
     *     
     */
    public ApiAlarmGetAlarmsTO getApiAlarmGetAlarmsTO1() {
        return apiAlarmGetAlarmsTO1;
    }

    /**
     * Sets the value of the apiAlarmGetAlarmsTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiAlarmGetAlarmsTO }
     *     
     */
    public void setApiAlarmGetAlarmsTO1(ApiAlarmGetAlarmsTO value) {
        this.apiAlarmGetAlarmsTO1 = value;
    }

}
