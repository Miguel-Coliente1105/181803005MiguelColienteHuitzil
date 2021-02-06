/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Panes {
    public String nombre,tipo, codigoB, tamanio;
    public double precio;
    
    
    public Panes(){
        this.nombre = "";
        this.tipo = "";
        this.codigoB = "";
        this.precio = 0;
        this.tamanio="";
        
    }
    
    
    public Panes(String nombre, String tipo, double precio, String codigoB,String tamanio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoB = codigoB;
        this.precio = precio;
        this.tamanio =tamanio;
        
    }
    
     @Override
    public String toString(){
        return "pan:"+nombre+"\ntipo: "+tipo+"\ncodigoB: "+codigoB+"\ntamanio"+tamanio+"\nprecio: "+precio;
    }
    
}
