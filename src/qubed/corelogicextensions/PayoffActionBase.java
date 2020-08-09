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
 * <p>Java class for PayoffActionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayoffActionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="LenderOrderBothPayoffSubordinate"/>
 *     &lt;enumeration value="LenderOrderPayoff"/>
 *     &lt;enumeration value="LenderOrderSubordinate"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TitleCompanyOrderBothPayoffSubordinate"/>
 *     &lt;enumeration value="TitleCompanyOrderPayoff"/>
 *     &lt;enumeration value="TitleCompanyOrderSubordinate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayoffActionBase")
@XmlEnum
public enum PayoffActionBase {

    @XmlEnumValue("LenderOrderBothPayoffSubordinate")
    LENDER_ORDER_BOTH_PAYOFF_SUBORDINATE("LenderOrderBothPayoffSubordinate"),
    @XmlEnumValue("LenderOrderPayoff")
    LENDER_ORDER_PAYOFF("LenderOrderPayoff"),
    @XmlEnumValue("LenderOrderSubordinate")
    LENDER_ORDER_SUBORDINATE("LenderOrderSubordinate"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("TitleCompanyOrderBothPayoffSubordinate")
    TITLE_COMPANY_ORDER_BOTH_PAYOFF_SUBORDINATE("TitleCompanyOrderBothPayoffSubordinate"),
    @XmlEnumValue("TitleCompanyOrderPayoff")
    TITLE_COMPANY_ORDER_PAYOFF("TitleCompanyOrderPayoff"),
    @XmlEnumValue("TitleCompanyOrderSubordinate")
    TITLE_COMPANY_ORDER_SUBORDINATE("TitleCompanyOrderSubordinate");
    private final String value;

    PayoffActionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayoffActionBase fromValue(String v) {
        for (PayoffActionBase c: PayoffActionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
