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
 * <p>Java class for FulfillmentPartyRoleBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FulfillmentPartyRoleBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Notary"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TitleAgent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FulfillmentPartyRoleBase")
@XmlEnum
public enum FulfillmentPartyRoleBase {

    @XmlEnumValue("Notary")
    NOTARY("Notary"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("TitleAgent")
    TITLE_AGENT("TitleAgent");
    private final String value;

    FulfillmentPartyRoleBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FulfillmentPartyRoleBase fromValue(String v) {
        for (FulfillmentPartyRoleBase c: FulfillmentPartyRoleBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
