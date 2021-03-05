/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hackerman
 */
public class UsuariosUbicacion {
    private int id,idUsuarios;
    private String ubicacionInicial,ubicacionFinal,ipUbicacion,fechaCambio;

    public UsuariosUbicacion() {
        this.id = 0;
        this.idUsuarios = 0;
        this.ubicacionInicial = "";
        this.ubicacionFinal = "";
        this.ipUbicacion = "";
        this.fechaCambio = "";
    }  

    public UsuariosUbicacion(int id, int idUsuarios, String ubicacionInicial, String ubicacionFinal, String ipUbicacion, String fechaCambio) {
        this.id = id;
        this.idUsuarios = idUsuarios;
        this.ubicacionInicial = ubicacionInicial;
        this.ubicacionFinal = ubicacionFinal;
        this.ipUbicacion = ipUbicacion;
        this.fechaCambio = fechaCambio;
    }

    public int getId() {
        return id;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public String getUbicacionInicial() {
        return ubicacionInicial;
    }

    public String getUbicacionFinal() {
        return ubicacionFinal;
    }

    public String getIpUbicacion() {
        return ipUbicacion;
    }

    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public void setUbicacionInicial(String ubicacionInicial) {
        this.ubicacionInicial = ubicacionInicial;
    }

    public void setUbicacionFinal(String ubicacionFinal) {
        this.ubicacionFinal = ubicacionFinal;
    }

    public void setIpUbicacion(String ipUbicacion) {
        this.ipUbicacion = ipUbicacion;
    }

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    @Override
    public String toString() {
        return "UsuariosUbicacion{" + "id=" + id + ", idUsuarios=" + idUsuarios + ", ubicacionInicial=" + ubicacionInicial + ", ubicacionFinal=" + ubicacionFinal + ", ipUbicacion=" + ipUbicacion + ", fechaCambio=" + fechaCambio + '}';
    }
   
}
