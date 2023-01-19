
package ejercicio16;

import java.io.File;

public class Ejercicio16 {

    public static void main(String[] args) {
      
        //renombra un fichero
        File fichero = new File ("documento.txt");
        File ficherobien = new File("documento16.txt");
        //se queda el nombre 16
        fichero.renameTo(ficherobien);
    }
    
}
