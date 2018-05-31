
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormMessageFieldTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormMessageFieldTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formFieldIndex" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_FormMessageFieldTO", propOrder = {
    "fieldData",
    "formFieldIndex"
})
public class ApiFormMessageFieldTO {

    @XmlElement(required = true, nillable = true)
    protected String fieldData;
    @XmlElement(required = true)
    protected ApiLong formFieldIndex;

    /**
     * Gets the value of the fieldData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldData() {
        return fieldData;
    }

    /**
     * Sets the value of the fieldData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldData(String value) {
        this.fieldData = value;
    }

    /**
     * Gets the value of the formFieldIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getFormFieldIndex() {
        return formFieldIndex;
    }

    /**
     * Sets the value of the formFieldIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setFormFieldIndex(ApiLong value) {
        this.formFieldIndex = value;
    }

}
