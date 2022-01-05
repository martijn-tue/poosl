//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_command.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="t_command"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="run"/&gt;
 *     &lt;enumeration value="pause"/&gt;
 *     &lt;enumeration value="stop"/&gt;
 *     &lt;enumeration value="step"/&gt;
 *     &lt;enumeration value="process-step"/&gt;
 *     &lt;enumeration value="time-step"/&gt;
 *     &lt;enumeration value="comm-step"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "t_command")
@XmlEnum
public enum TCommand {

    @XmlEnumValue("run")
    RUN("run"), @XmlEnumValue("pause")
    PAUSE("pause"), @XmlEnumValue("stop")
    STOP("stop"), @XmlEnumValue("step")
    STEP("step"), @XmlEnumValue("process-step")
    PROCESS_STEP("process-step"), @XmlEnumValue("time-step")
    TIME_STEP("time-step"), @XmlEnumValue("comm-step")
    COMM_STEP("comm-step");

    private final String value;

    TCommand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TCommand fromValue(String v) {
        for (TCommand c : TCommand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
