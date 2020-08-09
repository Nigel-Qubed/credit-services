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
 * <p>Java class for LoanDelinquencyEventBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanDelinquencyEventBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BorrowerEmailSent"/>
 *     &lt;enumeration value="BorrowerFaceToFaceInterviewConducted"/>
 *     &lt;enumeration value="BorrowerFormLetterSent"/>
 *     &lt;enumeration value="BreachLetterExpires"/>
 *     &lt;enumeration value="BreachLetterSent"/>
 *     &lt;enumeration value="BrokerPriceOpinionOrAppraisalObtained"/>
 *     &lt;enumeration value="BrokerPriceOpinionOrdered"/>
 *     &lt;enumeration value="ChapterElevenBankruptcyPlanConfirmed"/>
 *     &lt;enumeration value="ChapterElevenCourtClearanceObtained"/>
 *     &lt;enumeration value="ChapterElevenPropertySurrendered"/>
 *     &lt;enumeration value="ChapterSevenBankruptcyAssetsPursued"/>
 *     &lt;enumeration value="ChapterSevenCourtClearanceObtained"/>
 *     &lt;enumeration value="ChapterSevenPropertySurrendered"/>
 *     &lt;enumeration value="ChapterThirteenBankruptcyPlanConfirmed"/>
 *     &lt;enumeration value="ChapterThirteenCourtClearanceObtained"/>
 *     &lt;enumeration value="ChapterThirteenPropertySurrendered"/>
 *     &lt;enumeration value="ChapterTwelveBankruptcyPlanConfirmed"/>
 *     &lt;enumeration value="ChapterTwelveCourtClearanceObtained"/>
 *     &lt;enumeration value="ChapterTwelvePropertySurrendered"/>
 *     &lt;enumeration value="DeedInLieu"/>
 *     &lt;enumeration value="EligibleForHAMP"/>
 *     &lt;enumeration value="FinalJudgmentRecorded"/>
 *     &lt;enumeration value="FirstLegalAction"/>
 *     &lt;enumeration value="FirstRightPartyContact"/>
 *     &lt;enumeration value="ForbearanceBegin"/>
 *     &lt;enumeration value="ForbearanceEnd"/>
 *     &lt;enumeration value="ForeclosureOnHold"/>
 *     &lt;enumeration value="ForeclosureRestarted"/>
 *     &lt;enumeration value="ForeclosureSaleCancelled"/>
 *     &lt;enumeration value="ForeclosureSaleConfirmed"/>
 *     &lt;enumeration value="ForeclosureSaleContinued"/>
 *     &lt;enumeration value="ForeclosureSaleHeld"/>
 *     &lt;enumeration value="ForeclosureSaleRescinded"/>
 *     &lt;enumeration value="ForeclosureSaleScheduled"/>
 *     &lt;enumeration value="FullReinstatement"/>
 *     &lt;enumeration value="HAMPBorrowerResponsePackageEvaluated"/>
 *     &lt;enumeration value="HAMPDeclinedByBorrower"/>
 *     &lt;enumeration value="HAMPInReview"/>
 *     &lt;enumeration value="HAMPModificationAgreementReceived"/>
 *     &lt;enumeration value="HAMPModificationAgreementSent"/>
 *     &lt;enumeration value="HAMPStipulationDocumentsReceived"/>
 *     &lt;enumeration value="HardshipAffidavitReceived"/>
 *     &lt;enumeration value="IneligibleForModification"/>
 *     &lt;enumeration value="IneligibleForShortSale"/>
 *     &lt;enumeration value="InvestorREONotificationSent"/>
 *     &lt;enumeration value="LastOutboundCallAttemptToBorrower"/>
 *     &lt;enumeration value="LastRightPartyContact"/>
 *     &lt;enumeration value="LastSkipTraceAttempt"/>
 *     &lt;enumeration value="ModificationInReview"/>
 *     &lt;enumeration value="ModificationNotificationDenied"/>
 *     &lt;enumeration value="ModificationTrialBegin"/>
 *     &lt;enumeration value="ModificationTrialEnd"/>
 *     &lt;enumeration value="NoActivity"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PartialReinstatement"/>
 *     &lt;enumeration value="PositiveSolicitationResponse"/>
 *     &lt;enumeration value="PromiseToPayBroken"/>
 *     &lt;enumeration value="PromiseToPayKept"/>
 *     &lt;enumeration value="PromiseToPayMade"/>
 *     &lt;enumeration value="PropertyIsListedForSale"/>
 *     &lt;enumeration value="ReinitiateForeclosure"/>
 *     &lt;enumeration value="REO"/>
 *     &lt;enumeration value="RepaymentBegin"/>
 *     &lt;enumeration value="RepaymentEnd"/>
 *     &lt;enumeration value="RepaymentPlanFirstPlanPaymentMade"/>
 *     &lt;enumeration value="RepaymentPlanInReview"/>
 *     &lt;enumeration value="RightPartyContactNextContactScheduled"/>
 *     &lt;enumeration value="RightPartyContactNoAction"/>
 *     &lt;enumeration value="ServicerSinglePointOfContactAssigned"/>
 *     &lt;enumeration value="ShortSaleAgreementSigned"/>
 *     &lt;enumeration value="ShortSaleCompleted"/>
 *     &lt;enumeration value="ShortSaleContractReceived"/>
 *     &lt;enumeration value="ShortSaleInReview"/>
 *     &lt;enumeration value="SkipTraceInitiated"/>
 *     &lt;enumeration value="SkipTraceSuccessful"/>
 *     &lt;enumeration value="SolicitationLetterSent"/>
 *     &lt;enumeration value="ThirdPartySale"/>
 *     &lt;enumeration value="TitleClaimResolutionPursed"/>
 *     &lt;enumeration value="UnsuccessfulRightPartyContactPhoneContactAttempt"/>
 *     &lt;enumeration value="UpdatedBorrowerFinancialsReceived"/>
 *     &lt;enumeration value="WorkoutEvaluationComplete"/>
 *     &lt;enumeration value="WorkoutInReview"/>
 *     &lt;enumeration value="WorkoutPackageCompleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanDelinquencyEventBase")
