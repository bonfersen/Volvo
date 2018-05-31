
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVehicleReportDataExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVehicleReportDataExtended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_ReportGetVehicleReportDataTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_ReportGetVehicleReportDataTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleReportDataExtended", propOrder = {
    "apiReportGetVehicleReportDataTO1"
})
public class GetVehicleReportDataExtended {

    @XmlElement(name = "Api_ReportGetVehicleReportDataTO_1", required = true, nillable = true)
    protected ApiReportGetVehicleReportDataTO apiReportGetVehicleReportDataTO1;

    /**
     * Gets the value of the apiReportGetVehicleReportDataTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiReportGetVehicleReportDataTO }
     *     
     */
    public ApiReportGetVehicleReportDataTO getApiReportGetVehicleReportDataTO1() {
        return apiReportGetVehicleReportDataTO1;
    }

    /**
     * Sets the value of the apiReportGetVehicleReportDataTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiReportGetVehicleReportDataTO }
     *     
     */
    public void setApiReportGetVehicleReportDataTO1(ApiReportGetVehicleReportDataTO value) {
        this.apiReportGetVehicleReportDataTO1 = value;
    }

}
