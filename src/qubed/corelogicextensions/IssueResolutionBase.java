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
 * <p>Java class for IssueResolutionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueResolutionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ConfidentialProprietaryOrPrivileged"/>
 *     &lt;enumeration value="Duplicative"/>
 *     &lt;enumeration value="ErrorCorrectionMade"/>
 *     &lt;enumeration value="Irrelevant"/>
 *     &lt;enumeration value="NoErrorOccurred"/>
 *     &lt;enumeration value="NotServicedLoan"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Overbroad"/>
 *     &lt;enumeration value="ReferredToRegulatoryAgency"/>
 *     &lt;enumeration value="RequestedInformationProvided"/>
 *     &lt;enumeration value="UnauthorizedParty"/>
 *     &lt;enumeration value="Untimely"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssueResolutionBase")
@XmlEnum
public enum IssueResolutionBase {


    /**
     * The information used in the investigation or requested by the borrower regarding an event issue may or may not be directly related to the borrower's mortgage loan account.  However, the material may be confidential, proprietary or privileged and was not disclosed.
     * 
     */
    @XmlEnumValue("ConfidentialProprietaryOrPrivileged")
    CONFIDENTIAL_PROPRIETARY_OR_PRIVILEGED("ConfidentialProprietaryOrPrivileged"),

    /**
     * The event issue is substantially the same as one previously received or resolved.
     * 
     */
    @XmlEnumValue("Duplicative")
    DUPLICATIVE("Duplicative"),

    /**
     * An error correction was made in response to the event issue.
     * 
     */
    @XmlEnumValue("ErrorCorrectionMade")
    ERROR_CORRECTION_MADE("ErrorCorrectionMade"),

    /**
     * The information requested in an event issue is not directly related to the borrower's mortgage loan account.
     * 
     */
    @XmlEnumValue("Irrelevant")
    IRRELEVANT("Irrelevant"),

    /**
     * No error has occurred in connection with the investigation of a event issue.
     * 
     */
    @XmlEnumValue("NoErrorOccurred")
    NO_ERROR_OCCURRED("NoErrorOccurred"),

    /**
     * The servicer does not recognize the loan or the borrower as a servicing customer.
     * 
     */
    @XmlEnumValue("NotServicedLoan")
    NOT_SERVICED_LOAN("NotServicedLoan"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The subject of the event issue cannot be determined.
     * 
     */
    @XmlEnumValue("Overbroad")
    OVERBROAD("Overbroad"),

    /**
     * The event issue has been referred to the CFPB or other regulatory agency for information or additional review.
     * 
     */
    @XmlEnumValue("ReferredToRegulatoryAgency")
    REFERRED_TO_REGULATORY_AGENCY("ReferredToRegulatoryAgency"),

    /**
     * The requested information has been provided in regard to a event issue.
     * 
     */
    @XmlEnumValue("RequestedInformationProvided")
    REQUESTED_INFORMATION_PROVIDED("RequestedInformationProvided"),

    /**
     * The initiator is not authorized to represent the borrower.
     * 
     */
    @XmlEnumValue("UnauthorizedParty")
    UNAUTHORIZED_PARTY("UnauthorizedParty"),

    /**
     * The event issue was initiated after the loan was transferred to another servicer, lien released and or the statute of limitations has expired and the issue will not be investigated.
     * 
     */
    @XmlEnumValue("Untimely")
    UNTIMELY("Untimely");
    private final String value;

    IssueResolutionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueResolutionBase fromValue(String v) {
        for (IssueResolutionBase c: IssueResolutionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
