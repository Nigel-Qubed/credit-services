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
 * <p>Java class for LoanDelinquencyStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanDelinquencyStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AssignmentPursued"/>
 *     &lt;enumeration value="Assumption"/>
 *     &lt;enumeration value="ChapterElevenBankruptcy"/>
 *     &lt;enumeration value="ChapterSevenBankruptcy"/>
 *     &lt;enumeration value="ChapterThirteenBankruptcy"/>
 *     &lt;enumeration value="ChapterTwelveBankruptcy"/>
 *     &lt;enumeration value="ChargeOffPursued"/>
 *     &lt;enumeration value="ContestedForeclosure"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="DelinquentNoAction"/>
 *     &lt;enumeration value="DrugSeizure"/>
 *     &lt;enumeration value="Forbearance"/>
 *     &lt;enumeration value="Foreclosure"/>
 *     &lt;enumeration value="GovernmentSeizure"/>
 *     &lt;enumeration value="MediationReferral"/>
 *     &lt;enumeration value="MilitaryIndulgence"/>
 *     &lt;enumeration value="Modification"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PreforeclosureSalePlanned"/>
 *     &lt;enumeration value="Probate"/>
 *     &lt;enumeration value="Refinance"/>
 *     &lt;enumeration value="RepaymentPlan"/>
 *     &lt;enumeration value="SecondLienConsiderations"/>
 *     &lt;enumeration value="ShortSalePlanning"/>
 *     &lt;enumeration value="TrialModificationActive"/>
 *     &lt;enumeration value="VeteransAffairsBuydown"/>
 *     &lt;enumeration value="VeteransAffairsNoBids"/>
 *     &lt;enumeration value="VeteransAffairsRefundPursued"/>
 *     &lt;enumeration value="Workout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanDelinquencyStatusBase")
@XmlEnum
public enum LoanDelinquencyStatusBase {


    /**
     * An FHA-insured mortgage that qualifies for HUD special assignment procedures is in the process of being assigned to HUD.
     * 
     */
    @XmlEnumValue("AssignmentPursued")
    ASSIGNMENT_PURSUED("AssignmentPursued"),

    /**
     * The Servicer is working with the borrower to sell the property by permitting the purchaser to pay the delinquent installments and assume the outstanding debt.
     * 
     */
    @XmlEnumValue("Assumption")
    ASSUMPTION("Assumption"),

    /**
     * The borrower has filed for bankruptcy under Chapter 11 of the Federal Bankruptcy Act.
     * 
     */
    @XmlEnumValue("ChapterElevenBankruptcy")
    CHAPTER_ELEVEN_BANKRUPTCY("ChapterElevenBankruptcy"),

    /**
     * The borrower has filed for bankruptcy under Chapter 7 of the Federal Bankruptcy Act.
     * 
     */
    @XmlEnumValue("ChapterSevenBankruptcy")
    CHAPTER_SEVEN_BANKRUPTCY("ChapterSevenBankruptcy"),

    /**
     * The borrower has filed for bankruptcy under Chapter 13 of the Federal Bankruptcy Act.
     * 
     */
    @XmlEnumValue("ChapterThirteenBankruptcy")
    CHAPTER_THIRTEEN_BANKRUPTCY("ChapterThirteenBankruptcy"),

    /**
     * The borrower has filed for bankruptcy under Chapter 12 of the Federal Bankruptcy Act. A Chapter 12 bankruptcy is a bankruptcy action that involves the reorganization of a family farming business.
     * 
     */
    @XmlEnumValue("ChapterTwelveBankruptcy")
    CHAPTER_TWELVE_BANKRUPTCY("ChapterTwelveBankruptcy"),

    /**
     * The investor has agreed not to pursue collection efforts or legal actions against the borrower because of a reduced value for the property, a low outstanding mortgage balance, or the presence of environmental hazards on the property.
     * 
     */
    @XmlEnumValue("ChargeOffPursued")
    CHARGE_OFF_PURSUED("ChargeOffPursued"),

    /**
     * Borrower has contested the  legal action of the servicer or there is litigation pending or filed that adversely affects the property. For example, a borrower or other defendant interposes an answer to an action, or files a countersuit.
     * 
     */
    @XmlEnumValue("ContestedForeclosure")
    CONTESTED_FORECLOSURE("ContestedForeclosure"),

    /**
     * The loan has been made current and is no longer delinquent.
     * 
     */
    @XmlEnumValue("Current")
    CURRENT("Current"),

    /**
     * Considered delinquent based on investor guidelines, but the servicer has not taken legal action.
     * 
     */
    @XmlEnumValue("DelinquentNoAction")
    DELINQUENT_NO_ACTION("DelinquentNoAction"),

    /**
     * The Department of Justice or a state/local agency has decided to seize (or has seized) a property under the forfeiture provision of the Controlled Substances Act.
     * 
     */
    @XmlEnumValue("DrugSeizure")
    DRUG_SEIZURE("DrugSeizure"),

