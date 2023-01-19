
package ejercicio24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio24 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //bufer
        FileReader leer = new FileReader ("leer4.txt");
        
        //variables
        int letra = leer.read();
        int contador =0;
        
        //mientras no llege a fin de documento
        while (letra != -1){
            //comprueba vocales
            if ((char)letra == 'a'||(char)letra == 'A'||(char)letra == 'e'||(char)letra == 'E'|| (char)letra == 'i' ||(char)letra == 'I'||
                    (char)letra == 'o'||(char)letra == 'O'||(char)letra == 'u'||(char)letra == 'U'){
                //suma contador
                contador++; }
            //le otra letra
            letra = leer.read();    }
        
        System.out.println("Tu texto tiene: " + contador + " vocales");
        
   }
}
