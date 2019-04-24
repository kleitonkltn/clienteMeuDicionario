
package dic.src;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BuscarDefinicaoWSMyWordsResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BuscarDefinicaoWSMyWordsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefinicaoWSMyWords" type="{http://services.aonaware.com/webservices/}definicao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarDefinicaoWSMyWordsResponse", propOrder = {
    "definicaoWSMyWords"
})
public class BuscarDefinicaoWSMyWordsResponse {

    @XmlElement(name = "DefinicaoWSMyWords")
    protected List<Definicao> definicaoWSMyWords;

    /**
     * Gets the value of the definicaoWSMyWords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definicaoWSMyWords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinicaoWSMyWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definicao }
     * 
     * 
     */
    public List<Definicao> getDefinicaoWSMyWords() {
        if (definicaoWSMyWords == null) {
            definicaoWSMyWords = new ArrayList<Definicao>();
        }
        return this.definicaoWSMyWords;
    }

}
