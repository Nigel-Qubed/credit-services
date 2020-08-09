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
 * <p>Java class for IncomeReportedBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomeReportedBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="PostTax"/>
 *     &lt;enumeration value="PreTax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncomeReportedBase")
@XmlEnum
public enum IncomeReportedBase {

    @XmlEnumValue("PostTax")
    POST_TAX("PostTax"),
    @XmlEnumValue("PreTax")
    PRE_TAX("PreTax");
    private final String value;

    IncomeReportedBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncomeReportedBase fromValue(String v) {
        for (IncomeReportedBase c: IncomeReportedBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
