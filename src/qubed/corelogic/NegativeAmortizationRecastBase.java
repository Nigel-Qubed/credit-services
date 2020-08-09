//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeAmortizationRecastBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegativeAmortizationRecastBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BothScheduledAndMaximumPercent"/>
 *     &lt;enumeration value="MaximumPercent"/>
 *     &lt;enumeration value="Scheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NegativeAmortizationRecastBase")
@XmlEnum
public enum NegativeAmortizationRecastBase {


    /**
     * The negative amortization ends on first occurrence of predetermined percent or a specific point in time.
     * 
     */
    @XmlEnumValue("BothScheduledAndMaximumPercent")
    BOTH_SCHEDULED_AND_MAXIMUM_PERCENT("BothScheduledAndMaximumPercent"),

    /**
     * The negative amortization ends when it reaches a predetermined percent.
     * 
     */
    @XmlEnumValue("MaximumPercent")
    MAXIMUM_PERCENT("MaximumPercent"),

    /**
     * The negative amortization is scheduled to end at a specific point in time.
     * 
     */
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled");
    private final String value;

    NegativeAmortizationRecastBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NegativeAmortizationRecastBase fromValue(String v) {
        for (NegativeAmortizationRecastBase c: NegativeAmortizationRecastBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
