/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Ak {
    
    //atributos
    public String material, disponibilidad;
    public int municion;
    public double danio, velocidadDisparo, precio;
    
    
    //metodo
    
    @Override
    public String toString(){
            return " El material del arma es"+material+"Con una disponibilidad de:"+disponibilidad+"con una municion de:"+municion+"Con una velocidad de disparo"+velocidadDisparo+"con un danio de"+danio+"con un precio de"+precio;
        }    
    
}
