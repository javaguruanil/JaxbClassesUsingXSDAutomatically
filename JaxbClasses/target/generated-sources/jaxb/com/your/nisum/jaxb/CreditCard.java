//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.05 at 07:35:07 AM IST 
//


package com.your.nisum.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNickName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="creditCardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contact" type="{}contact"/&gt;
 *         &lt;element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="amountCharged" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCard", propOrder = {
    "cardNickName",
    "creditCardNumber",
    "creditCardType",
    "cvv",
    "primary",
    "contact",
    "expirationMonth",
    "expirationYear",
    "amountCharged"
})
public class CreditCard {

    @XmlElement(required = true)
    protected String cardNickName;
    protected long creditCardNumber;
    @XmlElement(required = true)
    protected String creditCardType;
    protected int cvv;
    protected boolean primary;
    @XmlElement(required = true)
    protected Contact contact;
    protected int expirationMonth;
    protected int expirationYear;
    protected double amountCharged;

    /**
     * Gets the value of the cardNickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNickName() {
        return cardNickName;
    }

    /**
     * Sets the value of the cardNickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNickName(String value) {
        this.cardNickName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     */
    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     */
    public void setCreditCardNumber(long value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     */
    public int getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     */
    public void setCvv(int value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     */
    public int getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     */
    public void setExpirationMonth(int value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     */
    public int getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     */
    public void setExpirationYear(int value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the amountCharged property.
     * 
     */
    public double getAmountCharged() {
        return amountCharged;
    }

    /**
     * Sets the value of the amountCharged property.
     * 
     */
    public void setAmountCharged(double value) {
        this.amountCharged = value;
    }

}
