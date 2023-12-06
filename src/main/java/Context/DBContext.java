package Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {

    private static final String DB_URL = """
                                         jdbc:sqlserver://localhost:1433;
                                         databaseName=online_health_monitering_system;
                                         integratedSecurity=false; encrypt=false
                                         """;
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    static Connection getSQLServerConnection_SQLJDBC() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println(conn.toString());
            System.out.println("connect successfully!");
        } catch (SQLException ex) {
            System.out.println("connect failure!");
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
