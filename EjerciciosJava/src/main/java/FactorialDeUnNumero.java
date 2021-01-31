
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
public class FactorialDeUnNumero {
     public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);
         int suma = 1;
         System.out.print("Ingresa el Numero para cacular el Factorial: ");
         int numero = scanner.nextInt();
         for (int i = numero; i>1; i--){
             suma = suma * i;
         }
         System.out.println("el Factorial de el numero" +numero+ " es " + suma );
   }
    
}
