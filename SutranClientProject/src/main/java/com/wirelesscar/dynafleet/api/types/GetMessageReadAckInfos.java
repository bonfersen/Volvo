
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMessageReadAckInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMessageReadAckInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_MessageGetReadAckInfosTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageGetReadAckInfosTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessageReadAckInfos", propOrder = {
    "apiMessageGetReadAckInfosTO1"
})
public class GetMessageReadAckInfos {

    @XmlElement(name = "Api_MessageGetReadAckInfosTO_1", required = true, nillable = true)
    protected ApiMessageGetReadAckInfosTO apiMessageGetReadAckInfosTO1;

    /**
     * Gets the value of the apiMessageGetReadAckInfosTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageGetReadAckInfosTO }
     *     
     */
    public ApiMessageGetReadAckInfosTO getApiMessageGetReadAckInfosTO1() {
        return apiMessageGetReadAckInfosTO1;
    }

    /**
     * Sets the value of the apiMessageGetReadAckInfosTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageGetReadAckInfosTO }
     *     
     */
    public void setApiMessageGetReadAckInfosTO1(ApiMessageGetReadAckInfosTO value) {
        this.apiMessageGetReadAckInfosTO1 = value;
    }

}
