
package DaoUsuarios;

import Usuarios.Usuarios;
import java.util.List;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hackerman
 */
public class DaoUsuarios {
    private static String SQL;
    
    public static List<Usuarios> listaUsuarios() throws SQLException{
        List<Usuarios> lista = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM usuarios";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next()){
            Usuarios usuario = new Usuarios(resultado.getInt("id"),resultado.getString("nombre_usuario"), resultado.getString("contraseña"), resultado.getString("fecha_de_alta"), resultado.getInt("status"));
            lista.add(usuario);
        }
        Conexion.close(conexion, declaracion, resultado);
        return lista;
    }
    public static void insertar(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO usuarios(nombre_usuario,contraseña,status) VALUES (?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, usuario.getNombreUsuario());
        declaracion.setString(2, usuario.getContraseña());
        declaracion.setInt(3,1);
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }        
    public static void delete(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM usuarios WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void update (Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE usuarios SET nombre_usuario = ?, contraseña = ?, status = ? WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, usuario.getNombreUsuario());
        declaracion.setString(2, usuario.getContraseña());
        declaracion.setInt(3, usuario.getStat());
        declaracion.setInt(4, usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}