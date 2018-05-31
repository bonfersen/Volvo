
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDTMAlarmSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDTMAlarmSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_DTMGetDTMAlarmSettingTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_DTMGetDTMAlarmSettingTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDTMAlarmSetting", propOrder = {
    "apiDTMGetDTMAlarmSettingTO1"
})
public class GetDTMAlarmSetting {

    @XmlElement(name = "Api_DTMGetDTMAlarmSettingTO_1", required = true, nillable = true)
    protected ApiDTMGetDTMAlarmSettingTO apiDTMGetDTMAlarmSettingTO1;

    /**
     * Gets the value of the apiDTMGetDTMAlarmSettingTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDTMGetDTMAlarmSettingTO }
     *     
     */
    public ApiDTMGetDTMAlarmSettingTO getApiDTMGetDTMAlarmSettingTO1() {
        return apiDTMGetDTMAlarmSettingTO1;
    }

    /**
     * Sets the value of the apiDTMGetDTMAlarmSettingTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDTMGetDTMAlarmSettingTO }
     *     
     */
    public void setApiDTMGetDTMAlarmSettingTO1(ApiDTMGetDTMAlarmSettingTO value) {
        this.apiDTMGetDTMAlarmSettingTO1 = value;
    }

}
