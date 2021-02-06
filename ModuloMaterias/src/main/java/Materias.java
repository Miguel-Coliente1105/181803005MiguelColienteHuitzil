/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maluisa
 */
public class Materias {
    public String nombreMateria, carrera, clave;
    public int creditos, cuatrimestre;
    
    public Materias(){
        this.nombreMateria = "";
        this.carrera = "";
        this.clave = "";
        this.creditos = 0;
        this.cuatrimestre = 0;
    }
    
    public Materias(String nombre, String carrera, int creditos, int cuatrimestre, String clave){
        this.nombreMateria = nombre;
        this.carrera = carrera;
        this.clave = clave;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
    }
    
    @Override
    public String toString(){
        return "materia: "+nombreMateria+"\ncarrera: "+carrera+"\nclave: "+clave+"\ncreditos: "+creditos+"\ncuatrimestre: "+cuatrimestre;
    }
}

