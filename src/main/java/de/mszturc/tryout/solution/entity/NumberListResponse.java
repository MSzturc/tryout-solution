//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.06.03 um 10:31:08 AM CEST 
//


package de.mszturc.tryout.solution.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncodingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SerialNumberList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "encodingType",
    "idType",
    "numberFrom",
    "numberTo",
    "gtin",
    "serialNumberList"
})
@XmlRootElement(name = "NumberListResponse")
public class NumberListResponse {

    @XmlElement(name = "EncodingType", required = true)
    protected String encodingType;
    @XmlElement(name = "IDType", required = true)
    protected String idType;
    @XmlElement(name = "NumberFrom", required = true)
    protected String numberFrom;
    @XmlElement(name = "NumberTo", required = true)
    protected String numberTo;
    @XmlElement(name = "GTIN", required = true)
    protected String gtin;
    @XmlElement(name = "SerialNumberList", required = true)
    protected NumberListResponse.SerialNumberList serialNumberList;

    /**
     * Ruft den Wert der encodingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * Legt den Wert der encodingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingType(String value) {
        this.encodingType = value;
    }

    /**
     * Ruft den Wert der idType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Legt den Wert der idType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Ruft den Wert der numberFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFrom() {
        return numberFrom;
    }

    /**
     * Legt den Wert der numberFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFrom(String value) {
        this.numberFrom = value;
    }

    /**
     * Ruft den Wert der numberTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberTo() {
        return numberTo;
    }

    /**
     * Legt den Wert der numberTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberTo(String value) {
        this.numberTo = value;
    }

    /**
     * Ruft den Wert der gtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTIN() {
        return gtin;
    }

    /**
     * Legt den Wert der gtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTIN(String value) {
        this.gtin = value;
    }

    /**
     * Ruft den Wert der serialNumberList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NumberListResponse.SerialNumberList }
     *     
     */
    public NumberListResponse.SerialNumberList getSerialNumberList() {
        return serialNumberList;
    }

    /**
     * Legt den Wert der serialNumberList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberListResponse.SerialNumberList }
     *     
     */
    public void setSerialNumberList(NumberListResponse.SerialNumberList value) {
        this.serialNumberList = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sn"
    })
    public static class SerialNumberList {

        @XmlElement(name = "SN", type = Long.class)
        protected List<Long> sn;

        /**
         * Gets the value of the sn property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sn property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getSN() {
            if (sn == null) {
                sn = new ArrayList<Long>();
            }
            return this.sn;
        }

    }

}
