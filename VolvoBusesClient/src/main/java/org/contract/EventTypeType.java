
package org.contract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unspecified"/>
 *     &lt;enumeration value="HarshAcceleration"/>
 *     &lt;enumeration value="HarshBraking"/>
 *     &lt;enumeration value="HarshCurving"/>
 *     &lt;enumeration value="OverspeedExceeded"/>
 *     &lt;enumeration value="OverspeedCleared"/>
 *     &lt;enumeration value="AlcolockPositive"/>
 *     &lt;enumeration value="PanicAlarmActivate"/>
 *     &lt;enumeration value="PanicAlarmUpdate"/>
 *     &lt;enumeration value="PanicAlarmDeactivate"/>
 *     &lt;enumeration value="PanicAlarmStationaryLimit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventTypeType {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("HarshAcceleration")
    HARSH_ACCELERATION("HarshAcceleration"),
    @XmlEnumValue("HarshBraking")
    HARSH_BRAKING("HarshBraking"),
    @XmlEnumValue("HarshCurving")
    HARSH_CURVING("HarshCurving"),
    @XmlEnumValue("OverspeedExceeded")
    OVERSPEED_EXCEEDED("OverspeedExceeded"),
    @XmlEnumValue("OverspeedCleared")
    OVERSPEED_CLEARED("OverspeedCleared"),
    @XmlEnumValue("AlcolockPositive")
    ALCOLOCK_POSITIVE("AlcolockPositive"),
    @XmlEnumValue("PanicAlarmActivate")
    PANIC_ALARM_ACTIVATE("PanicAlarmActivate"),
    @XmlEnumValue("PanicAlarmUpdate")
    PANIC_ALARM_UPDATE("PanicAlarmUpdate"),
    @XmlEnumValue("PanicAlarmDeactivate")
    PANIC_ALARM_DEACTIVATE("PanicAlarmDeactivate"),
    @XmlEnumValue("PanicAlarmStationaryLimit")
    PANIC_ALARM_STATIONARY_LIMIT("PanicAlarmStationaryLimit");
    private final String value;

    EventTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventTypeType fromValue(String v) {
        for (EventTypeType c: EventTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
