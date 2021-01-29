/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class NumeroAleatorio {
     public static void main(String [] args){
         /*int numeroAleatorio=(int)(Math.random ()*25 +1);
         System.out.println(numeroAleatorio);*/
          int max = 5; 
          int min = 1; 
          int range = max - min + 1; 
       // generate random numbers within 1 to 10 
           for (int i = 0; i < 10; i++) { 
                int rand = (int)(Math.random() * range) + min;
            // Output is different everytime this code is executed 
                System.out.println(rand); 
     }
    } 
}
