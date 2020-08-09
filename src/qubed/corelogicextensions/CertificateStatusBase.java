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
 * <p>Java class for CertificateStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificateStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Denied"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="InApplication"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificateStatusBase")
@XmlEnum
public enum CertificateStatusBase {

    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Denied")
    DENIED("Denied"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("InApplication")
    IN_APPLICATION("InApplication"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CertificateStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificateStatusBase fromValue(String v) {
        for (CertificateStatusBase c: CertificateStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
