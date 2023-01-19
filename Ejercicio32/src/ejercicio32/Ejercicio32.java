
package ejercicio32;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio32 {

    public static void main(String[] args) {
        
        
        String cadena="";
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escriba la cadena a guardar en el fichero");
        cadena = teclado.nextLine();
        
        try {
            BufferedWriter escribir = new BufferedWriter ( new FileWriter ("fichero2.txt"));
                escribir.write(cadena);
                escribir.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio32.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
