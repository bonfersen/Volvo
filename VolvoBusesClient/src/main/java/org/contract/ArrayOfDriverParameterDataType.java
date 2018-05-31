
package org.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDriverParameterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDriverParameterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverParameterData" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}DriverParameterData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDriverParameterData", propOrder = {
    "driverParameterData"
})
public class ArrayOfDriverParameterDataType {

    @XmlElement(name = "DriverParameterData", nillable = true)
    protected List<DriverParameterDataType> driverParameterData;

    /**
     * Gets the value of the driverParameterData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverParameterData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverParameterData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverParameterDataType }
     * 
     * 
     */
    public List<DriverParameterDataType> getDriverParameterData() {
        if (driverParameterData == null) {
            driverParameterData = new ArrayList<DriverParameterDataType>();
        }
        return this.driverParameterData;
    }

}
