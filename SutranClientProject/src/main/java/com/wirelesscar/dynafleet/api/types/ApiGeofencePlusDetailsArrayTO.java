
package com.wirelesscar.dynafleet.api.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Api_GeofencePlusDetailsArrayTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Api_GeofencePlusDetailsArrayTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geofences" type="{http://wirelesscar.com/dynafleet/api/types}Api_GeofencePlusDetailsTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Api_GeofencePlusDetailsArrayTO", propOrder = {
    "geofences"
})
public class ApiGeofencePlusDetailsArrayTO {

    @XmlElement(nillable = true)
    protected List<ApiGeofencePlusDetailsTO> geofences;

    /**
     * Gets the value of the geofences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geofences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeofences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiGeofencePlusDetailsTO }
     * 
     * 
     */
    public List<ApiGeofencePlusDetailsTO> getGeofences() {
        if (geofences == null) {
            geofences = new ArrayList<ApiGeofencePlusDetailsTO>();
        }
        return this.geofences;
    }

}
