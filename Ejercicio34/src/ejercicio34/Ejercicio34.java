
package ejercicio34;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio34 {

    public static void main(String[] args) {
        
        String nombre,contenido;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Indique el nombre del archivo");
        nombre = teclado.nextLine();
        
        System.out.println("Indique el contenido del archivo");
        contenido = teclado.nextLine();
       
            try{
            //escritura del fichero
            BufferedWriter escribir = new BufferedWriter ( new FileWriter (nombre+".txt"));
            escribir.write(contenido);
            escribir.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio34.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
