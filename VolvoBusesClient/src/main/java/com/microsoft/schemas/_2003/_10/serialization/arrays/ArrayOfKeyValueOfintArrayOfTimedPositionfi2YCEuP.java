
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.contract.ArrayOfTimedPositionType;


/**
 * <p>Java class for ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfintArrayOfTimedPositionfi2YCEuP" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfTimedPosition"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP", propOrder = {
    "keyValueOfintArrayOfTimedPositionfi2YCEuP"
})
public class ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP {

    @XmlElement(name = "KeyValueOfintArrayOfTimedPositionfi2YCEuP")
    protected List<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP> keyValueOfintArrayOfTimedPositionfi2YCEuP;

    /**
     * Gets the value of the keyValueOfintArrayOfTimedPositionfi2YCEuP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintArrayOfTimedPositionfi2YCEuP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintArrayOfTimedPositionfi2YCEuP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP> getKeyValueOfintArrayOfTimedPositionfi2YCEuP() {
        if (keyValueOfintArrayOfTimedPositionfi2YCEuP == null) {
            keyValueOfintArrayOfTimedPositionfi2YCEuP = new ArrayList<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP>();
        }
        return this.keyValueOfintArrayOfTimedPositionfi2YCEuP;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}ArrayOfTimedPosition"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfintArrayOfTimedPositionfi2YCEuP {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfTimedPositionType value;

        /**
         * Gets the value of the key property.
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfTimedPositionType }
         *     
         */
        public ArrayOfTimedPositionType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfTimedPositionType }
         *     
         */
        public void setValue(ArrayOfTimedPositionType value) {
            this.value = value;
        }

    }

}
