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
 * <p>Java class for LoanUnderwritingSubmitterBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanUnderwritingSubmitterBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Broker"/>
 *     &lt;enumeration value="Correspondent"/>
 *     &lt;enumeration value="LenderOtherThanSeller"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Seller"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanUnderwritingSubmitterBase")
@XmlEnum
public enum LoanUnderwritingSubmitterBase {


    /**
     * A party who, for a commission, matches borrowers and lenders. A mortgage broker takes applications and sometimes processes loans, but generally does not use its own funds for closing.
     * 
     */
    @XmlEnumValue("Broker")
    BROKER("Broker"),

    /**
     * A specialized type of mortgage banker whose function is limited to the origination of mortgage loans which are sold to other mortgage bankers or investment bankers under a specific commitment.
     * 
     */
    @XmlEnumValue("Correspondent")
    CORRESPONDENT("Correspondent"),

    /**
     * The party that invests in or originates mortgage loans. The lender is generally whosever name the loan is closed in.
     * 
     */
    @XmlEnumValue("LenderOtherThanSeller")
    LENDER_OTHER_THAN_SELLER("LenderOtherThanSeller"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The party selling the loan in the subject transaction.
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller");
    private final String value;

    LoanUnderwritingSubmitterBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanUnderwritingSubmitterBase fromValue(String v) {
        for (LoanUnderwritingSubmitterBase c: LoanUnderwritingSubmitterBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
