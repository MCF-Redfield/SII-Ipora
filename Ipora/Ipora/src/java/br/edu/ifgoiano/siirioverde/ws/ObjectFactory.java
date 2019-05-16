
package br.edu.ifgoiano.siirioverde.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifgoiano.siirioverde.ws package. 
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

    private final static QName _GetProjetoResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProjetoResponse");
    private final static QName _GetProjetoNomeTituloResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProjetoNomeTituloResponse");
    private final static QName _GetProfessorResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorResponse");
    private final static QName _GetAlunoProjetoTituloNomeOrientando_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getAlunoProjetoTituloNomeOrientando");
    private final static QName _GetAluno_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAluno");
    private final static QName _GetAlunoNome_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoNome");
    private final static QName _GetProfessorNomeResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorNomeResponse");
    private final static QName _GetAlunoNomeResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoNomeResponse");
    private final static QName _GetAlunoProjetoIdResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoProjetoIdResponse");
    private final static QName _GetProfessorSiapeResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorSiapeResponse");
    private final static QName _GetProfessorNome_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorNome");
    private final static QName _GetProjeto_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProjeto");
    private final static QName _GetAlunoProjetoTituloNomeOrientandoResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getAlunoProjetoTituloNomeOrientandoResponse");
    private final static QName _GetProjetoNomeTitulo_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProjetoNomeTitulo");
    private final static QName _GetProfessorId_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorId");
    private final static QName _GetAlunoResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoResponse");
    private final static QName _GetAlunoProjeto_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getAlunoProjeto");
    private final static QName _GetAlunoProjetoResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getAlunoProjetoResponse");
    private final static QName _GetAlunoId_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoId");
    private final static QName _GetProfessor_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessor");
    private final static QName _GetProfessorIdResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorIdResponse");
    private final static QName _GetAlunoIdResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoIdResponse");
    private final static QName _GetAlunoNomeCpfResponse_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoNomeCpfResponse");
    private final static QName _GetAlunoNomeCpf_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoNomeCpf");
    private final static QName _GetProfessorSiape_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "getProfessorSiape");
    private final static QName _GetAlunoProjetoId_QNAME = new QName("http://ws.siirioverde.ifgoiano.edu.br/", "GetAlunoProjetoId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifgoiano.siirioverde.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProfessorNome }
     * 
     */
    public GetProfessorNome createGetProfessorNome() {
        return new GetProfessorNome();
    }

    /**
     * Create an instance of {@link GetAlunoProjetoTituloNomeOrientandoResponse }
     * 
     */
    public GetAlunoProjetoTituloNomeOrientandoResponse createGetAlunoProjetoTituloNomeOrientandoResponse() {
        return new GetAlunoProjetoTituloNomeOrientandoResponse();
    }

    /**
     * Create an instance of {@link GetProjeto }
     * 
     */
    public GetProjeto createGetProjeto() {
        return new GetProjeto();
    }

    /**
     * Create an instance of {@link GetProfessorNomeResponse }
     * 
     */
    public GetProfessorNomeResponse createGetProfessorNomeResponse() {
        return new GetProfessorNomeResponse();
    }

    /**
     * Create an instance of {@link GetAlunoProjetoIdResponse }
     * 
     */
    public GetAlunoProjetoIdResponse createGetAlunoProjetoIdResponse() {
        return new GetAlunoProjetoIdResponse();
    }

    /**
     * Create an instance of {@link GetAlunoNomeResponse }
     * 
     */
    public GetAlunoNomeResponse createGetAlunoNomeResponse() {
        return new GetAlunoNomeResponse();
    }

    /**
     * Create an instance of {@link GetProfessorSiapeResponse }
     * 
     */
    public GetProfessorSiapeResponse createGetProfessorSiapeResponse() {
        return new GetProfessorSiapeResponse();
    }

    /**
     * Create an instance of {@link GetProjetoNomeTituloResponse }
     * 
     */
    public GetProjetoNomeTituloResponse createGetProjetoNomeTituloResponse() {
        return new GetProjetoNomeTituloResponse();
    }

    /**
     * Create an instance of {@link GetProfessorResponse }
     * 
     */
    public GetProfessorResponse createGetProfessorResponse() {
        return new GetProfessorResponse();
    }

    /**
     * Create an instance of {@link GetAluno }
     * 
     */
    public GetAluno createGetAluno() {
        return new GetAluno();
    }

    /**
     * Create an instance of {@link GetAlunoProjetoTituloNomeOrientando }
     * 
     */
    public GetAlunoProjetoTituloNomeOrientando createGetAlunoProjetoTituloNomeOrientando() {
        return new GetAlunoProjetoTituloNomeOrientando();
    }

    /**
     * Create an instance of {@link GetAlunoNome }
     * 
     */
    public GetAlunoNome createGetAlunoNome() {
        return new GetAlunoNome();
    }

    /**
     * Create an instance of {@link GetProjetoResponse }
     * 
     */
    public GetProjetoResponse createGetProjetoResponse() {
        return new GetProjetoResponse();
    }

    /**
     * Create an instance of {@link GetAlunoProjetoId }
     * 
     */
    public GetAlunoProjetoId createGetAlunoProjetoId() {
        return new GetAlunoProjetoId();
    }

    /**
     * Create an instance of {@link GetAlunoNomeCpfResponse }
     * 
     */
    public GetAlunoNomeCpfResponse createGetAlunoNomeCpfResponse() {
        return new GetAlunoNomeCpfResponse();
    }

    /**
     * Create an instance of {@link GetAlunoNomeCpf }
     * 
     */
    public GetAlunoNomeCpf createGetAlunoNomeCpf() {
        return new GetAlunoNomeCpf();
    }

    /**
     * Create an instance of {@link GetAlunoIdResponse }
     * 
     */
    public GetAlunoIdResponse createGetAlunoIdResponse() {
        return new GetAlunoIdResponse();
    }

    /**
     * Create an instance of {@link GetProfessorSiape }
     * 
     */
    public GetProfessorSiape createGetProfessorSiape() {
        return new GetProfessorSiape();
    }

    /**
     * Create an instance of {@link GetAlunoId }
     * 
     */
    public GetAlunoId createGetAlunoId() {
        return new GetAlunoId();
    }

    /**
     * Create an instance of {@link GetProfessor }
     * 
     */
    public GetProfessor createGetProfessor() {
        return new GetProfessor();
    }

    /**
     * Create an instance of {@link GetProfessorIdResponse }
     * 
     */
    public GetProfessorIdResponse createGetProfessorIdResponse() {
        return new GetProfessorIdResponse();
    }

    /**
     * Create an instance of {@link GetProjetoNomeTitulo }
     * 
     */
    public GetProjetoNomeTitulo createGetProjetoNomeTitulo() {
        return new GetProjetoNomeTitulo();
    }

    /**
     * Create an instance of {@link GetProfessorId }
     * 
     */
    public GetProfessorId createGetProfessorId() {
        return new GetProfessorId();
    }

    /**
     * Create an instance of {@link GetAlunoProjetoResponse }
     * 
     */
    public GetAlunoProjetoResponse createGetAlunoProjetoResponse() {
        return new GetAlunoProjetoResponse();
    }

    /**
     * Create an instance of {@link GetAlunoProjeto }
     * 
     */
    public GetAlunoProjeto createGetAlunoProjeto() {
        return new GetAlunoProjeto();
    }

    /**
     * Create an instance of {@link GetAlunoResponse }
     * 
     */
    public GetAlunoResponse createGetAlunoResponse() {
        return new GetAlunoResponse();
    }

    /**
     * Create an instance of {@link AlunoProjeto }
     * 
     */
    public AlunoProjeto createAlunoProjeto() {
        return new AlunoProjeto();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link Projeto }
     * 
     */
    public Projeto createProjeto() {
        return new Projeto();
    }

    /**
     * Create an instance of {@link Professor }
     * 
     */
    public Professor createProfessor() {
        return new Professor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjetoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProjetoResponse")
    public JAXBElement<GetProjetoResponse> createGetProjetoResponse(GetProjetoResponse value) {
        return new JAXBElement<GetProjetoResponse>(_GetProjetoResponse_QNAME, GetProjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjetoNomeTituloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProjetoNomeTituloResponse")
    public JAXBElement<GetProjetoNomeTituloResponse> createGetProjetoNomeTituloResponse(GetProjetoNomeTituloResponse value) {
        return new JAXBElement<GetProjetoNomeTituloResponse>(_GetProjetoNomeTituloResponse_QNAME, GetProjetoNomeTituloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorResponse")
    public JAXBElement<GetProfessorResponse> createGetProfessorResponse(GetProfessorResponse value) {
        return new JAXBElement<GetProfessorResponse>(_GetProfessorResponse_QNAME, GetProfessorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoProjetoTituloNomeOrientando }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getAlunoProjetoTituloNomeOrientando")
    public JAXBElement<GetAlunoProjetoTituloNomeOrientando> createGetAlunoProjetoTituloNomeOrientando(GetAlunoProjetoTituloNomeOrientando value) {
        return new JAXBElement<GetAlunoProjetoTituloNomeOrientando>(_GetAlunoProjetoTituloNomeOrientando_QNAME, GetAlunoProjetoTituloNomeOrientando.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAluno")
    public JAXBElement<GetAluno> createGetAluno(GetAluno value) {
        return new JAXBElement<GetAluno>(_GetAluno_QNAME, GetAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoNome")
    public JAXBElement<GetAlunoNome> createGetAlunoNome(GetAlunoNome value) {
        return new JAXBElement<GetAlunoNome>(_GetAlunoNome_QNAME, GetAlunoNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorNomeResponse")
    public JAXBElement<GetProfessorNomeResponse> createGetProfessorNomeResponse(GetProfessorNomeResponse value) {
        return new JAXBElement<GetProfessorNomeResponse>(_GetProfessorNomeResponse_QNAME, GetProfessorNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoNomeResponse")
    public JAXBElement<GetAlunoNomeResponse> createGetAlunoNomeResponse(GetAlunoNomeResponse value) {
        return new JAXBElement<GetAlunoNomeResponse>(_GetAlunoNomeResponse_QNAME, GetAlunoNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoProjetoIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoProjetoIdResponse")
    public JAXBElement<GetAlunoProjetoIdResponse> createGetAlunoProjetoIdResponse(GetAlunoProjetoIdResponse value) {
        return new JAXBElement<GetAlunoProjetoIdResponse>(_GetAlunoProjetoIdResponse_QNAME, GetAlunoProjetoIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorSiapeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorSiapeResponse")
    public JAXBElement<GetProfessorSiapeResponse> createGetProfessorSiapeResponse(GetProfessorSiapeResponse value) {
        return new JAXBElement<GetProfessorSiapeResponse>(_GetProfessorSiapeResponse_QNAME, GetProfessorSiapeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorNome")
    public JAXBElement<GetProfessorNome> createGetProfessorNome(GetProfessorNome value) {
        return new JAXBElement<GetProfessorNome>(_GetProfessorNome_QNAME, GetProfessorNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProjeto")
    public JAXBElement<GetProjeto> createGetProjeto(GetProjeto value) {
        return new JAXBElement<GetProjeto>(_GetProjeto_QNAME, GetProjeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoProjetoTituloNomeOrientandoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getAlunoProjetoTituloNomeOrientandoResponse")
    public JAXBElement<GetAlunoProjetoTituloNomeOrientandoResponse> createGetAlunoProjetoTituloNomeOrientandoResponse(GetAlunoProjetoTituloNomeOrientandoResponse value) {
        return new JAXBElement<GetAlunoProjetoTituloNomeOrientandoResponse>(_GetAlunoProjetoTituloNomeOrientandoResponse_QNAME, GetAlunoProjetoTituloNomeOrientandoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjetoNomeTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProjetoNomeTitulo")
    public JAXBElement<GetProjetoNomeTitulo> createGetProjetoNomeTitulo(GetProjetoNomeTitulo value) {
        return new JAXBElement<GetProjetoNomeTitulo>(_GetProjetoNomeTitulo_QNAME, GetProjetoNomeTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorId")
    public JAXBElement<GetProfessorId> createGetProfessorId(GetProfessorId value) {
        return new JAXBElement<GetProfessorId>(_GetProfessorId_QNAME, GetProfessorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoResponse")
    public JAXBElement<GetAlunoResponse> createGetAlunoResponse(GetAlunoResponse value) {
        return new JAXBElement<GetAlunoResponse>(_GetAlunoResponse_QNAME, GetAlunoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoProjeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getAlunoProjeto")
    public JAXBElement<GetAlunoProjeto> createGetAlunoProjeto(GetAlunoProjeto value) {
        return new JAXBElement<GetAlunoProjeto>(_GetAlunoProjeto_QNAME, GetAlunoProjeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoProjetoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getAlunoProjetoResponse")
    public JAXBElement<GetAlunoProjetoResponse> createGetAlunoProjetoResponse(GetAlunoProjetoResponse value) {
        return new JAXBElement<GetAlunoProjetoResponse>(_GetAlunoProjetoResponse_QNAME, GetAlunoProjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoId")
    public JAXBElement<GetAlunoId> createGetAlunoId(GetAlunoId value) {
        return new JAXBElement<GetAlunoId>(_GetAlunoId_QNAME, GetAlunoId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessor")
    public JAXBElement<GetProfessor> createGetProfessor(GetProfessor value) {
        return new JAXBElement<GetProfessor>(_GetProfessor_QNAME, GetProfessor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorIdResponse")
    public JAXBElement<GetProfessorIdResponse> createGetProfessorIdResponse(GetProfessorIdResponse value) {
        return new JAXBElement<GetProfessorIdResponse>(_GetProfessorIdResponse_QNAME, GetProfessorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoIdResponse")
    public JAXBElement<GetAlunoIdResponse> createGetAlunoIdResponse(GetAlunoIdResponse value) {
        return new JAXBElement<GetAlunoIdResponse>(_GetAlunoIdResponse_QNAME, GetAlunoIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoNomeCpfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoNomeCpfResponse")
    public JAXBElement<GetAlunoNomeCpfResponse> createGetAlunoNomeCpfResponse(GetAlunoNomeCpfResponse value) {
        return new JAXBElement<GetAlunoNomeCpfResponse>(_GetAlunoNomeCpfResponse_QNAME, GetAlunoNomeCpfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoNomeCpf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoNomeCpf")
    public JAXBElement<GetAlunoNomeCpf> createGetAlunoNomeCpf(GetAlunoNomeCpf value) {
        return new JAXBElement<GetAlunoNomeCpf>(_GetAlunoNomeCpf_QNAME, GetAlunoNomeCpf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfessorSiape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "getProfessorSiape")
    public JAXBElement<GetProfessorSiape> createGetProfessorSiape(GetProfessorSiape value) {
        return new JAXBElement<GetProfessorSiape>(_GetProfessorSiape_QNAME, GetProfessorSiape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlunoProjetoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.siirioverde.ifgoiano.edu.br/", name = "GetAlunoProjetoId")
    public JAXBElement<GetAlunoProjetoId> createGetAlunoProjetoId(GetAlunoProjetoId value) {
        return new JAXBElement<GetAlunoProjetoId>(_GetAlunoProjetoId_QNAME, GetAlunoProjetoId.class, null, value);
    }

}
