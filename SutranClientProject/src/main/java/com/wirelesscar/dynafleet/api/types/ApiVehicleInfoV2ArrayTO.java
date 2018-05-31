
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_VehicleInfoV2ArrayTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_VehicleInfoV2ArrayTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleInfos" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleInfoV2TO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_VehicleInfoV2ArrayTO", propOrder = {
    "vehicleInfos"
})
public class ApiVehicleInfoV2ArrayTO {

    @XmlElement(nillable = true)
    protected List<ApiVehicleInfoV2TO> vehicleInfos;

    /**
     * Gets the value of the vehicleInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiVehicleInfoV2TO }
     * 
     * 
     */
    public List<ApiVehicleInfoV2TO> getVehicleInfos() {
        if (vehicleInfos == null) {
            vehicleInfos = new ArrayList<ApiVehicleInfoV2TO>();
        }
        return this.vehicleInfos;
    }

}
