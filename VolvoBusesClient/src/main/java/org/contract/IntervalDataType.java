
package org.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntervalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Fuel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IntervalFrom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IntervalTo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalData", propOrder = {
    "distance",
    "fuel",
    "intervalFrom",
    "intervalTo",
    "time"
})
@XmlSeeAlso({
    DriverIntervalDataType.class,
    VehicleIntervalDataType.class
})
public class IntervalDataType {

    @XmlElement(name = "Distance")
    protected Double distance;
    @XmlElement(name = "Fuel")
    protected Double fuel;
    @XmlElement(name = "IntervalFrom")
    protected Double intervalFrom;
    @XmlElement(name = "IntervalTo")
    protected Double intervalTo;
    @XmlElement(name = "Time")
    protected Integer time;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistance(Double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the fuel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFuel(Double value) {
        this.fuel = value;
    }

    /**
     * Gets the value of the intervalFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntervalFrom() {
        return intervalFrom;
    }

    /**
     * Sets the value of the intervalFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntervalFrom(Double value) {
        this.intervalFrom = value;
    }

    /**
     * Gets the value of the intervalTo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntervalTo() {
        return intervalTo;
    }

    /**
     * Sets the value of the intervalTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntervalTo(Double value) {
        this.intervalTo = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTime(Integer value) {
        this.time = value;
    }

}
