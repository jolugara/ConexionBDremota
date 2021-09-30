/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JorgeLPR
 */
public class ConexionDefault {
 
    private final String DB="czNJ8gixWD";
    private final String URL="jdbc:mysql://remotemysql.com:3306/"+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
    private final String USER="czNJ8gixWD";
    private final String PASS="xTww7cML8W";
    
    public void openConnection() {
        
        Connection connect = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=(Connection) DriverManager.getConnection(URL,USER,PASS);
            
            if(connect!=null){
                System.out.println("Conexión exitosa");            
            }else{
                System.out.println("Conexión Fallida");            
            }
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("error "+ex.getMessage());
        }
        
    }    
    
    
    public void closeConnection(Connection connect){
        try {
            connect.close();
            System.out.println("Conexión Cerrada Exitosamente");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDefault.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
