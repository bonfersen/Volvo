
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageDeleteMessageTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageDeleteMessageTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMessage", propOrder = {
    "apiMessageDeleteMessageTO1"
})
public class DeleteMessage {

    @XmlElement(name = "Api_MessageDeleteMessageTO_1", required = true, nillable = true)
    protected ApiMessageDeleteMessageTO apiMessageDeleteMessageTO1;

    /**
     * Gets the value of the apiMessageDeleteMessageTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageDeleteMessageTO }
     *     
     */
    public ApiMessageDeleteMessageTO getApiMessageDeleteMessageTO1() {
        return apiMessageDeleteMessageTO1;
    }

    /**
     * Sets the value of the apiMessageDeleteMessageTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageDeleteMessageTO }
     *     
     */
    public void setApiMessageDeleteMessageTO1(ApiMessageDeleteMessageTO value) {
        this.apiMessageDeleteMessageTO1 = value;
    }

}
