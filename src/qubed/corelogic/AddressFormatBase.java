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
 * <p>Java class for AddressFormatBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressFormatBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="HighwayContract"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="International"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PostOfficeBox"/>
 *     &lt;enumeration value="RuralRoute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressFormatBase")
@XmlEnum
public enum AddressFormatBase {


    /**
     * A route for carrying mail over the highway between designated points. Given on a contract to a private carrier and often requiring, in rural areas, delivery to home mailboxes.
     * 
     */
    @XmlEnumValue("HighwayContract")
    HIGHWAY_CONTRACT("HighwayContract"),

    /**
     * Delivery of mail to a single destination defined by USPS. Commonly referred to as the street address.
     * 
     */
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),

    /**
     * Delivery of mail to a foreign destination that is not part of the USPS delivery network.
     * 
     */
    @XmlEnumValue("International")
    INTERNATIONAL("International"),

    /**
     * Delivery of mail to a military location (APO/FPO/DPO).
     * 
     */
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Delivery of mail to a secured location within a postal facility.
     * 
     */
    @XmlEnumValue("PostOfficeBox")
    POST_OFFICE_BOX("PostOfficeBox"),

    /**
     * Delivery of mail to a rural free area.
     * 
     */
    @XmlEnumValue("RuralRoute")
    RURAL_ROUTE("RuralRoute");
    private final String value;

    AddressFormatBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressFormatBase fromValue(String v) {
        for (AddressFormatBase c: AddressFormatBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}