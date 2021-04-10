/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hackerman
 */
public class Conexion {
    
 private static final String URL = "jdbc:mysql://localhost:3306/catalogo?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        
    }
    
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
 
    public static void close(Connection conexion, java.sql.Statement declaracion, ResultSet resultado ) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }

    public static void close( Connection conexion, java.sql.Statement declaracion) throws SQLException{
        declaracion.close();
        conexion.close();
    }
    
}


