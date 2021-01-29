
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
public class Opciones {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int numero1, numero2;
        System.out.println("dame el numero1");
        numero1=scanner.nextInt();
        System.out.println("dame el numero2");
        numero2=scanner.nextInt();
        System.out.println("opcion1:\nsuma\n opcion2:resta");
        int opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println(numero1+numero2);
                break;
            case 2:
                System.out.println(numero1-numero2);
        }
        
    } 
}
