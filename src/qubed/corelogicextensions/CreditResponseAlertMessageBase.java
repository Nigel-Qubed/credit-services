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
 * <p>Java class for CreditResponseAlertMessageBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditResponseAlertMessageBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="EquifaxSAFESCAN"/>
 *     &lt;enumeration value="EquifaxSSNVerified"/>
 *     &lt;enumeration value="ExperianFACSPlus"/>
 *     &lt;enumeration value="ExperianFraudShield"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TransUnionHAWKAlert"/>
 *     &lt;enumeration value="TransUnionHighRiskFraudAlert"/>
 *     &lt;enumeration value="TransUnionIdentifierMismatchAlert"/>
 *     &lt;enumeration value="TransUnionTransAlert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditResponseAlertMessageBase")
@XmlEnum
public enum CreditResponseAlertMessageBase {


    /**
     * Optional product that provides alert messages for possibly fraudulent SSN, addresses and other data.
     * 
     */
    @XmlEnumValue("EquifaxSAFESCAN")
    EQUIFAX_SAFESCAN("EquifaxSAFESCAN"),

    /**
     * Optional product that validates borrowers SSN data.
     * 
     */
    @XmlEnumValue("EquifaxSSNVerified")
    EQUIFAX_SSN_VERIFIED("EquifaxSSNVerified"),

    /**
     * Optional product that generates alert messages for possibly fraudulent SSNs, addresses and other data.
     * 
     */
    @XmlEnumValue("ExperianFACSPlus")
    EXPERIAN_FACS_PLUS("ExperianFACSPlus"),

    /**
     * Optional product that generates alert messages for possibly fraudulent SSNs, addresses and other data. This product was formerly called Experian FACS Plus.
     * 
     */
    @XmlEnumValue("ExperianFraudShield")
    EXPERIAN_FRAUD_SHIELD("ExperianFraudShield"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Optional product that matches addresses, SSNs, and phone numbers against national fraud database. Trans Union has renamed this product to Trans Union High Risk Fraud Alert.
     * 
     */
    @XmlEnumValue("TransUnionHAWKAlert")
    TRANS_UNION_HAWK_ALERT("TransUnionHAWKAlert"),

    /**
     * New name for the Trans Union HAWK Alert product, which matches addresses, SSNs and phone numbers against national fraud database.
     * 
     */
    @XmlEnumValue("TransUnionHighRiskFraudAlert")
    TRANS_UNION_HIGH_RISK_FRAUD_ALERT("TransUnionHighRiskFraudAlert"),

    /**
     * New name for the Trans Union Trans Alert product, which highlights mismatched addresses, invalid postal codes, SSN mismatches, etc.
     * 
     */
    @XmlEnumValue("TransUnionIdentifierMismatchAlert")
    TRANS_UNION_IDENTIFIER_MISMATCH_ALERT("TransUnionIdentifierMismatchAlert"),

    /**
     * Optional product that highlights mismatched addresses, invalid postal codes, SSN mismatches, etc. Trans Union has renamed this product to Trans Union ID Mismatch Alert.
     * 
     */
    @XmlEnumValue("TransUnionTransAlert")
    TRANS_UNION_TRANS_ALERT("TransUnionTransAlert");
    private final String value;

    CreditResponseAlertMessageBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditResponseAlertMessageBase fromValue(String v) {
        for (CreditResponseAlertMessageBase c: CreditResponseAlertMessageBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