@XmlEnum
public enum LoanDelinquencyEventBase {

    @XmlEnumValue("BorrowerEmailSent")
    BORROWER_EMAIL_SENT("BorrowerEmailSent"),
    @XmlEnumValue("BorrowerFaceToFaceInterviewConducted")
    BORROWER_FACE_TO_FACE_INTERVIEW_CONDUCTED("BorrowerFaceToFaceInterviewConducted"),
    @XmlEnumValue("BorrowerFormLetterSent")
    BORROWER_FORM_LETTER_SENT("BorrowerFormLetterSent"),
    @XmlEnumValue("BreachLetterExpires")
    BREACH_LETTER_EXPIRES("BreachLetterExpires"),

    /**
     * The breach or acceleration letter has been sent and the mortgage loan has not yet been referred to an attorney (or trustee) for foreclosure proceedings.
     * 
     */
    @XmlEnumValue("BreachLetterSent")
    BREACH_LETTER_SENT("BreachLetterSent"),
    @XmlEnumValue("BrokerPriceOpinionOrAppraisalObtained")
    BROKER_PRICE_OPINION_OR_APPRAISAL_OBTAINED("BrokerPriceOpinionOrAppraisalObtained"),
    @XmlEnumValue("BrokerPriceOpinionOrdered")
    BROKER_PRICE_OPINION_ORDERED("BrokerPriceOpinionOrdered"),

    /**
     * The Creditors agreed to the restructuring plan.
     * 
     */
    @XmlEnumValue("ChapterElevenBankruptcyPlanConfirmed")
    CHAPTER_ELEVEN_BANKRUPTCY_PLAN_CONFIRMED("ChapterElevenBankruptcyPlanConfirmed"),

    /**
     * Legal clearance is under a Chapter 11 bankruptcy. The Loan Delinquency Event Date reported is the date that relief was granted, the date the case was dismissed or some other provision as provided under the bankruptcy plan.
     * 
     */
    @XmlEnumValue("ChapterElevenCourtClearanceObtained")
    CHAPTER_ELEVEN_COURT_CLEARANCE_OBTAINED("ChapterElevenCourtClearanceObtained"),
    @XmlEnumValue("ChapterElevenPropertySurrendered")
    CHAPTER_ELEVEN_PROPERTY_SURRENDERED("ChapterElevenPropertySurrendered"),

