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
          int max = 26; 
          int min = 1; 
          int range = max - min + 1;
          int rand=(int)(Math.random()*range)+min;
          System.out.println(rand); 
   }
} 
