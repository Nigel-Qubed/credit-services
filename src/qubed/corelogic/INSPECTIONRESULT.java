//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 04:46:29 AM CAT 
//


package qubed.corelogic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INSPECTION_RESULT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INSPECTION_RESULT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INSPECTION_RESULT_DETAIL" type="{http://globalgateway.corelogic.com/order/2015}INSPECTION_RESULT_DETAIL" minOccurs="0"/>
 *         &lt;element name="QUESTIONNAIRE" type="{http://globalgateway.corelogic.com/order/2015}QUESTIONNAIRE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INSPECTION_RESULT", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "inspectionresultdetail",
    "questionnaire"
})
public class INSPECTIONRESULT {

    @XmlElement(name = "INSPECTION_RESULT_DETAIL")
    protected INSPECTIONRESULTDETAIL inspectionresultdetail;
    @XmlElement(name = "QUESTIONNAIRE")
    protected QUESTIONNAIRE questionnaire;

    /**
     * Gets the value of the inspectionresultdetail property.
     * 
     * @return
     *     possible object is
     *     {@link INSPECTIONRESULTDETAIL }
     *     
     */
    public INSPECTIONRESULTDETAIL getINSPECTIONRESULTDETAIL() {
        return inspectionresultdetail;
    }

    /**
     * Sets the value of the inspectionresultdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link INSPECTIONRESULTDETAIL }
     *     
     */
    public void setINSPECTIONRESULTDETAIL(INSPECTIONRESULTDETAIL value) {
        this.inspectionresultdetail = value;
    }

    /**
     * Gets the value of the questionnaire property.
     * 
     * @return
     *     possible object is
     *     {@link QUESTIONNAIRE }
     *     
     */
    public QUESTIONNAIRE getQUESTIONNAIRE() {
        return questionnaire;
    }

    /**
     * Sets the value of the questionnaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link QUESTIONNAIRE }
     *     
     */
    public void setQUESTIONNAIRE(QUESTIONNAIRE value) {
        this.questionnaire = value;
    }

}