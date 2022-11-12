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
    
//-------------------------------------INGRESAR-------------------------------------
    
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
    public boolean ingresarDesarrollador(String fono, String rut, String nombre, String comuna, String correo){
    // rut y correo unico
        if(!rutUnico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correoUnico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // ingresar el desarrollador
        Desarrollador d = new Desarrollador(fono, rut, nombre, comuna, correo);
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
    public boolean ingresarArriendo(String codigo, String rutUsuario,String fechaI, String fechaE){
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
                if(u.getRut().equalsIgnoreCase(rutUsuario)){
                    posicionU = i;
                    break;
                }
        }
        if(posicionU == -1){
            throw new NullPointerException("No usuario con este rut.");
        }
        Fecha fecha_arriendo;
        try{
            fecha_arriendo=new Fecha(fechaI);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        
        Fecha fecha_entrega;
        try{
            fecha_entrega=new Fecha(fechaE);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        Arriendo a = new Arriendo(lVideojugo.get(posicionV), lUsuario.get(posicionU),fecha_arriendo,fecha_entrega);
        lArriendo.add(a);
        lVideojugo.remove(posicionV);
        return true;
    }
    
//-------------------------------------ELIMINAR-------------------------------------
    
    public boolean eliminarUsuario(String rut){
        for(Usuario u : lUsuario){
            if(u.getRut().equalsIgnoreCase(rut)){
                lUsuario.remove(u);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarVendedor(String rut){
        for(Vendedor v : lVendedor){
            if(v.getRut().equalsIgnoreCase(rut)){
                lVendedor.remove(v);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarDesarrollador(String rut){
        for(Desarrollador d : lDesarrollador){
            if(d.getRut().equalsIgnoreCase(rut)){
                lDesarrollador.remove(d);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarVideoJuego(int codigo){
        for(VideoJuego v: lVideojugo){
            if(v.getCodigo()==codigo){
                lVideojugo.remove(v);
                return true;
            }
        }
        return false;
    }
    
//-------------------------------------BUSCAR-------------------------------------
    
    public int buscarUsuario(String rut){
        for(int i=0;i<lUsuario.size();i++){
            Usuario u = lUsuario.get(i);
            if(u.getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    public int buscarVendedor(String rut){
        for(int i=0;i<lVendedor.size();i++){
            Vendedor u = lVendedor.get(i);
            if(u.getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    public int buscarDesarrollador(String rut){
        for(int i=0;i<lDesarrollador.size();i++){
            Desarrollador u = lDesarrollador.get(i);
            System.out.println(u.getRut()+" / "+rut);
            if(u.getRut().equalsIgnoreCase(rut)){
                System.out.println("Encontrado");
                return i;
            }
        }
        return -1;
    }
    public int buscarVideoJuego(int codigo){
        for(int i=0;i<lVideojugo.size();i++){
            VideoJuego v = lVideojugo.get(i);
            if(v.getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }
    
//-------------------------------------ACTUALIZAR-------------------------------------
    
    public void actualizarUsuario(int posicionUsuario,String fechaN, String comuna, String telefono, String nombre, String direccion){
        Usuario u = lUsuario.get(posicionUsuario);
        Fecha f;
        try{
            f=new Fecha(fechaN);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        u.setFechaN(f);
        u.setComuna(comuna);
        u.setTelefono(telefono);
        u.setNombre(nombre);
        u.setDireccion(direccion);
    }
    public void actualizarVendedor(int posicionUsuario, String fono, String nombre, String direccion, String correo){
        Vendedor v = lVendedor.get(posicionUsuario);
        v.setFono(fono);
        v.setNombre(nombre);
        v.setDireccion(direccion);
        v.setCorreo(correo);
    }
    public void actualizarDesarrollador(int posicionUsuario, String fono, String nombre, String direccion, String correo){
        Desarrollador d = lDesarrollador.get(posicionUsuario);
        d.setFono(fono);
        d.setNombre(nombre);
        d.setDireccion(direccion);
        d.setCorreo(correo);
    }
    public void actualizarVideoJuego(int posicionVideoJuego, String nombre, String version, String fechaD, String categoria, String genero, int precio){
        VideoJuego v = lVideojugo.get(posicionVideoJuego);
        Fecha f;
        try{
            f=new Fecha(fechaD);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        v.setNombre(nombre);
        v.setVersion(version);
        v.setFechaD(f);
        v.setCategoria(categoria);
        v.setGenero(genero);
        v.setPrecio(precio);
    }
    
//-------------------------------------OBTENER-------------------------------------
    
    public String [] obtenerDatosUsuario(int posicionUsuario){
        Usuario u = lUsuario.get(posicionUsuario);
        String [] datos = new String[5];
        datos[0] = u.getNombre();
        datos[1] = u.getComuna();
        datos[2] = u.getDireccion();
        datos[3] = u.getTelefono();
        datos[4] = u.getFechaN();
        return datos;
    }
    public String [] obtenerDatosVendedor(int posicionVendedor){
        Vendedor v = lVendedor.get(posicionVendedor);
        String [] datos = new String[4];
        datos[0] = v.getNombre();
        datos[1] = v.getDireccion();
        datos[2] = v.getFono();
        datos[3] = v.getClave();
        return datos;
    }
    public String [] obtenerDatosDesarrollador(int posicionDesarrollador){
        Desarrollador d = lDesarrollador.get(posicionDesarrollador);
        String [] datos = new String[3];
        System.out.println("ok "+d.getRut());
        datos[0] = d.getNombre();
        datos[1] = d.getDireccion();
        datos[2] = d.getFono();
       
        return datos;
    }
}
