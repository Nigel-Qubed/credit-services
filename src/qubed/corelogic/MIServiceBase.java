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
 * <p>Java class for MIServiceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIServiceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ContractUnderwrite"/>
 *     &lt;enumeration value="ContractUnderwriteWithMI"/>
 *     &lt;enumeration value="EligibilityOnly"/>
 *     &lt;enumeration value="FullUnderwrite"/>
 *     &lt;enumeration value="MIApplication"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PostCloseDocuments"/>
 *     &lt;enumeration value="PreQualification"/>
 *     &lt;enumeration value="RateQuote"/>
 *     &lt;enumeration value="RateQuoteAndEligibility"/>
 *     &lt;enumeration value="StatusQuery"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MIServiceBase")
@XmlEnum
public enum MIServiceBase {


    /**
     * A process where underwritng rules are checked for the requested insurance product and a decision and rates are returned, but there is no insurance implied for the loan.
     * 
     */
    @XmlEnumValue("ContractUnderwrite")
    CONTRACT_UNDERWRITE("ContractUnderwrite"),

    /**
     * Indicates that the loan that is being submitted for mortgage insurance is also being contract underwritten by the Mortgage Insurance Company.
     * 
     */
    @XmlEnumValue("ContractUnderwriteWithMI")
    CONTRACT_UNDERWRITE_WITH_MI("ContractUnderwriteWithMI"),

    /**
     * A process where underwritng rules are checked for the requested insurance product and a decision is returned, but the product is not priced, nor is any insurance implied. Usually done as a precusor to ordering insurance.
     * 
     */
    @XmlEnumValue("EligibilityOnly")
    ELIGIBILITY_ONLY("EligibilityOnly"),

    /**
     * A process where all underwriting functions are performed by the receiver of the data. No underwritiing functions are delegated to the lender. This usually includes the receiving of both data and documents.
     * 
     */
    @XmlEnumValue("FullUnderwrite")
    FULL_UNDERWRITE("FullUnderwrite"),

    /**
     * A request for Mortgage Insurance.
     * 
     */
    @XmlEnumValue("MIApplication")
    MI_APPLICATION("MIApplication"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Sending documents associated with a loan, after the loan has closed.
     * 
     */
    @XmlEnumValue("PostCloseDocuments")
    POST_CLOSE_DOCUMENTS("PostCloseDocuments"),

    /**
     * A request for Mortgage Insurance on a loan without a property.
     * 
     */
    @XmlEnumValue("PreQualification")
    PRE_QUALIFICATION("PreQualification"),

    /**
     * A process where a rate is returned for the requested insurance product, but no underwriting rules are checked, nor is any insurance implied. Usually done as a precusor to ordering insurance.
     * 
     */
    @XmlEnumValue("RateQuote")
    RATE_QUOTE("RateQuote"),

    /**
     * A process where the requested insurance proudct is priced and an underwriting decision is given, but no insurance is implied. Usually done as a precusor to ordering insurance.
     * 
     */
    @XmlEnumValue("RateQuoteAndEligibility")
    RATE_QUOTE_AND_ELIGIBILITY("RateQuoteAndEligibility"),

    /**
     * To check the status of a previously placed order.
     * 
     */
    @XmlEnumValue("StatusQuery")
    STATUS_QUERY("StatusQuery");
    private final String value;

    MIServiceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIServiceBase fromValue(String v) {
        for (MIServiceBase c: MIServiceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
