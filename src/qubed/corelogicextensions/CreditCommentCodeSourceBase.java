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
 * <p>Java class for CreditCommentCodeSourceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCommentCodeSourceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EquifaxBankruptcy"/>
 *     &lt;enumeration value="EquifaxCollectionStatus"/>
 *     &lt;enumeration value="EquifaxLegalStatus"/>
 *     &lt;enumeration value="EquifaxNarrative"/>
 *     &lt;enumeration value="ExperianAccountPurpose"/>
 *     &lt;enumeration value="ExperianAccountStatus"/>
 *     &lt;enumeration value="ExperianLegalStatus"/>
 *     &lt;enumeration value="ExperianSpecialComment"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TransUnionLoanType"/>
 *     &lt;enumeration value="TransUnionPublicRecordType"/>
 *     &lt;enumeration value="TransUnionRemarks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCommentCodeSourceBase")
@XmlEnum
public enum CreditCommentCodeSourceBase {


    /**
     * Code List Found In: Equifax STS V5/V6 Guide / Attachment 2 � Equifax Bankruptcy Intent/Disposition Codes.
     * Data Source: Segment 13 (BP Record) / Current Intent Disposition Code.
     * 
     * 
     */
    @XmlEnumValue("EquifaxBankruptcy")
    EQUIFAX_BANKRUPTCY("EquifaxBankruptcy"),

    /**
     * Code List Found In: Equifax STS V5/V6 Guide / Attachment 3 � Equifax Collection Status Codes
     * Data Source: Segment 14 (CO Record) / Collection Status Code
     * 
     * 
     */
    @XmlEnumValue("EquifaxCollectionStatus")
    EQUIFAX_COLLECTION_STATUS("EquifaxCollectionStatus"),

    /**
     * Code List Found In: Equifax STS V5/V6 Guide / Attachment 17 � Equifax Legal Item Status Codes
     * Data Source: Segment 16 (LI Record) / Status Code
     * 
     * 
     */
    @XmlEnumValue("EquifaxLegalStatus")
    EQUIFAX_LEGAL_STATUS("EquifaxLegalStatus"),

    /**
     * Code List Found In: Equifax STS V5/V6 Guide / Attachment 6 � Equifax Narrative Codes
     * Data Source: Segment 13 (BP Record) / Narrative Code #1, #2
     * Data Source: Segment 14 (CO Record) / Narrative Code #1, #2
     * Data Source: Segment 16 (LI Record) / Narrative Code #1, #2
     * Data Source: Segment 20 (TL Record) / Narrative Code #1, #2
     * Data Source: Segment 23 (TC/PT Record) / Narrative Code #1, #2
     * 
     * 
     */
    @XmlEnumValue("EquifaxNarrative")
    EQUIFAX_NARRATIVE("EquifaxNarrative"),

    /**
     * Code List Found In: Experian File One Appendix G � Account Purpose Type Codes
     * Data Source: 357 Segment / Type Code
     * Data Source: 357 Segment � F3 Sub-segment / Enhanced Type Code
     * Data Source: 359 Segment / Type Code
     * 
     * 
     */
    @XmlEnumValue("ExperianAccountPurpose")
    EXPERIAN_ACCOUNT_PURPOSE("ExperianAccountPurpose"),

    /**
     * Code List Found In: Experian File One Appendix L � Account Condition and Payment Status Codes
     * Data Source: 357 Segment / Status Code
     * Data Source: 357 Segment � F3 Sub-segment / Account Condition Code
     * Data Source: 357 Segment � F3 Sub-segment / Enhanced Payment Status
     * 
     * 
     */
    @XmlEnumValue("ExperianAccountStatus")
    EXPERIAN_ACCOUNT_STATUS("ExperianAccountStatus"),

    /**
     * Code List Found In: Experian File One Appendix C � Legal Status Codes and Designators
     * Data Source: 350 Segment / Status Code
     * 
     * 
     */
    @XmlEnumValue("ExperianLegalStatus")
    EXPERIAN_LEGAL_STATUS("ExperianLegalStatus"),

    /**
     * Code List Found In: Experian File One Appendix B � Special Comment Codes
     * Data Source: 357 Segment / Special Comment Code
     * Data Source: 357 Segment � F3 Sub-segment / Enhanced Special Comment Code
     * 
     * 
     */
    @XmlEnumValue("ExperianSpecialComment")
    EXPERIAN_SPECIAL_COMMENT("ExperianSpecialComment"),

    /**
     * Code List is from another source that is identified in Credit Comment Code Source Type Other Description.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide � Appendix C. Loan Type Codes
     * Data Source: IN01 Segment / Loan Type Code
     * Data Source: TR01 Segment / Loan Type Code
     * 
     * 
     */
    @XmlEnumValue("TransUnionLoanType")
    TRANS_UNION_LOAN_TYPE("TransUnionLoanType"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide � Appendix D. Public Record Type Codes
     * Data Source: PR01 Segment / Public Record Type
     * 
     * 
     */
    @XmlEnumValue("TransUnionPublicRecordType")
    TRANS_UNION_PUBLIC_RECORD_TYPE("TransUnionPublicRecordType"),

    /**
     * Code List Found In: Trans Union 4.0 User Guide � Appendix C. Remarks Codes
     * Data Source: TR01 Segment / Remarks Code
     * 
     * 
     */
    @XmlEnumValue("TransUnionRemarks")
    TRANS_UNION_REMARKS("TransUnionRemarks");
    private final String value;

    CreditCommentCodeSourceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCommentCodeSourceBase fromValue(String v) {
        for (CreditCommentCodeSourceBase c: CreditCommentCodeSourceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}