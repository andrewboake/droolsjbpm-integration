//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jaxbWrapperType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jaxbWrapperType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SET"/&gt;
 *     &lt;enumeration value="ARRAY"/&gt;
 *     &lt;enumeration value="MAP"/&gt;
 *     &lt;enumeration value="LIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "jaxbWrapperType")
@XmlEnum
public enum JaxbWrapperType {

    SET,
    ARRAY,
    MAP,
    LIST;

    public String value() {
        return name();
    }

    public static JaxbWrapperType fromValue(String v) {
        return valueOf(v);
    }

}