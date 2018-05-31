
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_PoiGetPoisByTypeAndBoundingBoxTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_PoiGetPoisByTypeAndBoundingBoxTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude1" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="latitude2" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="longitude1" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="longitude2" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="poiType" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_PoiGetPoisByTypeAndBoundingBoxTO", propOrder = {
    "latitude1",
    "latitude2",
    "longitude1",
    "longitude2",
    "poiType",
    "sessionId"
})
public class ApiPoiGetPoisByTypeAndBoundingBoxTO {

    @XmlElement(required = true)
    protected ApiDouble latitude1;
    @XmlElement(required = true)
    protected ApiDouble latitude2;
    @XmlElement(required = true)
    protected ApiDouble longitude1;
    @XmlElement(required = true)
    protected ApiDouble longitude2;
    @XmlElement(required = true)
    protected ApiLong poiType;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the latitude1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLatitude1() {
        return latitude1;
    }

    /**
     * Sets the value of the latitude1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLatitude1(ApiDouble value) {
        this.latitude1 = value;
    }

    /**
     * Gets the value of the latitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLatitude2() {
        return latitude2;
    }

    /**
     * Sets the value of the latitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLatitude2(ApiDouble value) {
        this.latitude2 = value;
    }

    /**
     * Gets the value of the longitude1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLongitude1() {
        return longitude1;
    }

    /**
     * Sets the value of the longitude1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLongitude1(ApiDouble value) {
        this.longitude1 = value;
    }

    /**
     * Gets the value of the longitude2 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLongitude2() {
        return longitude2;
    }

    /**
     * Sets the value of the longitude2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLongitude2(ApiDouble value) {
        this.longitude2 = value;
    }

    /**
     * Gets the value of the poiType property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getPoiType() {
        return poiType;
    }

    /**
     * Sets the value of the poiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setPoiType(ApiLong value) {
        this.poiType = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSessionId }
     *     
     */
    public ApiSessionId getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSessionId }
     *     
     */
    public void setSessionId(ApiSessionId value) {
        this.sessionId = value;
    }

}
