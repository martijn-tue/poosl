//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_create_breakpoint_request complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_create_breakpoint_request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{uri:poosl}t_identifier" minOccurs="0"/&gt;
 *         &lt;element name="stmt_handle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{uri:poosl}t_source_position" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_create_breakpoint_request", propOrder = { "name", "stmtHandle", "position" })
public class TCreateBreakpointRequest {

    protected String name;

    @XmlElement(name = "stmt_handle")
    protected Integer stmtHandle;

    protected TSourcePosition position;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stmtHandle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     * 
     */
    public Integer getStmtHandle() {
        return stmtHandle;
    }

    /**
     * Sets the value of the stmtHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     * 
     */
    public void setStmtHandle(Integer value) {
        this.stmtHandle = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link TSourcePosition }
     * 
     */
    public TSourcePosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSourcePosition }
     * 
     */
    public void setPosition(TSourcePosition value) {
        this.position = value;
    }

}
