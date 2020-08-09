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
 * <p>Java class for StateRefinanceProgramBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StateRefinanceProgramBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ConsolidationExtensionAndModificationAgreement"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TexasHomeEquity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StateRefinanceProgramBase")
@XmlEnum
public enum StateRefinanceProgramBase {


    /**
     * Indicates the New York refinance code of Consolidation Extension And Modification Agreement (CEMA).
     * 
     */
    @XmlEnumValue("ConsolidationExtensionAndModificationAgreement")
    CONSOLIDATION_EXTENSION_AND_MODIFICATION_AGREEMENT("ConsolidationExtensionAndModificationAgreement"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Indicates the Texas refinance code of Texas Home Equity.
     * 
     */
    @XmlEnumValue("TexasHomeEquity")
    TEXAS_HOME_EQUITY("TexasHomeEquity");
    private final String value;

    StateRefinanceProgramBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateRefinanceProgramBase fromValue(String v) {
        for (StateRefinanceProgramBase c: StateRefinanceProgramBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
