
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiVADAdminGetDriverTimesTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiVADAdminGetDriverTimesTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *         &lt;element name="driverIds" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverIdArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiVADAdminGetDriverTimesTO", propOrder = {
    "sessionId",
    "driverIds"
})
public class ApiVADAdminGetDriverTimesTO {

    @XmlElement(required = true)
    protected ApiSessionId sessionId;
    @XmlElement(required = true)
    protected ApiDriverIdArray driverIds;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSessionId }
     *     
     */
    public ApiSessionId getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSessionId }
     *     
     */
    public void setSessionId(ApiSessionId value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the driverIds property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDriverIdArray }
     *     
     */
    public ApiDriverIdArray getDriverIds() {
        return driverIds;
    }

    /**
     * Sets the value of the driverIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDriverIdArray }
     *     
     */
    public void setDriverIds(ApiDriverIdArray value) {
        this.driverIds = value;
    }

}
