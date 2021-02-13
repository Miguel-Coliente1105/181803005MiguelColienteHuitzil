
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
public class TestCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner scanner = new Scanner(System.in);
        String titulo;
        int espera = 1,horaIni,horaFin;
       
        Cine cine = new Cine("love", 9, 11);
        //ArrayList<Pelicula> peliculas = new ArrayList();
        
        while(espera==1){
            System.out.println("Ingresa el titulo de la nueva pelicula: ");
            scanner.nextLine();
            titulo = scanner.nextLine();
            Pelicula pelicula = new Pelicula(titulo);
           // peliculas.add(nueva);
            cine.agregarPelicula(pelicula);
            System.out.println("para continuar ingrese 1");
            espera = scanner.nextInt();   
        }
       // Cine cine = new Cine("love", 9, 11, peliculas);
        System.out.println(cine.imprimirPeliculas());
        System.out.println(cine.menu());
        System.out.println("Numero de peliculas guardadas:"+cine.numeroPeliculas());
        System.out.println("Ingresar una hora para ver si esta abierto: ");
        horaIni = scanner.nextInt();
        System.out.println(cine.abierto(horaIni));
    }
    
}
