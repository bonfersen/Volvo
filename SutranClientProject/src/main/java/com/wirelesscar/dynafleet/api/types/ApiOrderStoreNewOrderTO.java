
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_OrderStoreNewOrderTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_OrderStoreNewOrderTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiOrder" type="{http://wirelesscar.com/dynafleet/api/types}Api_OrderTO"/>
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
@XmlType(name = "Api_OrderStoreNewOrderTO", propOrder = {
    "apiOrder",
    "sessionId"
})
public class ApiOrderStoreNewOrderTO {

    @XmlElement(required = true)
    protected ApiOrderTO apiOrder;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the apiOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ApiOrderTO }
     *     
     */
    public ApiOrderTO getApiOrder() {
        return apiOrder;
    }

    /**
     * Sets the value of the apiOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiOrderTO }
     *     
     */
    public void setApiOrder(ApiOrderTO value) {
        this.apiOrder = value;
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
