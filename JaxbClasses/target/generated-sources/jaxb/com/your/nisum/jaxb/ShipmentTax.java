//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.05 at 07:35:07 AM IST 
//


package com.your.nisum.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shipmentTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shipmentTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryFeeTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="giftWrapTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="merchandiseTax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipmentTax", propOrder = {
    "deliveryFeeTax",
    "giftWrapTax",
    "merchandiseTax"
})
public class ShipmentTax {

    protected double deliveryFeeTax;
    protected double giftWrapTax;
    protected double merchandiseTax;

    /**
     * Gets the value of the deliveryFeeTax property.
     * 
     */
    public double getDeliveryFeeTax() {
        return deliveryFeeTax;
    }

    /**
     * Sets the value of the deliveryFeeTax property.
     * 
     */
    public void setDeliveryFeeTax(double value) {
        this.deliveryFeeTax = value;
    }

    /**
     * Gets the value of the giftWrapTax property.
     * 
     */
    public double getGiftWrapTax() {
        return giftWrapTax;
    }

    /**
     * Sets the value of the giftWrapTax property.
     * 
     */
    public void setGiftWrapTax(double value) {
        this.giftWrapTax = value;
    }

    /**
     * Gets the value of the merchandiseTax property.
     * 
     */
    public double getMerchandiseTax() {
        return merchandiseTax;
    }

    /**
     * Sets the value of the merchandiseTax property.
     * 
     */
    public void setMerchandiseTax(double value) {
        this.merchandiseTax = value;
    }

}
