
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeDTMAlarmSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeDTMAlarmSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_DTMStoreDTMAlarmSettingTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_DTMStoreDTMAlarmSettingTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeDTMAlarmSetting", propOrder = {
    "apiDTMStoreDTMAlarmSettingTO1"
})
public class StoreDTMAlarmSetting {

    @XmlElement(name = "Api_DTMStoreDTMAlarmSettingTO_1", required = true, nillable = true)
    protected ApiDTMStoreDTMAlarmSettingTO apiDTMStoreDTMAlarmSettingTO1;

    /**
     * Gets the value of the apiDTMStoreDTMAlarmSettingTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDTMStoreDTMAlarmSettingTO }
     *     
     */
    public ApiDTMStoreDTMAlarmSettingTO getApiDTMStoreDTMAlarmSettingTO1() {
        return apiDTMStoreDTMAlarmSettingTO1;
    }

    /**
     * Sets the value of the apiDTMStoreDTMAlarmSettingTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDTMStoreDTMAlarmSettingTO }
     *     
     */
    public void setApiDTMStoreDTMAlarmSettingTO1(ApiDTMStoreDTMAlarmSettingTO value) {
        this.apiDTMStoreDTMAlarmSettingTO1 = value;
    }

}
