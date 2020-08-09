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
 * <p>Java class for CompensationPaidByBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompensationPaidByBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Borrower"/>
 *     &lt;enumeration value="Investor"/>
 *     &lt;enumeration value="Lender"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Seller"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompensationPaidByBase")
@XmlEnum
public enum CompensationPaidByBase {

    @XmlEnumValue("Borrower")
    BORROWER("Borrower"),
    @XmlEnumValue("Investor")
    INVESTOR("Investor"),
    @XmlEnumValue("Lender")
    LENDER("Lender"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Seller")
    SELLER("Seller");
    private final String value;

    CompensationPaidByBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompensationPaidByBase fromValue(String v) {
        for (CompensationPaidByBase c: CompensationPaidByBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
