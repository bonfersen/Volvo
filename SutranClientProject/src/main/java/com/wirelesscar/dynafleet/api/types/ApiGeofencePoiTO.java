
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofencePoiTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofencePoiTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poiId" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiId"/>
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
@XmlType(name = "Api_GeofencePoiTO", propOrder = {
    "poiId",
    "radius"
})
public class ApiGeofencePoiTO {

    @XmlElement(required = true)
    protected ApiPoiId poiId;
    @XmlElement(required = true)
    protected ApiDouble radius;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiId }
     *     
     */
    public ApiPoiId getPoiId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiId }
     *     
     */
    public void setPoiId(ApiPoiId value) {
        this.poiId = value;
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
