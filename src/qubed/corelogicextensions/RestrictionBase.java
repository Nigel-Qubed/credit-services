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
 * <p>Java class for RestrictionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestrictionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="AnimalPet"/>
 *     &lt;enumeration value="Architectural"/>
 *     &lt;enumeration value="CommonArea"/>
 *     &lt;enumeration value="HistoricPreservation"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PropertyUse"/>
 *     &lt;enumeration value="Racial"/>
 *     &lt;enumeration value="Rental"/>
 *     &lt;enumeration value="Resale"/>
 *     &lt;enumeration value="Unenforceable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestrictionBase")
@XmlEnum
public enum RestrictionBase {

    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("AnimalPet")
    ANIMAL_PET("AnimalPet"),
    @XmlEnumValue("Architectural")
    ARCHITECTURAL("Architectural"),
    @XmlEnumValue("CommonArea")
    COMMON_AREA("CommonArea"),
    @XmlEnumValue("HistoricPreservation")
    HISTORIC_PRESERVATION("HistoricPreservation"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PropertyUse")
    PROPERTY_USE("PropertyUse"),
    @XmlEnumValue("Racial")
    RACIAL("Racial"),
    @XmlEnumValue("Rental")
    RENTAL("Rental"),
    @XmlEnumValue("Resale")
    RESALE("Resale"),
    @XmlEnumValue("Unenforceable")
    UNENFORCEABLE("Unenforceable");
    private final String value;

    RestrictionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictionBase fromValue(String v) {
        for (RestrictionBase c: RestrictionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}