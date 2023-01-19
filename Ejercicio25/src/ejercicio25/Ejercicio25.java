
package ejercicio25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio25 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        FileReader leer = new FileReader ("leer5.txt");
        int contador = 1;
        int letra = leer.read();
        
            while (letra != -1){
                //salto de linea
                if (letra == 10){
                    contador++;  }
                letra = leer.read();
         }
         System.out.println("Tu fichero tiene: " + contador + "lineas");
                 
    }
    
}
