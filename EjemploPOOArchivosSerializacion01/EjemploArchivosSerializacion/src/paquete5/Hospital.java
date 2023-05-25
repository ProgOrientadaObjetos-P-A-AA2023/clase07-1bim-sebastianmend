package paquete5;

import java.io.Serializable;

public class Hospital implements Serializable {

    String nombre;
    int numeroCamas;
    double presupuesto;
    Ciudad ciudad;

    public Hospital(String n, int nC, double p, Ciudad c) {
        nombre = n;
        numeroCamas = nC;
        presupuesto = p;
        ciudad = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumeroCamas(int n) {
        numeroCamas = n;
    }

    public void establecerPresupuesto(double n) {
        presupuesto = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public String ObtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

}

// @cbhas & @sebastianmend
