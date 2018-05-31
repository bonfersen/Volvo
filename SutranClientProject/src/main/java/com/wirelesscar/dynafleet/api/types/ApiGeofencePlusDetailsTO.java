
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofencePlusDetailsTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofencePlusDetailsTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeInformation" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceActiveInformationTO"/>
 *         &lt;element name="assignedVehicles" type="{http://wirelesscar.com/dynafleet/api/types}Api_LongArrayTO"/>
 *         &lt;element name="border" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceBorderTO"/>
 *         &lt;element name="circle" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceCircleTO"/>
 *         &lt;element name="enteringMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geofenceId" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceId"/>
 *         &lt;element name="geofenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geofenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leavingMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poi" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofencePoiTO"/>
 *         &lt;element name="polygon" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofencePolygonTO"/>
 *         &lt;element name="rectangle" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceRectangleTO"/>
 *         &lt;element name="route" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofenceRouteTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofencePlusDetailsTO", propOrder = {
    "activeInformation",
    "assignedVehicles",
    "border",
    "circle",
    "enteringMessage",
    "geofenceId",
    "geofenceName",
    "geofenceType",
    "leavingMessage",
    "poi",
    "polygon",
    "rectangle",
    "route"
})
public class ApiGeofencePlusDetailsTO {

    @XmlElement(required = true)
    protected ApiGeofenceActiveInformationTO activeInformation;
    @XmlElement(required = true, nillable = true)
    protected ApiLongArrayTO assignedVehicles;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofenceBorderTO border;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofenceCircleTO circle;
    @XmlElement(required = true, nillable = true)
    protected String enteringMessage;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofenceId geofenceId;
    @XmlElement(required = true)
    protected String geofenceName;
    @XmlElement(required = true)
    protected String geofenceType;
    @XmlElement(required = true, nillable = true)
    protected String leavingMessage;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofencePoiTO poi;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofencePolygonTO polygon;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofenceRectangleTO rectangle;
    @XmlElement(required = true, nillable = true)
    protected ApiGeofenceRouteTO route;

    /**
     * Gets the value of the activeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceActiveInformationTO }
     *     
     */
    public ApiGeofenceActiveInformationTO getActiveInformation() {
        return activeInformation;
    }

    /**
     * Sets the value of the activeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceActiveInformationTO }
     *     
     */
    public void setActiveInformation(ApiGeofenceActiveInformationTO value) {
        this.activeInformation = value;
    }

    /**
     * Gets the value of the assignedVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLongArrayTO }
     *     
     */
    public ApiLongArrayTO getAssignedVehicles() {
        return assignedVehicles;
    }

    /**
     * Sets the value of the assignedVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLongArrayTO }
     *     
     */
    public void setAssignedVehicles(ApiLongArrayTO value) {
        this.assignedVehicles = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceBorderTO }
     *     
     */
    public ApiGeofenceBorderTO getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceBorderTO }
     *     
     */
    public void setBorder(ApiGeofenceBorderTO value) {
        this.border = value;
    }

    /**
     * Gets the value of the circle property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceCircleTO }
     *     
     */
    public ApiGeofenceCircleTO getCircle() {
        return circle;
    }

    /**
     * Sets the value of the circle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceCircleTO }
     *     
     */
    public void setCircle(ApiGeofenceCircleTO value) {
        this.circle = value;
    }

    /**
     * Gets the value of the enteringMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnteringMessage() {
        return enteringMessage;
    }

    /**
     * Sets the value of the enteringMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnteringMessage(String value) {
        this.enteringMessage = value;
    }

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
     * Gets the value of the leavingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeavingMessage() {
        return leavingMessage;
    }

    /**
     * Sets the value of the leavingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeavingMessage(String value) {
        this.leavingMessage = value;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofencePoiTO }
     *     
     */
    public ApiGeofencePoiTO getPoi() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofencePoiTO }
     *     
     */
    public void setPoi(ApiGeofencePoiTO value) {
        this.poi = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofencePolygonTO }
     *     
     */
    public ApiGeofencePolygonTO getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofencePolygonTO }
     *     
     */
    public void setPolygon(ApiGeofencePolygonTO value) {
        this.polygon = value;
    }

    /**
     * Gets the value of the rectangle property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceRectangleTO }
     *     
     */
    public ApiGeofenceRectangleTO getRectangle() {
        return rectangle;
    }

    /**
     * Sets the value of the rectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceRectangleTO }
     *     
     */
    public void setRectangle(ApiGeofenceRectangleTO value) {
        this.rectangle = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofenceRouteTO }
     *     
     */
    public ApiGeofenceRouteTO getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofenceRouteTO }
     *     
     */
    public void setRoute(ApiGeofenceRouteTO value) {
        this.route = value;
    }

}
