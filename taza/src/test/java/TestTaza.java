/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class TestTaza {
    public static void main(String args[]){
        Taza negro=new Taza();
        negro.color = "negro";
        negro.material = "ceramica";
        negro.modelo = "Serie 1";
        negro.precio = 25.9;
        negro.tamanio = 10.5;
        System.out.println(negro);
        
        Taza tazaRoja=new Taza("rojo", "nacarado", "ceramica", 25.9, 10.2);
        System.out.println(tazaRoja);
    } 
    
}
