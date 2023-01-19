
package ejercicio20_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio20_1 {

    public static void main(String[] args) {
        try {
  
            //bufer lectura
            BufferedReader leer = new BufferedReader (new FileReader("leer20.txt"));
            //lee char (int)
            int letra = leer.read();
            String texto ="";
            //mientras que no este en fin de fichero
            while (letra != -1){
                
                //si la letra no es un espacio guarda y lee otra
                if (letra!=32){ texto = texto + (char)letra;}
                 letra = leer.read();
            }
            
            //imprime cadena
            System.out.println("El texto sin espacios es: " + texto);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio20_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio20_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
