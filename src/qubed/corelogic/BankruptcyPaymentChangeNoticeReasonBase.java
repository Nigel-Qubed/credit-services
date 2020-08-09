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
 * <p>Java class for BankruptcyPaymentChangeNoticeReasonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankruptcyPaymentChangeNoticeReasonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ARMAdjustment"/>
 *     &lt;enumeration value="CommunityDevelopmentDistrictFeeChange"/>
 *     &lt;enumeration value="HomeownersAssociationFeeChange"/>
 *     &lt;enumeration value="InsuranceChange"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PropertyTaxChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankruptcyPaymentChangeNoticeReasonBase")
@XmlEnum
public enum BankruptcyPaymentChangeNoticeReasonBase {


    /**
     * Adjustment due to the rate chnage of a loan with amortization type of ARM.
     * 
     */
    @XmlEnumValue("ARMAdjustment")
    ARM_ADJUSTMENT("ARMAdjustment"),

    /**
     * Change in Community Development District fees.
     * 
     */
    @XmlEnumValue("CommunityDevelopmentDistrictFeeChange")
    COMMUNITY_DEVELOPMENT_DISTRICT_FEE_CHANGE("CommunityDevelopmentDistrictFeeChange"),

    /**
     * Change in homeowners association fees.
     * 
     */
    @XmlEnumValue("HomeownersAssociationFeeChange")
    HOMEOWNERS_ASSOCIATION_FEE_CHANGE("HomeownersAssociationFeeChange"),

    /**
     * Change in Insurance premiums.
     * 
     */
    @XmlEnumValue("InsuranceChange")
    INSURANCE_CHANGE("InsuranceChange"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Change in property taxes
     * 
     */
    @XmlEnumValue("PropertyTaxChange")
    PROPERTY_TAX_CHANGE("PropertyTaxChange");
    private final String value;

    BankruptcyPaymentChangeNoticeReasonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankruptcyPaymentChangeNoticeReasonBase fromValue(String v) {
        for (BankruptcyPaymentChangeNoticeReasonBase c: BankruptcyPaymentChangeNoticeReasonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
