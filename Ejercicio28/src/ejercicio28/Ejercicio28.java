
package ejercicio28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio28 {

    public static void main(String[] args) {
        try {
            
            BufferedReader leer = new BufferedReader( new FileReader ("leer8.txt"));
            String linea = leer.readLine();
            int contador =0;
            
            //leemos linea a linea
            while (linea != null){
                contador++;
                System.out.println("Esta es la linea " + contador + " y su contenido es: \"" + linea + "\"");
                linea = leer.readLine();
            }
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio28.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio28.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
