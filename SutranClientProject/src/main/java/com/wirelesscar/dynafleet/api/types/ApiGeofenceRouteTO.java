
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofenceRouteTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofenceRouteTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviation" type="{http://wirelesscar.com/dynafleet/api/types}Api_Integer"/>
 *         &lt;element name="waypoints" type="{http://wirelesscar.com/dynafleet/api/types}Api_PointTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofenceRouteTO", propOrder = {
    "deviation",
    "waypoints"
})
public class ApiGeofenceRouteTO {

    @XmlElement(required = true)
    protected ApiInteger deviation;
    protected List<ApiPointTO> waypoints;

    /**
     * Gets the value of the deviation property.
     * 
     * @return
     *     possible object is
     *     {@link ApiInteger }
     *     
     */
    public ApiInteger getDeviation() {
        return deviation;
    }

    /**
     * Sets the value of the deviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiInteger }
     *     
     */
    public void setDeviation(ApiInteger value) {
        this.deviation = value;
    }

    /**
     * Gets the value of the waypoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waypoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaypoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiPointTO }
     * 
     * 
     */
    public List<ApiPointTO> getWaypoints() {
        if (waypoints == null) {
            waypoints = new ArrayList<ApiPointTO>();
        }
        return this.waypoints;
    }

}
