/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.par.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabricio
 */
public class conectar_db {
        public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conectar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conectar = DriverManager.getConnection("jdbc:postgresql://localhost:5432/paronline", "postgres", "postgres");
        return conectar;
    }

    public static void closeConnection(Connection conectar) {
        if (conectar != null) {
            try {
                conectar.close();
            } catch (SQLException ex) {
                Logger.getLogger(conectar_db.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    
}
