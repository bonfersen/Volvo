
package org.contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardFuelConsumptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardFuelConsumptionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EngineModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuelConsumption" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardFuelConsumptionData", propOrder = {
    "engineModel",
    "fuelConsumption",
    "model",
    "speed"
})
public class StandardFuelConsumptionDataType {

    @XmlElementRef(name = "EngineModel", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> engineModel;
    @XmlElement(name = "FuelConsumption")
    protected Double fuelConsumption;
    @XmlElementRef(name = "Model", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElement(name = "Speed")
    protected Double speed;

    /**
     * Gets the value of the engineModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEngineModel() {
        return engineModel;
    }

    /**
     * Sets the value of the engineModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEngineModel(JAXBElement<String> value) {
        this.engineModel = value;
    }

    /**
     * Gets the value of the fuelConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Sets the value of the fuelConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuelConsumption(Double value) {
        this.fuelConsumption = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeed(Double value) {
        this.speed = value;
    }

}
