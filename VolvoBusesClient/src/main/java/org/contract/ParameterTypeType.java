
package org.contract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="Fuel"/>
 *     &lt;enumeration value="HarshBrakingCount"/>
 *     &lt;enumeration value="HarshAccelerationCount"/>
 *     &lt;enumeration value="HarshCurvingCount"/>
 *     &lt;enumeration value="HarshInclinationCount"/>
 *     &lt;enumeration value="OverspeedingCount"/>
 *     &lt;enumeration value="AlcolockPositiveCount"/>
 *     &lt;enumeration value="AbsCount"/>
 *     &lt;enumeration value="BrakeCount"/>
 *     &lt;enumeration value="EspCount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterType")
@XmlEnum
public enum ParameterTypeType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),
    @XmlEnumValue("Fuel")
    FUEL("Fuel"),
    @XmlEnumValue("HarshBrakingCount")
    HARSH_BRAKING_COUNT("HarshBrakingCount"),
    @XmlEnumValue("HarshAccelerationCount")
    HARSH_ACCELERATION_COUNT("HarshAccelerationCount"),
    @XmlEnumValue("HarshCurvingCount")
    HARSH_CURVING_COUNT("HarshCurvingCount"),
    @XmlEnumValue("HarshInclinationCount")
    HARSH_INCLINATION_COUNT("HarshInclinationCount"),
    @XmlEnumValue("OverspeedingCount")
    OVERSPEEDING_COUNT("OverspeedingCount"),
    @XmlEnumValue("AlcolockPositiveCount")
    ALCOLOCK_POSITIVE_COUNT("AlcolockPositiveCount"),
    @XmlEnumValue("AbsCount")
    ABS_COUNT("AbsCount"),
    @XmlEnumValue("BrakeCount")
    BRAKE_COUNT("BrakeCount"),
    @XmlEnumValue("EspCount")
    ESP_COUNT("EspCount");
    private final String value;

    ParameterTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterTypeType fromValue(String v) {
        for (ParameterTypeType c: ParameterTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
