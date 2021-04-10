/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Hackerman
 */
public class Bolsas {
    private int id;
    private String nombreBolsas;
    private String material;
    private String color;
    private double tamanio;
    private double precio;
    private int modelo;

    public Bolsas(String nombreBolsas, String material, String color, double tamanio, double precio, int modelo) {
        this.nombreBolsas = nombreBolsas;
        this.material = material;
        this.color = color;
        this.tamanio = tamanio;
        this.precio = precio;
        this.modelo = modelo;
    }
    


    public Bolsas(int id, String nombreBolsas, String material, String color, double tamanio, double precio, int modelo) {
        this.id = id;
        this.nombreBolsas = nombreBolsas;
        this.material = material;
        this.color = color;
        this.tamanio = tamanio;
        this.precio = precio;
        this.modelo = modelo;
    }

    public Bolsas() {
    }

    Bolsas(int aInt, String string, String string0, String string1, double aDouble, double aDouble0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getNombreBolsas() {
        return nombreBolsas;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getTamanio() {
        return tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreBolsas(String nombreBolsas) {
        this.nombreBolsas = nombreBolsas;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return   nombreBolsas;
    }
      public String nombre() {
        return  " id = " + id + ", nombreBolsas = " + nombreBolsas + ", material = " + material + ", color = " + color + ", tamanio = " + tamanio + ", precio = " + precio + ", modelo = " + modelo;
    }
}
