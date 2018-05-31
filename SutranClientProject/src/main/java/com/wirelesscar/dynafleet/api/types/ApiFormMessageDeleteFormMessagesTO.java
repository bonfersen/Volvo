
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageDeleteFormMessagesTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageDeleteFormMessagesTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formMessageIdList" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormMessageId" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Api_FormMessageDeleteFormMessagesTO", propOrder = {
    "formMessageIdList",
    "sessionId"
})
public class ApiFormMessageDeleteFormMessagesTO {

    protected List<ApiFormMessageId> formMessageIdList;
    @XmlElement(required = true)
    protected ApiSessionId sessionId;

    /**
     * Gets the value of the formMessageIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formMessageIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormMessageIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiFormMessageId }
     * 
     * 
     */
    public List<ApiFormMessageId> getFormMessageIdList() {
        if (formMessageIdList == null) {
            formMessageIdList = new ArrayList<ApiFormMessageId>();
        }
        return this.formMessageIdList;
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
