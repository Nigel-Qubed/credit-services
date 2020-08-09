//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:53:09 AM CAT 
//


package qubed.corelogicextensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QUESTIONNAIRE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QUESTIONNAIRE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUESTIONNAIRE_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}QUESTIONNAIRE_DETAIL" minOccurs="0"/>
 *         &lt;element name="QUESTIONNAIRE_SECTIONS" type="{http://globalgateway.corelogic.com/order/2015}QUESTIONNAIRE_SECTIONS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QUESTIONNAIRE", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "questionnairedetail",
    "questionnairesections"
})
public class QUESTIONNAIRE {

    @XmlElement(name = "QUESTIONNAIRE_DETAIL")
    protected QUESTIONNAIREDETAIL questionnairedetail;
    @XmlElement(name = "QUESTIONNAIRE_SECTIONS")
    protected QUESTIONNAIRESECTIONS questionnairesections;

    /**
     * Gets the value of the questionnairedetail property.
     * 
     * @return
     *     possible object is
     *     {@link QUESTIONNAIREDETAIL }
     *     
     */
    public QUESTIONNAIREDETAIL getQUESTIONNAIREDETAIL() {
        return questionnairedetail;
    }

    /**
     * Sets the value of the questionnairedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUESTIONNAIREDETAIL }
     *     
     */
    public void setQUESTIONNAIREDETAIL(QUESTIONNAIREDETAIL value) {
        this.questionnairedetail = value;
    }

    /**
     * Gets the value of the questionnairesections property.
     * 
     * @return
     *     possible object is
     *     {@link QUESTIONNAIRESECTIONS }
     *     
     */
    public QUESTIONNAIRESECTIONS getQUESTIONNAIRESECTIONS() {
        return questionnairesections;
    }

    /**
     * Sets the value of the questionnairesections property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUESTIONNAIRESECTIONS }
     *     
     */
    public void setQUESTIONNAIRESECTIONS(QUESTIONNAIRESECTIONS value) {
        this.questionnairesections = value;
    }

}
