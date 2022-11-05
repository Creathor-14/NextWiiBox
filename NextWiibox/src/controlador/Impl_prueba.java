package controlador;

import modelo.Desarrollador;
import modelo.Usuario;
import modelo.Vendedor;
import modelo.VideoJuego;
import modelo.Arriendo;
import modelo.Fecha;

import java.util.ArrayList;
import java.util.List;


public class Impl_prueba implements SistemaI{
    
    private List <Desarrollador> lDesarrollador; 
    private List <Usuario> lUsuario; 
    private List <Vendedor> lVendedor; 
    private List <VideoJuego> lVideojugo; 
    private List <Arriendo> lArriendo; 
    public Impl_prueba(){
        lDesarrollador = new ArrayList<>();
        lUsuario = new ArrayList<>();
        lVendedor = new ArrayList<>();
        lVideojugo = new ArrayList<>();
        lArriendo = new ArrayList<>();
    }
    
    public boolean rutUnico(String rut){
        for(Desarrollador d : lDesarrollador){
            if(d.getRut().equalsIgnoreCase(rut)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getRut().equalsIgnoreCase(rut)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getRut().equalsIgnoreCase(rut)){
                return false;
            }
        }
        return true;
    }
    
    public boolean correoUnico(String correo){
        for(Desarrollador d : lDesarrollador){
            if(d.getCorreo().equalsIgnoreCase(correo)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getCorreo().equalsIgnoreCase(correo)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getCorreo().equalsIgnoreCase(correo)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean login(String usuario,String contraseña){
        //Inicio campos en blanco
        boolean usuarioEnBlanco = usuario.equals("ingrese su correo") || usuario.equals("");
        boolean contraseñaEnBlanco = contraseña.equals("************") || contraseña.equals("");
        if(usuarioEnBlanco && contraseñaEnBlanco){
            throw new NullPointerException("Es nesesario ingresar datos en los campos.");
        }//Fin campos en blanco
        
        if(usuario.contains(" ")){
            throw new NullPointerException("El usuario no debe contener espacios.");
        }
        if(usuario.equals("usuario")){
            if(contraseña.equals("contraseña")){
                return true;//usuario y contraseña correctos
            }else{
                throw new NullPointerException("Contraseña incorrecta.");
            }
        }
        return false;
    }
    public boolean ingresarUsuario(String fechaN, String comuna, String telefono, String rut, String nombre, String direccion, String correo){
    // rut y correo unico
        if(!rutUnico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correoUnico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // verificar fecha
        Fecha f;
        try{
            f=new Fecha(fechaN);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    // ingresar el usuario
        Usuario u = new Usuario(f, comuna, telefono, rut, nombre, direccion, correo);
        return lUsuario.add(u);
    }
    public boolean ingresarVideojuego(int codigo, String nombre, String version, String fechaD, String categoria, String genero, int precio, String rutDesarrollador){
    // codigo unico
        int posicion = 0;
        for(VideoJuego v:lVideojugo){
            if(v.getCodigo() == codigo){
                throw new NullPointerException("Este codigo ya existe en otro videojuego.");
            }
            posicion++;
        }
    // verificar fecha
        Fecha f;
        try{
            f=new Fecha(fechaD);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    // verificar si existe el desarollador, si existe ingresar videojuego
        for(Desarrollador d:lDesarrollador){
            if(d.getRut().equalsIgnoreCase(rutDesarrollador)){
                VideoJuego v = new VideoJuego(codigo, nombre, version, f, categoria, genero, precio, d);
                return lVideojugo.add(v);
            }
        }
        throw new NullPointerException("No existe el desarrollador con el rut "+rutDesarrollador);
    }
    public boolean ingresarDesarrollador(String fono, String rut, String nombre, String direccion, String correo){
    // rut y correo unico
        if(!rutUnico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correoUnico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // ingresar el desarrollador
        Desarrollador d = new Desarrollador(fono, rut, nombre, direccion, correo);
        return lDesarrollador.add(d);
    }
    public boolean ingresarVendedor(String fono, String rut, String nombre, String direccion, String correo){
    // rut y correo unico
        if(!rutUnico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correoUnico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // ingresar el vendedor
        Vendedor v = new Vendedor(fono, rut, nombre, direccion, correo);
        return lVendedor.add(v);
    }
    public boolean ingresarArriendo(String codigo, String rutUsuario){
        int codigoVideojuego;
        try{
            codigoVideojuego= Integer.valueOf(codigo);
        }catch(Exception e){
            throw new NullPointerException("Codigo del juego no valido.");
        }
        
        int posicionV = -1;
        for(int i=0;i<lVideojugo.size();i++){
            VideoJuego v= lVideojugo.get(i);
                if(v.getCodigo()==codigoVideojuego){
                    posicionV = i;
                    break;
                }
        }
        if(posicionV == -1){
            throw new NullPointerException("No existe un juego con este codigo.");
        }
        int posicionU = -1;
        for(int i=0;i<lUsuario.size();i++){
            Usuario u= lUsuario.get(i);
                if(u.getRut().equals(rutUsuario)){
                    posicionU = i;
                    break;
                }
        }
        if(posicionU == -1){
            throw new NullPointerException("No usuario con este rut.");
        }
        Arriendo a = new Arriendo(lVideojugo.get(posicionV), lUsuario.get(posicionU));
        lArriendo.add(a);
        lVideojugo.remove(posicionV);
        return true;
    }
}
