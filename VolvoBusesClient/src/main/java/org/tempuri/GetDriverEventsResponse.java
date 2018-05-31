
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfEventDataType;


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
 *         &lt;element name="GetDriverEventsResult" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfEventData" minOccurs="0"/>
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
    "getDriverEventsResult"
})
@XmlRootElement(name = "GetDriverEventsResponse")
public class GetDriverEventsResponse {

    @XmlElementRef(name = "GetDriverEventsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEventDataType> getDriverEventsResult;

    /**
     * Gets the value of the getDriverEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEventDataType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEventDataType> getGetDriverEventsResult() {
        return getDriverEventsResult;
    }

    /**
     * Sets the value of the getDriverEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEventDataType }{@code >}
     *     
     */
    public void setGetDriverEventsResult(JAXBElement<ArrayOfEventDataType> value) {
        this.getDriverEventsResult = value;
    }

}
