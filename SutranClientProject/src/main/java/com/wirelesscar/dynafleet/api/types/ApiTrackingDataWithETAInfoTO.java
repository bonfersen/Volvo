
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_TrackingDataWithETAInfoTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_TrackingDataWithETAInfoTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accumulatedFuelConsumption" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature1" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature2" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature3" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature4" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature5" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature6" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature7" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature8" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="currentDriverActivity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationPoint" type="{http://wirelesscar.com/dynafleet/api/types}Api_PointTO"/>
 *         &lt;element name="distanceToDestination" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="drivingTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="etaTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="frontAxleWeight" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="momentaneousVehicleSpeed" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="odometer" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="position" type="{http://wirelesscar.com/dynafleet/api/types}Api_PositionTO"/>
 *         &lt;element name="rearAxleWeight" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="restingTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="timestamp" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="totalWeight" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="trailerFrontAxleWeight" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="trailerRearAxleWeight" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="trailerTotalWeight" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="triggerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *         &lt;element name="waitingTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="workingTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_TrackingDataWithETAInfoTO", propOrder = {
    "accumulatedFuelConsumption",
    "cargoTemperature1",
    "cargoTemperature2",
    "cargoTemperature3",
    "cargoTemperature4",
    "cargoTemperature5",
    "cargoTemperature6",
    "cargoTemperature7",
    "cargoTemperature8",
    "currentDriverActivity",
    "destinationPoint",
    "distanceToDestination",
    "driverId",
    "drivingTime",
    "etaTime",
    "frontAxleWeight",
    "momentaneousVehicleSpeed",
    "odometer",
    "position",
    "rearAxleWeight",
    "restingTime",
    "timestamp",
    "totalWeight",
    "trailerFrontAxleWeight",
    "trailerRearAxleWeight",
    "trailerTotalWeight",
    "triggerType",
    "vehicleId",
    "waitingTime",
    "workingTime"
})
public class ApiTrackingDataWithETAInfoTO {

    @XmlElement(required = true, nillable = true)
    protected ApiLong accumulatedFuelConsumption;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature1;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature2;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature3;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature4;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature5;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature6;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature7;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature8;
    @XmlElement(required = true, nillable = true)
    protected String currentDriverActivity;
    @XmlElement(required = true, nillable = true)
    protected ApiPointTO destinationPoint;
    @XmlElement(required = true, nillable = true)
    protected ApiLong distanceToDestination;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiLong drivingTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate etaTime;
    @XmlElement(required = true, nillable = true)
    protected ApiLong frontAxleWeight;
    @XmlElement(required = true, nillable = true)
    protected ApiLong momentaneousVehicleSpeed;
    @XmlElement(required = true, nillable = true)
    protected ApiLong odometer;
    @XmlElement(required = true, nillable = true)
    protected ApiPositionTO position;
    @XmlElement(required = true, nillable = true)
    protected ApiLong rearAxleWeight;
    @XmlElement(required = true, nillable = true)
    protected ApiLong restingTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;
    @XmlElement(required = true, nillable = true)
    protected ApiLong totalWeight;
    @XmlElement(required = true, nillable = true)
    protected ApiLong trailerFrontAxleWeight;
    @XmlElement(required = true, nillable = true)
    protected ApiLong trailerRearAxleWeight;
    @XmlElement(required = true, nillable = true)
    protected ApiLong trailerTotalWeight;
    @XmlElement(required = true, nillable = true)
    protected String triggerType;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;
    @XmlElement(required = true, nillable = true)
    protected ApiLong waitingTime;
    @XmlElement(required = true, nillable = true)
    protected ApiLong workingTime;

