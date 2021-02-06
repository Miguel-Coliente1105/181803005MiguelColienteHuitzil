/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Bicicleta {
    
    public String color, marca;
    public int rodada, velocidad;
    public double precio;
    
    
    @Override
    public String toString(){
            return "\n La marca de la bicicleta es:"+ marca +"\n Con un color: " + color + "\n Con un numero de rodada: " + rodada + "\n Con " + velocidad + " velocidades " + "\n Tiene un precio de:" + precio;
        }    
}
