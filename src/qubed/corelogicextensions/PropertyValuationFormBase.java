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
 * <p>Java class for PropertyValuationFormBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyValuationFormBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AppraisalUpdateAndOrCompletionReport"/>
 *     &lt;enumeration value="ComplianceInspectionReport"/>
 *     &lt;enumeration value="ConditionalCommitmentDirectEndorsementStatementOfAppraisedValue"/>
 *     &lt;enumeration value="DefinitionsStatementOfLimitingConditionsAndAppraisersCertification"/>
 *     &lt;enumeration value="DesktopUnderwriterPropertyInspectionReport"/>
 *     &lt;enumeration value="EmployeeRelocationCouncil2001"/>
 *     &lt;enumeration value="ExteriorOnlyInspectionIndividualCondominiumUnitAppraisalReport"/>
 *     &lt;enumeration value="ExteriorOnlyInspectionIndividualCooperativeInterestAppraisalReport"/>
 *     &lt;enumeration value="ExteriorOnlyInspectionResidentialAppraisalReport"/>
 *     &lt;enumeration value="ForYourProtectionGetAHomeInspection"/>
 *     &lt;enumeration value="GeneralAddendum"/>
 *     &lt;enumeration value="HUD_VAAddendumToURLA"/>
 *     &lt;enumeration value="ImportantNoticeToHomebuyers"/>
 *     &lt;enumeration value="IndividualCondominiumUnitAppraisalReport"/>
 *     &lt;enumeration value="IndividualCooperativeInterestAppraisalReport"/>
 *     &lt;enumeration value="LoanProspectorConditionAndMarketability"/>
 *     &lt;enumeration value="ManufacturedHomeAppraisalReport"/>
 *     &lt;enumeration value="ManufacturedHomeAppraisalReportVA"/>
 *     &lt;enumeration value="MarketConditionsAddendumToTheAppraisalReport"/>
 *     &lt;enumeration value="MortgageesAssuranceOfCompletion"/>
 *     &lt;enumeration value="NewConstructionSubterraneanTermiteSoilTreatmentRecord"/>
 *     &lt;enumeration value="OneUnitResidentialAppraisalFieldReviewReport"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="RequestForDeterminationOfReasonableValue"/>
 *     &lt;enumeration value="SmallResidentialIncomePropertyAppraisalReport"/>
 *     &lt;enumeration value="SubterraneanTermiteSoilTreatmentBuildersGuarantee"/>
 *     &lt;enumeration value="TwoToFourUnitResidentialAppraisalFieldReviewReport"/>
 *     &lt;enumeration value="UniformResidentialAppraisalReport"/>
 *     &lt;enumeration value="WorldwideEmployeeRelocationCouncilSummaryAppraisalReport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyValuationFormBase")
@XmlEnum
public enum PropertyValuationFormBase {


    /**
     * FNM 1004D FRE 442
     * 
     */
    @XmlEnumValue("AppraisalUpdateAndOrCompletionReport")
    APPRAISAL_UPDATE_AND_OR_COMPLETION_REPORT("AppraisalUpdateAndOrCompletionReport"),

    /**
     * HUD-92051 (07/1987)
     * 
     */
    @XmlEnumValue("ComplianceInspectionReport")
    COMPLIANCE_INSPECTION_REPORT("ComplianceInspectionReport"),

    /**
     * HUD-92800.5B (09/2004)
     * 
     */
    @XmlEnumValue("ConditionalCommitmentDirectEndorsementStatementOfAppraisedValue")
    CONDITIONAL_COMMITMENT_DIRECT_ENDORSEMENT_STATEMENT_OF_APPRAISED_VALUE("ConditionalCommitmentDirectEndorsementStatementOfAppraisedValue"),

    /**
     * FNM 1004B
     * 
     */
    @XmlEnumValue("DefinitionsStatementOfLimitingConditionsAndAppraisersCertification")
    DEFINITIONS_STATEMENT_OF_LIMITING_CONDITIONS_AND_APPRAISERS_CERTIFICATION("DefinitionsStatementOfLimitingConditionsAndAppraisersCertification"),

    /**
     * FNM 2075
     * 
     */
    @XmlEnumValue("DesktopUnderwriterPropertyInspectionReport")
    DESKTOP_UNDERWRITER_PROPERTY_INSPECTION_REPORT("DesktopUnderwriterPropertyInspectionReport"),

    /**
     * ERC2001
     * 
     */
    @XmlEnumValue("EmployeeRelocationCouncil2001")
    EMPLOYEE_RELOCATION_COUNCIL_2001("EmployeeRelocationCouncil2001"),

    /**
     * FNM 1075 FRE 466
     * 
     */
    @XmlEnumValue("ExteriorOnlyInspectionIndividualCondominiumUnitAppraisalReport")
    EXTERIOR_ONLY_INSPECTION_INDIVIDUAL_CONDOMINIUM_UNIT_APPRAISAL_REPORT("ExteriorOnlyInspectionIndividualCondominiumUnitAppraisalReport"),

    /**
     * FNM 2095
     * 
     */
    @XmlEnumValue("ExteriorOnlyInspectionIndividualCooperativeInterestAppraisalReport")
    EXTERIOR_ONLY_INSPECTION_INDIVIDUAL_COOPERATIVE_INTEREST_APPRAISAL_REPORT("ExteriorOnlyInspectionIndividualCooperativeInterestAppraisalReport"),

    /**
     * FNM 2055 FRE2055
     * 
     */
    @XmlEnumValue("ExteriorOnlyInspectionResidentialAppraisalReport")
    EXTERIOR_ONLY_INSPECTION_RESIDENTIAL_APPRAISAL_REPORT("ExteriorOnlyInspectionResidentialAppraisalReport"),

