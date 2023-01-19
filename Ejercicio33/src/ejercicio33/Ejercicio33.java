
package ejercicio33;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio33 {
//pide nombre y contenido, escribe y lee letra a letra
    public static void main(String[] args) {
        
        String nombre,contenido;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Indique el nombre del documento");
        nombre = teclado.nextLine();
        
        System.out.println("Ahora indique el contenido del documento");
        contenido = teclado.nextLine();
        
        try {
           
            //escritura en el fichero letra a letra
            BufferedWriter escribir = new BufferedWriter (new FileWriter(nombre+".txt"));
            for (int i=0 ; i< contenido.length() ; i++){
                escribir.append(contenido.charAt(i));
            }
            escribir.close();
            
            //lectura del fichero letra a letra
            BufferedReader leer = new BufferedReader ( new FileReader (nombre+".txt"));
            int letra = leer.read();
                while (letra != -1){
                    System.out.print((char)letra);
                    letra = leer.read();
                }
             escribir.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio33.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
