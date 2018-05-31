
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAutoDeleteMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAutoDeleteMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageSetAutoDeleteMessageTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageSetAutoDeleteMessageTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAutoDeleteMessage", propOrder = {
    "apiMessageSetAutoDeleteMessageTO1"
})
public class SetAutoDeleteMessage {

    @XmlElement(name = "Api_MessageSetAutoDeleteMessageTO_1", required = true, nillable = true)
    protected ApiMessageSetAutoDeleteMessageTO apiMessageSetAutoDeleteMessageTO1;

    /**
     * Gets the value of the apiMessageSetAutoDeleteMessageTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageSetAutoDeleteMessageTO }
     *     
     */
    public ApiMessageSetAutoDeleteMessageTO getApiMessageSetAutoDeleteMessageTO1() {
        return apiMessageSetAutoDeleteMessageTO1;
    }

    /**
     * Sets the value of the apiMessageSetAutoDeleteMessageTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageSetAutoDeleteMessageTO }
     *     
     */
    public void setApiMessageSetAutoDeleteMessageTO1(ApiMessageSetAutoDeleteMessageTO value) {
        this.apiMessageSetAutoDeleteMessageTO1 = value;
    }

}
