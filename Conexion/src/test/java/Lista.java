
import java.sql.*;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hackerman
 */
public class Lista {
    public static void main(String args[])throws SQLException{
            List<Usuarios> lista = new ArrayList<>();
            lista = DaoUsuarios.listaUsuarios();
            for(Usuarios usuario:lista){
                System.out.println(usuario);
            }
  /*     // String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //try{
            //crear conexion con BD
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Conexion.getConnection();
            //crear una declaracion de como se va a trabajar con la BD
            Statement declaracion = conexion.createStatement();
            String SQL = "SELECT * FROM usuarios";
            //variable que recibira el resultado de ejecutar la secuencia SQL 
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            while(resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre_usuario"));
                System.out.println(resultado.getString("contraseña"));
                System.out.println(resultado.getString("status"));
                System.out.println(resultado.getString("fecha_de_alta"));
            }
            //cerrar toda conexion con la BD
            Conexion.close(conexion, declaracion, resultado);
            //resultado.close();
            //declaracion.close();
            //conexion.close();
        //}catch(SQLException ex){
          //  ex.printStackTrace(System.out);
        //}*/
    }
}