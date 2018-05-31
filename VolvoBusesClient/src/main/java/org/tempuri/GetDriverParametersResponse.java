
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfDriverParameterDataType;


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
 *         &lt;element name="GetDriverParametersResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfDriverParameterData" minOccurs="0"/>
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
    "getDriverParametersResult"
})
@XmlRootElement(name = "GetDriverParametersResponse")
public class GetDriverParametersResponse {

    @XmlElementRef(name = "GetDriverParametersResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDriverParameterDataType> getDriverParametersResult;

    /**
     * Gets the value of the getDriverParametersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDriverParameterDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDriverParameterDataType> getGetDriverParametersResult() {
        return getDriverParametersResult;
    }

    /**
     * Sets the value of the getDriverParametersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDriverParameterDataType }{@code >}
     *     
     */
    public void setGetDriverParametersResult(JAXBElement<ArrayOfDriverParameterDataType> value) {
        this.getDriverParametersResult = value;
    }

}
