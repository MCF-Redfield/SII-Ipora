
package br.edu.ifgoiano.siirioverde.ws;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SiiRioVerdeWs", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SiiRioVerdeWs {


    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAlunoProjetoId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAlunoProjetoId", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoProjetoId")
    @ResponseWrapper(localName = "GetAlunoProjetoIdResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoProjetoIdResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoProjetoIdRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoProjetoIdResponse")
    public String getAlunoProjetoId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param matriculaSiape
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProfessorSiape", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorSiape")
    @ResponseWrapper(localName = "getProfessorSiapeResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorSiapeResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorSiapeRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorSiapeResponse")
    public String getProfessorSiape(
        @WebParam(name = "MatriculaSiape", targetNamespace = "")
        String matriculaSiape);

    /**
     * 
     * @param titulo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProjetoNomeTitulo", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProjetoNomeTitulo")
    @ResponseWrapper(localName = "getProjetoNomeTituloResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProjetoNomeTituloResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProjetoNomeTituloRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProjetoNomeTituloResponse")
    public String getProjetoNomeTitulo(
        @WebParam(name = "Titulo", targetNamespace = "")
        String titulo);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAlunoId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAlunoId", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoId")
    @ResponseWrapper(localName = "GetAlunoIdResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoIdResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoIdRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoIdResponse")
    public String getAlunoId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAlunoNome")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAlunoNome", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoNome")
    @ResponseWrapper(localName = "GetAlunoNomeResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoNomeResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoNomeRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoNomeResponse")
    public String getAlunoNome(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAlunoNomeCpf")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAlunoNomeCpf", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoNomeCpf")
    @ResponseWrapper(localName = "GetAlunoNomeCpfResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoNomeCpfResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoNomeCpfRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoNomeCpfResponse")
    public String getAlunoNomeCpf(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifgoiano.siirioverde.ws.Professor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProfessor", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessor")
    @ResponseWrapper(localName = "getProfessorResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorResponse")
    public List<Professor> getProfessor();

    /**
     * 
     * @param nome
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProfessorNome", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorNome")
    @ResponseWrapper(localName = "getProfessorNomeResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorNomeResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorNomeRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorNomeResponse")
    public String getProfessorNome(
        @WebParam(name = "nome", targetNamespace = "")
        String nome);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifgoiano.siirioverde.ws.Projeto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProjeto", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProjeto")
    @ResponseWrapper(localName = "getProjetoResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProjetoResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProjetoRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProjetoResponse")
    public List<Projeto> getProjeto();

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProfessorId", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorId")
    @ResponseWrapper(localName = "getProfessorIdResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetProfessorIdResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorIdRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getProfessorIdResponse")
    public String getProfessorId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifgoiano.siirioverde.ws.Aluno>
     */
    @WebMethod(operationName = "GetAluno")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAluno", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAluno")
    @ResponseWrapper(localName = "GetAlunoResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/GetAlunoResponse")
    public List<Aluno> getAluno();

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifgoiano.siirioverde.ws.AlunoProjeto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAlunoProjeto", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoProjeto")
    @ResponseWrapper(localName = "getAlunoProjetoResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoProjetoResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getAlunoProjetoRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getAlunoProjetoResponse")
    public List<AlunoProjeto> getAlunoProjeto();

    /**
     * 
     * @param tituloprojeto
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAlunoProjetoTituloNomeOrientando", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoProjetoTituloNomeOrientando")
    @ResponseWrapper(localName = "getAlunoProjetoTituloNomeOrientandoResponse", targetNamespace = "http://ws.siirioverde.ifgoiano.edu.br/", className = "br.edu.ifgoiano.siirioverde.ws.GetAlunoProjetoTituloNomeOrientandoResponse")
    @Action(input = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getAlunoProjetoTituloNomeOrientandoRequest", output = "http://ws.siirioverde.ifgoiano.edu.br/SiiRioVerdeWs/getAlunoProjetoTituloNomeOrientandoResponse")
    public String getAlunoProjetoTituloNomeOrientando(
        @WebParam(name = "tituloprojeto", targetNamespace = "")
        String tituloprojeto);

}