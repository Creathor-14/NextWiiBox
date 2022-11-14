package modelo;

import bbdd.Conexion;
/**
 *
 * @author reeso
 */
public class Principal {
    
    public static  void main (String[] args){
        Conexion con = new Conexion();
        con.conectar();
        
    }
 // se deberia hacer en el controlador en nuestro caso   
}
