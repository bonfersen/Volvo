
package org.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStandardFuelConsumptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStandardFuelConsumptionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardFuelConsumptionData" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}StandardFuelConsumptionData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStandardFuelConsumptionData", propOrder = {
    "standardFuelConsumptionData"
})
public class ArrayOfStandardFuelConsumptionDataType {

    @XmlElement(name = "StandardFuelConsumptionData", nillable = true)
    protected List<StandardFuelConsumptionDataType> standardFuelConsumptionData;

    /**
     * Gets the value of the standardFuelConsumptionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardFuelConsumptionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardFuelConsumptionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardFuelConsumptionDataType }
     * 
     * 
     */
    public List<StandardFuelConsumptionDataType> getStandardFuelConsumptionData() {
        if (standardFuelConsumptionData == null) {
            standardFuelConsumptionData = new ArrayList<StandardFuelConsumptionDataType>();
        }
        return this.standardFuelConsumptionData;
    }

}
