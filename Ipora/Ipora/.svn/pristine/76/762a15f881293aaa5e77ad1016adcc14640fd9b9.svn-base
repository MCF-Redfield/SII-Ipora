
package br.edu.ifgoiano.siiipora.persistence.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos da Costa Oliveira
 */
public class ConnectionFactory {
    
    
    public Connection getConnection(){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/siiipora",
                    "root","root");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
