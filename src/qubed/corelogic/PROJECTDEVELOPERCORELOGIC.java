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
 * <p>Java class for PROJECT_DEVELOPER_CORELOGIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROJECT_DEVELOPER_CORELOGIC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectDeveloperTransferredControlCompletedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *         &lt;element name="ProjectDeveloperTransferControlEstimatedDate" type="{http://www.mismo.org/residential/2009/schemas}MISMODate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROJECT_DEVELOPER_CORELOGIC", namespace = "http://globalgateway.corelogic.com/order/2015", propOrder = {
    "projectDeveloperTransferredControlCompletedDate",
    "projectDeveloperTransferControlEstimatedDate"
})
public class PROJECTDEVELOPERCORELOGIC {

    @XmlElement(name = "ProjectDeveloperTransferredControlCompletedDate")
    protected MISMODate projectDeveloperTransferredControlCompletedDate;
    @XmlElement(name = "ProjectDeveloperTransferControlEstimatedDate")
    protected MISMODate projectDeveloperTransferControlEstimatedDate;

    /**
     * Gets the value of the projectDeveloperTransferredControlCompletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link MISMODate }
     *     
     */
    public MISMODate getProjectDeveloperTransferredControlCompletedDate() {
        return projectDeveloperTransferredControlCompletedDate;
    }

    /**
     * Sets the value of the projectDeveloperTransferredControlCompletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMODate }
     *     
     */
    public void setProjectDeveloperTransferredControlCompletedDate(MISMODate value) {
        this.projectDeveloperTransferredControlCompletedDate = value;
    }

    /**
     * Gets the value of the projectDeveloperTransferControlEstimatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link MISMODate }
     *     
     */
    public MISMODate getProjectDeveloperTransferControlEstimatedDate() {
        return projectDeveloperTransferControlEstimatedDate;
    }

    /**
     * Sets the value of the projectDeveloperTransferControlEstimatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISMODate }
     *     
     */
    public void setProjectDeveloperTransferControlEstimatedDate(MISMODate value) {
        this.projectDeveloperTransferControlEstimatedDate = value;
    }

}
