
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCoveredDistanceFromStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCoveredDistanceFromStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetCoveredDistanceFromStatusTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetCoveredDistanceFromStatusTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCoveredDistanceFromStatus", propOrder = {
    "apiOrderGetCoveredDistanceFromStatusTO1"
})
public class GetCoveredDistanceFromStatus {

    @XmlElement(name = "Api_OrderGetCoveredDistanceFromStatusTO_1", required = true, nillable = true)
    protected ApiOrderGetCoveredDistanceFromStatusTO apiOrderGetCoveredDistanceFromStatusTO1;

    /**
     * Gets the value of the apiOrderGetCoveredDistanceFromStatusTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetCoveredDistanceFromStatusTO }
     *     
     */
    public ApiOrderGetCoveredDistanceFromStatusTO getApiOrderGetCoveredDistanceFromStatusTO1() {
        return apiOrderGetCoveredDistanceFromStatusTO1;
    }

    /**
     * Sets the value of the apiOrderGetCoveredDistanceFromStatusTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetCoveredDistanceFromStatusTO }
     *     
     */
    public void setApiOrderGetCoveredDistanceFromStatusTO1(ApiOrderGetCoveredDistanceFromStatusTO value) {
        this.apiOrderGetCoveredDistanceFromStatusTO1 = value;
    }

}
