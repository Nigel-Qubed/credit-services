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
 * <p>Java class for SCRAReliefStatusBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SCRAReliefStatusBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="NeverReceived"/>
 *     &lt;enumeration value="OneOrMoreBorrowersCurrentlyReceive"/>
 *     &lt;enumeration value="OneOrMoreBorrowersPreviouslyReceived"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SCRAReliefStatusBase")
@XmlEnum
public enum SCRAReliefStatusBase {

    @XmlEnumValue("NeverReceived")
    NEVER_RECEIVED("NeverReceived"),
    @XmlEnumValue("OneOrMoreBorrowersCurrentlyReceive")
    ONE_OR_MORE_BORROWERS_CURRENTLY_RECEIVE("OneOrMoreBorrowersCurrentlyReceive"),
    @XmlEnumValue("OneOrMoreBorrowersPreviouslyReceived")
    ONE_OR_MORE_BORROWERS_PREVIOUSLY_RECEIVED("OneOrMoreBorrowersPreviouslyReceived"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SCRAReliefStatusBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SCRAReliefStatusBase fromValue(String v) {
        for (SCRAReliefStatusBase c: SCRAReliefStatusBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}