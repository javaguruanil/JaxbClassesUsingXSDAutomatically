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
 * <p>Java class for aesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aesDivision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aesStoreNbr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="aesKeyVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aesInfo", propOrder = {
    "aesDivision",
    "aesStoreNbr",
    "aesKeyVersion"
})
public class AesInfo {

    @XmlElement(required = true)
    protected String aesDivision;
    protected int aesStoreNbr;
    protected int aesKeyVersion;

    /**
     * Gets the value of the aesDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAesDivision() {
        return aesDivision;
    }

    /**
     * Sets the value of the aesDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAesDivision(String value) {
        this.aesDivision = value;
    }

    /**
     * Gets the value of the aesStoreNbr property.
     * 
     */
    public int getAesStoreNbr() {
        return aesStoreNbr;
    }

    /**
     * Sets the value of the aesStoreNbr property.
     * 
     */
    public void setAesStoreNbr(int value) {
        this.aesStoreNbr = value;
    }

    /**
     * Gets the value of the aesKeyVersion property.
     * 
     */
    public int getAesKeyVersion() {
        return aesKeyVersion;
    }

    /**
     * Sets the value of the aesKeyVersion property.
     * 
     */
    public void setAesKeyVersion(int value) {
        this.aesKeyVersion = value;
    }

}
