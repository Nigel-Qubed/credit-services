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
 * <p>Java class for AttachmentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Attached"/>
 *     &lt;enumeration value="Detached"/>
 *     &lt;enumeration value="SemiDetached"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentBase")
@XmlEnum
public enum AttachmentBase {


    /**
     * Residential dwelling unit that has common wall or other direct physical connection with another residential dwelling unit.
     * 
     */
    @XmlEnumValue("Attached")
    ATTACHED("Attached"),

    /**
     * Residential dwelling unit that has no common wall or other direct physical connection with another residential dwelling unit.
     * 
     */
    @XmlEnumValue("Detached")
    DETACHED("Detached"),

    /**
     * Residential dwellings that consist of pairs of houses built side by side sharing a common party wall. Sometimes called a duplex.
     * 
     */
    @XmlEnumValue("SemiDetached")
    SEMI_DETACHED("SemiDetached");
    private final String value;

    AttachmentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentBase fromValue(String v) {
        for (AttachmentBase c: AttachmentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
