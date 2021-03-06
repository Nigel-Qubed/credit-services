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
 * <p>Java class for DocumentManagementRequestProductEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentManagementRequestProductEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullReview"/>
 *     &lt;enumeration value="LimitedReview"/>
 *     &lt;enumeration value="LimitedReviewPlus"/>
 *     &lt;enumeration value="FullReviewAndAdditionalDocuments"/>
 *     &lt;enumeration value="LimitedReviewAndAdditionalDocuments"/>
 *     &lt;enumeration value="LimitedReviewPlusAndAdditionalDocuments"/>
 *     &lt;enumeration value="AdditionalDocuments"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentManagementRequestProductEnum", namespace = "http://globalgateway.corelogic.com/order/2015")
@XmlEnum
public enum DocumentManagementRequestProductEnum {

    @XmlEnumValue("FullReview")
    FULL_REVIEW("FullReview"),
    @XmlEnumValue("LimitedReview")
    LIMITED_REVIEW("LimitedReview"),
    @XmlEnumValue("LimitedReviewPlus")
    LIMITED_REVIEW_PLUS("LimitedReviewPlus"),
    @XmlEnumValue("FullReviewAndAdditionalDocuments")
    FULL_REVIEW_AND_ADDITIONAL_DOCUMENTS("FullReviewAndAdditionalDocuments"),
    @XmlEnumValue("LimitedReviewAndAdditionalDocuments")
    LIMITED_REVIEW_AND_ADDITIONAL_DOCUMENTS("LimitedReviewAndAdditionalDocuments"),
    @XmlEnumValue("LimitedReviewPlusAndAdditionalDocuments")
    LIMITED_REVIEW_PLUS_AND_ADDITIONAL_DOCUMENTS("LimitedReviewPlusAndAdditionalDocuments"),
    @XmlEnumValue("AdditionalDocuments")
    ADDITIONAL_DOCUMENTS("AdditionalDocuments"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DocumentManagementRequestProductEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentManagementRequestProductEnum fromValue(String v) {
        for (DocumentManagementRequestProductEnum c: DocumentManagementRequestProductEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
