
package org.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Contract.Data}EventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventType", propOrder = {
    "eventType"
})
public class ArrayOfEventTypeType {

    @XmlElement(name = "EventType")
    protected List<EventTypeType> eventType;

    /**
     * Gets the value of the eventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeType }
     * 
     * 
     */
    public List<EventTypeType> getEventType() {
        if (eventType == null) {
            eventType = new ArrayList<EventTypeType>();
        }
        return this.eventType;
    }

}
