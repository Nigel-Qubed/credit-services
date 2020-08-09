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
 * <p>Java class for InterestRateAdjustmentCalculationMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestRateAdjustmentCalculationMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AddFixedPercentageToCurrentInterestRate"/>
 *     &lt;enumeration value="AddFixedPercentageToOriginalInterestRate"/>
 *     &lt;enumeration value="AddImpliedMarginToValueOfFinancialIndex"/>
 *     &lt;enumeration value="AddIndexChangeToOriginalInterestRate"/>
 *     &lt;enumeration value="AddMarginToValueOfFinancialIndex"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Renegotiated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestRateAdjustmentCalculationMethodBase")
@XmlEnum
public enum InterestRateAdjustmentCalculationMethodBase {

    @XmlEnumValue("AddFixedPercentageToCurrentInterestRate")
    ADD_FIXED_PERCENTAGE_TO_CURRENT_INTEREST_RATE("AddFixedPercentageToCurrentInterestRate"),
    @XmlEnumValue("AddFixedPercentageToOriginalInterestRate")
    ADD_FIXED_PERCENTAGE_TO_ORIGINAL_INTEREST_RATE("AddFixedPercentageToOriginalInterestRate"),
    @XmlEnumValue("AddImpliedMarginToValueOfFinancialIndex")
    ADD_IMPLIED_MARGIN_TO_VALUE_OF_FINANCIAL_INDEX("AddImpliedMarginToValueOfFinancialIndex"),
    @XmlEnumValue("AddIndexChangeToOriginalInterestRate")
    ADD_INDEX_CHANGE_TO_ORIGINAL_INTEREST_RATE("AddIndexChangeToOriginalInterestRate"),
    @XmlEnumValue("AddMarginToValueOfFinancialIndex")
    ADD_MARGIN_TO_VALUE_OF_FINANCIAL_INDEX("AddMarginToValueOfFinancialIndex"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Renegotiated")
    RENEGOTIATED("Renegotiated");
    private final String value;

    InterestRateAdjustmentCalculationMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestRateAdjustmentCalculationMethodBase fromValue(String v) {
        for (InterestRateAdjustmentCalculationMethodBase c: InterestRateAdjustmentCalculationMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
