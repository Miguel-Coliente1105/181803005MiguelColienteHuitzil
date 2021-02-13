/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Coche {
    
    
    public String marca, color;
    public double precio;
    public int placa,km;
    public Coche(){
        this.color = "";
        this.marca = "";
        this.placa = 0;
        this.precio = 0;
        this.km = 0;
    }
    public Coche(String marca, String color, double precio, int placa, int km){
        this.color = color;
        this.marca = marca;
        this.placa = placa;
        this.precio = precio;
        this.km = km;
    }
    @Override
    public String toString(){
        return "marca: "+marca+"\ncolor:"+color+"\nPlaca:"+placa+"\nprecio:"+precio+"\nKm: "+km;
    }
}

