/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Taza {
    public String color,modelo,material;
    public double tamanio, precio;
    
    //constructor
    
    public Taza(String color,String modelo,String material, double precio,double tamanio){
        this.color=color;
        this.material=material;
        this.modelo=modelo;
        this.precio=precio;
        this.tamanio=tamanio;
    }
    public Taza(){
        
    }
    
    //metodos
    @Override
    public String toString(){
        return "La taza mide: "+tamanio+"\ncuesta: "+precio+"\nes del modelo: "+modelo+"\ny esta hecha con: "+material;
    
    }
}
