/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author thoma
 */
public class Arriendo {
    private VideoJuego videoJuego;
    private Usuario usuario;
    private Fecha fecha_arriendo;
    private Fecha fecha_entrega;

    public Arriendo(VideoJuego videoJuego, Usuario usuario, Fecha fecha_arriendo, Fecha fecha_entrega) {
        this.videoJuego = videoJuego;
        this.usuario = usuario;
        this.fecha_arriendo = fecha_arriendo;
        this.fecha_entrega = fecha_entrega;
    }

    public Arriendo() {
        this.videoJuego = null;
        this.usuario = null;
        this.fecha_arriendo = null;
        this.fecha_entrega = null;
    }

    public VideoJuego getVideoJuego() {
        return videoJuego;
    }

    public void setVideoJuego(VideoJuego videoJuego) {
        this.videoJuego = videoJuego;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Fecha getFecha_arriendo() {
        return fecha_arriendo;
    }

    public void setFecha_arriendo(Fecha fecha_arriendo) {
        this.fecha_arriendo = fecha_arriendo;
    }

    public Fecha getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Fecha fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Arriendo{" + "videoJuego=" + videoJuego + ", usuario=" + usuario + '}';
    }
    
}
