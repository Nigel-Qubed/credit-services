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
 * <p>Java class for TitleEndorsementSourceBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleEndorsementSourceBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ALTA"/>
 *     &lt;enumeration value="CLTA"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TLTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TitleEndorsementSourceBase")
@XmlEnum
public enum TitleEndorsementSourceBase {

    ALTA("ALTA"),
    CLTA("CLTA"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    TLTA("TLTA");
    private final String value;

    TitleEndorsementSourceBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TitleEndorsementSourceBase fromValue(String v) {
        for (TitleEndorsementSourceBase c: TitleEndorsementSourceBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
