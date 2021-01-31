
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
public class Avatar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
         String nombre;
         int fuerza, resistencia, velocidad;
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("---------------| BIENVENIDO A COLIENTE'S Profile |---------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ingresa los datos que se solicitan para crear tu perfil de juego.");
        System.out.println("-----------------------------------------------------------------");   
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Fuerza: ");
        fuerza = sc.nextInt();
        System.out.println("Resistencia: ");
        resistencia = sc.nextInt();
        System.out.println("Velocidad: ");
        velocidad = sc.nextInt();
        if((fuerza+resistencia+velocidad)>15){ 
            fuerza=0;resistencia=0;velocidad=0;
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------| Los datos de tu perfil son |------------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Nombre Usuario: " + nombre);
        System.out.println("Cual es el valor de la Fuerza (" + fuerza + ")");
        System.out.println("Cual es el valor de la resistencia (" + resistencia + ")");
        System.out.println("Cual es el valor de la Velocidad (" + velocidad + ")");
        System.out.println("-----------------------------------------------------------------\n\n\n\n");
        
    }
}