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
 * <p>Java class for CreditCommentBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCommentBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="BureauRemarks"/>
 *     &lt;enumeration value="ConsumerStatement"/>
 *     &lt;enumeration value="Instruction"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PublicRecordText"/>
 *     &lt;enumeration value="StatusCode"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCommentBase")
@XmlEnum
public enum CreditCommentBase {


    /**
     * Additional text comments provided by the credit bureau or repository bureau. See Credit Comment Source Type attribute for the exact source. Equifax Narrative codes are listed in Attachment 6 of the Equifax System-to-System V5/V6 Manuals. Experian Comment Codes are listed in Appendix B of the Experian Technical Manual. Trans Union Remarks Codes are listed in Appendix C of the TU Release 4 User Guide.
     * 
     */
    @XmlEnumValue("BureauRemarks")
    BUREAU_REMARKS("BureauRemarks"),

    /**
     * Comments from the borrower regarding their credit report data.
     * 
     */
    @XmlEnumValue("ConsumerStatement")
    CONSUMER_STATEMENT("ConsumerStatement"),

    /**
     * Request for Update of credit information are normally accompanied by special instruction comments.
     * 
     */
    @XmlEnumValue("Instruction")
    INSTRUCTION("Instruction"),

    /**
     * See Credit Comment Type Other Description.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Additional text regarding public record data. See Credit Comment Source Type attribute for the exact source.
     * 
     */
    @XmlEnumValue("PublicRecordText")
    PUBLIC_RECORD_TEXT("PublicRecordText"),

    /**
     * The comment text matches the status code listed in the specification for the entity listed in the Credit Comment Source Type attribute. Experian Status Codes are listed in Appendix N of the Experian Technical Manual.
     * 
     */
    @XmlEnumValue("StatusCode")
    STATUS_CODE("StatusCode"),

    /**
     * The comment text indicates information being reported that may warrant additional investigation or consideration.
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    CreditCommentBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCommentBase fromValue(String v) {
        for (CreditCommentBase c: CreditCommentBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
