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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bagGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipments" type="{}shipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{}item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipping" type="{}shipping"/&gt;
 *         &lt;element name="loyalty" type="{}loyalty"/&gt;
 *         &lt;element name="user" type="{}user"/&gt;
 *         &lt;element name="promoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="context" type="{}context"/&gt;
 *         &lt;element name="taxExemptInfo" type="{}taxExemptInfo"/&gt;
 *         &lt;element name="paymentDetails" type="{}paymentDetails"/&gt;
 *         &lt;element name="registry" type="{}registry"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bagId",
    "bagGuid",
    "shipments",
    "items",
    "shipping",
    "loyalty",
    "user",
    "promoCode",
    "context",
    "taxExemptInfo",
    "paymentDetails",
    "registry"
})
@XmlRootElement(name = "orderCapture")
public class OrderCapture {

    protected Long bagId;
    @XmlElement(required = true)
    protected String bagGuid;
    protected List<Shipment> shipments;
    protected List<Item> items;
    @XmlElement(required = true)
    protected Shipping shipping;
    @XmlElement(required = true)
    protected Loyalty loyalty;
    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected String promoCode;
    @XmlElement(required = true)
    protected Context context;
    @XmlElement(required = true)
    protected TaxExemptInfo taxExemptInfo;
    @XmlElement(required = true)
    protected PaymentDetails paymentDetails;
    @XmlElement(required = true)
    protected Registry registry;

    /**
     * Gets the value of the bagId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBagId() {
        return bagId;
    }

    /**
     * Sets the value of the bagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBagId(Long value) {
        this.bagId = value;
    }

    /**
     * Gets the value of the bagGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagGuid() {
        return bagGuid;
    }

    /**
     * Sets the value of the bagGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagGuid(String value) {
        this.bagGuid = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shipment }
     * 
     * 
     */
    public List<Shipment> getShipments() {
        if (shipments == null) {
            shipments = new ArrayList<Shipment>();
        }
        return this.shipments;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link Shipping }
     *     
     */
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shipping }
     *     
     */
    public void setShipping(Shipping value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the loyalty property.
     * 
     * @return
     *     possible object is
     *     {@link Loyalty }
     *     
     */
    public Loyalty getLoyalty() {
        return loyalty;
    }

    /**
     * Sets the value of the loyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loyalty }
     *     
     */
    public void setLoyalty(Loyalty value) {
        this.loyalty = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setContext(Context value) {
        this.context = value;
    }

    /**
     * Gets the value of the taxExemptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptInfo }
     *     
     */
    public TaxExemptInfo getTaxExemptInfo() {
        return taxExemptInfo;
    }

    /**
     * Sets the value of the taxExemptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptInfo }
     *     
     */
    public void setTaxExemptInfo(TaxExemptInfo value) {
        this.taxExemptInfo = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setPaymentDetails(PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link Registry }
     *     
     */
    public Registry getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registry }
     *     
     */
    public void setRegistry(Registry value) {
        this.registry = value;
    }

}