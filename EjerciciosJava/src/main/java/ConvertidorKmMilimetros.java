
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
public class ConvertidorKmMilimetros {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
         float kilometros;
         System.out.println("Ingresa los Kilometros para convertir a Milimetros: ");
         kilometros=scanner.nextFloat();
         System.out.println("La conversion a milimetros es:"+(kilometros*1000000));   
    }
    
}
