
package ejercicio21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio21 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        //lectura de fichero
        FileReader leer = new FileReader("leer1.txt");
        int letra = leer.read();
        
        //imprimimos letra a letra
        while (letra !=-1){
            System.out.print((char)letra);
            letra = leer.read();
        }
            
        
        
    }
    
}
