import java.util.ArrayList;
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
    public int horaIni,horaFin;
    public ArrayList<Pelicula> peliculas;
    public Cine(){
        this.nombre = "";
        this.horaIni = 0;
        this.horaFin = 0;
        this.peliculas = new ArrayList();
    }
    public Cine(String nombre, int horaIni, int horaFin, ArrayList <Pelicula> peliculas){
        this.nombre = nombre;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.peliculas = peliculas;
    }
    public Cine(String nombre, int horaIni, int horaFin){
        this.nombre = nombre;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.peliculas = new ArrayList();
    }
    public String imprimirPeliculas(){
        String cartelera = "";
        for(Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo+"\n";
        }
        return cartelera;
    }
    public void agregarPelicula(Pelicula nueva){
        peliculas.add(nueva);
    }
    
    public int numeroPeliculas(){
        return peliculas.size();
    }
    //Menu 
    public String menu(){
        String carteleraMenu = "";
        int i = 0;
        for(Pelicula pelicula:peliculas){
            i ++;
            
            carteleraMenu += i+"."+pelicula.titulo+"\n";
        }
        return carteleraMenu;
    }
    
    public String abierto(int hora){
        this.horaIni = hora;
        if(horaIni >=9 && horaIni <= 20){
            return "Abierto";
        }else{
            return "Cerrado";
    }
    }
}
    

