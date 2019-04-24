
package dic.src;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de definicao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="definicao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="palavra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "definicao", namespace = "http://services.aonaware.com/webservices/", propOrder = {
    "definicao",
    "id",
    "palavra"
})
public class Definicao {

    @XmlElement(namespace = "http://services.aonaware.com/webservices/")
    protected String definicao;
    @XmlElement(namespace = "http://services.aonaware.com/webservices/")
    protected long id;
    @XmlElement(namespace = "http://services.aonaware.com/webservices/")
    protected String palavra;

    /**
     * Obtém o valor da propriedade definicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinicao() {
        return definicao;
    }

    /**
     * Define o valor da propriedade definicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinicao(String value) {
        this.definicao = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade palavra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     * Define o valor da propriedade palavra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalavra(String value) {
        this.palavra = value;
    }

}
