
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_VehicleEventMessageTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_VehicleEventMessageTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleEventMessageId" type="{http://wirelesscar.com/dynafleet/api/types}Api_MessageId"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="vehicleId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleId"/>
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicleEventId" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleEventId"/>
 *         &lt;element name="position" type="{http://wirelesscar.com/dynafleet/api/types}Api_PositionTO"/>
 *         &lt;element name="timestamp" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="isRead" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="fuelLevelChangePercent" type="{http://wirelesscar.com/dynafleet/api/types}Api_Float"/>
 *         &lt;element name="currentFuelLevelPercent" type="{http://wirelesscar.com/dynafleet/api/types}Api_Float"/>
 *         &lt;element name="adBlueLevelChangeMm" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="adBlueLevelChangePerMille" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoDoorStatus" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="cargoDefrostStatus" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="cargoTemperature1Alarm" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="cargoTemperature2Alarm" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="cargoTemperature3Alarm" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="cargoTemperature4Alarm" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="cargoTemperature1" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature2" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature3" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cargoTemperature4" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_VehicleEventMessageTO", propOrder = {
    "vehicleEventMessageId",
    "driverId",
    "vehicleId",
    "trigger",
    "vehicleEventId",
    "position",
    "timestamp",
    "isRead",
    "fuelLevelChangePercent",
    "currentFuelLevelPercent",
    "adBlueLevelChangeMm",
    "adBlueLevelChangePerMille",
    "cargoDoorStatus",
    "cargoDefrostStatus",
    "cargoTemperature1Alarm",
    "cargoTemperature2Alarm",
    "cargoTemperature3Alarm",
    "cargoTemperature4Alarm",
    "cargoTemperature1",
    "cargoTemperature2",
    "cargoTemperature3",
    "cargoTemperature4"
})
public class ApiVehicleEventMessageTO {

    @XmlElement(required = true)
    protected ApiMessageId vehicleEventMessageId;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleId vehicleId;
    @XmlElement(required = true, nillable = true)
    protected String trigger;
    @XmlElement(required = true, nillable = true)
    protected ApiVehicleEventId vehicleEventId;
    @XmlElement(required = true, nillable = true)
    protected ApiPositionTO position;
    @XmlElement(required = true, nillable = true)
    protected ApiDate timestamp;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isRead;
    @XmlElement(required = true, nillable = true)
    protected ApiFloat fuelLevelChangePercent;
    @XmlElement(required = true, nillable = true)
    protected ApiFloat currentFuelLevelPercent;
    @XmlElement(required = true, nillable = true)
    protected ApiLong adBlueLevelChangeMm;
    @XmlElement(required = true, nillable = true)
    protected ApiLong adBlueLevelChangePerMille;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean cargoDoorStatus;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean cargoDefrostStatus;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean cargoTemperature1Alarm;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean cargoTemperature2Alarm;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean cargoTemperature3Alarm;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean cargoTemperature4Alarm;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature1;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature2;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature3;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cargoTemperature4;

    /**
     * Gets the value of the vehicleEventMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMessageId }
     *     
     */
    public ApiMessageId getVehicleEventMessageId() {
        return vehicleEventMessageId;
    }

    /**
     * Sets the value of the vehicleEventMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMessageId }
     *     
     */
    public void setVehicleEventMessageId(ApiMessageId value) {
        this.vehicleEventMessageId = value;
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
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the vehicleEventId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleEventId }
     *     
     */
    public ApiVehicleEventId getVehicleEventId() {
        return vehicleEventId;
    }

    /**
     * Sets the value of the vehicleEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleEventId }
     *     
     */
    public void setVehicleEventId(ApiVehicleEventId value) {
        this.vehicleEventId = value;
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
     * Gets the value of the isRead property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getIsRead() {
        return isRead;
    }

    /**
     * Sets the value of the isRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setIsRead(ApiBoolean value) {
        this.isRead = value;
    }

    /**
     * Gets the value of the fuelLevelChangePercent property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFloat }
     *     
     */
    public ApiFloat getFuelLevelChangePercent() {
        return fuelLevelChangePercent;
    }

    /**
     * Sets the value of the fuelLevelChangePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFloat }
     *     
     */
    public void setFuelLevelChangePercent(ApiFloat value) {
        this.fuelLevelChangePercent = value;
    }

    /**
     * Gets the value of the currentFuelLevelPercent property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFloat }
     *     
     */
    public ApiFloat getCurrentFuelLevelPercent() {
        return currentFuelLevelPercent;
    }

    /**
     * Sets the value of the currentFuelLevelPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFloat }
     *     
     */
    public void setCurrentFuelLevelPercent(ApiFloat value) {
        this.currentFuelLevelPercent = value;
    }

    /**
     * Gets the value of the adBlueLevelChangeMm property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getAdBlueLevelChangeMm() {
        return adBlueLevelChangeMm;
    }

    /**
     * Sets the value of the adBlueLevelChangeMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setAdBlueLevelChangeMm(ApiLong value) {
        this.adBlueLevelChangeMm = value;
    }

    /**
     * Gets the value of the adBlueLevelChangePerMille property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getAdBlueLevelChangePerMille() {
        return adBlueLevelChangePerMille;
    }

    /**
     * Sets the value of the adBlueLevelChangePerMille property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setAdBlueLevelChangePerMille(ApiLong value) {
        this.adBlueLevelChangePerMille = value;
    }

    /**
     * Gets the value of the cargoDoorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getCargoDoorStatus() {
        return cargoDoorStatus;
    }

    /**
     * Sets the value of the cargoDoorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setCargoDoorStatus(ApiBoolean value) {
        this.cargoDoorStatus = value;
    }

    /**
     * Gets the value of the cargoDefrostStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getCargoDefrostStatus() {
        return cargoDefrostStatus;
    }

    /**
     * Sets the value of the cargoDefrostStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setCargoDefrostStatus(ApiBoolean value) {
        this.cargoDefrostStatus = value;
    }

    /**
     * Gets the value of the cargoTemperature1Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getCargoTemperature1Alarm() {
        return cargoTemperature1Alarm;
    }

    /**
     * Sets the value of the cargoTemperature1Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setCargoTemperature1Alarm(ApiBoolean value) {
        this.cargoTemperature1Alarm = value;
    }

    /**
     * Gets the value of the cargoTemperature2Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getCargoTemperature2Alarm() {
        return cargoTemperature2Alarm;
    }

    /**
     * Sets the value of the cargoTemperature2Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setCargoTemperature2Alarm(ApiBoolean value) {
        this.cargoTemperature2Alarm = value;
    }

    /**
     * Gets the value of the cargoTemperature3Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getCargoTemperature3Alarm() {
        return cargoTemperature3Alarm;
    }

    /**
     * Sets the value of the cargoTemperature3Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setCargoTemperature3Alarm(ApiBoolean value) {
        this.cargoTemperature3Alarm = value;
    }

    /**
     * Gets the value of the cargoTemperature4Alarm property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getCargoTemperature4Alarm() {
        return cargoTemperature4Alarm;
    }

    /**
     * Sets the value of the cargoTemperature4Alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setCargoTemperature4Alarm(ApiBoolean value) {
        this.cargoTemperature4Alarm = value;
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

}
