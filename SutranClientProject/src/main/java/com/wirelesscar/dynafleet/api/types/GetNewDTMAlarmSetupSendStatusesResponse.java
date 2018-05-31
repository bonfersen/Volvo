
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNewDTMAlarmSetupSendStatusesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNewDTMAlarmSetupSendStatusesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://wirelesscar.com/dynafleet/api/types}Api_DTMAlarmSetupSendstatusArrayTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNewDTMAlarmSetupSendStatusesResponse", propOrder = {
    "result"
})
public class GetNewDTMAlarmSetupSendStatusesResponse {

    @XmlElement(required = true, nillable = true)
    protected ApiDTMAlarmSetupSendstatusArrayTO result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDTMAlarmSetupSendstatusArrayTO }
     *     
     */
    public ApiDTMAlarmSetupSendstatusArrayTO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDTMAlarmSetupSendstatusArrayTO }
     *     
     */
    public void setResult(ApiDTMAlarmSetupSendstatusArrayTO value) {
        this.result = value;
    }

}
