
package dic.src;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ListarTodasDefinicoesBDResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListarTodasDefinicoesBDResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listTodos" type="{http://services.aonaware.com/webservices/}definicao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListarTodasDefinicoesBDResponse", propOrder = {
    "listTodos"
})
public class ListarTodasDefinicoesBDResponse {

    protected List<Definicao> listTodos;

    /**
     * Gets the value of the listTodos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTodos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTodos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definicao }
     * 
     * 
     */
    public List<Definicao> getListTodos() {
        if (listTodos == null) {
            listTodos = new ArrayList<Definicao>();
        }
        return this.listTodos;
    }

}
