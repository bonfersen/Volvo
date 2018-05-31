
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDtjReportData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDtjReportData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api_GetDtjActivitiesTO_1" type="{http://wirelesscar.com/dynafleet/api/types}Api_GetDtjActivitiesTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDtjReportData", propOrder = {
    "apiGetDtjActivitiesTO1"
})
public class GetDtjReportData {

    @XmlElement(name = "Api_GetDtjActivitiesTO_1", required = true, nillable = true)
    protected ApiGetDtjActivitiesTO apiGetDtjActivitiesTO1;

    /**
     * Gets the value of the apiGetDtjActivitiesTO1 property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGetDtjActivitiesTO }
     *     
     */
    public ApiGetDtjActivitiesTO getApiGetDtjActivitiesTO1() {
        return apiGetDtjActivitiesTO1;
    }

    /**
     * Sets the value of the apiGetDtjActivitiesTO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGetDtjActivitiesTO }
     *     
     */
    public void setApiGetDtjActivitiesTO1(ApiGetDtjActivitiesTO value) {
        this.apiGetDtjActivitiesTO1 = value;
    }

}
