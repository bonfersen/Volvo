
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_VehicleArrayTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_VehicleArrayTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicles" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_VehicleArrayTO", propOrder = {
    "vehicles"
})
public class ApiVehicleArrayTO {

    @XmlElement(nillable = true)
    protected List<ApiVehicleTO> vehicles;

    /**
     * Gets the value of the vehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiVehicleTO }
     * 
     * 
     */
    public List<ApiVehicleTO> getVehicles() {
        if (vehicles == null) {
            vehicles = new ArrayList<ApiVehicleTO>();
        }
        return this.vehicles;
    }

}
