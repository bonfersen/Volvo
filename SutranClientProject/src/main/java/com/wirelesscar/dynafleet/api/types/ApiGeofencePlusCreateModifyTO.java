
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofencePlusCreateModifyTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofencePlusCreateModifyTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofencePlusDetailsTO"/>
 *         &lt;element name="sessionId" type="{http://wirelesscar.com/dynafleet/api/types}Api_SessionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofencePlusCreateModifyTO", propOrder = {
    "details",
    "sessionId"
})
public class ApiGeofencePlusCreateModifyTO {

    @XmlElement(required = true)
    protected ApiGeofencePlusDetailsTO details;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ApiGeofencePlusDetailsTO }
     *     
     */
    public ApiGeofencePlusDetailsTO getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiGeofencePlusDetailsTO }
     *     
     */
    public void setDetails(ApiGeofencePlusDetailsTO value) {
        this.details = value;
    }

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

}
