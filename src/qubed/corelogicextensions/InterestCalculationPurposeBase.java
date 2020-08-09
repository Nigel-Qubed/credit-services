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
 * <p>Java class for InterestCalculationPurposeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestCalculationPurposeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Draw"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Payoff"/>
 *     &lt;enumeration value="ServicerAdvance"/>
 *     &lt;enumeration value="Standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestCalculationPurposeBase")
@XmlEnum
public enum InterestCalculationPurposeBase {


    /**
     * The interest calculation will be used for a draw.
     * 
     */
    @XmlEnumValue("Draw")
    DRAW("Draw"),

    /**
     * The interest calculation will be used for other purpose.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The interest calculation will be used for a payoff.
     * 
     */
    @XmlEnumValue("Payoff")
    PAYOFF("Payoff"),

    /**
     * The interest calculation will be used for a servicer advance.
     * 
     */
    @XmlEnumValue("ServicerAdvance")
    SERVICER_ADVANCE("ServicerAdvance"),

    /**
     * The interest calculation will be used for the regular payment.
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard");
    private final String value;

    InterestCalculationPurposeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestCalculationPurposeBase fromValue(String v) {
        for (InterestCalculationPurposeBase c: InterestCalculationPurposeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
