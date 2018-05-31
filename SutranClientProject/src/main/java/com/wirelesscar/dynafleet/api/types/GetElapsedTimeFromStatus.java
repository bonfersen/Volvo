
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getElapsedTimeFromStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getElapsedTimeFromStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetElapsedTimeFromStatusTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetElapsedTimeFromStatusTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getElapsedTimeFromStatus", propOrder = {
    "apiOrderGetElapsedTimeFromStatusTO1"
})
public class GetElapsedTimeFromStatus {

    @XmlElement(name = "Api_OrderGetElapsedTimeFromStatusTO_1", required = true, nillable = true)
    protected ApiOrderGetElapsedTimeFromStatusTO apiOrderGetElapsedTimeFromStatusTO1;

    /**
     * Gets the value of the apiOrderGetElapsedTimeFromStatusTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetElapsedTimeFromStatusTO }
     *     
     */
    public ApiOrderGetElapsedTimeFromStatusTO getApiOrderGetElapsedTimeFromStatusTO1() {
        return apiOrderGetElapsedTimeFromStatusTO1;
    }

    /**
     * Sets the value of the apiOrderGetElapsedTimeFromStatusTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetElapsedTimeFromStatusTO }
     *     
     */
    public void setApiOrderGetElapsedTimeFromStatusTO1(ApiOrderGetElapsedTimeFromStatusTO value) {
        this.apiOrderGetElapsedTimeFromStatusTO1 = value;
    }

}
