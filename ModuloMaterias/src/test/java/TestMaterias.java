
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
public class TestMaterias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de la materia: ");
        String nombre = scan.nextLine();
       
        System.out.println("Ingresa el nombre de la carrera: ");
        String carrera = scan.nextLine();
       
        System.out.println("Ingresa el numero de creditos: ");
        int creditos = scan.nextInt();
       
        System.out.println("Ingresa el codigo de la materia: ");
        String clave = scan.nextLine();
        
        System.out.println("Ingresa el cuatrimestre: ");
        int cuatrimestre = scan.nextInt();
        
        Materias matematicas = new Materias ("Ciencias Naturales", "Biologia", 17, 1,"CN12");
        Materias programacion = new Materias ("Geografia", "Geografia", 15, 3,"GEO74");
        Materias fundamentosPOO = new Materias ("Español", "Literatura", 20, 5,"Es258");
        Materias materia = new Materias(nombre, carrera, creditos, cuatrimestre, clave);
       
        System.out.println(matematicas+"\n"+programacion+"\n"+fundamentosPOO+"\n"+materia); 
    }
        
}
    

