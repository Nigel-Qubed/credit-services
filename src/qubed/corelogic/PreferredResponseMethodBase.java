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
 * <p>Java class for PreferredResponseMethodBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredResponseMethodBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="FTP"/>
 *     &lt;enumeration value="HTTP"/>
 *     &lt;enumeration value="HTTPS"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="MessageQueue"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SMTP"/>
 *     &lt;enumeration value="VAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferredResponseMethodBase")
@XmlEnum
public enum PreferredResponseMethodBase {


    /**
     * Supply a telephone number
     * 
     */
    @XmlEnumValue("Fax")
    FAX("Fax"),

    /**
     * Supply a path and file name
     * 
     */
    @XmlEnumValue("File")
    FILE("File"),

    /**
     * Supply a URL
     * 
     */
    FTP("FTP"),

    /**
     * Supply a URL
     * 
     */
    HTTP("HTTP"),

    /**
     * Supply a secure URL.
     * 
     */
    HTTPS("HTTPS"),

    /**
     * Supply a mailing address
     * 
     */
    @XmlEnumValue("Mail")
    MAIL("Mail"),

    /**
     * Supply a queue name
     * 
     */
    @XmlEnumValue("MessageQueue")
    MESSAGE_QUEUE("MessageQueue"),

    /**
     * Specify in Delivery Method Other element
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Supply an email address.
     * 
     */
    SMTP("SMTP"),

    /**
     * Supply a mailbox ID
     * 
     */
    VAN("VAN");
    private final String value;

    PreferredResponseMethodBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferredResponseMethodBase fromValue(String v) {
        for (PreferredResponseMethodBase c: PreferredResponseMethodBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}