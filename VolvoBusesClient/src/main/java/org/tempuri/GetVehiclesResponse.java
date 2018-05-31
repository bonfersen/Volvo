
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfVehicleType;


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
 *         &lt;element name="GetVehiclesResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfVehicle" minOccurs="0"/>
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
    "getVehiclesResult"
})
@XmlRootElement(name = "GetVehiclesResponse")
public class GetVehiclesResponse {

    @XmlElementRef(name = "GetVehiclesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVehicleType> getVehiclesResult;

    /**
     * Gets the value of the getVehiclesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVehicleType> getGetVehiclesResult() {
        return getVehiclesResult;
    }

    /**
     * Sets the value of the getVehiclesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleType }{@code >}
     *     
     */
    public void setGetVehiclesResult(JAXBElement<ArrayOfVehicleType> value) {
        this.getVehiclesResult = value;
    }

}
