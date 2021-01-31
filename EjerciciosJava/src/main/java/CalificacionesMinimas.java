
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
public class CalificacionesMinimas {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float nota1,nota2;
        System.out.println("Ingresa la primera nota:");
        nota1 = scanner.nextFloat();
        System.out.println("Ingresa la segunda nota:");
        nota2 = scanner.nextFloat();
        System.out.println("La nota minima para pasar con 7 es:"+(7+nota1+nota2)/3);  
    }  
}