    /**
     * The Servicer has authorized a temporary suspension of payments or a repayment plan that calls for periodic payments of less than the normal monthly payment, or periodic payments at different intervals, to give the borrower additional time to bring the mortgage current.
     * 
     */
    @XmlEnumValue("Forbearance")
    FORBEARANCE("Forbearance"),

    /**
     * The Servicer has referred the case to an attorney to take legal action to acquire the property through a foreclosure sale.
     * 
     */
    @XmlEnumValue("Foreclosure")
    FORECLOSURE("Foreclosure"),

    /**
     * An action by a local agency to seize or initiate forfeiture proceedings against a property.
     * 
     */
    @XmlEnumValue("GovernmentSeizure")
    GOVERNMENT_SEIZURE("GovernmentSeizure"),

    /**
     * The mortgage loan has been referred to mediation.
     * 
     */
    @XmlEnumValue("MediationReferral")
    MEDIATION_REFERRAL("MediationReferral"),

    /**
     * The Servicer has granted a delinquent service member forbearance or a stay in foreclosure proceedings under the provisions of the Soldiers and Sailors Civil Relief Act.
     * 
     */
    @XmlEnumValue("MilitaryIndulgence")
    MILITARY_INDULGENCE("MilitaryIndulgence"),

    /**
     * The Servicer is working with the borrower to renegotiate the terms of the mortgage.
     * 
     */
    @XmlEnumValue("Modification")
    MODIFICATION("Modification"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The Servicer plans to pursue a preforeclosure sale with a payoff of less than the full amount of indebtedness.
     * 
     */
    @XmlEnumValue("PreforeclosureSalePlanned")
    PREFORECLOSURE_SALE_PLANNED("PreforeclosureSalePlanned"),

    /**
     * The Servicer cannot pursue (or complete) foreclosure action because proceedings required to verify a will of a deceased mortgagor are in process.
     * 
     */
    @XmlEnumValue("Probate")
    PROBATE("Probate"),

    /**
     * The Servicer is pursuing a new loan in which the existing first mortgage is paid off with the proceeds of the new mortgage.
     * 
     */
    @XmlEnumValue("Refinance")
    REFINANCE("Refinance"),

    /**
     * A written or verbal agreement between the Servicer and the borrower that gives the borrower a defined period of time to reinstate the mortgage by making payments in excess of the monthly payment.
     * 
     */
    @XmlEnumValue("RepaymentPlan")
    REPAYMENT_PLAN("RepaymentPlan"),

    /**
     * The Servicer is evaluating the pros and cons of pursuing foreclosure or recommending that the debt be charged off on a second mortgage.
     * 
     */
    @XmlEnumValue("SecondLienConsiderations")
    SECOND_LIEN_CONSIDERATIONS("SecondLienConsiderations"),

    /**
     * The Servicer is working with the borrower to pursue a short sale.
     * 
     */
    @XmlEnumValue("ShortSalePlanning")
    SHORT_SALE_PLANNING("ShortSalePlanning"),

    /**
     * The borrower has been approved to participate in a modification that requires a trial period plan and is current on their trial payments.
     * 
     */
    @XmlEnumValue("TrialModificationActive")
    TRIAL_MODIFICATION_ACTIVE("TrialModificationActive"),

    /**
     * The investor has agreed to make a cash contribution to reduce the outstanding indebtedness of a VA-guaranteed mortgage, for which the Department of Veterans Affairs failed to establish an "upset price" bid for the foreclosure sale, in order to get the VA to reconsider its decision. Servicer has completed processing the Buydown.
     * 
     */
    @XmlEnumValue("VeteransAffairsBuydown")
    VETERANS_AFFAIRS_BUYDOWN("VeteransAffairsBuydown"),

    /**
     * The Department of Veterans Affairs refused to establish an "upset price" to be bid at the foreclosure sale of a VA-guaranteed mortgage that the Servicer had referred for foreclosure. Servicer is pursuing a buydown, charge-off or other alternative.
     * 
     */
    @XmlEnumValue("VeteransAffairsNoBids")
    VETERANS_AFFAIRS_NO_BIDS("VeteransAffairsNoBids"),

    /**
     * The Department of Veterans Affairs has requested information about a VA-guaranteed mortgage the Servicer had referred for foreclosure in order to decide whether to accept an assignment and refund the mortgage.
     * 
     */
    @XmlEnumValue("VeteransAffairsRefundPursued")
    VETERANS_AFFAIRS_REFUND_PURSUED("VeteransAffairsRefundPursued"),

    /**
     * There is a workout being pursued on the loan that will help bring the loan current or liquidate the loan to avoid foreclosure.
     * 
     */
    @XmlEnumValue("Workout")
    WORKOUT("Workout");
    private final String value;

    LoanDelinquencyStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanDelinquencyStatusBase fromValue(String v) {
        for (LoanDelinquencyStatusBase c: LoanDelinquencyStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
