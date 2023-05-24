/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

/**
 *
 * @author SALA H
 */
public class ManejoArrayList5 {
    public static void main (String[] args){
        String[] lineas={"Tara Hernandez|contratado|30",
            "Luis, Andrade|factura|35","Ana Juarez|nombramiento|40"};
          
        
        String nombre;
        String tipo;
        int edad;
        
        Profesor2[] profesores = new Profesor2 [lineas.length];
        
        for (int i=0 ;i<lineas.length ;i++){
            
        ArrayList<String> linea_partes = new ArrayList<>(
                Arrays.asList(lineas[i].split("\\|"))); // ["Tara Hernandez", "contratado"]
                
        nombre=linea_partes.get(0);
        tipo=linea_partes.get(1);
        edad=Integer.parseInt(linea_partes.get(2));
         
        
        profesores[i]=new Profesor2(nombre,tipo,edad);
        System.out.printf("%s",profesores[i]);
        
        
    }
    
        
    }
}
        
        
        
        
    
    
    
    

