
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_VehicleDataEntryTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_VehicleDataEntryTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PTOcentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="PTOmeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="PTOseconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="coastingCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="coastingMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="coastingSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cruiseCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cruiseMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="cruiseSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverId"/>
 *         &lt;element name="driverLoggedInCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="driverLoggedInMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="driverLoggedInSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="drivingCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="drivingMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="drivingSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="economyCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="economyLowerLimitRPM" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="economyMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="economySeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="economyUpperLimitRPM" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="endTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="engineLoadUpperLimitPercentage" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="engineOnCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOnMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOnSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOverRevCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOverRevMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOverRevSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOverloadCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOverloadMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineOverloadSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="engineUpperLimitRPM" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="idleCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="idleMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="idleSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="roadOverspeedCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="roadOverspeedMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="roadOverspeedSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="speedUpperLimitMps" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="startTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="topGearCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="topGearMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="topGearSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="unitOnCentilitres" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="unitOnMeters" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="unitOnSeconds" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_VehicleDataEntryTO", propOrder = {
    "ptOcentilitres",
    "ptOmeters",
    "ptOseconds",
    "coastingCentilitres",
    "coastingMeters",
    "coastingSeconds",
    "cruiseCentilitres",
    "cruiseMeters",
    "cruiseSeconds",
    "driverId",
    "driverLoggedInCentilitres",
    "driverLoggedInMeters",
    "driverLoggedInSeconds",
    "drivingCentilitres",
    "drivingMeters",
    "drivingSeconds",
    "economyCentilitres",
    "economyLowerLimitRPM",
    "economyMeters",
    "economySeconds",
    "economyUpperLimitRPM",
    "endTime",
    "engineLoadUpperLimitPercentage",
    "engineOnCentilitres",
    "engineOnMeters",
    "engineOnSeconds",
    "engineOverRevCentilitres",
    "engineOverRevMeters",
    "engineOverRevSeconds",
    "engineOverloadCentilitres",
    "engineOverloadMeters",
    "engineOverloadSeconds",
    "engineUpperLimitRPM",
    "idleCentilitres",
    "idleMeters",
    "idleSeconds",
    "roadOverspeedCentilitres",
    "roadOverspeedMeters",
    "roadOverspeedSeconds",
    "speedUpperLimitMps",
    "startTime",
    "topGearCentilitres",
    "topGearMeters",
    "topGearSeconds",
    "unitOnCentilitres",
    "unitOnMeters",
    "unitOnSeconds"
})
public class ApiVehicleDataEntryTO {

    @XmlElement(name = "PTOcentilitres", required = true, nillable = true)
    protected ApiLong ptOcentilitres;
    @XmlElement(name = "PTOmeters", required = true, nillable = true)
    protected ApiLong ptOmeters;
    @XmlElement(name = "PTOseconds", required = true, nillable = true)
    protected ApiLong ptOseconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong coastingCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong coastingMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong coastingSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cruiseCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cruiseMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong cruiseSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiDriverId driverId;
    @XmlElement(required = true, nillable = true)
    protected ApiLong driverLoggedInCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong driverLoggedInMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong driverLoggedInSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong drivingCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong drivingMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong drivingSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong economyCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble economyLowerLimitRPM;
    @XmlElement(required = true, nillable = true)
    protected ApiLong economyMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong economySeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble economyUpperLimitRPM;
    @XmlElement(required = true, nillable = true)
    protected ApiDate endTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble engineLoadUpperLimitPercentage;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOnCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOnMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOnSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOverRevCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOverRevMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOverRevSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOverloadCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOverloadMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong engineOverloadSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble engineUpperLimitRPM;
    @XmlElement(required = true, nillable = true)
    protected ApiLong idleCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong idleMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong idleSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong roadOverspeedCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong roadOverspeedMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong roadOverspeedSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiDouble speedUpperLimitMps;
    @XmlElement(required = true, nillable = true)
    protected ApiDate startTime;
    @XmlElement(required = true, nillable = true)
    protected ApiLong topGearCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong topGearMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong topGearSeconds;
    @XmlElement(required = true, nillable = true)
    protected ApiLong unitOnCentilitres;
    @XmlElement(required = true, nillable = true)
    protected ApiLong unitOnMeters;
    @XmlElement(required = true, nillable = true)
    protected ApiLong unitOnSeconds;

