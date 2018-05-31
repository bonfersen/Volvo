
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofenceTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofenceTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geofenceId" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceId"/>
 *         &lt;element name="geofenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geofenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofenceTO", propOrder = {
    "geofenceId",
    "geofenceName",
    "geofenceType",
    "serviceType"
})
public class ApiGeofenceTO {

    @XmlElement(required = true)
    protected ApiGeofenceId geofenceId;
    @XmlElement(required = true)
    protected String geofenceName;
    @XmlElement(required = true)
    protected String geofenceType;
    @XmlElement(required = true)
    protected String serviceType;

    /**
     * Gets the value of the geofenceId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceId }
     *     
     */
    public ApiGeofenceId getGeofenceId() {
        return geofenceId;
    }

    /**
     * Sets the value of the geofenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceId }
     *     
     */
    public void setGeofenceId(ApiGeofenceId value) {
        this.geofenceId = value;
    }

    /**
     * Gets the value of the geofenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeofenceName() {
        return geofenceName;
    }

    /**
     * Sets the value of the geofenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeofenceName(String value) {
        this.geofenceName = value;
    }

    /**
     * Gets the value of the geofenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeofenceType() {
        return geofenceType;
    }

    /**
     * Sets the value of the geofenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeofenceType(String value) {
        this.geofenceType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
