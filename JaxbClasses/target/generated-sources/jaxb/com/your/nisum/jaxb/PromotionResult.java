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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for promotionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="promotionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustedCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="amountDiscounted" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="error" type="{}promotionError"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="operationDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originalCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="scope" type="{}promotionScope"/&gt;
 *         &lt;element name="target" type="{}promotionTarget"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionResult", propOrder = {
    "adjustedCost",
    "amountDiscounted",
    "code",
    "error",
    "id",
    "operationDescription",
    "originalCost",
    "scope",
    "target",
    "type",
    "itemSequenceNumber",
    "expirationDate",
    "shortDescription"
})
public class PromotionResult {

    protected double adjustedCost;
    protected double amountDiscounted;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected PromotionError error;
    protected long id;
    @XmlElement(required = true)
    protected String operationDescription;
    protected double originalCost;
    @XmlElement(required = true)
    protected PromotionScope scope;
    @XmlElement(required = true)
    protected PromotionTarget target;
    @XmlElement(required = true)
    protected String type;
    protected int itemSequenceNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(required = true)
    protected String shortDescription;

    /**
     * Gets the value of the adjustedCost property.
     * 
     */
    public double getAdjustedCost() {
        return adjustedCost;
    }

    /**
     * Sets the value of the adjustedCost property.
     * 
     */
    public void setAdjustedCost(double value) {
        this.adjustedCost = value;
    }

    /**
     * Gets the value of the amountDiscounted property.
     * 
     */
    public double getAmountDiscounted() {
        return amountDiscounted;
    }

    /**
     * Sets the value of the amountDiscounted property.
     * 
     */
    public void setAmountDiscounted(double value) {
        this.amountDiscounted = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionError }
     *     
     */
    public PromotionError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionError }
     *     
     */
    public void setError(PromotionError value) {
        this.error = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the operationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /**
     * Sets the value of the operationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationDescription(String value) {
        this.operationDescription = value;
    }

    /**
     * Gets the value of the originalCost property.
     * 
     */
    public double getOriginalCost() {
        return originalCost;
    }

    /**
     * Sets the value of the originalCost property.
     * 
     */
    public void setOriginalCost(double value) {
        this.originalCost = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionScope }
     *     
     */
    public PromotionScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionScope }
     *     
     */
    public void setScope(PromotionScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionTarget }
     *     
     */
    public PromotionTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionTarget }
     *     
     */
    public void setTarget(PromotionTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the itemSequenceNumber property.
     * 
     */
    public int getItemSequenceNumber() {
        return itemSequenceNumber;
    }

    /**
     * Sets the value of the itemSequenceNumber property.
     * 
     */
    public void setItemSequenceNumber(int value) {
        this.itemSequenceNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

}