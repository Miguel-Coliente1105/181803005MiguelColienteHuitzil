package Usuarios;


/**
 *
 * @author Hackerman
 */
public class Usuarios {
    private int id, stat;
    private String nombreUsuario,contraseña,fechaDeAlta;

    public Usuarios() {
        this.id = 0;
        this.nombreUsuario = "";
        this.contraseña = "";
        this.fechaDeAlta = "";
        this.stat = 0;
    }
    public Usuarios(int id, String nombreUsuario, String contraseña, String fechaDeAlta, int stat) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaDeAlta = fechaDeAlta;
        this.stat = stat;
    }
    public Usuarios(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    public Usuarios(int id, String nombreUsuario, String contraseña, int stat) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.stat = stat;
    }
    public Usuarios(int id, String nombreUsuario, String contraseña) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }    
    public Usuarios(int id) {
        this.id = id;     
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public int getStat() {
        return stat;
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

    @Override
    public String toString() {
        return nombreUsuario;
    }    
    public String imprimir() {
        return "Usuarios" + "id=" + id + ", stat=" + stat + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", fechaDeAlta=" + fechaDeAlta + '}';
    }   
}
