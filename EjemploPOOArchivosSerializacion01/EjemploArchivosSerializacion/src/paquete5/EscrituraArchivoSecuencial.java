package paquete5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Hospital registroHospital;
    private ArrayList<Hospital> listaHospitales;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCiudades();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaHospital().size() > 0) {
                for (int i = 0; i < obtenerListaHospital().size(); i++) {
                    establecerRegistroHospital(obtenerListaHospital().get(i));
                    establecerSalida();
                }
            }
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroHospital(Hospital h) {
        registroHospital = h;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroHospital);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaCiudades() {
        LecturaArchivoSecuencial l
                = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerProfesores();
        listaHospitales = l.obtenerCiudad();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Hospital> obtenerListaHospital() {
        return listaHospitales;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        }
    }

}