    /**
     * Notification that the Chapter 7 Bankruptcy will remain in effect longer than expected due to the fact that the trustee has found additional assets.
     * 
     */
    @XmlEnumValue("ChapterSevenBankruptcyAssetsPursued")
    CHAPTER_SEVEN_BANKRUPTCY_ASSETS_PURSUED("ChapterSevenBankruptcyAssetsPursued"),

    /**
     * Legal clearance is under a Chapter 7 bankruptcy. The Loan Delinquency Event Date reported is the date that relief was granted, the date the case was dismissed or the later of the Discharge of Debtor or the filing of the Trustee No Asset report/ Abandonment.
     * 
     */
    @XmlEnumValue("ChapterSevenCourtClearanceObtained")
    CHAPTER_SEVEN_COURT_CLEARANCE_OBTAINED("ChapterSevenCourtClearanceObtained"),
    @XmlEnumValue("ChapterSevenPropertySurrendered")
    CHAPTER_SEVEN_PROPERTY_SURRENDERED("ChapterSevenPropertySurrendered"),

    /**
     * The Bankruptcy Court entered confirmation of the bankruptcy of the Debtors Chapter 13 plan.
     * 
     */
    @XmlEnumValue("ChapterThirteenBankruptcyPlanConfirmed")
    CHAPTER_THIRTEEN_BANKRUPTCY_PLAN_CONFIRMED("ChapterThirteenBankruptcyPlanConfirmed"),

    /**
     * Legal clearance is under a Chapter 13 bankruptcy. The Loan Delinquency Event Date reported is the date that relief was granted or the date the case was dismissed.
     * 
     */
    @XmlEnumValue("ChapterThirteenCourtClearanceObtained")
    CHAPTER_THIRTEEN_COURT_CLEARANCE_OBTAINED("ChapterThirteenCourtClearanceObtained"),
    @XmlEnumValue("ChapterThirteenPropertySurrendered")
    CHAPTER_THIRTEEN_PROPERTY_SURRENDERED("ChapterThirteenPropertySurrendered"),

    /**
     * The Bankruptcy Court entered confirmation of the bankruptcy of the Debtors Chapter 12 plan.
     * 
     */
    @XmlEnumValue("ChapterTwelveBankruptcyPlanConfirmed")
    CHAPTER_TWELVE_BANKRUPTCY_PLAN_CONFIRMED("ChapterTwelveBankruptcyPlanConfirmed"),

    /**
     * Legal clearance is under a Chapter 12 bankruptcy. The Loan Delinquency Event Date reported is the date that relief was granted or the date the case was dismissed.
     * 
     */
    @XmlEnumValue("ChapterTwelveCourtClearanceObtained")
    CHAPTER_TWELVE_COURT_CLEARANCE_OBTAINED("ChapterTwelveCourtClearanceObtained"),
    @XmlEnumValue("ChapterTwelvePropertySurrendered")
    CHAPTER_TWELVE_PROPERTY_SURRENDERED("ChapterTwelvePropertySurrendered"),

    /**
     * The investor has authorized the Servicer to accept a voluntary conveyance of the property instead of initiating foreclosure proceedings. The Servicer has received the executed Deed from the borrower.
     * 
     */
    @XmlEnumValue("DeedInLieu")
    DEED_IN_LIEU("DeedInLieu"),
    @XmlEnumValue("EligibleForHAMP")
    ELIGIBLE_FOR_HAMP("EligibleForHAMP"),

    /**
     * The mortgage is in foreclosure and the final judgment or decree has been recorded in the appropriate venue.
     * 
     */
    @XmlEnumValue("FinalJudgmentRecorded")
    FINAL_JUDGMENT_RECORDED("FinalJudgmentRecorded"),

    /**
     * The first legal step in processing a foreclosure was taken (i.e. complaint/petition filing, recording notice of default, posting publication of notice of sale, etc).
     * 
     */
    @XmlEnumValue("FirstLegalAction")
    FIRST_LEGAL_ACTION("FirstLegalAction"),

    /**
     * First contact was made by the Servicer or the agent of the Servicer in the delinquency period with the Borrower, co-Borrower, a representative of the estate or anyone that is legally responsible for representing any of these entities.
     * 
     */
    @XmlEnumValue("FirstRightPartyContact")
    FIRST_RIGHT_PARTY_CONTACT("FirstRightPartyContact"),
    @XmlEnumValue("ForbearanceBegin")
    FORBEARANCE_BEGIN("ForbearanceBegin"),
    @XmlEnumValue("ForbearanceEnd")
    FORBEARANCE_END("ForbearanceEnd"),

