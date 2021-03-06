
package org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FleetMgmtException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Service.Data.Exception", "FleetMgmtException");
    private final static QName _FleetMgmtExceptionMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Service.Data.Exception", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.tmix_cap_fleetmgmt_library_wcf_external_service_data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FleetMgmtException }
     * 
     */
    public FleetMgmtException createFleetMgmtException() {
        return new FleetMgmtException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FleetMgmtException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Service.Data.Exception", name = "FleetMgmtException")
    public JAXBElement<FleetMgmtException> createFleetMgmtException(FleetMgmtException value) {
        return new JAXBElement<FleetMgmtException>(_FleetMgmtException_QNAME, FleetMgmtException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tmix.Cap.FleetMgmt.Library.Wcf.External.Service.Data.Exception", name = "Message", scope = FleetMgmtException.class)
    public JAXBElement<String> createFleetMgmtExceptionMessage(String value) {
        return new JAXBElement<String>(_FleetMgmtExceptionMessage_QNAME, String.class, FleetMgmtException.class, value);
    }

}
