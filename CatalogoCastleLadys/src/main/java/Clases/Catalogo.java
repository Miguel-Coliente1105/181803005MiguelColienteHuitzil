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
public class Catalogo {
    private int id;
    private String nombreBolsas;
    private int modelo;
    private double precio;

    public Catalogo(int id, String nombreBolsas, int modelo, double precio) {
        this.id = id;
        this.nombreBolsas = nombreBolsas;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Catalogo() {
    }

    public int getId() {
        return id;
    }

    public String getNombreBolsas() {
        return nombreBolsas;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreBolsas(String nombreBolsas) {
        this.nombreBolsas = nombreBolsas;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "id=" + id + ", nombreBolsas=" + nombreBolsas + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    
}
