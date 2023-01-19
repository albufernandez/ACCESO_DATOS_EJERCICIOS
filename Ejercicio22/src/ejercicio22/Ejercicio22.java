
package ejercicio22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio22 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //creamo lectura
        FileReader leer = new FileReader("leer2.txt");
        int letra = leer.read();
        int contador =0;
        
        //vamos leyendo letra a letra y sumando contador
        while (letra!=-1){
            contador++;
            letra = leer.read();
        }
        System.out.println("Tu documento tiene:" + contador + " letras");
    }
    
}
