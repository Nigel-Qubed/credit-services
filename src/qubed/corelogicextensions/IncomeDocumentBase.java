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
 * <p>Java class for IncomeDocumentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomeDocumentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="IRSW2"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayStub"/>
 *     &lt;enumeration value="RentalIncomeAnalysisStatement"/>
 *     &lt;enumeration value="RetirementAccountStatement"/>
 *     &lt;enumeration value="TaxReturn"/>
 *     &lt;enumeration value="ThirdPartyEmploymentStatement"/>
 *     &lt;enumeration value="VerbalStatement"/>
 *     &lt;enumeration value="VerificationOfIncome"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncomeDocumentBase")
@XmlEnum
public enum IncomeDocumentBase {


    /**
     * Confirms the wage income and taxes withheld for a person.
     * 
     */
    @XmlEnumValue("IRSW2")
    IRSW_2("IRSW2"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Describes income for a particular pay period.
     * 
     */
    @XmlEnumValue("PayStub")
    PAY_STUB("PayStub"),

    /**
     * Evaluates the rental potential of a property and establishes its value.
     * 
     */
    @XmlEnumValue("RentalIncomeAnalysisStatement")
    RENTAL_INCOME_ANALYSIS_STATEMENT("RentalIncomeAnalysisStatement"),

    /**
     * Definition: Evidences transactions recorded and account balances for a restricted individual investment account during a specified period.
     * 
     */
    @XmlEnumValue("RetirementAccountStatement")
    RETIREMENT_ACCOUNT_STATEMENT("RetirementAccountStatement"),

    /**
     * Provides information used to calculate income or other taxes.
     * 
     */
    @XmlEnumValue("TaxReturn")
    TAX_RETURN("TaxReturn"),

    /**
     * Used when a third party employment verification vendor provides verification of employment.
     * 
     */
    @XmlEnumValue("ThirdPartyEmploymentStatement")
    THIRD_PARTY_EMPLOYMENT_STATEMENT("ThirdPartyEmploymentStatement"),

    /**
     *  When verbal verification is allowed. This may be a written statement by the lender that information was collected verbally. Might include the name of the person making the contact, the name of the entity contacted, the name and title of the individual at the entity who provided the information, date of the contact and information that was collected.
     * 
     */
    @XmlEnumValue("VerbalStatement")
    VERBAL_STATEMENT("VerbalStatement"),

    /**
     * This could include items such as an award letter from Social Security, Pension Statement or IRS 1099
     * 
     */
    @XmlEnumValue("VerificationOfIncome")
    VERIFICATION_OF_INCOME("VerificationOfIncome");
    private final String value;

    IncomeDocumentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncomeDocumentBase fromValue(String v) {
        for (IncomeDocumentBase c: IncomeDocumentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}