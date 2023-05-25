package paquete5;

import java.util.ArrayList;

public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "hospitales.data";

        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Ibarra", "Imbabura");
        Ciudad c3 = new Ciudad("Cuenca", "Azuay");
        Ciudad c4 = new Ciudad("Tulcán", "Carchi");
        Ciudad c5 = new Ciudad("Azogues", "Cañar");

        ArrayList<Hospital> hospital = new ArrayList<>();

        Hospital h1 = new Hospital("Isidro Ayora", 40, 2000, c1);
        Hospital h2 = new Hospital("San Vicente de Paul", 20, 2500, c2);
        Hospital h3 = new Hospital("Vicente Corral Moscoso", 45, 3200, 
                c3);
        Hospital h4 = new Hospital("General TULCAN", 25, 8740, c4);
        Hospital h5 = new Hospital("Homero Castanier Crespo", 20, 1900, 
                c5);

        hospital.add(h1);
        hospital.add(h2);
        hospital.add(h3);
        hospital.add(h4);
        hospital.add(h5);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(
                nombreArchivo
        );

        for (int i = 0; i < hospital.size(); i++) {
            archivo.establecerRegistro(hospital.get(i));
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial presentar = new LecturaArchivoSecuencial(
                nombreArchivo
        );
        presentar.establecerListaHospitales();
        System.out.println(presentar);
    }

}

// @cbhas & @sebastianmend
