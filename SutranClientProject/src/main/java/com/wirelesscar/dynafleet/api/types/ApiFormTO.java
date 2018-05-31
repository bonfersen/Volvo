
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formFields" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormFieldArrayTO"/>
 *         &lt;element name="formId" type="{http://wirelesscar.com/dynafleet/api/types}Api_FormId"/>
 *         &lt;element name="formIsUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="messageForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_FormTO", propOrder = {
    "deleted",
    "displayName",
    "formFields",
    "formId",
    "formIsUsed",
    "messageForm"
})
public class ApiFormTO {

    protected boolean deleted;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected ApiFormFieldArrayTO formFields;
    @XmlElement(required = true, nillable = true)
    protected ApiFormId formId;
    protected boolean formIsUsed;
    protected boolean messageForm;

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the formFields property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormFieldArrayTO }
     *     
     */
    public ApiFormFieldArrayTO getFormFields() {
        return formFields;
    }

    /**
     * Sets the value of the formFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormFieldArrayTO }
     *     
     */
    public void setFormFields(ApiFormFieldArrayTO value) {
        this.formFields = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiFormId }
     *     
     */
    public ApiFormId getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiFormId }
     *     
     */
    public void setFormId(ApiFormId value) {
        this.formId = value;
    }

    /**
     * Gets the value of the formIsUsed property.
     * 
     */
    public boolean isFormIsUsed() {
        return formIsUsed;
    }

    /**
     * Sets the value of the formIsUsed property.
     * 
     */
    public void setFormIsUsed(boolean value) {
        this.formIsUsed = value;
    }

    /**
     * Gets the value of the messageForm property.
     * 
     */
    public boolean isMessageForm() {
        return messageForm;
    }

    /**
     * Sets the value of the messageForm property.
     * 
     */
    public void setMessageForm(boolean value) {
        this.messageForm = value;
    }

}
