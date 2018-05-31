
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormMessageReadAckInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFormMessageReadAckInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_FormMessageGetReadAckInfosTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageGetReadAckInfosTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormMessageReadAckInfos", propOrder = {
    "apiFormMessageGetReadAckInfosTO1"
})
public class GetFormMessageReadAckInfos {

    @XmlElement(name = "Api_FormMessageGetReadAckInfosTO_1", required = true, nillable = true)
    protected ApiFormMessageGetReadAckInfosTO apiFormMessageGetReadAckInfosTO1;

    /**
     * Gets the value of the apiFormMessageGetReadAckInfosTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormMessageGetReadAckInfosTO }
     *     
     */
    public ApiFormMessageGetReadAckInfosTO getApiFormMessageGetReadAckInfosTO1() {
        return apiFormMessageGetReadAckInfosTO1;
    }

    /**
     * Sets the value of the apiFormMessageGetReadAckInfosTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormMessageGetReadAckInfosTO }
     *     
     */
    public void setApiFormMessageGetReadAckInfosTO1(ApiFormMessageGetReadAckInfosTO value) {
        this.apiFormMessageGetReadAckInfosTO1 = value;
    }

}
