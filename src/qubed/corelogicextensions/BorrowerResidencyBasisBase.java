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
 * <p>Java class for BorrowerResidencyBasisBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BorrowerResidencyBasisBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="LivingRentFree"/>
 *     &lt;enumeration value="Own"/>
 *     &lt;enumeration value="Rent"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BorrowerResidencyBasisBase")
@XmlEnum
public enum BorrowerResidencyBasisBase {


    /**
     * Borrower lives/lived at indicated address without paying rent (e.g., parents home).
     * 
     */
    @XmlEnumValue("LivingRentFree")
    LIVING_RENT_FREE("LivingRentFree"),

    /**
     * Borrower lives/lived at indicated address as an owner.
     * 
     */
    @XmlEnumValue("Own")
    OWN("Own"),

    /**
     * Borrower lives/lived in rented dwelling at indicated address.
     * 
     */
    @XmlEnumValue("Rent")
    RENT("Rent"),

    /**
     * Basis on which borrower lived at indicated address is not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    BorrowerResidencyBasisBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BorrowerResidencyBasisBase fromValue(String v) {
        for (BorrowerResidencyBasisBase c: BorrowerResidencyBasisBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
