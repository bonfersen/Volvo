
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_OrderGetCustomerOrderTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_OrderGetCustomerOrderTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://wirelesscar.com/dynafleet/api/types}Api_TransportCustomerId"/>
 *         &lt;element name="orderCustomerRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Api_OrderGetCustomerOrderTO", propOrder = {
    "customerId",
    "orderCustomerRef",
    "sessionId"
})
public class ApiOrderGetCustomerOrderTO {

    @XmlElement(required = true)
    protected ApiTransportCustomerId customerId;
    @XmlElement(required = true)
    protected String orderCustomerRef;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTransportCustomerId }
     *     
     */
    public ApiTransportCustomerId getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTransportCustomerId }
     *     
     */
    public void setCustomerId(ApiTransportCustomerId value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the orderCustomerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCustomerRef() {
        return orderCustomerRef;
    }

    /**
     * Sets the value of the orderCustomerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCustomerRef(String value) {
        this.orderCustomerRef = value;
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
