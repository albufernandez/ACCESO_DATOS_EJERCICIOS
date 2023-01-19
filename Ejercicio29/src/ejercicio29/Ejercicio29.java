
package ejercicio29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio29 {

    public static void main(String[] args) {
        
        String lineaLarga="";
        int contador =0;
        int posDefinitiva=0;
        
        try {
            //bufered lectura
            BufferedReader leer = new BufferedReader (new FileReader("leer9.txt"));
            String linea = leer.readLine();
            
            //leemos todas las lineas
            while(linea!=null){
                contador++;
                System.out.println("Linea numero " + contador);
                System.out.println(linea);
                //si la que leemos es mas larga que la que ya es mas larga se asigna valor
                if(linea.length() > lineaLarga.length()){
                    System.out.println(linea + " es mas larga, la guardo");
                    lineaLarga = linea;
                    posDefinitiva = contador;
                }
                //leemos otra linea
                linea = leer.readLine(); 
            }
            System.out.println("La linea mas larga era " + lineaLarga + " con el numero de linea " + posDefinitiva);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error fichero no encontrado");;
        } catch (IOException ex) {
            System.out.println("Error IOException");;
        }
    }
    
}
