
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfDriverIntervalDataType;


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
 *         &lt;element name="GetDriverSpeedIntervalsResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfDriverIntervalData" minOccurs="0"/>
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
    "getDriverSpeedIntervalsResult"
})
@XmlRootElement(name = "GetDriverSpeedIntervalsResponse")
public class GetDriverSpeedIntervalsResponse {

    @XmlElementRef(name = "GetDriverSpeedIntervalsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDriverIntervalDataType> getDriverSpeedIntervalsResult;

    /**
     * Gets the value of the getDriverSpeedIntervalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDriverIntervalDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDriverIntervalDataType> getGetDriverSpeedIntervalsResult() {
        return getDriverSpeedIntervalsResult;
    }

    /**
     * Sets the value of the getDriverSpeedIntervalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDriverIntervalDataType }{@code >}
     *     
     */
    public void setGetDriverSpeedIntervalsResult(JAXBElement<ArrayOfDriverIntervalDataType> value) {
        this.getDriverSpeedIntervalsResult = value;
    }

}
