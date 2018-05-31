
package org.contract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmissionProfileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmissionProfileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Euro0"/>
 *     &lt;enumeration value="EuroI"/>
 *     &lt;enumeration value="EuroII"/>
 *     &lt;enumeration value="EuroIII"/>
 *     &lt;enumeration value="EuroIV"/>
 *     &lt;enumeration value="EuroV"/>
 *     &lt;enumeration value="EuroVI"/>
 *     &lt;enumeration value="EEV"/>
 *     &lt;enumeration value="EuroVEEV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmissionProfileType")
@XmlEnum
public enum EmissionProfileTypeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Euro0")
    EURO_0("Euro0"),
    @XmlEnumValue("EuroI")
    EURO_I("EuroI"),
    @XmlEnumValue("EuroII")
    EURO_II("EuroII"),
    @XmlEnumValue("EuroIII")
    EURO_III("EuroIII"),
    @XmlEnumValue("EuroIV")
    EURO_IV("EuroIV"),
    @XmlEnumValue("EuroV")
    EURO_V("EuroV"),
    @XmlEnumValue("EuroVI")
    EURO_VI("EuroVI"),
    EEV("EEV"),
    @XmlEnumValue("EuroVEEV")
    EURO_VEEV("EuroVEEV");
    private final String value;

    EmissionProfileTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmissionProfileTypeType fromValue(String v) {
        for (EmissionProfileTypeType c: EmissionProfileTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
