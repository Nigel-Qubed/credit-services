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
 * <p>Java class for PerChangePrincipalAndInterestCalculationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerChangePrincipalAndInterestCalculationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AddDollarAmountToPreviousPrincipalAndInterest"/>
 *     &lt;enumeration value="AddPercentBasedOnOriginalPrincipalAndInterest"/>
 *     &lt;enumeration value="AddPercentBasedOnPreviousPrincipalAndInterest"/>
 *     &lt;enumeration value="BasedOnInterestRateUsingAThrowawayRate"/>
 *     &lt;enumeration value="BasedOnNewInterestRate"/>
 *     &lt;enumeration value="FHA245Formula"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerChangePrincipalAndInterestCalculationBase")
@XmlEnum
public enum PerChangePrincipalAndInterestCalculationBase {

    @XmlEnumValue("AddDollarAmountToPreviousPrincipalAndInterest")
    ADD_DOLLAR_AMOUNT_TO_PREVIOUS_PRINCIPAL_AND_INTEREST("AddDollarAmountToPreviousPrincipalAndInterest"),
    @XmlEnumValue("AddPercentBasedOnOriginalPrincipalAndInterest")
    ADD_PERCENT_BASED_ON_ORIGINAL_PRINCIPAL_AND_INTEREST("AddPercentBasedOnOriginalPrincipalAndInterest"),
    @XmlEnumValue("AddPercentBasedOnPreviousPrincipalAndInterest")
    ADD_PERCENT_BASED_ON_PREVIOUS_PRINCIPAL_AND_INTEREST("AddPercentBasedOnPreviousPrincipalAndInterest"),

    /**
     * The principal and interest payment is based on an interest rate used solely for the calculation and not for accruing interest.
     * 
     */
    @XmlEnumValue("BasedOnInterestRateUsingAThrowawayRate")
    BASED_ON_INTEREST_RATE_USING_A_THROWAWAY_RATE("BasedOnInterestRateUsingAThrowawayRate"),
    @XmlEnumValue("BasedOnNewInterestRate")
    BASED_ON_NEW_INTEREST_RATE("BasedOnNewInterestRate"),
    @XmlEnumValue("FHA245Formula")
    FHA_245_FORMULA("FHA245Formula"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PerChangePrincipalAndInterestCalculationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerChangePrincipalAndInterestCalculationBase fromValue(String v) {
        for (PerChangePrincipalAndInterestCalculationBase c: PerChangePrincipalAndInterestCalculationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
