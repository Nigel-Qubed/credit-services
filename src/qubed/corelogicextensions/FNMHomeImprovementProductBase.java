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
 * <p>Java class for FNMHomeImprovementProductBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FNMHomeImprovementProductBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ActualActualBiweekly"/>
 *     &lt;enumeration value="ConstructionToPermanent"/>
 *     &lt;enumeration value="DailySimpleInterestCashConventional"/>
 *     &lt;enumeration value="DailySimpleInterestMBS"/>
 *     &lt;enumeration value="GovernmentTitleI"/>
 *     &lt;enumeration value="Universal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FNMHomeImprovementProductBase")
@XmlEnum
public enum FNMHomeImprovementProductBase {

    @XmlEnumValue("ActualActualBiweekly")
    ACTUAL_ACTUAL_BIWEEKLY("ActualActualBiweekly"),
    @XmlEnumValue("ConstructionToPermanent")
    CONSTRUCTION_TO_PERMANENT("ConstructionToPermanent"),
    @XmlEnumValue("DailySimpleInterestCashConventional")
    DAILY_SIMPLE_INTEREST_CASH_CONVENTIONAL("DailySimpleInterestCashConventional"),
    @XmlEnumValue("DailySimpleInterestMBS")
    DAILY_SIMPLE_INTEREST_MBS("DailySimpleInterestMBS"),
    @XmlEnumValue("GovernmentTitleI")
    GOVERNMENT_TITLE_I("GovernmentTitleI"),
    @XmlEnumValue("Universal")
    UNIVERSAL("Universal");
    private final String value;

    FNMHomeImprovementProductBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FNMHomeImprovementProductBase fromValue(String v) {
        for (FNMHomeImprovementProductBase c: FNMHomeImprovementProductBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
