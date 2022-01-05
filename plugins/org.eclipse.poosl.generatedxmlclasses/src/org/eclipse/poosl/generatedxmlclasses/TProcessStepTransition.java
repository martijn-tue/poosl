//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_process_step_transition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_process_step_transition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="process_path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="node" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="handle" use="required" type="{uri:poosl}t_handle_id" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_process_step_transition", propOrder = { "processPath", "node" })
public class TProcessStepTransition {

    @XmlElement(name = "process_path", required = true)
    protected String processPath;

    @XmlElement(required = true)
    protected BigInteger node;

    @XmlAttribute(name = "handle", required = true)
    protected BigInteger handle;

    /**
     * Gets the value of the processPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getProcessPath() {
        return processPath;
    }

    /**
     * Sets the value of the processPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setProcessPath(String value) {
        this.processPath = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setNode(BigInteger value) {
        this.node = value;
    }

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setHandle(BigInteger value) {
        this.handle = value;
    }

}
