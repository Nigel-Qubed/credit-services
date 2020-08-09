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
 * <p>Java class for LoanProductStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanProductStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Eligible"/>
 *     &lt;enumeration value="Ineligible"/>
 *     &lt;enumeration value="Offered"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Selected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoanProductStatusBase")
@XmlEnum
public enum LoanProductStatusBase {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Eligible")
    ELIGIBLE("Eligible"),
    @XmlEnumValue("Ineligible")
    INELIGIBLE("Ineligible"),
    @XmlEnumValue("Offered")
    OFFERED("Offered"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Selected")
    SELECTED("Selected");
    private final String value;

    LoanProductStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanProductStatusBase fromValue(String v) {
        for (LoanProductStatusBase c: LoanProductStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}