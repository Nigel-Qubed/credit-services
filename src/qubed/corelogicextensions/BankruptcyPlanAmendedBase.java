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
 * <p>Java class for BankruptcyPlanAmendedBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankruptcyPlanAmendedBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ChapterFifteen"/>
 *     &lt;enumeration value="PlanDateExtended"/>
 *     &lt;enumeration value="PlanDisbursementAmountIncreased"/>
 *     &lt;enumeration value="PlanDisbursementAmountReduced"/>
 *     &lt;enumeration value="PlanLengthReduced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankruptcyPlanAmendedBase")
@XmlEnum
public enum BankruptcyPlanAmendedBase {


    /**
     * A debtor has filed for bankruptcy in another country and has filed for Chapter 15 in the US Bankruptcy Court for protection under US law.
     * 
     */
    @XmlEnumValue("ChapterFifteen")
    CHAPTER_FIFTEEN("ChapterFifteen"),

    /**
     * The bankruptcy plan was amended due to the extension of the plan date.
     * 
     */
    @XmlEnumValue("PlanDateExtended")
    PLAN_DATE_EXTENDED("PlanDateExtended"),

    /**
     * The bankruptcy plan was amended due to an increase in the plan disbursement amount.
     * 
     */
    @XmlEnumValue("PlanDisbursementAmountIncreased")
    PLAN_DISBURSEMENT_AMOUNT_INCREASED("PlanDisbursementAmountIncreased"),

    /**
     * The bankruptcy plan was amended due to a reduction in the plan disbursement amount.
     * 
     */
    @XmlEnumValue("PlanDisbursementAmountReduced")
    PLAN_DISBURSEMENT_AMOUNT_REDUCED("PlanDisbursementAmountReduced"),

    /**
     * The bankruptcy plan was amended due to the reduction of the plan length.
     * 
     */
    @XmlEnumValue("PlanLengthReduced")
    PLAN_LENGTH_REDUCED("PlanLengthReduced");
    private final String value;

    BankruptcyPlanAmendedBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankruptcyPlanAmendedBase fromValue(String v) {
        for (BankruptcyPlanAmendedBase c: BankruptcyPlanAmendedBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
