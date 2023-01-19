
package ejercicio12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio12 {

    public static void main(String[] args) {
  
        //crear fichero pasandole un nombre
        System.out.println("Escribe el nombre del fichero por favor");
        Scanner teclado = new Scanner (System.in);
        String  nombre = teclado.nextLine();
        
        File texto = new File (nombre + ".txt");
        try {
            texto.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        }
        //imprime si el fichero es de lectura y escritura
        if (texto.canRead())System.out.println("Es de lectura");
        if (texto.canWrite()) System.out.println("Es de escritura");
        
    }
    
}
