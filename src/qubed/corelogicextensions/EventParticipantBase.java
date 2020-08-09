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
 * <p>Java class for EventParticipantBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventParticipantBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Initiator"/>
 *     &lt;enumeration value="Investigator"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PrimaryPointOfContact"/>
 *     &lt;enumeration value="Recipient"/>
 *     &lt;enumeration value="Resolver"/>
 *     &lt;enumeration value="Responder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventParticipantBase")
@XmlEnum
public enum EventParticipantBase {


    /**
     * A party that started an event.
     * 
     */
    @XmlEnumValue("Initiator")
    INITIATOR("Initiator"),

    /**
     * A party that provides research or examines issues related to a event.
     * 
     */
    @XmlEnumValue("Investigator")
    INVESTIGATOR("Investigator"),
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * An individual or team that has been designated by an organization as the primary consumer point of contact to provide continuity of event communications.
     * 
     */
    @XmlEnumValue("PrimaryPointOfContact")
    PRIMARY_POINT_OF_CONTACT("PrimaryPointOfContact"),

    /**
     * A party that received information about an event.
     * 
     */
    @XmlEnumValue("Recipient")
    RECIPIENT("Recipient"),

    /**
     * A party that provides a solution to the initiator regarding an event.
     * 
     */
    @XmlEnumValue("Resolver")
    RESOLVER("Resolver"),

    /**
     * A party that provides a response to the initiator of an event.
     * 
     */
    @XmlEnumValue("Responder")
    RESPONDER("Responder");
    private final String value;

    EventParticipantBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventParticipantBase fromValue(String v) {
        for (EventParticipantBase c: EventParticipantBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
