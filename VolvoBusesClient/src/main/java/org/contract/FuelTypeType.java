
package org.contract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Diesel"/>
 *     &lt;enumeration value="CNG"/>
 *     &lt;enumeration value="DieselElectricalHybrid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FuelType")
@XmlEnum
public enum FuelTypeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Diesel")
    DIESEL("Diesel"),
    CNG("CNG"),
    @XmlEnumValue("DieselElectricalHybrid")
    DIESEL_ELECTRICAL_HYBRID("DieselElectricalHybrid");
    private final String value;

    FuelTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeType fromValue(String v) {
        for (FuelTypeType c: FuelTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
