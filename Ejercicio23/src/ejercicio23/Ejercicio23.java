
package ejercicio23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio23 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
   
        String cadena="";
        FileReader leer = new FileReader("leer3.txt");
        int letra = leer.read();
        while(letra !=-1){
            cadena = cadena + (char)letra;
            letra = leer.read();
    }
        System.out.println(cadena);
  }
}

