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

    public Arriendo(VideoJuego videoJuego, Usuario usuario) {
        this.videoJuego = videoJuego;
        this.usuario = usuario;
    }
    public Arriendo() {
        this.videoJuego = null;
        this.usuario = null;
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

    @Override
    public String toString() {
        return "Arriendo{" + "videoJuego=" + videoJuego + ", usuario=" + usuario + '}';
    }
    
}
