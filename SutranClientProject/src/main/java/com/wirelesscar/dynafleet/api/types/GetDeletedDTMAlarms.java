
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeletedDTMAlarms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeletedDTMAlarms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_SessionId_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeletedDTMAlarms", propOrder = {
    "apiSessionId1"
})
public class GetDeletedDTMAlarms {

    @XmlElement(name = "Api_SessionId_1", required = true, nillable = true)
    protected ApiSessionId apiSessionId1;

    /**
     * Gets the value of the apiSessionId1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSessionId }
     *     
     */
    public ApiSessionId getApiSessionId1() {
        return apiSessionId1;
    }

    /**
     * Sets the value of the apiSessionId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSessionId }
     *     
     */
    public void setApiSessionId1(ApiSessionId value) {
        this.apiSessionId1 = value;
    }

}
