//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:55:55 PM CST 
//


package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for 年级类型.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="年级类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="大一"/>
 *     &lt;enumeration value="大二"/>
 *     &lt;enumeration value="大三"/>
 *     &lt;enumeration value="大四"/>
 *     &lt;enumeration value="研一"/>
 *     &lt;enumeration value="研二"/>
 *     &lt;enumeration value="研三"/>
 *     &lt;enumeration value="博士在读"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u5e74\u7ea7\u7c7b\u578b")
@XmlEnum
public enum 年级类型 {

    大一,
    大二,
    大三,
    大四,
    研一,
    研二,
    研三,
    博士在读;

    public String value() {
        return name();
    }

    public static 年级类型 fromValue(String v) {
        return valueOf(v);
    }

}
