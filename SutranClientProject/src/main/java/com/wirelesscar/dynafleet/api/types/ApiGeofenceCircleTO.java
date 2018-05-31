
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofenceCircleTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofenceCircleTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centerPoint" type="{http://wirelesscar.com/dynafleet/api/types}Api_PointTO"/>
 *         &lt;element name="radius" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofenceCircleTO", propOrder = {
    "centerPoint",
    "radius"
})
public class ApiGeofenceCircleTO {

    @XmlElement(required = true)
    protected ApiPointTO centerPoint;
    @XmlElement(required = true)
    protected ApiDouble radius;

    /**
     * Gets the value of the centerPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPointTO }
     *     
     */
    public ApiPointTO getCenterPoint() {
        return centerPoint;
    }

    /**
     * Sets the value of the centerPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPointTO }
     *     
     */
    public void setCenterPoint(ApiPointTO value) {
        this.centerPoint = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setRadius(ApiDouble value) {
        this.radius = value;
    }

}
