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
 * <p>Java class for FREPurchaseEligibilityBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FREPurchaseEligibilityBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="FreddieMacEligible"/>
 *     &lt;enumeration value="FreddieMacIneligible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FREPurchaseEligibilityBase")
@XmlEnum
public enum FREPurchaseEligibilityBase {

    @XmlEnumValue("FreddieMacEligible")
    FREDDIE_MAC_ELIGIBLE("FreddieMacEligible"),
    @XmlEnumValue("FreddieMacIneligible")
    FREDDIE_MAC_INELIGIBLE("FreddieMacIneligible");
    private final String value;

    FREPurchaseEligibilityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FREPurchaseEligibilityBase fromValue(String v) {
        for (FREPurchaseEligibilityBase c: FREPurchaseEligibilityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}