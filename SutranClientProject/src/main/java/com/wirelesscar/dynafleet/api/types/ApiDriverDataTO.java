
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DriverDataTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DriverDataTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataEntries" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverDataEntryTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="driverId" type="{http://wirelesscar.com/dynafleet/api/types}Api_Long"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_DriverDataTO", propOrder = {
    "dataEntries",
    "driverId",
    "firstName",
    "lastName"
})
public class ApiDriverDataTO {

    @XmlElement(nillable = true)
    protected List<ApiDriverDataEntryTO> dataEntries;
    @XmlElement(required = true, nillable = true)
    protected ApiLong driverId;
    @XmlElement(required = true, nillable = true)
    protected String firstName;
    @XmlElement(required = true, nillable = true)
    protected String lastName;

    /**
     * Gets the value of the dataEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiDriverDataEntryTO }
     * 
     * 
     */
    public List<ApiDriverDataEntryTO> getDataEntries() {
        if (dataEntries == null) {
            dataEntries = new ArrayList<ApiDriverDataEntryTO>();
        }
        return this.dataEntries;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLong }
     *     
     */
    public ApiLong getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLong }
     *     
     */
    public void setDriverId(ApiLong value) {
        this.driverId = value;
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

}
