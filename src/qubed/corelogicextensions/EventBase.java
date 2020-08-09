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
 * <p>Java class for EventBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="AddedTaxCollectionStamps"/>
 *     &lt;enumeration value="AppliedFinalTamperEvidentSignature"/>
 *     &lt;enumeration value="AppliedTamperEvidentSignature"/>
 *     &lt;enumeration value="CorrectedData"/>
 *     &lt;enumeration value="CreatedBlankDocument"/>
 *     &lt;enumeration value="DocumentReceived"/>
 *     &lt;enumeration value="DraftedData"/>
 *     &lt;enumeration value="EnteredData"/>
 *     &lt;enumeration value="ExportedDocument"/>
 *     &lt;enumeration value="NotarizedDocument"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PaperedOutDocument"/>
 *     &lt;enumeration value="PartiallyPopulatedDocument"/>
 *     &lt;enumeration value="PopulatedDocument"/>
 *     &lt;enumeration value="RecordedDocument"/>
 *     &lt;enumeration value="RerecordedDocument"/>
 *     &lt;enumeration value="SignedDocument"/>
 *     &lt;enumeration value="ValidatedDocument"/>
 *     &lt;enumeration value="VerifiedSignatures"/>
 *     &lt;enumeration value="VoidedDocument"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventBase")
@XmlEnum
public enum EventBase {

    @XmlEnumValue("AddedTaxCollectionStamps")
    ADDED_TAX_COLLECTION_STAMPS("AddedTaxCollectionStamps"),

    /**
     * Denotes that a final electronic tamper evident seal has been applied to the entire document.
     * 
     */
    @XmlEnumValue("AppliedFinalTamperEvidentSignature")
    APPLIED_FINAL_TAMPER_EVIDENT_SIGNATURE("AppliedFinalTamperEvidentSignature"),

    /**
     * Denotes that the document has an electronic signature that shows evidence when the file has been opened or changed.
     * 
     */
    @XmlEnumValue("AppliedTamperEvidentSignature")
    APPLIED_TAMPER_EVIDENT_SIGNATURE("AppliedTamperEvidentSignature"),
    @XmlEnumValue("CorrectedData")
    CORRECTED_DATA("CorrectedData"),

    /**
     * Denotes that the document boiler plate has been created. The view is unpopulated and there are no data parts. A document must contain exactly one audit entry with this action type.
     * 
     */
    @XmlEnumValue("CreatedBlankDocument")
    CREATED_BLANK_DOCUMENT("CreatedBlankDocument"),
    @XmlEnumValue("DocumentReceived")
    DOCUMENT_RECEIVED("DocumentReceived"),

    /**
     * Denotes that draft data has been added to the document or that a previous set of draft data has been modified. A document may contain zero or more audit entries with this action type.
     * 
     */
    @XmlEnumValue("DraftedData")
    DRAFTED_DATA("DraftedData"),
    @XmlEnumValue("EnteredData")
    ENTERED_DATA("EnteredData"),

    /**
     * Denotes that the document has been exported to a different electronic format, but the document is still in effect.
     * 
     */
    @XmlEnumValue("ExportedDocument")
    EXPORTED_DOCUMENT("ExportedDocument"),
    @XmlEnumValue("NotarizedDocument")
    NOTARIZED_DOCUMENT("NotarizedDocument"),

    /**
     * Denotes that the action type is other than the ones listed above. When this option is selected, a description of the action type must be provided in the ActionTypeOtherDescription attribute.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Denotes that the document has been converted to paper form and that the electronic version no longer has legal force or effect. A document must not contain more than one audit entries with this action type.
     * 
     */
    @XmlEnumValue("PaperedOutDocument")
    PAPERED_OUT_DOCUMENT("PaperedOutDocument"),
    @XmlEnumValue("PartiallyPopulatedDocument")
    PARTIALLY_POPULATED_DOCUMENT("PartiallyPopulatedDocument"),

    /**
     * Denotes that the document has been populated with data. The data appears in the original view and may also be present in one or more data parts. A document must not contain more than one audit entries with this action type.
     * 
     */
    @XmlEnumValue("PopulatedDocument")
    POPULATED_DOCUMENT("PopulatedDocument"),

    /**
     * Denotes that the document has been recorded.
     * 
     */
    @XmlEnumValue("RecordedDocument")
    RECORDED_DOCUMENT("RecordedDocument"),
    @XmlEnumValue("RerecordedDocument")
    RERECORDED_DOCUMENT("RerecordedDocument"),

    /**
     * Denotes that a principal party, a witness or a notary has signed the document. When this value is specified, additional information about the action must be provided in the SIGNED_ACTION_DETAIL element. A document may contain zero or more audit entries with this action type.
     * 
     */
    @XmlEnumValue("SignedDocument")
    SIGNED_DOCUMENT("SignedDocument"),

    /**
     * Denotes that a system or process has validated the provided data parts against the corresponding readable data in the presentation view. A document may contain zero or more audit entries with this action type.
     * 
     */
    @XmlEnumValue("ValidatedDocument")
    VALIDATED_DOCUMENT("ValidatedDocument"),

    /**
     * Denotes that a system or process has verified that all required signatures for all stakeholder parties, notaries and witnesses have been executed. The document is fully executed.
     * 
     */
    @XmlEnumValue("VerifiedSignatures")
    VERIFIED_SIGNATURES("VerifiedSignatures"),

    /**
     * Denotes that the document no longer has legal force or effect. A document must not contain more than one audit entries with this action type.
     * 
     */
    @XmlEnumValue("VoidedDocument")
    VOIDED_DOCUMENT("VoidedDocument");
    private final String value;

    EventBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventBase fromValue(String v) {
        for (EventBase c: EventBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
