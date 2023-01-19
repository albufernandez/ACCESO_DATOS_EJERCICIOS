
package ejercicio14;

import java.io.File;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        //peso en bytes
        File fichero = new File ("hola.txt");
        long tamaño =  fichero.length();
        System.out.println(tamaño);
    }
    
}
