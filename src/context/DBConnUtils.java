/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnUtils {
    public static Connection getConnection(){
        return DBContext.getSQLServerConnection_SQLJDBC();
    }
    
    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        }catch(Exception e) {
            
        }
    }
    
    public static void rollbackConnection(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
            
        }
    }
}
