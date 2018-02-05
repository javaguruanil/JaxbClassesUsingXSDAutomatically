//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.05 at 07:35:07 AM IST 
//


package com.your.nisum.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="upcNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="changedPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="expectedShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="adjustedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="surchargeFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="personalizationFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pickupFromStore" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bigTicketItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="itemRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="priceTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mediaCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errors" type="{}businessMessages" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemPromotions" type="{}promotionResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "description",
    "productId",
    "upcNumber",
    "quantity",
    "price",
    "changedPrice",
    "tax",
    "expectedShipDate",
    "itemTotal",
    "adjustedQuantity",
    "surchargeFee",
    "personalizationFee",
    "pickupFromStore",
    "bigTicketItem",
    "itemRef",
    "priceTypeId",
    "itemOrigin",
    "mediaCode",
    "itemSequenceNumber",
    "maxQuantity",
    "errors",
    "itemPromotions"
})
public class Item {

    @XmlElement(required = true)
    protected String description;
    protected long productId;
    protected long upcNumber;
    protected int quantity;
    protected double price;
    protected double changedPrice;
    protected double tax;
    @XmlElement(required = true)
    protected String expectedShipDate;
    protected double itemTotal;
    protected int adjustedQuantity;
    protected double surchargeFee;
    protected double personalizationFee;
    protected boolean pickupFromStore;
    protected boolean bigTicketItem;
    @XmlElement(required = true)
    protected String itemRef;
    protected int priceTypeId;
    @XmlElement(required = true)
    protected String itemOrigin;
    @XmlElement(required = true)
    protected String mediaCode;
    protected int itemSequenceNumber;
    protected int maxQuantity;
    protected List<BusinessMessages> errors;
    protected List<PromotionResult> itemPromotions;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the upcNumber property.
     * 
     */
    public long getUpcNumber() {
        return upcNumber;
    }

    /**
     * Sets the value of the upcNumber property.
     * 
     */
    public void setUpcNumber(long value) {
        this.upcNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the changedPrice property.
     * 
     */
    public double getChangedPrice() {
        return changedPrice;
    }

    /**
     * Sets the value of the changedPrice property.
     * 
     */
    public void setChangedPrice(double value) {
        this.changedPrice = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     */
    public double getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     */
    public void setTax(double value) {
        this.tax = value;
    }

    /**
     * Gets the value of the expectedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedShipDate() {
        return expectedShipDate;
    }

    /**
     * Sets the value of the expectedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedShipDate(String value) {
        this.expectedShipDate = value;
    }

    /**
     * Gets the value of the itemTotal property.
     * 
     */
    public double getItemTotal() {
        return itemTotal;
    }

    /**
     * Sets the value of the itemTotal property.
     * 
     */
    public void setItemTotal(double value) {
        this.itemTotal = value;
    }

    /**
     * Gets the value of the adjustedQuantity property.
     * 
     */
    public int getAdjustedQuantity() {
        return adjustedQuantity;
    }

    /**
     * Sets the value of the adjustedQuantity property.
     * 
     */
    public void setAdjustedQuantity(int value) {
        this.adjustedQuantity = value;
    }

    /**
     * Gets the value of the surchargeFee property.
     * 
     */
    public double getSurchargeFee() {
        return surchargeFee;
    }

    /**
     * Sets the value of the surchargeFee property.
     * 
     */
    public void setSurchargeFee(double value) {
        this.surchargeFee = value;
    }

    /**
     * Gets the value of the personalizationFee property.
     * 
     */
    public double getPersonalizationFee() {
        return personalizationFee;
    }

    /**
     * Sets the value of the personalizationFee property.
     * 
     */
    public void setPersonalizationFee(double value) {
        this.personalizationFee = value;
    }

    /**
     * Gets the value of the pickupFromStore property.
     * 
     */
    public boolean isPickupFromStore() {
        return pickupFromStore;
    }

    /**
     * Sets the value of the pickupFromStore property.
     * 
     */
    public void setPickupFromStore(boolean value) {
        this.pickupFromStore = value;
    }

    /**
     * Gets the value of the bigTicketItem property.
     * 
     */
    public boolean isBigTicketItem() {
        return bigTicketItem;
    }

    /**
     * Sets the value of the bigTicketItem property.
     * 
     */
    public void setBigTicketItem(boolean value) {
        this.bigTicketItem = value;
    }

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRef(String value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the priceTypeId property.
     * 
     */
    public int getPriceTypeId() {
        return priceTypeId;
    }

    /**
     * Sets the value of the priceTypeId property.
     * 
     */
    public void setPriceTypeId(int value) {
        this.priceTypeId = value;
    }

    /**
     * Gets the value of the itemOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOrigin() {
        return itemOrigin;
    }

    /**
     * Sets the value of the itemOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOrigin(String value) {
        this.itemOrigin = value;
    }

    /**
     * Gets the value of the mediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaCode() {
        return mediaCode;
    }

    /**
     * Sets the value of the mediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaCode(String value) {
        this.mediaCode = value;
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
     * Gets the value of the maxQuantity property.
     * 
     */
    public int getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * Sets the value of the maxQuantity property.
     * 
     */
    public void setMaxQuantity(int value) {
        this.maxQuantity = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessMessages }
     * 
     * 
     */
    public List<BusinessMessages> getErrors() {
        if (errors == null) {
            errors = new ArrayList<BusinessMessages>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the itemPromotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPromotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionResult }
     * 
     * 
     */
    public List<PromotionResult> getItemPromotions() {
        if (itemPromotions == null) {
            itemPromotions = new ArrayList<PromotionResult>();
        }
        return this.itemPromotions;
    }

}