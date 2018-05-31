
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_PoiTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_PoiTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="deletedTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastModifyTime" type="{http://wirelesscar.com/dynafleet/api/types}Api_Date"/>
 *         &lt;element name="latitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="longitude" type="{http://wirelesscar.com/dynafleet/api/types}Api_Double"/>
 *         &lt;element name="poiId" type="{http://wirelesscar.com/dynafleet/api/types}Api_PoiId"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_PoiTO", propOrder = {
    "category",
    "city",
    "country",
    "createTime",
    "deletedTime",
    "description",
    "displayName",
    "lastModifyTime",
    "latitude",
    "longitude",
    "poiId",
    "street"
})
public class ApiPoiTO {

    @XmlElement(required = true)
    protected ApiLong category;
    @XmlElement(required = true, nillable = true)
    protected String city;
    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected ApiDate createTime;
    @XmlElement(required = true, nillable = true)
    protected ApiDate deletedTime;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected ApiDate lastModifyTime;
    @XmlElement(required = true)
    protected ApiDouble latitude;
    @XmlElement(required = true)
    protected ApiDouble longitude;
    @XmlElement(required = true, nillable = true)
    protected ApiPoiId poiId;
    @XmlElement(required = true, nillable = true)
    protected String street;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setCategory(ApiLong value) {
        this.category = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setCreateTime(ApiDate value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the deletedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getDeletedTime() {
        return deletedTime;
    }

    /**
     * Sets the value of the deletedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setDeletedTime(ApiDate value) {
        this.deletedTime = value;
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
     * Gets the value of the lastModifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDate }
     *     
     */
    public ApiDate getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * Sets the value of the lastModifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDate }
     *     
     */
    public void setLastModifyTime(ApiDate value) {
        this.lastModifyTime = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLatitude(ApiDouble value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDouble }
     *     
     */
    public ApiDouble getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDouble }
     *     
     */
    public void setLongitude(ApiDouble value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPoiId }
     *     
     */
    public ApiPoiId getPoiId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPoiId }
     *     
     */
    public void setPoiId(ApiPoiId value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

}
