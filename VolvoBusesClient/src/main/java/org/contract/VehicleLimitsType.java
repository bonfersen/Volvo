
package org.contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExcessiveIdling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FuelDrain" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HarshAcceleration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HarshBraking" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HarshCurving" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HarshInclination" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Overspeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Overweight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RpmEconomyLower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RpmEconomyUpper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLimits", propOrder = {
    "excessiveIdling",
    "fuelDrain",
    "harshAcceleration",
    "harshBraking",
    "harshCurving",
    "harshInclination",
    "overspeed",
    "overweight",
    "rpmEconomyLower",
    "rpmEconomyUpper"
})
public class VehicleLimitsType {

    @XmlElementRef(name = "ExcessiveIdling", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> excessiveIdling;
    @XmlElementRef(name = "FuelDrain", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> fuelDrain;
    @XmlElementRef(name = "HarshAcceleration", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshAcceleration;
    @XmlElementRef(name = "HarshBraking", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshBraking;
    @XmlElementRef(name = "HarshCurving", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshCurving;
    @XmlElementRef(name = "HarshInclination", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harshInclination;
    @XmlElementRef(name = "Overspeed", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> overspeed;
    @XmlElementRef(name = "Overweight", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> overweight;
    @XmlElementRef(name = "RpmEconomyLower", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rpmEconomyLower;
    @XmlElementRef(name = "RpmEconomyUpper", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rpmEconomyUpper;

    /**
     * Gets the value of the excessiveIdling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExcessiveIdling() {
        return excessiveIdling;
    }

    /**
     * Sets the value of the excessiveIdling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExcessiveIdling(JAXBElement<Integer> value) {
        this.excessiveIdling = value;
    }

    /**
     * Gets the value of the fuelDrain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFuelDrain() {
        return fuelDrain;
    }

    /**
     * Sets the value of the fuelDrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFuelDrain(JAXBElement<Double> value) {
        this.fuelDrain = value;
    }

    /**
     * Gets the value of the harshAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshAcceleration() {
        return harshAcceleration;
    }

    /**
     * Sets the value of the harshAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshAcceleration(JAXBElement<Double> value) {
        this.harshAcceleration = value;
    }

    /**
     * Gets the value of the harshBraking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshBraking() {
        return harshBraking;
    }

    /**
     * Sets the value of the harshBraking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshBraking(JAXBElement<Double> value) {
        this.harshBraking = value;
    }

    /**
     * Gets the value of the harshCurving property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshCurving() {
        return harshCurving;
    }

    /**
     * Sets the value of the harshCurving property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshCurving(JAXBElement<Double> value) {
        this.harshCurving = value;
    }

    /**
     * Gets the value of the harshInclination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarshInclination() {
        return harshInclination;
    }

    /**
     * Sets the value of the harshInclination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarshInclination(JAXBElement<Double> value) {
        this.harshInclination = value;
    }

    /**
     * Gets the value of the overspeed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOverspeed() {
        return overspeed;
    }

    /**
     * Sets the value of the overspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOverspeed(JAXBElement<Double> value) {
        this.overspeed = value;
    }

    /**
     * Gets the value of the overweight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOverweight() {
        return overweight;
    }

    /**
     * Sets the value of the overweight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOverweight(JAXBElement<Double> value) {
        this.overweight = value;
    }

    /**
     * Gets the value of the rpmEconomyLower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRpmEconomyLower() {
        return rpmEconomyLower;
    }

    /**
     * Sets the value of the rpmEconomyLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRpmEconomyLower(JAXBElement<Double> value) {
        this.rpmEconomyLower = value;
    }

    /**
     * Gets the value of the rpmEconomyUpper property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRpmEconomyUpper() {
        return rpmEconomyUpper;
    }

    /**
     * Sets the value of the rpmEconomyUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRpmEconomyUpper(JAXBElement<Double> value) {
        this.rpmEconomyUpper = value;
    }

}
