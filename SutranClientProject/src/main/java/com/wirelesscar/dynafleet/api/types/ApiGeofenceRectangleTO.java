
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofenceRectangleTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofenceRectangleTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cornerNE" type="{http://wirelesscar.com/dynafleet/api/types}Api_PointTO"/>
 *         &lt;element name="cornerSW" type="{http://wirelesscar.com/dynafleet/api/types}Api_PointTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofenceRectangleTO", propOrder = {
    "cornerNE",
    "cornerSW"
})
public class ApiGeofenceRectangleTO {

    @XmlElement(required = true)
    protected ApiPointTO cornerNE;
    @XmlElement(required = true)
    protected ApiPointTO cornerSW;

    /**
     * Gets the value of the cornerNE property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPointTO }
     *     
     */
    public ApiPointTO getCornerNE() {
        return cornerNE;
    }

    /**
     * Sets the value of the cornerNE property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPointTO }
     *     
     */
    public void setCornerNE(ApiPointTO value) {
        this.cornerNE = value;
    }

    /**
     * Gets the value of the cornerSW property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPointTO }
     *     
     */
    public ApiPointTO getCornerSW() {
        return cornerSW;
    }

    /**
     * Sets the value of the cornerSW property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPointTO }
     *     
     */
    public void setCornerSW(ApiPointTO value) {
        this.cornerSW = value;
    }

}
