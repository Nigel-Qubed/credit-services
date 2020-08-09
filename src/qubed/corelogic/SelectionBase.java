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
 * <p>Java class for SelectionBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectionBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Comparison"/>
 *     &lt;enumeration value="Proposed"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Selected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelectionBase")
@XmlEnum
public enum SelectionBase {


    /**
     * One of possibly many loan paramter sets used to complate GFE Page 3
     * 
     */
    @XmlEnumValue("Comparison")
    COMPARISON("Comparison"),

    /**
     * Loan products that are proposed which may meet current borrower needs.
     * 
     */
    @XmlEnumValue("Proposed")
    PROPOSED("Proposed"),

    /**
     * Borrower or lender selected paramters for searching for a loan
     * 
     */
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),

    /**
     * Loan paramters that will be processed or has been processed. Assumed value if SelectionType is not present
     * 
     */
    @XmlEnumValue("Selected")
    SELECTED("Selected");
    private final String value;

    SelectionBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionBase fromValue(String v) {
        for (SelectionBase c: SelectionBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
