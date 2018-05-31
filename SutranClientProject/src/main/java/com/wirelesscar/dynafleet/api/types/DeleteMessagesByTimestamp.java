
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMessagesByTimestamp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteMessagesByTimestamp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageDeleteMessagesByTimestampTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageDeleteMessagesByTimestampTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMessagesByTimestamp", propOrder = {
    "apiMessageDeleteMessagesByTimestampTO1"
})
public class DeleteMessagesByTimestamp {

    @XmlElement(name = "Api_MessageDeleteMessagesByTimestampTO_1", required = true, nillable = true)
    protected ApiMessageDeleteMessagesByTimestampTO apiMessageDeleteMessagesByTimestampTO1;

    /**
     * Gets the value of the apiMessageDeleteMessagesByTimestampTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageDeleteMessagesByTimestampTO }
     *     
     */
    public ApiMessageDeleteMessagesByTimestampTO getApiMessageDeleteMessagesByTimestampTO1() {
        return apiMessageDeleteMessagesByTimestampTO1;
    }

    /**
     * Sets the value of the apiMessageDeleteMessagesByTimestampTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageDeleteMessagesByTimestampTO }
     *     
     */
    public void setApiMessageDeleteMessagesByTimestampTO1(ApiMessageDeleteMessagesByTimestampTO value) {
        this.apiMessageDeleteMessagesByTimestampTO1 = value;
    }

}
