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
 * <p>Java class for SignatureBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureBase">
 *   &lt;restriction base="{http://www.mismo.org/residential/2009/schemas}MISMOEnum_Base">
 *     &lt;enumeration value="Digital"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Wet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureBase")
@XmlEnum
public enum SignatureBase {


    /**
     * Denotes a digital signature. The signer uses a digital certificate to apply a PKI-based signature to the document. The certificate maybe a personal certificate of the signer, a system certificate, or a dynamically generated certificate created for that transaction. After signing a signature appearance is generated and place on the signature field in the view.
     * 
     */
    @XmlEnumValue("Digital")
    DIGITAL("Digital"),

    /**
     * Denotes an image signature. A graphic image of the signers signature  is captured and placed in signature field.
     * 
     */
    @XmlEnumValue("Image")
    IMAGE("Image"),

    /**
     * Denotes that the signature type is other than the ones listed above. When this option is selected, a description of the signature type must be provided in the SignatureTypeOtherDescription attribute.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Denotes a text signature. The signer types his/her name (signature) in the signature field or clicks a button onscreen indicating acceptance or agreement.
     * 
     */
    @XmlEnumValue("Text")
    TEXT("Text"),

    /**
     * Used for non-electronic signatures.
     * 
     */
    @XmlEnumValue("Wet")
    WET("Wet");
    private final String value;

    SignatureBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureBase fromValue(String v) {
        for (SignatureBase c: SignatureBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
