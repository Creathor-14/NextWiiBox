package controlador;

import modelo.Desarrollador;
import modelo.Usuario;
import modelo.Vendedor;
import modelo.VideoJuego;
import java.util.ArrayList;
import modelo.Fecha;
import vista.IngresarUsuario;
import vista.IngresarVideoJuego;

public class Impl_prueba implements SistemaI{
    
    private ArrayList <Desarrollador> lDesarrollador; 
    private ArrayList <Usuario> lUsuario; 
    private ArrayList <Vendedor> lVendedor; 
    private ArrayList <VideoJuego> lVideoJuego; 
    
    public Impl_prueba(){
        lDesarrollador = new ArrayList<>();
        lUsuario = new ArrayList<>();
        lVendedor = new ArrayList<>();
        lVideoJuego = new ArrayList<>();
    }
    
    public boolean rut_correoUnico(String rut){
        for(Desarrollador d : lDesarrollador){
            if(d.getRut().equals(rut) || d.getCorreo().equals(rut)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getRut().equals(rut) || v.getCorreo().equals(rut)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getRut().equals(rut) || u.getCorreo().equals(rut)){
                return false;
            }
        }
        return true;
    }
    
    public boolean registrarVideojuego(int codigo, String nombre, String version, String fechaD, String categoria, String genero, int precio, String rutDesarrollador){
    //Verificar que exista el dearrollador en el sistema. 
        boolean existe_el_desarrollador = false;
        int posicion_desarrollador = 0;
        for(Desarrollador d : lDesarrollador){
            if(d.getRut().equals(rutDesarrollador)){
                existe_el_desarrollador = true;
                break;
            }
            posicion_desarrollador++;
        }
        if(!existe_el_desarrollador){
            throw new NullPointerException("El desarrollador no existe en el sistema.");
        }
    //Verificar que no exista un videojuego con el mismo codigo en el sistema.
        for(VideoJuego videoJuego : lVideoJuego){
            if(videoJuego.getCodigo()==(codigo)){
                throw new NullPointerException("Este codigo de videojuego ya existe en el sistema.");
            }
        }
    //Verificar si la fecha es posible que exista.------------------------------------------------------------------------
        Fecha f;
        try{
            f=new Fecha(fechaD);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    //Ingresar videoJuego al sistema
        Desarrollador d = lDesarrollador.get(posicion_desarrollador);
        
        VideoJuego v = new VideoJuego(codigo, nombre, version, f, categoria, genero, precio, d);
        
        return lVideoJuego.add(v);
    }
    
    public boolean ingresarUsuario(String fechaN, String comuna, String telefono, String rut, String nombre, String direccion, String correo){
    //Verificar que el rut y correo del usuario sea unico en el sistema. 
        boolean unico = rut_correoUnico(rut);
        if(!unico){
            throw new NullPointerException("El rut o el correo del Usuario ya se encuentra en el sistema.");
        }
    //Verificar si la fecha es posible que exista.------------------------------------------------------------------------
        Fecha f;
        try{
            f=new Fecha(fechaN);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    //Ingresar el usuario al sistema
        Usuario u = new Usuario(f, comuna, telefono, rut, nombre, direccion, correo);
        return lUsuario.add(u);
    }
    
    public boolean ingresarDesarrollador(String fono, String rut, String nombre, String direccion, String correo){
    //Verificar que el rut y correo del usuario sea unico en el sistema. 
        boolean unico = rut_correoUnico(rut);
        if(!unico){
            throw new NullPointerException("El rut o el correo del Desarrollador ya se encuentra en el sistema.");
        }

    //Ingresar el usuario al sistema
        Desarrollador d = new Desarrollador(fono, rut, nombre, direccion, correo);
        return lDesarrollador.add(d);
    }
    
    public boolean ingresarVendedor(String fono, String rut, String nombre, String direccion, String correo){
    //Verificar que el rut y correo del usuario sea unico en el sistema. 
        boolean unico = rut_correoUnico(rut);
        if(!unico){
            throw new NullPointerException("El rut o el correo del Vendedor ya se encuentra en el sistema.");
        }

    //Ingresar el usuario al sistema
        Vendedor v = new Vendedor(fono, rut, nombre, direccion, correo);
        return lVendedor.add(v);
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

}
