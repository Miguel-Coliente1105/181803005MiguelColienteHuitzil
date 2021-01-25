/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
import java.util.Scanner;
public class Promedio {
     public static void main(String args[]){
        Double num1, num2, num3, suma, promedio ;
        Scanner entrada = new Scanner (System.in) ;
        System.out.println ("Ingrese nota 1") ;
        num1 = entrada.nextDouble() ;
        System.out.println ("Ingrese nota 2");
        num2 = entrada.nextDouble() ;
        System.out.println ("Ingrese nota 3") ;
        num3 = entrada.nextDouble() ;
        suma = (num1 + num2 + num3) ;
        promedio = (suma/3) ;

System.out.println ("El estudiante aprovo con un promedio de: " +promedio );
     }  
    
}
