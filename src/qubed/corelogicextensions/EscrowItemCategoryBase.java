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
 * <p>Java class for EscrowItemCategoryBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EscrowItemCategoryBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AssociationDues"/>
 *     &lt;enumeration value="Holdback"/>
 *     &lt;enumeration value="HomeownersInsurance"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PropertyTaxes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EscrowItemCategoryBase")
@XmlEnum
public enum EscrowItemCategoryBase {


    /**
     * Fee payable by homeowners to the respective association within which the subject property is located, which is intended to pay for the daily operation of the association and may include but is not limited to items such as electricity bills for street lights, landscaping, and maintenance and repairs to community facilities like clubhouses, pools, and exercise rooms and may also cover insurance on community assets, the salaries of HOA employees or third party management fees and any capital or special assessments in aggregate.
     * 
     */
    @XmlEnumValue("AssociationDues")
    ASSOCIATION_DUES("AssociationDues"),

    /**
     * Funds set aside after closing for moneys held back until a specified work item has been completed.
     * 
     */
    @XmlEnumValue("Holdback")
    HOLDBACK("Holdback"),

    /**
     * Insurance against loss of or damage to the property, or against liability arising out of the ownership or use of the property.
     * 
     */
    @XmlEnumValue("HomeownersInsurance")
    HOMEOWNERS_INSURANCE("HomeownersInsurance"),

    /**
     * Fee for Insurance or guaranty to protect lender against the non-payment of, or default on, an individual mortgage.
     * 
     */
    MI("MI"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Property taxes in aggregate levied by all authorities in which the subject property is located
     * 
     */
    @XmlEnumValue("PropertyTaxes")
    PROPERTY_TAXES("PropertyTaxes");
    private final String value;

    EscrowItemCategoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EscrowItemCategoryBase fromValue(String v) {
        for (EscrowItemCategoryBase c: EscrowItemCategoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
