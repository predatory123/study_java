//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.12 at 02:18:08 PM CEST 
//


package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.generiert;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="besitzer" type="{http://www.galileocomputing.de/schroedinger/terminkalender}besitzer"/>
 *         &lt;element name="termine" type="{http://www.galileocomputing.de/schroedinger/terminkalender}termine"/>
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
    "besitzer",
    "termine"
})
@XmlRootElement(name = "terminkalender")
public class Terminkalender {

    @XmlElement(required = true)
    protected Besitzer besitzer;
    @XmlElement(required = true)
    protected Termine termine;

    /**
     * Gets the value of the besitzer property.
     * 
     * @return
     *     possible object is
     *     {@link Besitzer }
     *     
     */
    public Besitzer getBesitzer() {
        return besitzer;
    }

    /**
     * Sets the value of the besitzer property.
     * 
     * @param name
     *     allowed object is
     *     {@link Besitzer }
     *     
     */
    public void setBesitzer(Besitzer name) {
        this.besitzer = name;
    }

    /**
     * Gets the value of the termine property.
     * 
     * @return
     *     possible object is
     *     {@link Termine }
     *     
     */
    public Termine getTermine() {
        return termine;
    }

    /**
     * Sets the value of the termine property.
     * 
     * @param termine
     *     allowed object is
     *     {@link Termine }
     *     
     */
    public void setTermine(Termine termine) {
        this.termine = termine;
    }

}
