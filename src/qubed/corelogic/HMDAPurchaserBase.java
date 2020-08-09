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
 * <p>Java class for HMDAPurchaserBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HMDAPurchaserBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AffiliateInstitution"/>
 *     &lt;enumeration value="CommercialOrSavingsBank"/>
 *     &lt;enumeration value="FannieMae"/>
 *     &lt;enumeration value="FarmerMac"/>
 *     &lt;enumeration value="FinancialInstitution"/>
 *     &lt;enumeration value="FreddieMac"/>
 *     &lt;enumeration value="GinnieMae"/>
 *     &lt;enumeration value="MortgageCompany"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PrivateSecuritization"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HMDAPurchaserBase")
@XmlEnum
public enum HMDAPurchaserBase {


    /**
     * A covered loan sold to an institution affiliated with you the reporting entity, such as your subsidiary or a subsidiary of your parent corporation. For purposes of section 1003.4(a)(11), the term �affiliate� means any company that controls, is controlled by, or is under common control with, another company, as set forth in the Bank Holding Company Act of 1956 (12 U.S.C. 1841 et seq.).
     * 
     */
    @XmlEnumValue("AffiliateInstitution")
    AFFILIATE_INSTITUTION("AffiliateInstitution"),

    /**
     * Commercial bank, savings bank, or savings association
     * 
     */
    @XmlEnumValue("CommercialOrSavingsBank")
    COMMERCIAL_OR_SAVINGS_BANK("CommercialOrSavingsBank"),

    /**
     * Fannie Mae
     * 
     */
    @XmlEnumValue("FannieMae")
    FANNIE_MAE("FannieMae"),

    /**
     * Farmer Mac
     * 
     */
    @XmlEnumValue("FarmerMac")
    FARMER_MAC("FarmerMac"),

    /**
     * Life insurance company, credit union, mortgage bank, or finance company
     * 
     */
    @XmlEnumValue("FinancialInstitution")
    FINANCIAL_INSTITUTION("FinancialInstitution"),

    /**
     * Freddie Mac
     * 
     */
    @XmlEnumValue("FreddieMac")
    FREDDIE_MAC("FreddieMac"),

    /**
     * A covered loan to Ginnie Mae in connection with a mortgage-backed security transaction.
     * 
     */
    @XmlEnumValue("GinnieMae")
    GINNIE_MAE("GinnieMae"),

    /**
     * A non depository institution that purchases covered loans and typically originates such loans. A mortgage company might be an affiliate or a subsidiary of a bank holding company or thrift holding company, or it might be an independent mortgage company. Regardless, a financial institution reports the purchasing entity type as a mortgage company, unless the mortgage company is an affiliate of the seller institution, in which case the seller institution should report the loan as purchased by an affiliate institution.
     * 
     */
    @XmlEnumValue("MortgageCompany")
    MORTGAGE_COMPANY("MortgageCompany"),

    /**
     * Covered loan was not originated or was originated or purchased but was not sold to a secondary market entity in calendar year covered by register:  application was denied, withdrawn, or approved but not accepted by the applicant, or file was closed for incompleteness. Also used for preapproval requests that were denied or approved but not accepted by the applicant.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * For private securitizations by purchasers other than Ginnie Mae, Fannie Mae, Freddie Mac or Farmer Mac. Also if you know or reasonably believe that the covered loan you are selling will be securitized by the institution purchasing the covered loan regardless of the type or affiliation of the purchasing institution.
     * 
     */
    @XmlEnumValue("PrivateSecuritization")
    PRIVATE_SECURITIZATION("PrivateSecuritization");
    private final String value;

    HMDAPurchaserBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HMDAPurchaserBase fromValue(String v) {
        for (HMDAPurchaserBase c: HMDAPurchaserBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
