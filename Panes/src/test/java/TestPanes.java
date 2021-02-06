
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class TestPanes {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del pan: ");
        String nombre = scanner.nextLine();
       
        System.out.println("Ingresa el tipo del pan: ");
        String tipo = scanner.nextLine();
        
        System.out.println("Ingresa el tamaño del pan:");
        String tamanio=scanner.nextLine();
       
        System.out.println("Ingresa el codigo de barras: ");
        int codigoB = scanner.nextInt();
        
        System.out.println("Ingresa el precio del pan : ");
        String precio = scanner.nextLine();

        
        
        Panes blanco= new Panes ("pan blanco", "natural", 23.61, "bln123","chico" ); 
        Panes linaza= new Panes ("artesano", "linaza", 38.10, "arli147", "grande");
        Panes multigrano= new Panes("integral", "multigrano", 29.30,"inmul56","mediano");
        Panes dobleFibra=new Panes("silueta", "doble fibra", 41.10, "doF58", "grande");
        Panes pan = new Panes(nombre, tipo, codigoB,tamanio, precio);
        System.out.println(blanco+"\n"+linaza+"\n"+multigrano+"\n"+dobleFibra+pan); 
    }
    
}
