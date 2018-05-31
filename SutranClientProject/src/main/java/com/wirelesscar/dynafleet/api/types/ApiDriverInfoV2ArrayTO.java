
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_DriverInfoV2ArrayTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_DriverInfoV2ArrayTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driverInfos" type="{http://wirelesscar.com/dynafleet/api/types}Api_DriverInfoV2TO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_DriverInfoV2ArrayTO", propOrder = {
    "driverInfos"
})
public class ApiDriverInfoV2ArrayTO {

    @XmlElement(nillable = true)
    protected List<ApiDriverInfoV2TO> driverInfos;

    /**
     * Gets the value of the driverInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiDriverInfoV2TO }
     * 
     * 
     */
    public List<ApiDriverInfoV2TO> getDriverInfos() {
        if (driverInfos == null) {
            driverInfos = new ArrayList<ApiDriverInfoV2TO>();
        }
        return this.driverInfos;
    }

}
