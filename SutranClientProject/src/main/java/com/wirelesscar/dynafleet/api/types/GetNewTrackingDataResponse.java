
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNewTrackingDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNewTrackingDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://wirelesscar.com/dynafleet/api/types}Api_TrackingDataArrayTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNewTrackingDataResponse", propOrder = {
    "result"
})
public class GetNewTrackingDataResponse {

    @XmlElement(required = true, nillable = true)
    protected ApiTrackingDataArrayTO result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTrackingDataArrayTO }
     *     
     */
    public ApiTrackingDataArrayTO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTrackingDataArrayTO }
     *     
     */
    public void setResult(ApiTrackingDataArrayTO value) {
        this.result = value;
    }

}
