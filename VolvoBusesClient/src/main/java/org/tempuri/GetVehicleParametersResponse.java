
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfVehicleParameterDataType;


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
 *         &lt;element name="GetVehicleParametersResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfVehicleParameterData" minOccurs="0"/>
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
    "getVehicleParametersResult"
})
@XmlRootElement(name = "GetVehicleParametersResponse")
public class GetVehicleParametersResponse {

    @XmlElementRef(name = "GetVehicleParametersResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVehicleParameterDataType> getVehicleParametersResult;

    /**
     * Gets the value of the getVehicleParametersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleParameterDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVehicleParameterDataType> getGetVehicleParametersResult() {
        return getVehicleParametersResult;
    }

    /**
     * Sets the value of the getVehicleParametersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVehicleParameterDataType }{@code >}
     *     
     */
    public void setGetVehicleParametersResult(JAXBElement<ArrayOfVehicleParameterDataType> value) {
        this.getVehicleParametersResult = value;
    }

}