    /**
     * HUD-92564-CN (06/2006)
     * 
     */
    @XmlEnumValue("ForYourProtectionGetAHomeInspection")
    FOR_YOUR_PROTECTION_GET_A_HOME_INSPECTION("ForYourProtectionGetAHomeInspection"),
    @XmlEnumValue("GeneralAddendum")
    GENERAL_ADDENDUM("GeneralAddendum"),

    /**
     * HUD-92900-A (09/2010)
     * 
     */
    @XmlEnumValue("HUD_VAAddendumToURLA")
    HUD_VA_ADDENDUM_TO_URLA("HUD_VAAddendumToURLA"),

    /**
     * HUD-92900-B (12/2004)
     * 
     */
    @XmlEnumValue("ImportantNoticeToHomebuyers")
    IMPORTANT_NOTICE_TO_HOMEBUYERS("ImportantNoticeToHomebuyers"),

    /**
     * FNM 1073, FRE 465
     * 
     */
    @XmlEnumValue("IndividualCondominiumUnitAppraisalReport")
    INDIVIDUAL_CONDOMINIUM_UNIT_APPRAISAL_REPORT("IndividualCondominiumUnitAppraisalReport"),

    /**
     * FNM 2090
     * 
     */
    @XmlEnumValue("IndividualCooperativeInterestAppraisalReport")
    INDIVIDUAL_COOPERATIVE_INTEREST_APPRAISAL_REPORT("IndividualCooperativeInterestAppraisalReport"),

    /**
     * FRE 2070
     * 
     */
    @XmlEnumValue("LoanProspectorConditionAndMarketability")
    LOAN_PROSPECTOR_CONDITION_AND_MARKETABILITY("LoanProspectorConditionAndMarketability"),

    /**
     * FNM 1004C FRE 70B
     * 
     */
    @XmlEnumValue("ManufacturedHomeAppraisalReport")
    MANUFACTURED_HOME_APPRAISAL_REPORT("ManufacturedHomeAppraisalReport"),

    /**
     * VA Form 26-8712
     * 
     */
    @XmlEnumValue("ManufacturedHomeAppraisalReportVA")
    MANUFACTURED_HOME_APPRAISAL_REPORT_VA("ManufacturedHomeAppraisalReportVA"),

    /**
     * FNM 1004MC
     * 
     */
    @XmlEnumValue("MarketConditionsAddendumToTheAppraisalReport")
    MARKET_CONDITIONS_ADDENDUM_TO_THE_APPRAISAL_REPORT("MarketConditionsAddendumToTheAppraisalReport"),

    /**
     * HUD-92300 (02/1991)
     * 
     */
    @XmlEnumValue("MortgageesAssuranceOfCompletion")
    MORTGAGEES_ASSURANCE_OF_COMPLETION("MortgageesAssuranceOfCompletion"),

    /**
     * NPMA-99-B (08/2008)
     * 
     */
    @XmlEnumValue("NewConstructionSubterraneanTermiteSoilTreatmentRecord")
    NEW_CONSTRUCTION_SUBTERRANEAN_TERMITE_SOIL_TREATMENT_RECORD("NewConstructionSubterraneanTermiteSoilTreatmentRecord"),

    /**
     * FNM 2000 FRE1032
     * 
     */
    @XmlEnumValue("OneUnitResidentialAppraisalFieldReviewReport")
    ONE_UNIT_RESIDENTIAL_APPRAISAL_FIELD_REVIEW_REPORT("OneUnitResidentialAppraisalFieldReviewReport"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * VA Form 26-1805
     * 
     */
    @XmlEnumValue("RequestForDeterminationOfReasonableValue")
    REQUEST_FOR_DETERMINATION_OF_REASONABLE_VALUE("RequestForDeterminationOfReasonableValue"),

    /**
     * FNM 1025, FRE 72
     * 
     */
    @XmlEnumValue("SmallResidentialIncomePropertyAppraisalReport")
    SMALL_RESIDENTIAL_INCOME_PROPERTY_APPRAISAL_REPORT("SmallResidentialIncomePropertyAppraisalReport"),

    /**
     * NPMA-99-A (08/2008)
     * 
     */
    @XmlEnumValue("SubterraneanTermiteSoilTreatmentBuildersGuarantee")
    SUBTERRANEAN_TERMITE_SOIL_TREATMENT_BUILDERS_GUARANTEE("SubterraneanTermiteSoilTreatmentBuildersGuarantee"),

    /**
     * FNM 2000A, FRE 1072
     * 
     */
    @XmlEnumValue("TwoToFourUnitResidentialAppraisalFieldReviewReport")
    TWO_TO_FOUR_UNIT_RESIDENTIAL_APPRAISAL_FIELD_REVIEW_REPORT("TwoToFourUnitResidentialAppraisalFieldReviewReport"),

    /**
     * FNM 1004, FRE 70
     * 
     */
    @XmlEnumValue("UniformResidentialAppraisalReport")
    UNIFORM_RESIDENTIAL_APPRAISAL_REPORT("UniformResidentialAppraisalReport"),

    /**
     * ERC2010
     * 
     */
    @XmlEnumValue("WorldwideEmployeeRelocationCouncilSummaryAppraisalReport")
    WORLDWIDE_EMPLOYEE_RELOCATION_COUNCIL_SUMMARY_APPRAISAL_REPORT("WorldwideEmployeeRelocationCouncilSummaryAppraisalReport");
    private final String value;

    PropertyValuationFormBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyValuationFormBase fromValue(String v) {
        for (PropertyValuationFormBase c: PropertyValuationFormBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
