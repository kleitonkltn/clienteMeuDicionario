
package dic.src;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DicionarioWS", targetNamespace = "http://ws1.ifms/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DicionarioWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "AddDefinicaoBD")
    @RequestWrapper(localName = "AddDefinicaoBD", targetNamespace = "http://ws1.ifms/", className = "dic.src.AddDefinicaoBD")
    @ResponseWrapper(localName = "AddDefinicaoBDResponse", targetNamespace = "http://ws1.ifms/", className = "dic.src.AddDefinicaoBDResponse")
    @Action(input = "http://ws1.ifms/DicionarioWS/AddDefinicaoBDRequest", output = "http://ws1.ifms/DicionarioWS/AddDefinicaoBDResponse")
    public void addDefinicaoBD(
        @WebParam(name = "arg0", targetNamespace = "")
        Definicao arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<dic.src.Definicao>
     */
    @WebMethod(operationName = "BuscarDefinicaoWSMyWords")
    @WebResult(name = "DefinicaoWSMyWords", targetNamespace = "")
    @RequestWrapper(localName = "BuscarDefinicaoWSMyWords", targetNamespace = "http://ws1.ifms/", className = "dic.src.BuscarDefinicaoWSMyWords")
    @ResponseWrapper(localName = "BuscarDefinicaoWSMyWordsResponse", targetNamespace = "http://ws1.ifms/", className = "dic.src.BuscarDefinicaoWSMyWordsResponse")
    @Action(input = "http://ws1.ifms/DicionarioWS/BuscarDefinicaoWSMyWordsRequest", output = "http://ws1.ifms/DicionarioWS/BuscarDefinicaoWSMyWordsResponse")
    public List<Definicao> buscarDefinicaoWSMyWords(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<dic.src.Definicao>
     */
    @WebMethod(operationName = "ListarTodasDefinicoesBD")
    @WebResult(name = "listTodos", targetNamespace = "")
    @RequestWrapper(localName = "ListarTodasDefinicoesBD", targetNamespace = "http://ws1.ifms/", className = "dic.src.ListarTodasDefinicoesBD")
    @ResponseWrapper(localName = "ListarTodasDefinicoesBDResponse", targetNamespace = "http://ws1.ifms/", className = "dic.src.ListarTodasDefinicoesBDResponse")
    @Action(input = "http://ws1.ifms/DicionarioWS/ListarTodasDefinicoesBDRequest", output = "http://ws1.ifms/DicionarioWS/ListarTodasDefinicoesBDResponse")
    public List<Definicao> listarTodasDefinicoesBD();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<dic.src.Definicao>
     */
    @WebMethod(operationName = "BuscarDefinicaoMyDictionary")
    @WebResult(name = "DefinicaoMyDictionary", targetNamespace = "")
    @RequestWrapper(localName = "BuscarDefinicaoMyDictionary", targetNamespace = "http://ws1.ifms/", className = "dic.src.BuscarDefinicaoMyDictionary")
    @ResponseWrapper(localName = "BuscarDefinicaoMyDictionaryResponse", targetNamespace = "http://ws1.ifms/", className = "dic.src.BuscarDefinicaoMyDictionaryResponse")
    @Action(input = "http://ws1.ifms/DicionarioWS/BuscarDefinicaoMyDictionaryRequest", output = "http://ws1.ifms/DicionarioWS/BuscarDefinicaoMyDictionaryResponse")
    public List<Definicao> buscarDefinicaoMyDictionary(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
