/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class TestCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Coche coche = new Coche("audi roadster", "rojo", 750000, 749933, 0);
        Cliente cliente = new Cliente(1, "2227010942", "Coliente", coche, 0);
        
        System.out.println(cliente);  
    }
    
}
