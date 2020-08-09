//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeclosureSaleCancellationReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForeclosureSaleCancellationReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ExcessiveDelays"/>
 *     &lt;enumeration value="FilingErrors"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Payoff"/>
 *     &lt;enumeration value="Workout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForeclosureSaleCancellationReasonBase")
@XmlEnum
public enum ForeclosureSaleCancellationReasonBase {


    /**
     * There were delays in the foreclosure processing that exceeded expected time frames.
     * 
     */
    @XmlEnumValue("ExcessiveDelays")
    EXCESSIVE_DELAYS("ExcessiveDelays"),

    /**
     * There were errors in the foreclosure documents filed with the court.
     * 
     */
    @XmlEnumValue("FilingErrors")
    FILING_ERRORS("FilingErrors"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The borrower has paid off the loan.
     * 
     */
    @XmlEnumValue("Payoff")
    PAYOFF("Payoff"),

    /**
     * A borrower has entered into a workout.
     * 
     */
    @XmlEnumValue("Workout")
    WORKOUT("Workout");
    private final String value;

    ForeclosureSaleCancellationReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeclosureSaleCancellationReasonBase fromValue(String v) {
        for (ForeclosureSaleCancellationReasonBase c: ForeclosureSaleCancellationReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
