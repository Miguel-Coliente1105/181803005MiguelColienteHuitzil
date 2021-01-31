
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
public class NumeroDeterminado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la palabra que se repetira: ");
        String palabra = scanner.nextLine();
        System.out.println("Ingresa las veces que quieres que se repita");
        int repeticion=scanner.nextInt();
        for(int i=1; i<= repeticion; i++){
            System.out.println("La palabra es:"+palabra);
        }
        
    }
}
