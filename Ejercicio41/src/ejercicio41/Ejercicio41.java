
package ejercicio41;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio41 {
//escribirmos bytes los num 0 al 99 e imprimir
    public static void main(String[] args) {
        try {
            
            DataOutputStream escribir = new DataOutputStream ( new FileOutputStream ("fichero41.dat"));
            DataInputStream leer = new DataInputStream ( new FileInputStream ("fichero41.dat"));
            
            for (int i =0; i<100; i++){
                escribir.write(i);
            }
            
            for (int e=0; e<100; e++){
                System.out.println(leer.read());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio41.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio41.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
