/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hackerman
 */
public class Usuarios {
    private int id;
    private String nombreUsuario,contraseña,fechaDeAlta;
    private boolean status;
   
    public Usuarios(){
        this.id = 0;
        this.nombreUsuario = "";
        this.contraseña = "";
        this.fechaDeAlta = "";
        this.status = false;
    }
    public Usuarios(int id, String nombreUsuario, String contraseña, String fechaDeAlta, boolean status) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaDeAlta = fechaDeAlta;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getFechaDeAlta() {
        return fechaDeAlta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaDeAlta(String fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "usuarios{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", fechaDeAlta=" + fechaDeAlta + ", status=" + status + '}';
    }
}
