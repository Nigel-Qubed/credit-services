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
 * <p>Java class for ActualDocumentationLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActualDocumentationLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullDocumentation"/>
 *     &lt;enumeration value="LimitedDocumentation"/>
 *     &lt;enumeration value="NoDocumentation"/>
 *     &lt;enumeration value="NoIncomeNoAssets"/>
 *     &lt;enumeration value="StatedIncome"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActualDocumentationLevelEnum", namespace = "http://globalgateway.corelogic.com/order/2015")
@XmlEnum
public enum ActualDocumentationLevelEnum {

    @XmlEnumValue("FullDocumentation")
    FULL_DOCUMENTATION("FullDocumentation"),
    @XmlEnumValue("LimitedDocumentation")
    LIMITED_DOCUMENTATION("LimitedDocumentation"),
    @XmlEnumValue("NoDocumentation")
    NO_DOCUMENTATION("NoDocumentation"),
    @XmlEnumValue("NoIncomeNoAssets")
    NO_INCOME_NO_ASSETS("NoIncomeNoAssets"),
    @XmlEnumValue("StatedIncome")
    STATED_INCOME("StatedIncome"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ActualDocumentationLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActualDocumentationLevelEnum fromValue(String v) {
        for (ActualDocumentationLevelEnum c: ActualDocumentationLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}