
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLastKnownPositionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLastKnownPositionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastKnownPositions" type="{http://wirelesscar.com/dynafleet/api/types}Api_LastKnownPositionArrayTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLastKnownPositionsResponse", propOrder = {
    "lastKnownPositions"
})
public class GetLastKnownPositionsResponse {

    @XmlElement(required = true, nillable = true)
    protected ApiLastKnownPositionArrayTO lastKnownPositions;

    /**
     * Gets the value of the lastKnownPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLastKnownPositionArrayTO }
     *     
     */
    public ApiLastKnownPositionArrayTO getLastKnownPositions() {
        return lastKnownPositions;
    }

    /**
     * Sets the value of the lastKnownPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLastKnownPositionArrayTO }
     *     
     */
    public void setLastKnownPositions(ApiLastKnownPositionArrayTO value) {
        this.lastKnownPositions = value;
    }

}
