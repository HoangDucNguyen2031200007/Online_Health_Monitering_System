/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
 
public class DBContext {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Online_Health_Monitering_System;"
            + "integratedSecurity=false; encrypt=false";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "sa";
 
    static Connection getSQLServerConnection_SQLJDBC() { 
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
            
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        } 
        return conn;
    }
}
