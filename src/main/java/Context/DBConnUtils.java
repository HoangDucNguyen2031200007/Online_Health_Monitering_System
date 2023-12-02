/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DBConnUtils {
    public Connection getConnection(){
        return DBContext.getSQLServerConnection_SQLJDBC();
    }
    
    public void closeConnection(Connection conn) {
        try {
            conn.close();
        }catch(Exception e) {
            
        }
    }
    
    public void rollbackConnection(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
            
        }
    }
}
