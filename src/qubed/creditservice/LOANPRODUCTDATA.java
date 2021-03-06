//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 01:17:24 AM CAT 
//


package qubed.creditservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arm",
    "buydown",
    "loanfeatures",
    "paymentadjustment",
    "rateadjustment"
})
@XmlRootElement(name = "LOAN_PRODUCT_DATA")
public class LOANPRODUCTDATA {

    @XmlElement(name = "ARM")
    protected ARM arm;
    @XmlElement(name = "BUYDOWN")
    protected List<BUYDOWN> buydown;
    @XmlElement(name = "LOAN_FEATURES")
    protected LOANFEATURES loanfeatures;
    @XmlElement(name = "PAYMENT_ADJUSTMENT")
    protected List<PAYMENTADJUSTMENT> paymentadjustment;
    @XmlElement(name = "RATE_ADJUSTMENT")
    protected List<RATEADJUSTMENT> rateadjustment;

    /**
     * Gets the value of the arm property.
     * 
     * @return
     *     possible object is
     *     {@link ARM }
     *     
     */
    public ARM getARM() {
        return arm;
    }

    /**
     * Sets the value of the arm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARM }
     *     
     */
    public void setARM(ARM value) {
        this.arm = value;
    }

    /**
     * Gets the value of the buydown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buydown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBUYDOWN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BUYDOWN }
     * 
     * 
     */
    public List<BUYDOWN> getBUYDOWN() {
        if (buydown == null) {
            buydown = new ArrayList<BUYDOWN>();
        }
        return this.buydown;
    }

    /**
     * Gets the value of the loanfeatures property.
     * 
     * @return
     *     possible object is
     *     {@link LOANFEATURES }
     *     
     */
    public LOANFEATURES getLOANFEATURES() {
        return loanfeatures;
    }

    /**
     * Sets the value of the loanfeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOANFEATURES }
     *     
     */
    public void setLOANFEATURES(LOANFEATURES value) {
        this.loanfeatures = value;
    }

    /**
     * Gets the value of the paymentadjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentadjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAYMENTADJUSTMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PAYMENTADJUSTMENT }
     * 
     * 
     */
    public List<PAYMENTADJUSTMENT> getPAYMENTADJUSTMENT() {
        if (paymentadjustment == null) {
            paymentadjustment = new ArrayList<PAYMENTADJUSTMENT>();
        }
        return this.paymentadjustment;
    }

    /**
     * Gets the value of the rateadjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateadjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRATEADJUSTMENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RATEADJUSTMENT }
     * 
     * 
     */
    public List<RATEADJUSTMENT> getRATEADJUSTMENT() {
        if (rateadjustment == null) {
            rateadjustment = new ArrayList<RATEADJUSTMENT>();
        }
        return this.rateadjustment;
    }

}
