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
 * <p>Java class for TILPaymentSummaryItemBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TILPaymentSummaryItemBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AtFirstAdjustment"/>
 *     &lt;enumeration value="AtSecondAdjustment"/>
 *     &lt;enumeration value="Introductory"/>
 *     &lt;enumeration value="MaximumEver"/>
 *     &lt;enumeration value="MaximumFirstFiveYears"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TILPaymentSummaryItemBase")
@XmlEnum
public enum TILPaymentSummaryItemBase {


    /**
     * The interest rate and payment summary information at the time the first payment increase is scheduled to occur.
     * 
     */
    @XmlEnumValue("AtFirstAdjustment")
    AT_FIRST_ADJUSTMENT("AtFirstAdjustment"),

    /**
     * The interest rate and payment summary information at the time the second payment increase is scheduled to occur.
     * 
     */
    @XmlEnumValue("AtSecondAdjustment")
    AT_SECOND_ADJUSTMENT("AtSecondAdjustment"),

    /**
     * The interest rate and payment summary information at consummation and for the period of time until the first interest rate adjustment may occur.
     * 
     */
    @XmlEnumValue("Introductory")
    INTRODUCTORY("Introductory"),

    /**
     * The maximum interest rate and payment summary information that may apply during the life of the loan and earliest date on which that rate may apply.
     * 
     */
    @XmlEnumValue("MaximumEver")
    MAXIMUM_EVER("MaximumEver"),

    /**
     * The maximum interest rate and payment summary information during the first five years after consummation and earliest date on which that rate may apply.
     * 
     */
    @XmlEnumValue("MaximumFirstFiveYears")
    MAXIMUM_FIRST_FIVE_YEARS("MaximumFirstFiveYears"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TILPaymentSummaryItemBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TILPaymentSummaryItemBase fromValue(String v) {
        for (TILPaymentSummaryItemBase c: TILPaymentSummaryItemBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
