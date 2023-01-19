
package ejercicio45;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio45 {

    public static void main(String[] args) {
        
     Scanner teclado = new Scanner (System.in);
     String nombre;
     
        try {
            DataOutputStream escribir = new DataOutputStream (new FileOutputStream ("firmas.dat"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio45.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    
    
    System.out.println("Dime nombre");
   nombre = teclado.nextLine();
         
         
         
         while (nombre.length()>0){
             
         }
     
    }
    
}
