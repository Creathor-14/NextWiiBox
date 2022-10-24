package modelo;

public class VideoJuego {
    private int codigo;
    private String nombre;
    private String version;    
    private Fecha fechaD;
    private String categoria;
    private String genero;
    private int precio;
    private Desarrollador desarrollador;

    public VideoJuego() {
        this.codigo = 0;
        this.nombre = "";
        this.version = "";
        this.fechaD = null;
        this.categoria = "";
        this.genero = "";
        this.precio = 0;
        this.desarrollador = null;
    }

    public VideoJuego(int codigo, String nombre, String version, Fecha fechaD, String categoria, String genero, int precio, Desarrollador desarrollador) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.version = version;
        this.fechaD = fechaD;
        this.categoria = categoria;
        this.genero = genero;
        this.precio = precio;
        this.desarrollador = desarrollador;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Fecha getFechaD() {
        return fechaD;
    }

    public void setFechaD(Fecha fechaD) {
        this.fechaD = fechaD;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", nombre=" + nombre + ", version=" + version + ", fechaD=" + fechaD + ", categoria=" + categoria + ", genero=" + genero + ", precio=" + precio + ", desarrollador=" + desarrollador.toString() + '}';
    }
    
    
    
}
