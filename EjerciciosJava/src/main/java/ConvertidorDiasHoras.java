
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
public class ConvertidorDiasHoras {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
         int dias;
         System.out.println("Ingresa los Dias a convertir en Horas: ");
         dias=scanner.nextInt();
         System.out.println("La conversion a Horas es:"+(dias*24));
    }
    
}
