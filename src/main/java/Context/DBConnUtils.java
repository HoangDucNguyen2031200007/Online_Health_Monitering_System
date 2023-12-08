package Context;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnUtils {

    public static Connection getConnection() {
        return DBContext.getSQLServerConnection_SQLJDBC();
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            Logger.getLogger(DBConnUtils.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void rollbackConnection(Connection conn) {
        try {
            conn.rollback();
        } catch (SQLException e) {
            Logger.getLogger(DBConnUtils.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
