/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Cliente {
    
   public int dni, edad;
    public String telefono,nombre;
    Coche coche;
    public Cliente(){
        this.coche = null;
        this.dni = 0;
        this.nombre = "";
        this.telefono = "";
        this.edad = 0;
    }
    public Cliente(int dni, String telefono, String nombre, Coche coche, int edad){
        this.coche = coche;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }
   @Override
    public String toString(){
        return "Nombre: "+nombre+"\ndni: "+dni+"\nTelefono: "+telefono+"\nEdad: "+edad+ "\ncoche:"+coche;
    
    }
}
