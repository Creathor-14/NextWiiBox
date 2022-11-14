package bbdd;

import java.sql.*;
        
public class Conexion {
    Connection conexion = null;
    public void conectar (){
        try {
        String url = "jdbc:mysql://localhost:3306/libreria"; 
        String user = "root";
        String password = "";    
        conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Concexion correcta");
            
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}

