
import Conexion.Conexion;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Hackerman
 */
public class Delete {
    public static void main(String args[]) throws SQLException{
        /*String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con BD
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Conexion.getConnection();
            //crear una declaracion de como se va a trabajar con la BD
            String SQL = "DELETE FROM usuarios WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
         */Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el id del usuario a eliminar:");
            int id = scan.nextInt();
            Usuarios usuario = new Usuarios(id);
            
            DaoUsuarios.delete(usuario);
            /*declaracion.setInt(1, id);
            declaracion.executeUpdate();*/
            System.out.println("id eliminado...");
            
            //cerrar toda conexion con la BD
           // Conexion.close(conexion, declaracion);
            //declaracion.close();
            //conexion.close();
        /*}catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
    }
}