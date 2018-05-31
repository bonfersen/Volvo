
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_ServicePlanEntryTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_ServicePlanEntryTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasOdometerAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasOverdueAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mileage" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceDate" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="servicePlanEntryId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *         &lt;element name="vospCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vospOriginated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_ServicePlanEntryTO", propOrder = {
    "hasOdometerAlert",
    "hasOverdueAlert",
    "mileage",
    "operation",
    "serviceDate",
    "servicePlanEntryId",
    "status",
    "vehicleId",
    "vospCode",
    "vospOriginated"
})
public class ApiServicePlanEntryTO {

    protected boolean hasOdometerAlert;
    protected boolean hasOverdueAlert;
    @XmlElement(required = true, nillable = true)
    protected ApiLong mileage;
    @XmlElement(required = true, nillable = true)
    protected String operation;
    @XmlElement(required = true, nillable = true)
    protected ApiDate serviceDate;
    @XmlElement(required = true, nillable = true)
    protected ApiLong servicePlanEntryId;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;
    @XmlElement(required = true, nillable = true)
    protected String vospCode;
    protected boolean vospOriginated;

    /**
     * Gets the value of the hasOdometerAlert property.
     * 
     */
    public boolean isHasOdometerAlert() {
        return hasOdometerAlert;
    }

    /**
     * Sets the value of the hasOdometerAlert property.
     * 
     */
    public void setHasOdometerAlert(boolean value) {
        this.hasOdometerAlert = value;
    }

    /**
     * Gets the value of the hasOverdueAlert property.
     * 
     */
    public boolean isHasOverdueAlert() {
        return hasOverdueAlert;
    }

    /**
     * Sets the value of the hasOverdueAlert property.
     * 
     */
    public void setHasOverdueAlert(boolean value) {
        this.hasOverdueAlert = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setMileage(ApiLong value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setServiceDate(ApiDate value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the servicePlanEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getServicePlanEntryId() {
        return servicePlanEntryId;
    }

    /**
     * Sets the value of the servicePlanEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setServicePlanEntryId(ApiLong value) {
        this.servicePlanEntryId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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

    /**
     * Gets the value of the vospCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVospCode() {
        return vospCode;
    }

    /**
     * Sets the value of the vospCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVospCode(String value) {
        this.vospCode = value;
    }

    /**
     * Gets the value of the vospOriginated property.
     * 
     */
    public boolean isVospOriginated() {
        return vospOriginated;
    }

    /**
     * Sets the value of the vospOriginated property.
     * 
     */
    public void setVospOriginated(boolean value) {
        this.vospOriginated = value;
    }

}
