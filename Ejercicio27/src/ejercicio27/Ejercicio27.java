
package ejercicio27;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio27 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        FileReader leer = new FileReader ("leer7.txt");
        int contador=0;
        int letra = leer.read();
        
        while (letra != -1){
            //si el caracter esta entre las  mayuc
            if (letra > 64 && letra <91){
                //contado suma 1
                contador++;
            }
            //leemos  otra letra
            letra = leer.read();
        }
        System.out.println("Este fichero tiene: " + contador + " letras mayusculas");
    }
    
}
