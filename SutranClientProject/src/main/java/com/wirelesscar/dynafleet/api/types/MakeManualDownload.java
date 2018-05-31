
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeManualDownload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeManualDownload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_ReportMakeManualDownloadTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_ReportMakeManualDownloadTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeManualDownload", propOrder = {
    "apiReportMakeManualDownloadTO1"
})
public class MakeManualDownload {

    @XmlElement(name = "Api_ReportMakeManualDownloadTO_1", required = true, nillable = true)
    protected ApiReportMakeManualDownloadTO apiReportMakeManualDownloadTO1;

    /**
     * Gets the value of the apiReportMakeManualDownloadTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiReportMakeManualDownloadTO }
     *     
     */
    public ApiReportMakeManualDownloadTO getApiReportMakeManualDownloadTO1() {
        return apiReportMakeManualDownloadTO1;
    }

    /**
     * Sets the value of the apiReportMakeManualDownloadTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiReportMakeManualDownloadTO }
     *     
     */
    public void setApiReportMakeManualDownloadTO1(ApiReportMakeManualDownloadTO value) {
        this.apiReportMakeManualDownloadTO1 = value;
    }

}
