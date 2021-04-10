/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hackerman
 */
public class Mostrar {
    public static void main(String args[])throws SQLException{
            List<Bolsas> lista = new ArrayList<>();
            lista = DaoBolsas.listaBolsas();
            for(Bolsas bolsa:lista){
                System.out.println(bolsa);
            }
    }
}
