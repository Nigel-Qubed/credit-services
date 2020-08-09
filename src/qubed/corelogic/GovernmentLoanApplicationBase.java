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
 * <p>Java class for GovernmentLoanApplicationBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GovernmentLoanApplicationBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="HomeLoanGuaranty"/>
 *     &lt;enumeration value="NationalHousingAct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GovernmentLoanApplicationBase")
@XmlEnum
public enum GovernmentLoanApplicationBase {

    @XmlEnumValue("HomeLoanGuaranty")
    HOME_LOAN_GUARANTY("HomeLoanGuaranty"),
    @XmlEnumValue("NationalHousingAct")
    NATIONAL_HOUSING_ACT("NationalHousingAct");
    private final String value;

    GovernmentLoanApplicationBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GovernmentLoanApplicationBase fromValue(String v) {
        for (GovernmentLoanApplicationBase c: GovernmentLoanApplicationBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
