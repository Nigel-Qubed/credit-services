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
 * <p>Java class for ProjectAnalysisCompetitiveProjectComparisonBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectAnalysisCompetitiveProjectComparisonBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectAnalysisCompetitiveProjectComparisonBase")
@XmlEnum
public enum ProjectAnalysisCompetitiveProjectComparisonBase {

    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Low")
    LOW("Low");
    private final String value;

    ProjectAnalysisCompetitiveProjectComparisonBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectAnalysisCompetitiveProjectComparisonBase fromValue(String v) {
        for (ProjectAnalysisCompetitiveProjectComparisonBase c: ProjectAnalysisCompetitiveProjectComparisonBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}