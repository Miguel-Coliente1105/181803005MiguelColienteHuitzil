
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
public class SiEntonces {
    public static void main(String args[]){
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa un numero");
        numero=leer.nextInt();
        if (numero<0)
            System.out.println("Numero negativo");
        else
            System.out.println("Numero positivo");
    }  
}
