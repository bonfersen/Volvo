
package org.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfParameterDoubleData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfParameterDoubleData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParameterDoubleData" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ParameterDoubleData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfParameterDoubleData", propOrder = {
    "parameterDoubleData"
})
public class ArrayOfParameterDoubleDataType {

    @XmlElement(name = "ParameterDoubleData", nillable = true)
    protected List<ParameterDoubleDataType> parameterDoubleData;

    /**
     * Gets the value of the parameterDoubleData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterDoubleData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterDoubleData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterDoubleDataType }
     * 
     * 
     */
    public List<ParameterDoubleDataType> getParameterDoubleData() {
        if (parameterDoubleData == null) {
            parameterDoubleData = new ArrayList<ParameterDoubleDataType>();
        }
        return this.parameterDoubleData;
    }

}