    /**
     * Foreclosure activity is placed on hold.
     * 
     */
    @XmlEnumValue("ForeclosureOnHold")
    FORECLOSURE_ON_HOLD("ForeclosureOnHold"),

    /**
     * The foreclosure process is restarted after a delay has occurred. Delays such as Bankruptcy, Contested/ Litigated Action, Repayment Plan, Forbearance, Drug Seizure, HUD Assignment/ VA Refunding review, canceled Workout, etc. could suspend the foreclosure process.
     * 
     */
    @XmlEnumValue("ForeclosureRestarted")
    FORECLOSURE_RESTARTED("ForeclosureRestarted"),

    /**
     * The foreclosure sale that was scheduled has been cancelled.
     * 
     */
    @XmlEnumValue("ForeclosureSaleCancelled")
    FORECLOSURE_SALE_CANCELLED("ForeclosureSaleCancelled"),
    @XmlEnumValue("ForeclosureSaleConfirmed")
    FORECLOSURE_SALE_CONFIRMED("ForeclosureSaleConfirmed"),

    /**
     * The foreclosure sale that was on hold is now being  continued (or scheduled).
     * 
     */
    @XmlEnumValue("ForeclosureSaleContinued")
    FORECLOSURE_SALE_CONTINUED("ForeclosureSaleContinued"),
    @XmlEnumValue("ForeclosureSaleHeld")
    FORECLOSURE_SALE_HELD("ForeclosureSaleHeld"),

    /**
     * The foreclosure sale has been rescinded.
     * 
     */
    @XmlEnumValue("ForeclosureSaleRescinded")
    FORECLOSURE_SALE_RESCINDED("ForeclosureSaleRescinded"),

    /**
     * A foreclosure sale has been scheduled by the court or sheriff. In a statutory foreclosure state, the Loan Delinquency Event Date reported is the earliest date after the publication has expired on which the sale could occur. If the foreclosure sale is rescheduled, the Loan Delinquency Event Date reported is the updated foreclosure sale date.
     * 
     */
    @XmlEnumValue("ForeclosureSaleScheduled")
    FORECLOSURE_SALE_SCHEDULED("ForeclosureSaleScheduled"),

    /**
     * The borrower has restored the delinquent mortgage to current status by paying the total amount delinquent, including advances, accrued interest, legal costs and other expenses.
     * 
     */
    @XmlEnumValue("FullReinstatement")
    FULL_REINSTATEMENT("FullReinstatement"),

    /**
     * The servicer has evaluated the borrower response package eligibility for HAMP.
     * 
     */
    @XmlEnumValue("HAMPBorrowerResponsePackageEvaluated")
    HAMP_BORROWER_RESPONSE_PACKAGE_EVALUATED("HAMPBorrowerResponsePackageEvaluated"),

    /**
     * Borrower declines to accept a HAMP workout
     * 
     */
    @XmlEnumValue("HAMPDeclinedByBorrower")
    HAMP_DECLINED_BY_BORROWER("HAMPDeclinedByBorrower"),
    @XmlEnumValue("HAMPInReview")
    HAMP_IN_REVIEW("HAMPInReview"),
    @XmlEnumValue("HAMPModificationAgreementReceived")
    HAMP_MODIFICATION_AGREEMENT_RECEIVED("HAMPModificationAgreementReceived"),
    @XmlEnumValue("HAMPModificationAgreementSent")
    HAMP_MODIFICATION_AGREEMENT_SENT("HAMPModificationAgreementSent"),

    /**
     * Servicer received HAMP Stipulation Documents.
     * 
     */
    @XmlEnumValue("HAMPStipulationDocumentsReceived")
    HAMP_STIPULATION_DOCUMENTS_RECEIVED("HAMPStipulationDocumentsReceived"),

    /**
     * The servicer receives the Hardship Affidavit from the borrower for any relevant workout.
     * 
     */
    @XmlEnumValue("HardshipAffidavitReceived")
    HARDSHIP_AFFIDAVIT_RECEIVED("HardshipAffidavitReceived"),
    @XmlEnumValue("IneligibleForModification")
    INELIGIBLE_FOR_MODIFICATION("IneligibleForModification"),
    @XmlEnumValue("IneligibleForShortSale")
    INELIGIBLE_FOR_SHORT_SALE("IneligibleForShortSale"),

