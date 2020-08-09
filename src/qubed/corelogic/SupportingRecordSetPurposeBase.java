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
 * <p>Java class for SupportingRecordSetPurposeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportingRecordSetPurposeBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Acknowledgement"/>
 *     &lt;enumeration value="FollowUpRequest"/>
 *     &lt;enumeration value="FollowUpResponse"/>
 *     &lt;enumeration value="InitiatorCorrespondence"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Research"/>
 *     &lt;enumeration value="Resolution"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupportingRecordSetPurposeBase")
@XmlEnum
public enum SupportingRecordSetPurposeBase {


    /**
     * Confirmation of the receipt of a request and a summary of the issues involved.
     * 
     */
    @XmlEnumValue("Acknowledgement")
    ACKNOWLEDGEMENT("Acknowledgement"),

    /**
     * Information which supports a request for follow-up.
     * 
     */
    @XmlEnumValue("FollowUpRequest")
    FOLLOW_UP_REQUEST("FollowUpRequest"),

    /**
     * Information which provides requested follow-up records.
     * 
     */
    @XmlEnumValue("FollowUpResponse")
    FOLLOW_UP_RESPONSE("FollowUpResponse"),

    /**
     * Correspondence that initiated an event.
     * 
     */
    @XmlEnumValue("InitiatorCorrespondence")
    INITIATOR_CORRESPONDENCE("InitiatorCorrespondence"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Information which supports the investigation into a reported issue.
     * 
     */
    @XmlEnumValue("Research")
    RESEARCH("Research"),

    /**
     * Information which supports the resolution of an issue.
     * 
     */
    @XmlEnumValue("Resolution")
    RESOLUTION("Resolution");
    private final String value;

    SupportingRecordSetPurposeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportingRecordSetPurposeBase fromValue(String v) {
        for (SupportingRecordSetPurposeBase c: SupportingRecordSetPurposeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
