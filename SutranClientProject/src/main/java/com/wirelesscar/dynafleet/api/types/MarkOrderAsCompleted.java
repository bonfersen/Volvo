
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markOrderAsCompleted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markOrderAsCompleted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderMarkOrderAsCompletedTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderMarkOrderAsCompletedTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markOrderAsCompleted", propOrder = {
    "apiOrderMarkOrderAsCompletedTO1"
})
public class MarkOrderAsCompleted {

    @XmlElement(name = "Api_OrderMarkOrderAsCompletedTO_1", required = true, nillable = true)
    protected ApiOrderMarkOrderAsCompletedTO apiOrderMarkOrderAsCompletedTO1;

    /**
     * Gets the value of the apiOrderMarkOrderAsCompletedTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderMarkOrderAsCompletedTO }
     *     
     */
    public ApiOrderMarkOrderAsCompletedTO getApiOrderMarkOrderAsCompletedTO1() {
        return apiOrderMarkOrderAsCompletedTO1;
    }

    /**
     * Sets the value of the apiOrderMarkOrderAsCompletedTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderMarkOrderAsCompletedTO }
     *     
     */
    public void setApiOrderMarkOrderAsCompletedTO1(ApiOrderMarkOrderAsCompletedTO value) {
        this.apiOrderMarkOrderAsCompletedTO1 = value;
    }

}