    /**
     * Notification to the investor that the property is now REO.
     * 
     */
    @XmlEnumValue("InvestorREONotificationSent")
    INVESTOR_REO_NOTIFICATION_SENT("InvestorREONotificationSent"),

    /**
     * The latest outbound call attempted to the borrower or right party contact .
     * 
     */
    @XmlEnumValue("LastOutboundCallAttemptToBorrower")
    LAST_OUTBOUND_CALL_ATTEMPT_TO_BORROWER("LastOutboundCallAttemptToBorrower"),

    /**
     * Last contact was made by the Servicer or the agent of the Servicer in the delinquency period with the Borrower, co-Borrower, a representative of the estate or anyone that is legally responsible for representing any of these entities.
     * 
     */
    @XmlEnumValue("LastRightPartyContact")
    LAST_RIGHT_PARTY_CONTACT("LastRightPartyContact"),

    /**
     * The latest attempt to locate the borrower.
     * 
     */
    @XmlEnumValue("LastSkipTraceAttempt")
    LAST_SKIP_TRACE_ATTEMPT("LastSkipTraceAttempt"),
    @XmlEnumValue("ModificationInReview")
    MODIFICATION_IN_REVIEW("ModificationInReview"),

    /**
     * The denial letter was sent by the servicer on behalf of the investor.
     * 
     */
    @XmlEnumValue("ModificationNotificationDenied")
    MODIFICATION_NOTIFICATION_DENIED("ModificationNotificationDenied"),
    @XmlEnumValue("ModificationTrialBegin")
    MODIFICATION_TRIAL_BEGIN("ModificationTrialBegin"),
    @XmlEnumValue("ModificationTrialEnd")
    MODIFICATION_TRIAL_END("ModificationTrialEnd"),

