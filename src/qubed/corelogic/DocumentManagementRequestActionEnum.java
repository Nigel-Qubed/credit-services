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
 * <p>Java class for DocumentManagementRequestActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentManagementRequestActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="StatusQuery"/>
 *     &lt;enumeration value="Retrieve"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="OffHold"/>
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Reissue"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentManagementRequestActionEnum", namespace = "http://globalgateway.corelogic.com/order/2015")
@XmlEnum
public enum DocumentManagementRequestActionEnum {

    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("StatusQuery")
    STATUS_QUERY("StatusQuery"),
    @XmlEnumValue("Retrieve")
    RETRIEVE("Retrieve"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("OffHold")
    OFF_HOLD("OffHold"),
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Reissue")
    REISSUE("Reissue"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DocumentManagementRequestActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentManagementRequestActionEnum fromValue(String v) {
        for (DocumentManagementRequestActionEnum c: DocumentManagementRequestActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
