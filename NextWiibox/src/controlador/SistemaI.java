package controlador;


public interface SistemaI {
//----------------------------------------------UTILIDAD------------------------------------------------
    /**
     * Busca en el sistema si existe otro usuario con ese rut, si es unico retorna true.
     * @param rut
     * @return 
     */
    public boolean rutUnico(String rut);
    /**
     * Busca en el sistema si existe otro usuario con ese correo, si es unico retorna true.
     * @param correo
     * @return 
     */
    public boolean correoUnico(String correo);
    /**
     * Todabia no implementada correctamente
     * @param usuario
     * @param contraseña
     * @return 
     */
    public boolean login(String usuario,String contraseña);
//----------------------------------------------INGRESAR------------------------------------------------
    /**
     * Revisa si el rut es unico, luego, verifica si el correo es unico, si lo es, comprueba que la fecha funcione en el sistema, 
     * si todo lo anterior se cumple, se ingresa al usuario al sistema.
     * @param fechaN
     * @param comuna
     * @param telefono
     * @param rut
     * @param nombre
     * @param direccion
     * @param correo
     * @return 
     */
    public boolean ingresarUsuario(String fechaN, String comuna, String telefono, String rut, String nombre, String direccion, String correo);
    /**
     * Verifica que el codigo y el valor del videojuego sean valores numericos,
     * revisa si el valor del videojuego es negativo, si no lo es, comprueba que el codigo del juego sea unico,
     * si lo es, comprueba que la fecha funcione en el sistema, luego, verifica si el desarrollador existe en el sistema,
     * si todo lo anterior se cumple, se ingresa al videoJuego al sistema.
     * @param codigoV
     * @param nombre
     * @param version
     * @param fechaD
     * @param categoria
     * @param genero
     * @param valor
     * @param rutDesarrollador
     * @return 
     */
    public boolean ingresarVideojuego(String codigoV, String nombre, String version, String fechaD, String categoria, String genero, String valor, String rutDesarrollador);
    /**
     * Revisa si el rut es unico, si lo es, comprueba que la correo sea unico, si todo lo anterior se cumple, se ingresa al desarrollador al sistema.
     * @param fono
     * @param rut
     * @param nombre
     * @param direccion
     * @param correo
     * @return 
     */
    public boolean ingresarDesarrollador(String fono, String rut, String nombre, String direccion, String correo);
    /**
     * Revisa si el rut es unico, si lo es, comprueba que la correo sea unico, si todo lo anterior se cumple, se ingresa al vendedor al sistema.
     * @param fono
     * @param rut
     * @param nombre
     * @param direccion
     * @param correo
     * @return
     */
    public boolean ingresarVendedor(String fono, String rut, String nombre, String direccion, String correo);
    /**
     * Verifica que el codigo del videojuego sea un valor numerico y si este codigo existe en el sistema,
     * si existe, ve si existe el desarrollador, comprobamos que las fechas funcionen en el sistema,
     * si todo esto se cumple, creamos el arriendo, y eliminamos el videojuego ya que fue arrendado.
     * @param codigo
     * @param rutUsuario
     * @param fechaI
     * @param fechaE
     * @return 
     */
    public boolean ingresarArriendo(String codigo, String rutUsuario,String fechaI, String fechaE);
//----------------------------------------------INGRESAR------------------------------------------------
}
