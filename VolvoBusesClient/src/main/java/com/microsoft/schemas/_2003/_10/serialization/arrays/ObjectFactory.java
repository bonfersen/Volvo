
package com.microsoft.schemas._2003._10.serialization.arrays;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas._2003._10.serialization.arrays package. 
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

    private final static QName _ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas._2003._10.serialization.arrays
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP }
     * 
     */
    public ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP createArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP() {
        return new ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP }
     * 
     */
    public ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP createArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuPKeyValueOfintArrayOfTimedPositionfi2YCEuP() {
        return new ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.KeyValueOfintArrayOfTimedPositionfi2YCEuP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP")
    public JAXBElement<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP> createArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP(ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP value) {
        return new JAXBElement<ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP>(_ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP_QNAME, ArrayOfKeyValueOfintArrayOfTimedPositionfi2YCEuP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

}
