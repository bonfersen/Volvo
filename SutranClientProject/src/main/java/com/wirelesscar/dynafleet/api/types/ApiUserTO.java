
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_UserTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_UserTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedDrivers" type="{http://wirelesscar.com/dynafleet/api/types}Api_LongArrayTO"/>
 *         &lt;element name="assignedVehicles" type="{http://wirelesscar.com/dynafleet/api/types}Api_LongArrayTO"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://wirelesscar.com/dynafleet/api/types}Api_UserId"/>
 *         &lt;element name="isDeleted" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="showCommunicationCostWarning" type="{http://wirelesscar.com/dynafleet/api/types}Api_Boolean"/>
 *         &lt;element name="userRoles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_UserTO", propOrder = {
    "assignedDrivers",
    "assignedVehicles",
    "description",
    "email",
    "emailAlias",
    "firstName",
    "id",
    "isDeleted",
    "language",
    "lastName",
    "loginname",
    "measureType",
    "showCommunicationCostWarning",
    "userRoles"
})
public class ApiUserTO {

    @XmlElement(required = true, nillable = true)
    protected ApiLongArrayTO assignedDrivers;
    @XmlElement(required = true, nillable = true)
    protected ApiLongArrayTO assignedVehicles;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String emailAlias;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected ApiUserId id;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean isDeleted;
    @XmlElement(required = true, nillable = true)
    protected String language;
    @XmlElement(required = true, nillable = true)
    protected String lastName;
    @XmlElement(required = true, nillable = true)
    protected String loginname;
    @XmlElement(required = true, nillable = true)
    protected String measureType;
    @XmlElement(required = true, nillable = true)
    protected ApiBoolean showCommunicationCostWarning;
    @XmlElement(nillable = true)
    protected List<String> userRoles;

    /**
     * Gets the value of the assignedDrivers property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLongArrayTO }
     *     
     */
    public ApiLongArrayTO getAssignedDrivers() {
        return assignedDrivers;
    }

    /**
     * Sets the value of the assignedDrivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLongArrayTO }
     *     
     */
    public void setAssignedDrivers(ApiLongArrayTO value) {
        this.assignedDrivers = value;
    }

    /**
     * Gets the value of the assignedVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLongArrayTO }
     *     
     */
    public ApiLongArrayTO getAssignedVehicles() {
        return assignedVehicles;
    }

    /**
     * Sets the value of the assignedVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLongArrayTO }
     *     
     */
    public void setAssignedVehicles(ApiLongArrayTO value) {
        this.assignedVehicles = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAlias() {
        return emailAlias;
    }

    /**
     * Sets the value of the emailAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAlias(String value) {
        this.emailAlias = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ApiUserId }
     *     
     */
    public ApiUserId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiUserId }
     *     
     */
    public void setId(ApiUserId value) {
        this.id = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setIsDeleted(ApiBoolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the loginname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * Sets the value of the loginname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginname(String value) {
        this.loginname = value;
    }

    /**
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

    /**
     * Gets the value of the showCommunicationCostWarning property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBoolean }
     *     
     */
    public ApiBoolean getShowCommunicationCostWarning() {
        return showCommunicationCostWarning;
    }

    /**
     * Sets the value of the showCommunicationCostWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBoolean }
     *     
     */
    public void setShowCommunicationCostWarning(ApiBoolean value) {
        this.showCommunicationCostWarning = value;
    }

    /**
     * Gets the value of the userRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserRoles() {
        if (userRoles == null) {
            userRoles = new ArrayList<String>();
        }
        return this.userRoles;
    }

}
