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
 * <p>Java class for ArchitecturalDesignCategoryBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArchitecturalDesignCategoryBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Bungalow"/>
 *     &lt;enumeration value="CapeCod"/>
 *     &lt;enumeration value="Colonial"/>
 *     &lt;enumeration value="Contemporary"/>
 *     &lt;enumeration value="Cottage"/>
 *     &lt;enumeration value="Craftsman"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Georgian"/>
 *     &lt;enumeration value="LowCountry"/>
 *     &lt;enumeration value="Mediterranean"/>
 *     &lt;enumeration value="Modern"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Plantation"/>
 *     &lt;enumeration value="Ranch"/>
 *     &lt;enumeration value="Shotgun"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="Traditional"/>
 *     &lt;enumeration value="Tudor"/>
 *     &lt;enumeration value="Victorian"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArchitecturalDesignCategoryBase")
@XmlEnum
public enum ArchitecturalDesignCategoryBase {

    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("CapeCod")
    CAPE_COD("CapeCod"),
    @XmlEnumValue("Colonial")
    COLONIAL("Colonial"),
    @XmlEnumValue("Contemporary")
    CONTEMPORARY("Contemporary"),
    @XmlEnumValue("Cottage")
    COTTAGE("Cottage"),
    @XmlEnumValue("Craftsman")
    CRAFTSMAN("Craftsman"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Georgian")
    GEORGIAN("Georgian"),
    @XmlEnumValue("LowCountry")
    LOW_COUNTRY("LowCountry"),
    @XmlEnumValue("Mediterranean")
    MEDITERRANEAN("Mediterranean"),
    @XmlEnumValue("Modern")
    MODERN("Modern"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Plantation")
    PLANTATION("Plantation"),
    @XmlEnumValue("Ranch")
    RANCH("Ranch"),
    @XmlEnumValue("Shotgun")
    SHOTGUN("Shotgun"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("Traditional")
    TRADITIONAL("Traditional"),
    @XmlEnumValue("Tudor")
    TUDOR("Tudor"),
    @XmlEnumValue("Victorian")
    VICTORIAN("Victorian");
    private final String value;

    ArchitecturalDesignCategoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArchitecturalDesignCategoryBase fromValue(String v) {
        for (ArchitecturalDesignCategoryBase c: ArchitecturalDesignCategoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}