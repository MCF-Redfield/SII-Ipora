
package br.edu.ifgoiano.siiipora.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos da Costa Oliveira
 */
public class FabricaMySqlDAO extends fabricaDAO{
    public AnuncianteDAO getAnuncianteDAO(){
        return new AnuncianteDAO();
    }
    public EventoDAO getEventoDAO(){
        return new EventoDAO();
    }
    
    public static Connection connection(){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost/bd_ipora",
                    "root","root");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
