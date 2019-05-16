package br.edu.ifgoiano.siiipora.ws;

import br.edu.ifgoiano.siiipora.persistence.dao.AnuncianteDAO;
import br.edu.ifgoiano.siiipora.persistence.dao.EventoDAO;
import br.edu.ifgoiano.siiipora.model.Anunciante;
import br.edu.ifgoiano.siiipora.model.Evento;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Matheus Correia
 */
@WebService(serviceName="SiiIporaWs")
public class SiiIporaWs
{
    AnuncianteDAO anuncDAO = new AnuncianteDAO();
    EventoDAO eventoDAO = new EventoDAO();
    
    @WebMethod(operationName = "getAnunciantes")
    public List<Anunciante> listarAnunciantes()
    {
        return anuncDAO.getLista();
    }
    
    @WebMethod(operationName = "getEventos")
    public List<Evento> listarEventos()
    {
        return eventoDAO.getEvento();
    }    
    
    @WebMethod(operationName = "addAnunciante")
    public boolean cadastrarAnunciante(Anunciante anunc)
    {
       if(anunc.getCpf() == null || anunc.getNome() == null || anunc.getSenha() == null)
            return false;
        
        anuncDAO.adicionar(anunc);
        return true;
    }
    
    @WebMethod(operationName = "addEvento")
    public boolean cadastrarEvento(Evento evento)
    {        
        
        if(anuncDAO.buscarPorCPF(evento.getAnunciante().getCpf()).getNome() == null || evento.getNome() == null || evento.getLocal() == null || evento.getDescricao() == null || evento.getCampus() == null || evento.getData() == null)
            return false;
        
        eventoDAO.adicionar(evento);
        return true;
    }
    
    @WebMethod(operationName = "deleteEvento")
    public boolean deletarEvento(Evento evento)
    {   
        if(evento.getDescricao() == null)
          return false;
        
        eventoDAO.remover(evento);            
    return true;
    }
    
    @WebMethod(operationName = "deleteAnunciante")
    public boolean deletarAnunciante(Anunciante anunc)
    {           
        if(anunc.getNome() == null)
          return false;
        
        anuncDAO.remover(anunc);            
    return true;
    }
    
    @WebMethod(operationName = "alterarAnunciante")
    public boolean alterarAnunciante(Anunciante anunc)
    {           
        if(anunc.getNome() == null || anunc.getSenha() == null)
          return false;
        
        anuncDAO.alterar(anunc);            
        return true;
    }
    
    @WebMethod(operationName = "alterarEvento")
    public boolean alterarEvento(Evento evento)
    {           
        if(evento.getNome() == null || evento.getLocal() == null || evento.getDescricao() == null || evento.getCampus() == null || evento.getData() == null)
         return false;
        
        eventoDAO.alterar(evento);            
        return true;
    }
}

/*
    @WebMethod
    public List<String> listarAnunciantes()
    {
        int i=0;
        List<String> listaAnunciante = new ArrayList<>();
            
        while(i<anuncDAO.getLista().size())
        {                        
            listaAnunciante.add(anuncDAO.getLista().get(i).getNome());
            i++;
        }
        return listaAnunciante;
    }
    */

    /*@WebMethod
    public List<String> listarEventos()
    {
        int i=0;
        List<String> listaEvento = new ArrayList<>();
            
        while(i<eventoDAO.getEvento().size())
        {                        
            listaEvento.add(eventoDAO.getEvento().get(i).getNome());
            i++;
        }
        return listaEvento;
    }*/