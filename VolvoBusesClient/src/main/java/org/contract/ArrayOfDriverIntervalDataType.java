
package org.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDriverIntervalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDriverIntervalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverIntervalData" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}DriverIntervalData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDriverIntervalData", propOrder = {
    "driverIntervalData"
})
public class ArrayOfDriverIntervalDataType {

    @XmlElement(name = "DriverIntervalData", nillable = true)
    protected List<DriverIntervalDataType> driverIntervalData;

    /**
     * Gets the value of the driverIntervalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverIntervalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverIntervalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverIntervalDataType }
     * 
     * 
     */
    public List<DriverIntervalDataType> getDriverIntervalData() {
        if (driverIntervalData == null) {
            driverIntervalData = new ArrayList<DriverIntervalDataType>();
        }
        return this.driverIntervalData;
    }

}
