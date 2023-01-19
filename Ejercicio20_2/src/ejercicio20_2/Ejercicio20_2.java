
package ejercicio20_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio20_2 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        //pedimos ruta
        System.out.println("Por favor introduce la ruta del fichero");
        String ruta = teclado.nextLine();
        
        //creamos objetos
        File leer = new File(ruta);
        
        //miramos si existe
        if (leer.exists()) System.out.println("El fichero existe");
        else System.out.println("El fichero no existe");
        
            } 
        
}
