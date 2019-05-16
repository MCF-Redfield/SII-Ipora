
package br.edu.ifgoiano.siiipora.persistence.dao;

import br.edu.ifgoiano.siiipora.model.Evento;
import br.edu.ifgoiano.siiipora.persistence.fabrica.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.edu.ifgoiano.siiipora.controller.AdicionarAnuncianteServlet;

/**
 *
 * @author Carlos da Costa Oliveira
 */
public class EventoDAO implements InterfaceEventoDAO{
    Connection connection;
    
    public EventoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    @Override
    public void adicionar(Evento evento)
    {
        String sql = "INSERT INTO evento" + "(nome,local,data,descricao,campus,anunciante_cpf)"
                + "VALUES (?,?,?,?,?,?)";

        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, evento.getNome());
                stmt.setString(2, evento.getLocal());
                stmt.setDate(3, evento.getData());
                stmt.setString(4, evento.getDescricao());
                stmt.setString(5, evento.getCampus());
                stmt.setString(6, evento.getAnunciante().getCpf());
                
                stmt.execute();
                stmt.close();
            }

        } catch (SQLException e) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Override
    public void remover(Evento evento){
        String sql = "DELETE FROM evento WHERE id LIKE ?";
        
        try{
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, evento.getId());
                stmt.execute();
                stmt.close();
            }
            
        }catch(SQLException e){
           Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE,null,e);
           
        }
    }
    
    @Override
    public List<Evento> getEvento(){
        String sql = "SELECT * FROM evento";
        AnuncianteDAO anuncDAO = new AnuncianteDAO();
        try {
            List<Evento> listaEvento = new ArrayList<>();
            try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery())
            {
                
                while (rs.next())
                {
                    Evento evento = new Evento();
                    evento.setNome(rs.getString("nome"));
                    evento.setLocal(rs.getString("local"));
                    evento.setData(rs.getDate("data"));
                    evento.setDescricao(rs.getString("descricao"));
                    evento.setCampus(rs.getString("campus"));
                    evento.setId(rs.getInt("id"));
                    evento.setAnunciante(anuncDAO.buscarPorCPF(rs.getString("anunciante_cpf")));
                    
                    listaEvento.add(evento);
                }
            }            
            return listaEvento;
            
        } catch (SQLException e) {
            Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
    @Override
    public void alterar(Evento evento)
    {
        String sql = "UPDATE evento SET id=?,nome=?,local=?,data=?,descricao=?,campus=?,anunciante_cpf=? WHERE id=?";
        
        try{
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, evento.getId());
                stmt.setString(2, evento.getNome());
                stmt.setString(3, evento.getLocal());
                stmt.setDate(4, (Date) evento.getData());
                stmt.setString(5, evento.getDescricao());
                stmt.setString(6, evento.getCampus());
                stmt.setString(7, evento.getAnunciante().getCpf());
                
                stmt.execute();
                stmt.close();
            }
           
        }catch(SQLException e){
             Logger.getLogger(EventoDAO.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    @Override
    public java.sql.Date configuraData(String data)
    {
            String dia = data.substring(0, 2);
            String mes = data.substring(3, 5);
            String ano = data.substring(6, 10);
            String startDate = ano+mes+dia;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            java.util.Date date;
            try {
                    date = sdf.parse(startDate);
                    java.sql.Date dataSql = new java.sql.Date(date.getTime());
                    return dataSql;
                }
                catch(ParseException ex)
                {
                    Logger.getLogger(AdicionarAnuncianteServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            return null;
    }
    
    @Override
    public Evento buscarEvento(int idEvento)
    {
        String sql = "SELECT * FROM evento WHERE id like '" + idEvento + "'";
        Evento evento = new Evento();
        AnuncianteDAO anuncDAO = new AnuncianteDAO();
        EventoDAO eventoDAO = new EventoDAO();
        try
        {
            try(PreparedStatement stmt = connection.prepareStatement(sql))
            {
                ResultSet rs = stmt.executeQuery();

                while (rs.next())
                {
                    evento.setAnunciante(anuncDAO.buscarPorCPF(rs.getString("anunciante_cpf")));
                    evento.setNome(rs.getString("nome"));
                    evento.setCampus(rs.getString("campus"));
                    evento.setData(rs.getDate("data"));//(eventoDAO.configuraData(rs.getString("data")));
                    evento.setLocal(rs.getString("local"));
                    evento.setDescricao(rs.getString("descricao"));
                    evento.setId(rs.getInt("id"));
                }
                return evento;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AnuncianteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
