//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_error_stackframe complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_error_stackframe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stmt_handle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="variable_context_global" type="{uri:poosl}t_var_list"/&gt;
 *         &lt;element name="variable_context_local" type="{uri:poosl}t_var_list"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_error_stackframe",
        propOrder = { "method", "stmtHandle", "variableContextGlobal", "variableContextLocal" })
public class TErrorStackframe {

    @XmlElement(required = true)
    protected String method;

    @XmlElement(name = "stmt_handle", required = true)
    protected String stmtHandle;

    @XmlElement(name = "variable_context_global", required = true)
    protected TVarList variableContextGlobal;

    @XmlElement(name = "variable_context_local", required = true)
    protected TVarList variableContextLocal;

    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the stmtHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getStmtHandle() {
        return stmtHandle;
    }

    /**
     * Sets the value of the stmtHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setStmtHandle(String value) {
        this.stmtHandle = value;
    }

    /**
     * Gets the value of the variableContextGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link TVarList }
     * 
     */
    public TVarList getVariableContextGlobal() {
        return variableContextGlobal;
    }

    /**
     * Sets the value of the variableContextGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVarList }
     * 
     */
    public void setVariableContextGlobal(TVarList value) {
        this.variableContextGlobal = value;
    }

    /**
     * Gets the value of the variableContextLocal property.
     * 
     * @return
     *     possible object is
     *     {@link TVarList }
     * 
     */
    public TVarList getVariableContextLocal() {
        return variableContextLocal;
    }

    /**
     * Sets the value of the variableContextLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TVarList }
     * 
     */
    public void setVariableContextLocal(TVarList value) {
        this.variableContextLocal = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     * 
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
