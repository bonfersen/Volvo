
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFuelConsumptionFromStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFuelConsumptionFromStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderGetFuelConsumptionFromStatusTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderGetFuelConsumptionFromStatusTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFuelConsumptionFromStatus", propOrder = {
    "apiOrderGetFuelConsumptionFromStatusTO1"
})
public class GetFuelConsumptionFromStatus {

    @XmlElement(name = "Api_OrderGetFuelConsumptionFromStatusTO_1", required = true, nillable = true)
    protected ApiOrderGetFuelConsumptionFromStatusTO apiOrderGetFuelConsumptionFromStatusTO1;

    /**
     * Gets the value of the apiOrderGetFuelConsumptionFromStatusTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderGetFuelConsumptionFromStatusTO }
     *     
     */
    public ApiOrderGetFuelConsumptionFromStatusTO getApiOrderGetFuelConsumptionFromStatusTO1() {
        return apiOrderGetFuelConsumptionFromStatusTO1;
    }

    /**
     * Sets the value of the apiOrderGetFuelConsumptionFromStatusTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderGetFuelConsumptionFromStatusTO }
     *     
     */
    public void setApiOrderGetFuelConsumptionFromStatusTO1(ApiOrderGetFuelConsumptionFromStatusTO value) {
        this.apiOrderGetFuelConsumptionFromStatusTO1 = value;
    }

}
