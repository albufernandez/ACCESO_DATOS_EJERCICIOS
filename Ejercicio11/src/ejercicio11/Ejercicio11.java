
package ejercicio11;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio11 {

    public static void main(String[] args) {

        //creamos un fichero
        File texto = new File ("fichero.txt");
        try {
            texto.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //si existe imprimimos que existe y si  no que no 
        if (texto.exists()) System.out.println("El fichero si existe");
        else System.out.println("El fichero no existe");
        //si es un directorio imprimmos que es un directorio 
        if (texto.isDirectory())System.out.println("Es un directorio");
        else System.out.println("Es un fichero");
        
        
   
        
    }
    
}