    /**
     * Gets the value of the ptOcentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getPTOcentilitres() {
        return ptOcentilitres;
    }

    /**
     * Sets the value of the ptOcentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setPTOcentilitres(ApiLong value) {
        this.ptOcentilitres = value;
    }

    /**
     * Gets the value of the ptOmeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getPTOmeters() {
        return ptOmeters;
    }

    /**
     * Sets the value of the ptOmeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setPTOmeters(ApiLong value) {
        this.ptOmeters = value;
    }

    /**
     * Gets the value of the ptOseconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getPTOseconds() {
        return ptOseconds;
    }

    /**
     * Sets the value of the ptOseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setPTOseconds(ApiLong value) {
        this.ptOseconds = value;
    }

    /**
     * Gets the value of the coastingCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCoastingCentilitres() {
        return coastingCentilitres;
    }

    /**
     * Sets the value of the coastingCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCoastingCentilitres(ApiLong value) {
        this.coastingCentilitres = value;
    }

    /**
     * Gets the value of the coastingMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCoastingMeters() {
        return coastingMeters;
    }

    /**
     * Sets the value of the coastingMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCoastingMeters(ApiLong value) {
        this.coastingMeters = value;
    }

    /**
     * Gets the value of the coastingSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCoastingSeconds() {
        return coastingSeconds;
    }

    /**
     * Sets the value of the coastingSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCoastingSeconds(ApiLong value) {
        this.coastingSeconds = value;
    }

    /**
     * Gets the value of the cruiseCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCruiseCentilitres() {
        return cruiseCentilitres;
    }

    /**
     * Sets the value of the cruiseCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCruiseCentilitres(ApiLong value) {
        this.cruiseCentilitres = value;
    }

    /**
     * Gets the value of the cruiseMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCruiseMeters() {
        return cruiseMeters;
    }

    /**
     * Sets the value of the cruiseMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCruiseMeters(ApiLong value) {
        this.cruiseMeters = value;
    }

    /**
     * Gets the value of the cruiseSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCruiseSeconds() {
        return cruiseSeconds;
    }

    /**
     * Sets the value of the cruiseSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCruiseSeconds(ApiLong value) {
        this.cruiseSeconds = value;
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
     * Gets the value of the driverLoggedInCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDriverLoggedInCentilitres() {
        return driverLoggedInCentilitres;
    }

    /**
     * Sets the value of the driverLoggedInCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDriverLoggedInCentilitres(ApiLong value) {
        this.driverLoggedInCentilitres = value;
    }

    /**
     * Gets the value of the driverLoggedInMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDriverLoggedInMeters() {
        return driverLoggedInMeters;
    }

    /**
     * Sets the value of the driverLoggedInMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDriverLoggedInMeters(ApiLong value) {
        this.driverLoggedInMeters = value;
    }

    /**
     * Gets the value of the driverLoggedInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDriverLoggedInSeconds() {
        return driverLoggedInSeconds;
    }

    /**
     * Sets the value of the driverLoggedInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDriverLoggedInSeconds(ApiLong value) {
        this.driverLoggedInSeconds = value;
    }

    /**
     * Gets the value of the drivingCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDrivingCentilitres() {
        return drivingCentilitres;
    }

    /**
     * Sets the value of the drivingCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDrivingCentilitres(ApiLong value) {
        this.drivingCentilitres = value;
    }

    /**
     * Gets the value of the drivingMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDrivingMeters() {
        return drivingMeters;
    }

    /**
     * Sets the value of the drivingMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDrivingMeters(ApiLong value) {
        this.drivingMeters = value;
    }

    /**
     * Gets the value of the drivingSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDrivingSeconds() {
        return drivingSeconds;
    }

    /**
     * Sets the value of the drivingSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDrivingSeconds(ApiLong value) {
        this.drivingSeconds = value;
    }

    /**
     * Gets the value of the economyCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEconomyCentilitres() {
        return economyCentilitres;
    }

    /**
     * Sets the value of the economyCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEconomyCentilitres(ApiLong value) {
        this.economyCentilitres = value;
    }

    /**
     * Gets the value of the economyLowerLimitRPM property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getEconomyLowerLimitRPM() {
        return economyLowerLimitRPM;
    }

    /**
     * Sets the value of the economyLowerLimitRPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setEconomyLowerLimitRPM(ApiDouble value) {
        this.economyLowerLimitRPM = value;
    }

    /**
     * Gets the value of the economyMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEconomyMeters() {
        return economyMeters;
    }

    /**
     * Sets the value of the economyMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEconomyMeters(ApiLong value) {
        this.economyMeters = value;
    }

    /**
     * Gets the value of the economySeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEconomySeconds() {
        return economySeconds;
    }

    /**
     * Sets the value of the economySeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEconomySeconds(ApiLong value) {
        this.economySeconds = value;
    }

    /**
     * Gets the value of the economyUpperLimitRPM property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getEconomyUpperLimitRPM() {
        return economyUpperLimitRPM;
    }

    /**
     * Sets the value of the economyUpperLimitRPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setEconomyUpperLimitRPM(ApiDouble value) {
        this.economyUpperLimitRPM = value;
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
     * Gets the value of the engineLoadUpperLimitPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getEngineLoadUpperLimitPercentage() {
        return engineLoadUpperLimitPercentage;
    }

    /**
     * Sets the value of the engineLoadUpperLimitPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setEngineLoadUpperLimitPercentage(ApiDouble value) {
        this.engineLoadUpperLimitPercentage = value;
    }

    /**
     * Gets the value of the engineOnCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOnCentilitres() {
        return engineOnCentilitres;
    }

    /**
     * Sets the value of the engineOnCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOnCentilitres(ApiLong value) {
        this.engineOnCentilitres = value;
    }

    /**
     * Gets the value of the engineOnMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOnMeters() {
        return engineOnMeters;
    }

    /**
     * Sets the value of the engineOnMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOnMeters(ApiLong value) {
        this.engineOnMeters = value;
    }

    /**
     * Gets the value of the engineOnSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOnSeconds() {
        return engineOnSeconds;
    }

    /**
     * Sets the value of the engineOnSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOnSeconds(ApiLong value) {
        this.engineOnSeconds = value;
    }

    /**
     * Gets the value of the engineOverRevCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOverRevCentilitres() {
        return engineOverRevCentilitres;
    }

    /**
     * Sets the value of the engineOverRevCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOverRevCentilitres(ApiLong value) {
        this.engineOverRevCentilitres = value;
    }

    /**
     * Gets the value of the engineOverRevMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOverRevMeters() {
        return engineOverRevMeters;
    }

    /**
     * Sets the value of the engineOverRevMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOverRevMeters(ApiLong value) {
        this.engineOverRevMeters = value;
    }

    /**
     * Gets the value of the engineOverRevSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOverRevSeconds() {
        return engineOverRevSeconds;
    }

    /**
     * Sets the value of the engineOverRevSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOverRevSeconds(ApiLong value) {
        this.engineOverRevSeconds = value;
    }

    /**
     * Gets the value of the engineOverloadCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOverloadCentilitres() {
        return engineOverloadCentilitres;
    }

    /**
     * Sets the value of the engineOverloadCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOverloadCentilitres(ApiLong value) {
        this.engineOverloadCentilitres = value;
    }

    /**
     * Gets the value of the engineOverloadMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOverloadMeters() {
        return engineOverloadMeters;
    }

    /**
     * Sets the value of the engineOverloadMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOverloadMeters(ApiLong value) {
        this.engineOverloadMeters = value;
    }

    /**
     * Gets the value of the engineOverloadSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getEngineOverloadSeconds() {
        return engineOverloadSeconds;
    }

    /**
     * Sets the value of the engineOverloadSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setEngineOverloadSeconds(ApiLong value) {
        this.engineOverloadSeconds = value;
    }

    /**
     * Gets the value of the engineUpperLimitRPM property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getEngineUpperLimitRPM() {
        return engineUpperLimitRPM;
    }

    /**
     * Sets the value of the engineUpperLimitRPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setEngineUpperLimitRPM(ApiDouble value) {
        this.engineUpperLimitRPM = value;
    }

    /**
     * Gets the value of the idleCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getIdleCentilitres() {
        return idleCentilitres;
    }

    /**
     * Sets the value of the idleCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setIdleCentilitres(ApiLong value) {
        this.idleCentilitres = value;
    }

    /**
     * Gets the value of the idleMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getIdleMeters() {
        return idleMeters;
    }

    /**
     * Sets the value of the idleMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setIdleMeters(ApiLong value) {
        this.idleMeters = value;
    }

    /**
     * Gets the value of the idleSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getIdleSeconds() {
        return idleSeconds;
    }

    /**
     * Sets the value of the idleSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setIdleSeconds(ApiLong value) {
        this.idleSeconds = value;
    }

    /**
     * Gets the value of the roadOverspeedCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRoadOverspeedCentilitres() {
        return roadOverspeedCentilitres;
    }

    /**
     * Sets the value of the roadOverspeedCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRoadOverspeedCentilitres(ApiLong value) {
        this.roadOverspeedCentilitres = value;
    }

    /**
     * Gets the value of the roadOverspeedMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRoadOverspeedMeters() {
        return roadOverspeedMeters;
    }

    /**
     * Sets the value of the roadOverspeedMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRoadOverspeedMeters(ApiLong value) {
        this.roadOverspeedMeters = value;
    }

    /**
     * Gets the value of the roadOverspeedSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getRoadOverspeedSeconds() {
        return roadOverspeedSeconds;
    }

    /**
     * Sets the value of the roadOverspeedSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setRoadOverspeedSeconds(ApiLong value) {
        this.roadOverspeedSeconds = value;
    }

    /**
     * Gets the value of the speedUpperLimitMps property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getSpeedUpperLimitMps() {
        return speedUpperLimitMps;
    }

    /**
     * Sets the value of the speedUpperLimitMps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setSpeedUpperLimitMps(ApiDouble value) {
        this.speedUpperLimitMps = value;
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
     * Gets the value of the topGearCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTopGearCentilitres() {
        return topGearCentilitres;
    }

    /**
     * Sets the value of the topGearCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTopGearCentilitres(ApiLong value) {
        this.topGearCentilitres = value;
    }

    /**
     * Gets the value of the topGearMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTopGearMeters() {
        return topGearMeters;
    }

    /**
     * Sets the value of the topGearMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTopGearMeters(ApiLong value) {
        this.topGearMeters = value;
    }

    /**
     * Gets the value of the topGearSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getTopGearSeconds() {
        return topGearSeconds;
    }

    /**
     * Sets the value of the topGearSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setTopGearSeconds(ApiLong value) {
        this.topGearSeconds = value;
    }

    /**
     * Gets the value of the unitOnCentilitres property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getUnitOnCentilitres() {
        return unitOnCentilitres;
    }

    /**
     * Sets the value of the unitOnCentilitres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setUnitOnCentilitres(ApiLong value) {
        this.unitOnCentilitres = value;
    }

    /**
     * Gets the value of the unitOnMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getUnitOnMeters() {
        return unitOnMeters;
    }

    /**
     * Sets the value of the unitOnMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setUnitOnMeters(ApiLong value) {
        this.unitOnMeters = value;
    }

    /**
     * Gets the value of the unitOnSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getUnitOnSeconds() {
        return unitOnSeconds;
    }

    /**
     * Sets the value of the unitOnSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setUnitOnSeconds(ApiLong value) {
        this.unitOnSeconds = value;
    }

}
