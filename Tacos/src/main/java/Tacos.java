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
public class Tacos {
    public static void main(String args[]){
        int tacos, refresco, total;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n\t|-->Tacos de Doña Pelos<--|");
        System.out.println("\n\tNumero de tacos que comiste:");
        tacos=scanner.nextInt();
        System.out.println("\n\tNumero de Refrescos que bebiste:");
        refresco=scanner.nextInt();
        total=tacos*17 +refresco*10;
        System.out.println("\n\tSu pago es de:-->" + total);
        
       
        
    }
    
}
