
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DtjDataEntryTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DtjDataEntryTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtjActivityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="startTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_DtjDataEntryTO", propOrder = {
    "dtjActivityType",
    "endTime",
    "startTime",
    "vehicleId"
})
public class ApiDtjDataEntryTO {

    @XmlElement(required = true, nillable = true)
    protected String dtjActivityType;
    @XmlElement(required = true, nillable = true)
    protected ApiDate endTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate startTime;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;

    /**
     * Gets the value of the dtjActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtjActivityType() {
        return dtjActivityType;
    }

    /**
     * Sets the value of the dtjActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtjActivityType(String value) {
        this.dtjActivityType = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setEndTime(ApiDate value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setStartTime(ApiDate value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleId }
     *     
     */
    public ApiVehicleId getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleId }
     *     
     */
    public void setVehicleId(ApiVehicleId value) {
        this.vehicleId = value;
    }

}
