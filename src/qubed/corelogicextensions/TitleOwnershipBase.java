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
 * <p>Java class for TitleOwnershipBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleOwnershipBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Combination"/>
 *     &lt;enumeration value="Corporation"/>
 *     &lt;enumeration value="Estate"/>
 *     &lt;enumeration value="GovernmentEntity"/>
 *     &lt;enumeration value="Guardianship"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="JointVenture"/>
 *     &lt;enumeration value="LimitedLiabilityCompany"/>
 *     &lt;enumeration value="LimitedPartnership"/>
 *     &lt;enumeration value="NonProfitCorporation"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Partnership"/>
 *     &lt;enumeration value="Trust"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TitleOwnershipBase")
@XmlEnum
public enum TitleOwnershipBase {


    /**
     * Ownership will be held by a combination of Individuals, Corporations, Partnerships and Trusts.
     * 
     */
    @XmlEnumValue("Combination")
    COMBINATION("Combination"),

    /**
     * Ownership will be held by a corporation.
     * 
     */
    @XmlEnumValue("Corporation")
    CORPORATION("Corporation"),
    @XmlEnumValue("Estate")
    ESTATE("Estate"),
    @XmlEnumValue("GovernmentEntity")
    GOVERNMENT_ENTITY("GovernmentEntity"),
    @XmlEnumValue("Guardianship")
    GUARDIANSHIP("Guardianship"),

    /**
     * Ownership will be held by one individual.
     * 
     */
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("JointVenture")
    JOINT_VENTURE("JointVenture"),
    @XmlEnumValue("LimitedLiabilityCompany")
    LIMITED_LIABILITY_COMPANY("LimitedLiabilityCompany"),
    @XmlEnumValue("LimitedPartnership")
    LIMITED_PARTNERSHIP("LimitedPartnership"),
    @XmlEnumValue("NonProfitCorporation")
    NON_PROFIT_CORPORATION("NonProfitCorporation"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Ownership will be held by a partnership.
     * 
     */
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),

    /**
     * Ownership will be held by a trust.
     * 
     */
    @XmlEnumValue("Trust")
    TRUST("Trust");
    private final String value;

    TitleOwnershipBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TitleOwnershipBase fromValue(String v) {
        for (TitleOwnershipBase c: TitleOwnershipBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}