//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:55:55 PM CST 
//


package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for 地址类型 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="地址类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="省份" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="城市" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="区" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="街道" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5730\u5740\u7c7b\u578b", propOrder = {
    "\u7701\u4efd",
    "\u57ce\u5e02",
    "\u533a",
    "\u8857\u9053",
    "\u53f7"
})
public class 地址类型 {

    protected String 省份;
    @XmlElement(required = true)
    protected String 城市;
    @XmlElement(required = true)
    protected String 区;
    @XmlElement(required = true)
    protected String 街道;
    @XmlElement(required = true)
    protected String 号;

    /**
     * Gets the value of the 省份 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get省份() {
        return 省份;
    }

    /**
     * Sets the value of the 省份 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set省份(String value) {
        this.省份 = value;
    }

    /**
     * Gets the value of the 城市 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get城市() {
        return 城市;
    }

    /**
     * Sets the value of the 城市 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set城市(String value) {
        this.城市 = value;
    }

    /**
     * Gets the value of the 区 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get区() {
        return 区;
    }

    /**
     * Sets the value of the 区 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set区(String value) {
        this.区 = value;
    }

    /**
     * Gets the value of the 街道 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get街道() {
        return 街道;
    }

    /**
     * Sets the value of the 街道 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set街道(String value) {
        this.街道 = value;
    }

    /**
     * Gets the value of the 号 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get号() {
        return 号;
    }

    /**
     * Sets the value of the 号 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set号(String value) {
        this.号 = value;
    }

}
