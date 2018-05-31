
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markOrderAsRead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markOrderAsRead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_OrderMarkOrderAsReadTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderMarkOrderAsReadTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markOrderAsRead", propOrder = {
    "apiOrderMarkOrderAsReadTO1"
})
public class MarkOrderAsRead {

    @XmlElement(name = "Api_OrderMarkOrderAsReadTO_1", required = true, nillable = true)
    protected ApiOrderMarkOrderAsReadTO apiOrderMarkOrderAsReadTO1;

    /**
     * Gets the value of the apiOrderMarkOrderAsReadTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderMarkOrderAsReadTO }
     *     
     */
    public ApiOrderMarkOrderAsReadTO getApiOrderMarkOrderAsReadTO1() {
        return apiOrderMarkOrderAsReadTO1;
    }

    /**
     * Sets the value of the apiOrderMarkOrderAsReadTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderMarkOrderAsReadTO }
     *     
     */
    public void setApiOrderMarkOrderAsReadTO1(ApiOrderMarkOrderAsReadTO value) {
        this.apiOrderMarkOrderAsReadTO1 = value;
    }

}
