
package ejercicio31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio31 {

    //Declaramos cadena y luego la escribimos caracter a caracter
    public static void main(String[] args) {
   
        String cadena = "este es mi texto";
        try {
            BufferedWriter escribir = new BufferedWriter ( new FileWriter ("fichero1.txt"));
            
            for (int i=0; i<cadena.length(); i++){
                escribir.append(cadena.charAt(i));
            }
            escribir.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio31.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
