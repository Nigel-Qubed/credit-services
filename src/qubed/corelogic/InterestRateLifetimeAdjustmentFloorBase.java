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
 * <p>Java class for InterestRateLifetimeAdjustmentFloorBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestRateLifetimeAdjustmentFloorBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AbsoluteMinimumNetInterestRate"/>
 *     &lt;enumeration value="FactorAddedToOriginalNoteRate"/>
 *     &lt;enumeration value="InitialNoteRate"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestRateLifetimeAdjustmentFloorBase")
@XmlEnum
public enum InterestRateLifetimeAdjustmentFloorBase {

    @XmlEnumValue("AbsoluteMinimumNetInterestRate")
    ABSOLUTE_MINIMUM_NET_INTEREST_RATE("AbsoluteMinimumNetInterestRate"),
    @XmlEnumValue("FactorAddedToOriginalNoteRate")
    FACTOR_ADDED_TO_ORIGINAL_NOTE_RATE("FactorAddedToOriginalNoteRate"),
    @XmlEnumValue("InitialNoteRate")
    INITIAL_NOTE_RATE("InitialNoteRate"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    InterestRateLifetimeAdjustmentFloorBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestRateLifetimeAdjustmentFloorBase fromValue(String v) {
        for (InterestRateLifetimeAdjustmentFloorBase c: InterestRateLifetimeAdjustmentFloorBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
