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
 * <p>Java class for CreditRatingCodeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditRatingCodeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Equifax"/>
 *     &lt;enumeration value="Experian"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditRatingCodeBase")
@XmlEnum
public enum CreditRatingCodeBase {


    /**
     * Uses Equifax coding systems for rating manner of payment.
     * 
     */
    @XmlEnumValue("Equifax")
    EQUIFAX("Equifax"),

    /**
     * Uses Experian coding system for rating manner of payment.
     * 
     */
    @XmlEnumValue("Experian")
    EXPERIAN("Experian"),

    /**
     * Uses other rating code system.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CreditRatingCodeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditRatingCodeBase fromValue(String v) {
        for (CreditRatingCodeBase c: CreditRatingCodeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
