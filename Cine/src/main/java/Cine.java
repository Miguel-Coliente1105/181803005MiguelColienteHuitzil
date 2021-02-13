
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Cine {
    public String nombre;
    public int horaIni, horaFin;
    public ArrayList <Pelicula> peliculas=new ArrayList();
    public Cine(){
        this.nombre="";
        this.horaIni=0;
        this.horaFin=0;
        //this.peliculas=null;
    }
   
    public Cine(String nombre, int horaIni, int horaFin,ArrayList <Pelicula> peliculas){
        this.nombre=nombre;
        this.horaIni=horaIni;
        this.horaFin=horaFin;
        //this.peliculas=peliculas;
    }
    public void  agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);          
    }
    
    @Override
    public String toString(){
        return "Nombre:"+nombre;
    }
    
    public String imprimirPeliculas(){
        String cartelera="";
        cartelera = peliculas.stream().map((pelicula) -> pelicula.titulo +"\n").reduce(cartelera, String::concat);
        return cartelera;
    }
    public Cine(String nombre, int horaIni, int horaFin){
        this.nombre=nombre;
        this.horaIni=horaIni;
        this.horaFin=horaFin;
        //this.peliculas=null;
    }
    
}
