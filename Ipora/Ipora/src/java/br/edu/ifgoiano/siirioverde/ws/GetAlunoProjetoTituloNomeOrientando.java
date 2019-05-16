
package br.edu.ifgoiano.siirioverde.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlunoProjetoTituloNomeOrientando complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAlunoProjetoTituloNomeOrientando">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tituloprojeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlunoProjetoTituloNomeOrientando", propOrder = {
    "tituloprojeto"
})
public class GetAlunoProjetoTituloNomeOrientando {

    protected String tituloprojeto;

    /**
     * Gets the value of the tituloprojeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloprojeto() {
        return tituloprojeto;
    }

    /**
     * Sets the value of the tituloprojeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloprojeto(String value) {
        this.tituloprojeto = value;
    }

}
