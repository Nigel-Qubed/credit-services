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
 * <p>Java class for SchoolBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchoolBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="ElementarySchool"/>
 *     &lt;enumeration value="HighSchool"/>
 *     &lt;enumeration value="JuniorHighSchool"/>
 *     &lt;enumeration value="MiddleSchool"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchoolBase")
@XmlEnum
public enum SchoolBase {


    /**
     * Grades PK or K-6 on average, but state and local practice may vary. Age level from: 6 to: 14
     * 
     * 
     */
    @XmlEnumValue("ElementarySchool")
    ELEMENTARY_SCHOOL("ElementarySchool"),

    /**
     * Grades 9-12 or 10-12 Age level from: 15 to: 18
     * 
     */
    @XmlEnumValue("HighSchool")
    HIGH_SCHOOL("HighSchool"),

    /**
     * Grades 7-8, 7-9 or 8-9 Age level from: 13 to: 15
     * 
     */
    @XmlEnumValue("JuniorHighSchool")
    JUNIOR_HIGH_SCHOOL("JuniorHighSchool"),

    /**
     * Grades 6-8 or 7-9 Age level from: 10 to: 14
     * 
     */
    @XmlEnumValue("MiddleSchool")
    MIDDLE_SCHOOL("MiddleSchool"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SchoolBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchoolBase fromValue(String v) {
        for (SchoolBase c: SchoolBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
