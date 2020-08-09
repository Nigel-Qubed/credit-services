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
 * <p>Java class for PrepaymentPenaltyOptionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaymentPenaltyOptionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Hard"/>
 *     &lt;enumeration value="Soft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaymentPenaltyOptionBase")
@XmlEnum
public enum PrepaymentPenaltyOptionBase {


    /**
     * Standard prepay penalty applies in all situations.
     * 
     */
    @XmlEnumValue("Hard")
    HARD("Hard"),

    /**
     * Borrower may sell property without penalty. However, refinance will incur penalty.
     * 
     */
    @XmlEnumValue("Soft")
    SOFT("Soft");
    private final String value;

    PrepaymentPenaltyOptionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaymentPenaltyOptionBase fromValue(String v) {
        for (PrepaymentPenaltyOptionBase c: PrepaymentPenaltyOptionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
