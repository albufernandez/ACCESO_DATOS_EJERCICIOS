
package ejercicio36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio36 {

    // ejercicio en el que por consola le pasamos por parametro el nombre del fichero  
    //y despues pr consola nos pide lineas y nos las imprime sin salto de linea
    public static void main(String[] args){
  
        try {
            Scanner teclado = new Scanner (System.in);
            String linea = " ", lineaLeer;
         
            //coge por consola el argumento que le pasemos
            BufferedWriter escribir = new BufferedWriter ( new FileWriter (args[0]));
            BufferedReader leer = new BufferedReader (new FileReader (args[0]));
            
            //ya en consola se ejecuta pedir linea, guardarla e imprimirla
            System.out.println("Dime la linea a guardar en fichero");
            linea = teclado.nextLine();
            
            while (linea.length()>0){  
                escribir.write(linea);
                linea = teclado.nextLine(); 
            }
            escribir.close();
            
            lineaLeer = leer.readLine(); 
            while (lineaLeer != null){
                System.out.println(lineaLeer);
                lineaLeer = leer.readLine();
            }
            leer.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio36.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio36.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
         
    }
    
}
