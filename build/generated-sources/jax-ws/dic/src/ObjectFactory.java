
package dic.src;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dic.src package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddDefinicaoBD_QNAME = new QName("http://ws1.ifms/", "AddDefinicaoBD");
    private final static QName _AddDefinicaoBDResponse_QNAME = new QName("http://ws1.ifms/", "AddDefinicaoBDResponse");
    private final static QName _BuscarDefinicaoWSMyWords_QNAME = new QName("http://ws1.ifms/", "BuscarDefinicaoWSMyWords");
    private final static QName _BuscarDefinicaoMyDictionary_QNAME = new QName("http://ws1.ifms/", "BuscarDefinicaoMyDictionary");
    private final static QName _ListarTodasDefinicoesBD_QNAME = new QName("http://ws1.ifms/", "ListarTodasDefinicoesBD");
    private final static QName _BuscarDefinicaoMyDictionaryResponse_QNAME = new QName("http://ws1.ifms/", "BuscarDefinicaoMyDictionaryResponse");
    private final static QName _ListarTodasDefinicoesBDResponse_QNAME = new QName("http://ws1.ifms/", "ListarTodasDefinicoesBDResponse");
    private final static QName _BuscarDefinicaoWSMyWordsResponse_QNAME = new QName("http://ws1.ifms/", "BuscarDefinicaoWSMyWordsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dic.src
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTodasDefinicoesBD }
     * 
     */
    public ListarTodasDefinicoesBD createListarTodasDefinicoesBD() {
        return new ListarTodasDefinicoesBD();
    }

    /**
     * Create an instance of {@link AddDefinicaoBD }
     * 
     */
    public AddDefinicaoBD createAddDefinicaoBD() {
        return new AddDefinicaoBD();
    }

    /**
     * Create an instance of {@link AddDefinicaoBDResponse }
     * 
     */
    public AddDefinicaoBDResponse createAddDefinicaoBDResponse() {
        return new AddDefinicaoBDResponse();
    }

    /**
     * Create an instance of {@link BuscarDefinicaoWSMyWords }
     * 
     */
    public BuscarDefinicaoWSMyWords createBuscarDefinicaoWSMyWords() {
        return new BuscarDefinicaoWSMyWords();
    }

    /**
     * Create an instance of {@link BuscarDefinicaoMyDictionary }
     * 
     */
    public BuscarDefinicaoMyDictionary createBuscarDefinicaoMyDictionary() {
        return new BuscarDefinicaoMyDictionary();
    }

    /**
     * Create an instance of {@link BuscarDefinicaoWSMyWordsResponse }
     * 
     */
    public BuscarDefinicaoWSMyWordsResponse createBuscarDefinicaoWSMyWordsResponse() {
        return new BuscarDefinicaoWSMyWordsResponse();
    }

    /**
     * Create an instance of {@link BuscarDefinicaoMyDictionaryResponse }
     * 
     */
    public BuscarDefinicaoMyDictionaryResponse createBuscarDefinicaoMyDictionaryResponse() {
        return new BuscarDefinicaoMyDictionaryResponse();
    }

    /**
     * Create an instance of {@link ListarTodasDefinicoesBDResponse }
     * 
     */
    public ListarTodasDefinicoesBDResponse createListarTodasDefinicoesBDResponse() {
        return new ListarTodasDefinicoesBDResponse();
    }

    /**
     * Create an instance of {@link Definicao }
     * 
     */
    public Definicao createDefinicao() {
        return new Definicao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDefinicaoBD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "AddDefinicaoBD")
    public JAXBElement<AddDefinicaoBD> createAddDefinicaoBD(AddDefinicaoBD value) {
        return new JAXBElement<AddDefinicaoBD>(_AddDefinicaoBD_QNAME, AddDefinicaoBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDefinicaoBDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "AddDefinicaoBDResponse")
    public JAXBElement<AddDefinicaoBDResponse> createAddDefinicaoBDResponse(AddDefinicaoBDResponse value) {
        return new JAXBElement<AddDefinicaoBDResponse>(_AddDefinicaoBDResponse_QNAME, AddDefinicaoBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDefinicaoWSMyWords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "BuscarDefinicaoWSMyWords")
    public JAXBElement<BuscarDefinicaoWSMyWords> createBuscarDefinicaoWSMyWords(BuscarDefinicaoWSMyWords value) {
        return new JAXBElement<BuscarDefinicaoWSMyWords>(_BuscarDefinicaoWSMyWords_QNAME, BuscarDefinicaoWSMyWords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDefinicaoMyDictionary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "BuscarDefinicaoMyDictionary")
    public JAXBElement<BuscarDefinicaoMyDictionary> createBuscarDefinicaoMyDictionary(BuscarDefinicaoMyDictionary value) {
        return new JAXBElement<BuscarDefinicaoMyDictionary>(_BuscarDefinicaoMyDictionary_QNAME, BuscarDefinicaoMyDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasDefinicoesBD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "ListarTodasDefinicoesBD")
    public JAXBElement<ListarTodasDefinicoesBD> createListarTodasDefinicoesBD(ListarTodasDefinicoesBD value) {
        return new JAXBElement<ListarTodasDefinicoesBD>(_ListarTodasDefinicoesBD_QNAME, ListarTodasDefinicoesBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDefinicaoMyDictionaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "BuscarDefinicaoMyDictionaryResponse")
    public JAXBElement<BuscarDefinicaoMyDictionaryResponse> createBuscarDefinicaoMyDictionaryResponse(BuscarDefinicaoMyDictionaryResponse value) {
        return new JAXBElement<BuscarDefinicaoMyDictionaryResponse>(_BuscarDefinicaoMyDictionaryResponse_QNAME, BuscarDefinicaoMyDictionaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodasDefinicoesBDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "ListarTodasDefinicoesBDResponse")
    public JAXBElement<ListarTodasDefinicoesBDResponse> createListarTodasDefinicoesBDResponse(ListarTodasDefinicoesBDResponse value) {
        return new JAXBElement<ListarTodasDefinicoesBDResponse>(_ListarTodasDefinicoesBDResponse_QNAME, ListarTodasDefinicoesBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDefinicaoWSMyWordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws1.ifms/", name = "BuscarDefinicaoWSMyWordsResponse")
    public JAXBElement<BuscarDefinicaoWSMyWordsResponse> createBuscarDefinicaoWSMyWordsResponse(BuscarDefinicaoWSMyWordsResponse value) {
        return new JAXBElement<BuscarDefinicaoWSMyWordsResponse>(_BuscarDefinicaoWSMyWordsResponse_QNAME, BuscarDefinicaoWSMyWordsResponse.class, null, value);
    }

}
