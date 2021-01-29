
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
public class CicloFor {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    System.out.println("deme el numero");
    int serie=scanner.nextInt();
    for(int i=0; i<=serie; i++){
    System.out.println("la serie es:"+i );
    }
    int i=serie;
    while(i>=0){
        System.out.println("la serie invertida es"+i);
        i--;
    }
  }   
}
