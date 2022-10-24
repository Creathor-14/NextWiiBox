package modelo;

public class Usuario extends Persona {
    
    private Fecha fechaN; //pasar a date
    private String comuna;
    private String telefono;
    

    public Usuario() {
        super();
        this.fechaN = null; 
        this.comuna = "";
        this.telefono = "";
        
    }   

    public Usuario(Fecha fechaN, String comuna, String telefono, String rut, String nombre, String direccion, String correo) {
        super(rut, nombre, direccion, correo);
        this.fechaN = fechaN;
        this.comuna = comuna;
        this.telefono = telefono;
          
    } 

    public Fecha getFechaN() {
        return fechaN;
    }

    public void setFechaN(Fecha fechaN) {
        this.fechaN = fechaN;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+"\tUsuario{" + "fechaN=" + fechaN + ", comuna=" + comuna + ", telefono=" + telefono + '}';
    }
    
    
}
