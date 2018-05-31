
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_FormFieldTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_FormFieldTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxStringLength" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="mobileManadatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mobileReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mobileWriteIfYouLike" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="officeManadatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="officeReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="officeWriteIfYouLike" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_FormFieldTO", propOrder = {
    "dataType",
    "fieldDescription",
    "maxStringLength",
    "mobileManadatory",
    "mobileReadOnly",
    "mobileWriteIfYouLike",
    "officeManadatory",
    "officeReadOnly",
    "officeWriteIfYouLike"
})
public class ApiFormFieldTO {

    @XmlElement(required = true, nillable = true)
    protected String dataType;
    @XmlElement(required = true, nillable = true)
    protected String fieldDescription;
    @XmlElement(required = true, nillable = true)
    protected ApiLong maxStringLength;
    protected boolean mobileManadatory;
    protected boolean mobileReadOnly;
    protected boolean mobileWriteIfYouLike;
    protected boolean officeManadatory;
    protected boolean officeReadOnly;
    protected boolean officeWriteIfYouLike;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the fieldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Sets the value of the fieldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDescription(String value) {
        this.fieldDescription = value;
    }

    /**
     * Gets the value of the maxStringLength property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Sets the value of the maxStringLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setMaxStringLength(ApiLong value) {
        this.maxStringLength = value;
    }

    /**
     * Gets the value of the mobileManadatory property.
     * 
     */
    public boolean isMobileManadatory() {
        return mobileManadatory;
    }

    /**
     * Sets the value of the mobileManadatory property.
     * 
     */
    public void setMobileManadatory(boolean value) {
        this.mobileManadatory = value;
    }

    /**
     * Gets the value of the mobileReadOnly property.
     * 
     */
    public boolean isMobileReadOnly() {
        return mobileReadOnly;
    }

    /**
     * Sets the value of the mobileReadOnly property.
     * 
     */
    public void setMobileReadOnly(boolean value) {
        this.mobileReadOnly = value;
    }

    /**
     * Gets the value of the mobileWriteIfYouLike property.
     * 
     */
    public boolean isMobileWriteIfYouLike() {
        return mobileWriteIfYouLike;
    }

    /**
     * Sets the value of the mobileWriteIfYouLike property.
     * 
     */
    public void setMobileWriteIfYouLike(boolean value) {
        this.mobileWriteIfYouLike = value;
    }

    /**
     * Gets the value of the officeManadatory property.
     * 
     */
    public boolean isOfficeManadatory() {
        return officeManadatory;
    }

    /**
     * Sets the value of the officeManadatory property.
     * 
     */
    public void setOfficeManadatory(boolean value) {
        this.officeManadatory = value;
    }

    /**
     * Gets the value of the officeReadOnly property.
     * 
     */
    public boolean isOfficeReadOnly() {
        return officeReadOnly;
    }

    /**
     * Sets the value of the officeReadOnly property.
     * 
     */
    public void setOfficeReadOnly(boolean value) {
        this.officeReadOnly = value;
    }

    /**
     * Gets the value of the officeWriteIfYouLike property.
     * 
     */
    public boolean isOfficeWriteIfYouLike() {
        return officeWriteIfYouLike;
    }

    /**
     * Sets the value of the officeWriteIfYouLike property.
     * 
     */
    public void setOfficeWriteIfYouLike(boolean value) {
        this.officeWriteIfYouLike = value;
    }

}
