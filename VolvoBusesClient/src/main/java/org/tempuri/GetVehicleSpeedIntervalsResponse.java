
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfVehicleIntervalDataType;


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
 *         &lt;element name="GetVehicleSpeedIntervalsResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfVehicleIntervalData" minOccurs="0"/>
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
    "getVehicleSpeedIntervalsResult"
})
@XmlRootElement(name = "GetVehicleSpeedIntervalsResponse")
public class GetVehicleSpeedIntervalsResponse {

    @XmlElementRef(name = "GetVehicleSpeedIntervalsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVehicleIntervalDataType> getVehicleSpeedIntervalsResult;

    /**
     * Gets the value of the getVehicleSpeedIntervalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleIntervalDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVehicleIntervalDataType> getGetVehicleSpeedIntervalsResult() {
        return getVehicleSpeedIntervalsResult;
    }

    /**
     * Sets the value of the getVehicleSpeedIntervalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleIntervalDataType }{@code >}
     *     
     */
    public void setGetVehicleSpeedIntervalsResult(JAXBElement<ArrayOfVehicleIntervalDataType> value) {
        this.getVehicleSpeedIntervalsResult = value;
    }

}
