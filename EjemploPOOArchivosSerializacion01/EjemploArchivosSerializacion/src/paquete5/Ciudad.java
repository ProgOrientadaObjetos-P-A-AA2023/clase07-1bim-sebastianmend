/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author SALA I
 */
public class Ciudad implements Serializable {

    private String nombre;
    private int habitantes;

    public Ciudad(String n, int h) {
        nombre = n;
        habitantes = h;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public int obtenerHabitantes() {
        return habitantes;
    }

    public void establecerHabitantes(int h) {
        habitantes = h;
    }

    @Override
    public String toString() {
        String valor = String.format("%s-%d\n", obtenerNombre(), obtenerHabitantes());
        return valor;
    }

}
