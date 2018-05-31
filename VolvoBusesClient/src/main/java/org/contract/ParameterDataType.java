
package org.contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DoubleData" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfParameterDoubleData" minOccurs="0"/>
 *         &lt;element name="IntegerData" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfParameterIntegerData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterData", propOrder = {
    "doubleData",
    "integerData"
})
@XmlSeeAlso({
    DriverParameterDataType.class,
    VehicleParameterDataType.class
})
public class ParameterDataType {

    @XmlElementRef(name = "DoubleData", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParameterDoubleDataType> doubleData;
    @XmlElementRef(name = "IntegerData", namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParameterIntegerDataType> integerData;

    /**
     * Gets the value of the doubleData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterDoubleDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParameterDoubleDataType> getDoubleData() {
        return doubleData;
    }

    /**
     * Sets the value of the doubleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterDoubleDataType }{@code >}
     *     
     */
    public void setDoubleData(JAXBElement<ArrayOfParameterDoubleDataType> value) {
        this.doubleData = value;
    }

    /**
     * Gets the value of the integerData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterIntegerDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParameterIntegerDataType> getIntegerData() {
        return integerData;
    }

    /**
     * Sets the value of the integerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterIntegerDataType }{@code >}
     *     
     */
    public void setIntegerData(JAXBElement<ArrayOfParameterIntegerDataType> value) {
        this.integerData = value;
    }

}
