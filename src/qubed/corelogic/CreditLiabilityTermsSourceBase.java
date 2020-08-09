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
 * <p>Java class for CreditLiabilityTermsSourceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditLiabilityTermsSourceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Provided"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditLiabilityTermsSourceBase")
@XmlEnum
public enum CreditLiabilityTermsSourceBase {


    /**
     * The monthly payment terms amount was calculated by the credit bureau.
     * 
     */
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),

    /**
     * The monthly payment terms amount was provided by the credit liability holder.
     * 
     */
    @XmlEnumValue("Provided")
    PROVIDED("Provided");
    private final String value;

    CreditLiabilityTermsSourceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditLiabilityTermsSourceBase fromValue(String v) {
        for (CreditLiabilityTermsSourceBase c: CreditLiabilityTermsSourceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
