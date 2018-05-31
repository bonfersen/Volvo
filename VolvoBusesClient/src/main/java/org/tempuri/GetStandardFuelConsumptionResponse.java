
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfStandardFuelConsumptionDataType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetStandardFuelConsumptionResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfStandardFuelConsumptionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStandardFuelConsumptionResult"
})
@XmlRootElement(name = "GetStandardFuelConsumptionResponse")
public class GetStandardFuelConsumptionResponse {

    @XmlElementRef(name = "GetStandardFuelConsumptionResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStandardFuelConsumptionDataType> getStandardFuelConsumptionResult;

    /**
     * Gets the value of the getStandardFuelConsumptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStandardFuelConsumptionDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStandardFuelConsumptionDataType> getGetStandardFuelConsumptionResult() {
        return getStandardFuelConsumptionResult;
    }

    /**
     * Sets the value of the getStandardFuelConsumptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStandardFuelConsumptionDataType }{@code >}
     *     
     */
    public void setGetStandardFuelConsumptionResult(JAXBElement<ArrayOfStandardFuelConsumptionDataType> value) {
        this.getStandardFuelConsumptionResult = value;
    }

}
