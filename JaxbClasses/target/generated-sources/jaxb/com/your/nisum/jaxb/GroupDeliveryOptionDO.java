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
 * <p>Java class for groupDeliveryOptionDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupDeliveryOptionDO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingMethods" type="{}ShippingMethodDO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingMethodEligibleItems" type="{}ShippingMethodEligibleDO"/&gt;
 *         &lt;element name="userSeletedShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupDeliveryOptionDO", propOrder = {
    "shippingMethods",
    "shippingMethodEligibleItems",
    "userSeletedShippingMethod"
})
public class GroupDeliveryOptionDO {

    protected List<ShippingMethodDO> shippingMethods;
    @XmlElement(required = true)
    protected ShippingMethodEligibleDO shippingMethodEligibleItems;
    @XmlElement(required = true)
    protected String userSeletedShippingMethod;

    /**
     * Gets the value of the shippingMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingMethodDO }
     * 
     * 
     */
    public List<ShippingMethodDO> getShippingMethods() {
        if (shippingMethods == null) {
            shippingMethods = new ArrayList<ShippingMethodDO>();
        }
        return this.shippingMethods;
    }

    /**
     * Gets the value of the shippingMethodEligibleItems property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingMethodEligibleDO }
     *     
     */
    public ShippingMethodEligibleDO getShippingMethodEligibleItems() {
        return shippingMethodEligibleItems;
    }

    /**
     * Sets the value of the shippingMethodEligibleItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingMethodEligibleDO }
     *     
     */
    public void setShippingMethodEligibleItems(ShippingMethodEligibleDO value) {
        this.shippingMethodEligibleItems = value;
    }

    /**
     * Gets the value of the userSeletedShippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSeletedShippingMethod() {
        return userSeletedShippingMethod;
    }

    /**
     * Sets the value of the userSeletedShippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSeletedShippingMethod(String value) {
        this.userSeletedShippingMethod = value;
    }

}
