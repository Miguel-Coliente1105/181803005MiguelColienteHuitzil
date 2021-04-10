
package Conexion;

import java.sql.*;

/**
 *
 * @author Hackerman
 */
public class Conexion {
    //static es una palabra reservada que determina que el atributo es de la clase y no del objeto
    //Final es un modificador que indica que el atributo es una constante por lo que no se le podra cambiar el valor de ningun modo
    private static final String URL = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        //throws SQLException es el try y cache implementado en un metodo
    }
    //polimorfismo
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    //polimorfismo
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado ) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }
    //polimorfismo
    public static void close( Connection conexion, Statement declaracion) throws SQLException{
        declaracion.close();
        conexion.close();
    }
    
}