    /**
     * Gets the value of the accumulatedFuelConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getAccumulatedFuelConsumption() {
        return accumulatedFuelConsumption;
    }

    /**
     * Sets the value of the accumulatedFuelConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setAccumulatedFuelConsumption(ApiLong value) {
        this.accumulatedFuelConsumption = value;
    }

    /**
     * Gets the value of the cargoTemperature1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature1() {
        return cargoTemperature1;
    }

    /**
     * Sets the value of the cargoTemperature1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature1(ApiLong value) {
        this.cargoTemperature1 = value;
    }

    /**
     * Gets the value of the cargoTemperature2 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature2() {
        return cargoTemperature2;
    }

    /**
     * Sets the value of the cargoTemperature2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature2(ApiLong value) {
        this.cargoTemperature2 = value;
    }

    /**
     * Gets the value of the cargoTemperature3 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature3() {
        return cargoTemperature3;
    }

    /**
     * Sets the value of the cargoTemperature3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature3(ApiLong value) {
        this.cargoTemperature3 = value;
    }

    /**
     * Gets the value of the cargoTemperature4 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature4() {
        return cargoTemperature4;
    }

    /**
     * Sets the value of the cargoTemperature4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature4(ApiLong value) {
        this.cargoTemperature4 = value;
    }

    /**
     * Gets the value of the cargoTemperature5 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature5() {
        return cargoTemperature5;
    }

    /**
     * Sets the value of the cargoTemperature5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature5(ApiLong value) {
        this.cargoTemperature5 = value;
    }

    /**
     * Gets the value of the cargoTemperature6 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature6() {
        return cargoTemperature6;
    }

    /**
     * Sets the value of the cargoTemperature6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature6(ApiLong value) {
        this.cargoTemperature6 = value;
    }

    /**
     * Gets the value of the cargoTemperature7 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature7() {
        return cargoTemperature7;
    }

    /**
     * Sets the value of the cargoTemperature7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature7(ApiLong value) {
        this.cargoTemperature7 = value;
    }

    /**
     * Gets the value of the cargoTemperature8 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCargoTemperature8() {
        return cargoTemperature8;
    }

    /**
     * Sets the value of the cargoTemperature8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCargoTemperature8(ApiLong value) {
        this.cargoTemperature8 = value;
    }

    /**
     * Gets the value of the currentDriverActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDriverActivity() {
        return currentDriverActivity;
    }

    /**
     * Sets the value of the currentDriverActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDriverActivity(String value) {
        this.currentDriverActivity = value;
    }

    /**
     * Gets the value of the destinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPointTO }
     *     
     */
    public ApiPointTO getDestinationPoint() {
        return destinationPoint;
    }

    /**
     * Sets the value of the destinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPointTO }
     *     
     */
    public void setDestinationPoint(ApiPointTO value) {
        this.destinationPoint = value;
    }

    /**
     * Gets the value of the distanceToDestination property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Sets the value of the distanceToDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDistanceToDestination(ApiLong value) {
        this.distanceToDestination = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDriverId }
     *     
     */
    public ApiDriverId getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDriverId }
     *     
     */
    public void setDriverId(ApiDriverId value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the drivingTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDrivingTime() {
        return drivingTime;
    }

    /**
     * Sets the value of the drivingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDrivingTime(ApiLong value) {
        this.drivingTime = value;
    }

    /**
     * Gets the value of the etaTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getEtaTime() {
        return etaTime;
    }

    /**
     * Sets the value of the etaTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setEtaTime(ApiDate value) {
        this.etaTime = value;
    }

    /**
     * Gets the value of the frontAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getFrontAxleWeight() {
        return frontAxleWeight;
    }

    /**
     * Sets the value of the frontAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setFrontAxleWeight(ApiLong value) {
        this.frontAxleWeight = value;
    }

    /**
     * Gets the value of the momentaneousVehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getMomentaneousVehicleSpeed() {
        return momentaneousVehicleSpeed;
    }

    /**
     * Sets the value of the momentaneousVehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setMomentaneousVehicleSpeed(ApiLong value) {
        this.momentaneousVehicleSpeed = value;
    }

    /**
     * Gets the value of the odometer property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getOdometer() {
        return odometer;
    }

    /**
     * Sets the value of the odometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setOdometer(ApiLong value) {
        this.odometer = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPositionTO }
     *     
     */
    public ApiPositionTO getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPositionTO }
     *     
     */
    public void setPosition(ApiPositionTO value) {
        this.position = value;
    }

    /**
     * Gets the value of the rearAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRearAxleWeight() {
        return rearAxleWeight;
    }

    /**
     * Sets the value of the rearAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRearAxleWeight(ApiLong value) {
        this.rearAxleWeight = value;
    }

    /**
     * Gets the value of the restingTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRestingTime() {
        return restingTime;
    }

    /**
     * Sets the value of the restingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRestingTime(ApiLong value) {
        this.restingTime = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setTimestamp(ApiDate value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTotalWeight(ApiLong value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the trailerFrontAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTrailerFrontAxleWeight() {
        return trailerFrontAxleWeight;
    }

    /**
     * Sets the value of the trailerFrontAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTrailerFrontAxleWeight(ApiLong value) {
        this.trailerFrontAxleWeight = value;
    }

    /**
     * Gets the value of the trailerRearAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTrailerRearAxleWeight() {
        return trailerRearAxleWeight;
    }

    /**
     * Sets the value of the trailerRearAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTrailerRearAxleWeight(ApiLong value) {
        this.trailerRearAxleWeight = value;
    }

    /**
     * Gets the value of the trailerTotalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTrailerTotalWeight() {
        return trailerTotalWeight;
    }

    /**
     * Sets the value of the trailerTotalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTrailerTotalWeight(ApiLong value) {
        this.trailerTotalWeight = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerType(String value) {
        this.triggerType = value;
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
     * Gets the value of the waitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getWaitingTime() {
        return waitingTime;
    }

    /**
     * Sets the value of the waitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setWaitingTime(ApiLong value) {
        this.waitingTime = value;
    }

    /**
     * Gets the value of the workingTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getWorkingTime() {
        return workingTime;
    }

    /**
     * Sets the value of the workingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setWorkingTime(ApiLong value) {
        this.workingTime = value;
    }

}
