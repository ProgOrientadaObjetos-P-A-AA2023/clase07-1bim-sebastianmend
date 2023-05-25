/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/profesores.data";

        Ciudad ciudad1 = new Ciudad("loja", 12000);

        Ciudad ciudad2 = new Ciudad("Quito", 80000);

        Ciudad ciudad3 = new Ciudad("cuenca", 50000);

        Ciudad ciudad4 = new Ciudad("guayaquil", 90000);

        Ciudad ciudad5 = new Ciudad("ambato", 60000);

        Hospital hospital1 = new Hospital("Solca",
                300, 2400.20, ciudad1);

        Hospital hospital2 = new Hospital("Gregory Wallas",
                500, 50213, ciudad2);

        Hospital hospital3 = new Hospital("San Antonio",
                400, 31251.4, ciudad3);

        Hospital hospital4 = new Hospital("Santa Ines",
                300, 54565.8, ciudad4);

        Hospital hospital5 = new Hospital("hospital de Ambato",
                600, 64215, ciudad5);

        paquete4.EscrituraArchivoSecuencial archivo
                = new paquete4.EscrituraArchivoSecuencial(nombreArchivo);

        // establecer el valor del atributo registro
        archivo.establecerRegistroCiudad(hospital1 );
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();

        archivo.establecerRegistroCiudad(ciudad2);
        archivo.establecerSalida();

        archivo.establecerRegistroCiudad(ciudad3);
        archivo.establecerSalida();

        archivo.establecerRegistroCiudad(ciudad4);
        archivo.establecerSalida();

        archivo.establecerRegistroCiudad(ciudad5);
        archivo.establecerSalida();

        archivo.cerrarArchivo();

        paquete5.LecturaArchivoSecuencial lectura
                = new paquete5.LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerProfesores();
        System.out.println(lectura);
    }
}