    /**
     * Servicer has no delinquency activity to report.
     * 
     */
    @XmlEnumValue("NoActivity")
    NO_ACTIVITY("NoActivity"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The borrower pays an amount less than the total amount delinquent, including advances, accrued interest, legal costs and other expenses and agrees to a repayment plan to bring the account current within a defined period of time.
     * 
     */
    @XmlEnumValue("PartialReinstatement")
    PARTIAL_REINSTATEMENT("PartialReinstatement"),
    @XmlEnumValue("PositiveSolicitationResponse")
    POSITIVE_SOLICITATION_RESPONSE("PositiveSolicitationResponse"),

    /**
     * This event occurs when the Borrower does not keep their commitment to make payment promised by a specified date.
     * 
     */
    @XmlEnumValue("PromiseToPayBroken")
    PROMISE_TO_PAY_BROKEN("PromiseToPayBroken"),

    /**
     * This event occurs when the Borrower kept their commitment and made a payment that they promised to make by a specified date.
     * 
     */
    @XmlEnumValue("PromiseToPayKept")
    PROMISE_TO_PAY_KEPT("PromiseToPayKept"),

    /**
     * This event occurs when the Borrower verbally promises to make a payment by a specified date.
     * 
     */
    @XmlEnumValue("PromiseToPayMade")
    PROMISE_TO_PAY_MADE("PromiseToPayMade"),

    /**
     * Notification from property inspections, the Borrower or some other source that the property securing the Mortgage was listed for sale.
     * 
     */
    @XmlEnumValue("PropertyIsListedForSale")
    PROPERTY_IS_LISTED_FOR_SALE("PropertyIsListedForSale"),

    /**
     * Reinitiating all foreclosure activities due to a failure in the current foreclosure process.
     * 
     */
    @XmlEnumValue("ReinitiateForeclosure")
    REINITIATE_FORECLOSURE("ReinitiateForeclosure"),

    /**
     * Real estate owned loan after foreclosure sale has been completed. Title has reverted to the beneficiary.
     * 
     */
    REO("REO"),

    /**
     * The initial payment on a repayment plan was received.
     * 
     */
    @XmlEnumValue("RepaymentBegin")
    REPAYMENT_BEGIN("RepaymentBegin"),

    /**
     * The final payment on a repayment plan was received.
     * 
     */
    @XmlEnumValue("RepaymentEnd")
    REPAYMENT_END("RepaymentEnd"),

    /**
     * The first payment negotiated under a Repayment Plan is received by the Servicer.
     * 
     */
    @XmlEnumValue("RepaymentPlanFirstPlanPaymentMade")
    REPAYMENT_PLAN_FIRST_PLAN_PAYMENT_MADE("RepaymentPlanFirstPlanPaymentMade"),
    @XmlEnumValue("RepaymentPlanInReview")
    REPAYMENT_PLAN_IN_REVIEW("RepaymentPlanInReview"),
    @XmlEnumValue("RightPartyContactNextContactScheduled")
    RIGHT_PARTY_CONTACT_NEXT_CONTACT_SCHEDULED("RightPartyContactNextContactScheduled"),

    /**
     * The right party contact was contacted and there was no action agreed upon.
     * 
     */
    @XmlEnumValue("RightPartyContactNoAction")
    RIGHT_PARTY_CONTACT_NO_ACTION("RightPartyContactNoAction"),

    /**
     * Servicer assigns loan to a single point of contact (SPOC) for the borrower.
     * 
     */
    @XmlEnumValue("ServicerSinglePointOfContactAssigned")
    SERVICER_SINGLE_POINT_OF_CONTACT_ASSIGNED("ServicerSinglePointOfContactAssigned"),

    /**
     * The fully executed short sale contract for the property was signed by all responsible parties.
     * 
     */
    @XmlEnumValue("ShortSaleAgreementSigned")
    SHORT_SALE_AGREEMENT_SIGNED("ShortSaleAgreementSigned"),

    /**
     * A short sale has been completed.
     * 
     */
    @XmlEnumValue("ShortSaleCompleted")
    SHORT_SALE_COMPLETED("ShortSaleCompleted"),

    /**
     * A short sale contract or offer has been received by the servicer.
     * 
     */
    @XmlEnumValue("ShortSaleContractReceived")
    SHORT_SALE_CONTRACT_RECEIVED("ShortSaleContractReceived"),
    @XmlEnumValue("ShortSaleInReview")
    SHORT_SALE_IN_REVIEW("ShortSaleInReview"),
    @XmlEnumValue("SkipTraceInitiated")
    SKIP_TRACE_INITIATED("SkipTraceInitiated"),
    @XmlEnumValue("SkipTraceSuccessful")
    SKIP_TRACE_SUCCESSFUL("SkipTraceSuccessful"),
    @XmlEnumValue("SolicitationLetterSent")
    SOLICITATION_LETTER_SENT("SolicitationLetterSent"),

    /**
     * The property sold to a 3rd Party Purchaser at the foreclosure sale and did not revert to the Servicer/ Investor.
     * 
     */
    @XmlEnumValue("ThirdPartySale")
    THIRD_PARTY_SALE("ThirdPartySale"),

    /**
     * A title issue has been identified and is pending resolution.
     * 
     */
    @XmlEnumValue("TitleClaimResolutionPursed")
    TITLE_CLAIM_RESOLUTION_PURSED("TitleClaimResolutionPursed"),
    @XmlEnumValue("UnsuccessfulRightPartyContactPhoneContactAttempt")
    UNSUCCESSFUL_RIGHT_PARTY_CONTACT_PHONE_CONTACT_ATTEMPT("UnsuccessfulRightPartyContactPhoneContactAttempt"),

    /**
     * Received borrower income, assets, liabilities and expenses information either verbally or written.
     * 
     */
    @XmlEnumValue("UpdatedBorrowerFinancialsReceived")
    UPDATED_BORROWER_FINANCIALS_RECEIVED("UpdatedBorrowerFinancialsReceived"),

    /**
     * The servicer has evaluated the borrower for a workout.
     * 
     */
    @XmlEnumValue("WorkoutEvaluationComplete")
    WORKOUT_EVALUATION_COMPLETE("WorkoutEvaluationComplete"),

    /**
     * The borrower is being evaluated for a workout which is an alternative to foreclosure.
     * 
     */
    @XmlEnumValue("WorkoutInReview")
    WORKOUT_IN_REVIEW("WorkoutInReview"),

    /**
     * The completed Borrower's Response Package has been received by the servicer.
     * 
     */
    @XmlEnumValue("WorkoutPackageCompleted")
    WORKOUT_PACKAGE_COMPLETED("WorkoutPackageCompleted");
    private final String value;

    LoanDelinquencyEventBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanDelinquencyEventBase fromValue(String v) {
        for (LoanDelinquencyEventBase c: LoanDelinquencyEventBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
