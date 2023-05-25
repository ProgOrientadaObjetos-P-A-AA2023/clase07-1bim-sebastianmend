/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
     private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private Ciudad ciudad;
    
    public Hospital (String n,int num, double p, Ciudad ciu ){
      nombre=n;
      numeroCamas=num;
      presupuesto=p;
      ciudad=ciu;
   
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public void establecerNumeroCamas(int num) {
        this.numeroCamas = num;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public void establecerPresupuesto(double pre) {
        presupuesto = pre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad ciu) {
        ciudad = ciu;
    }
    
    
    
}

