/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hackerman
 */
public class DaoBolsas {
    
    private static String SQL;
     public static List<Bolsas> listaBolsas() throws SQLException{
        List<Bolsas> lista = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM bolsas";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next()){
            Bolsas bolsas = new Bolsas (resultado.getInt("id"),resultado.getString("nombre_bolsas"), 
                    resultado.getString("material"), resultado.getString("color"), resultado.getDouble("tamanio"),resultado.getDouble("precio"),resultado.getInt("modelo"));
            lista.add(bolsas);
        }
        Conexion.close(conexion, declaracion, resultado);
        return lista;
    }
     
    
      public static void insertar(Bolsas bolsas) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO bolsas(nombre_bolsas,material,color,tamanio,precio,modelo) VALUES (?,?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, bolsas.getNombreBolsas());
        declaracion.setString(2, bolsas.getColor());
        declaracion.setString(3, bolsas.getMaterial());
        declaracion.setDouble(4, bolsas.getTamanio());
        declaracion.setDouble(5, bolsas.getPrecio());
        declaracion.setInt(6, bolsas.getModelo());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    } 
       public static void delete(Bolsas bolsas) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM bolsas WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, bolsas.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
        public static void update (Bolsas bolsas) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE bolsas SET nombre_bolsas = ?,color=?,tamanio=?,material=?, modelo = ?, precio = ? WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, bolsas.getNombreBolsas());
        declaracion.setString(2, bolsas.getColor());
        declaracion.setDouble(3, bolsas.getTamanio());
        declaracion.setString(4, bolsas.getMaterial());
        declaracion.setInt(5, bolsas.getModelo());
        declaracion.setDouble(6, bolsas.getPrecio());
        declaracion.setInt(7, bolsas.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}

