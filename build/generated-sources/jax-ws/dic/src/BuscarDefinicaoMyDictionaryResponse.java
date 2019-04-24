
package dic.src;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BuscarDefinicaoMyDictionaryResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BuscarDefinicaoMyDictionaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefinicaoMyDictionary" type="{http://services.aonaware.com/webservices/}definicao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarDefinicaoMyDictionaryResponse", propOrder = {
    "definicaoMyDictionary"
})
public class BuscarDefinicaoMyDictionaryResponse {

    @XmlElement(name = "DefinicaoMyDictionary")
    protected List<Definicao> definicaoMyDictionary;

    /**
     * Gets the value of the definicaoMyDictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definicaoMyDictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinicaoMyDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definicao }
     * 
     * 
     */
    public List<Definicao> getDefinicaoMyDictionary() {
        if (definicaoMyDictionary == null) {
            definicaoMyDictionary = new ArrayList<Definicao>();
        }
        return this.definicaoMyDictionary;
    }

}
