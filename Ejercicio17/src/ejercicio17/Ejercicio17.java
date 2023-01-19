
package ejercicio17;

import java.io.File;
import java.io.IOException;

public class Ejercicio17 {

    public static void main(String[] args) throws IOException {
        //crea un directorio
        File directorio = new File ("Directorio17");
        directorio.mkdir();
        //y un fichero en ese directorio
        File fichero = new File (".//Directorio17", "fichero17.txt");
        fichero.createNewFile();
     
    }
    
}
