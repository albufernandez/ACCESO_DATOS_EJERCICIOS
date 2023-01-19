
package ejercicio35;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio35 {
//grabamos lineas si no estan vacias y las imprimimos
    
    public static void main(String[] args) {
        try {
            //variables
            String linea =" ", lineaLeer;
            BufferedWriter escribir = new BufferedWriter ( new FileWriter ("fichero35.txt"));
            BufferedReader leer = new BufferedReader (new FileReader("fichero35.txt"));
            Scanner teclado = new Scanner (System.in);
            
            //si la liena que pedimos es mayor que 0 la graba
                while (linea.length()>0){
                    System.out.println("Dime la linea a introducir");
                    linea = teclado.nextLine();
                    escribir.write(linea);
                }
                escribir.close();
                //leemos la primera linea
               lineaLeer = leer.readLine();
               
               //las imprimimos
               while (lineaLeer != null){
                   System.out.println(lineaLeer);
                   lineaLeer = leer.readLine();
               }
               leer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio35.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    
}
