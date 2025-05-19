package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;

public class database {
    private static Connection conn;


    public static Connection getConnetion() {
    if(conn==null){
        try {
            String url = "jdbc:mysql://localhost:3306/pangsitdewi";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        conn = (Connection) DriverManager.getConnection(url,user,password);
        }catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return conn;
    }
    
    public database() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
