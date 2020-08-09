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
 * <p>Java class for PrepaymentPenaltyCalculationValueBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaymentPenaltyCalculationValueBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FixedAmount"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PercentageOfPrincipalBalance"/>
 *     &lt;enumeration value="QualifyingAmountOfCurtailment"/>
 *     &lt;enumeration value="SpecifiedMonthsOfInterest"/>
 *     &lt;enumeration value="YieldMaintenance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaymentPenaltyCalculationValueBase")
@XmlEnum
public enum PrepaymentPenaltyCalculationValueBase {

    @XmlEnumValue("FixedAmount")
    FIXED_AMOUNT("FixedAmount"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PercentageOfPrincipalBalance")
    PERCENTAGE_OF_PRINCIPAL_BALANCE("PercentageOfPrincipalBalance"),
    @XmlEnumValue("QualifyingAmountOfCurtailment")
    QUALIFYING_AMOUNT_OF_CURTAILMENT("QualifyingAmountOfCurtailment"),
    @XmlEnumValue("SpecifiedMonthsOfInterest")
    SPECIFIED_MONTHS_OF_INTEREST("SpecifiedMonthsOfInterest"),

    /**
     * A prepayment penalty that allows the lender to attain the same yield as if the borrower had made all scheduled mortgage payments until maturity.
     * 
     */
    @XmlEnumValue("YieldMaintenance")
    YIELD_MAINTENANCE("YieldMaintenance");
    private final String value;

    PrepaymentPenaltyCalculationValueBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaymentPenaltyCalculationValueBase fromValue(String v) {
        for (PrepaymentPenaltyCalculationValueBase c: PrepaymentPenaltyCalculationValueBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
