
package ejercicio38;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio38 {
//grabamos lineas si no estan en blanco y guuardamos las impares
    public static void main(String[] args) {
        
        try {
            //declaraciones
            String linea, lineaLeer;
            BufferedWriter escribir = new BufferedWriter (new FileWriter ("fichero38.txt"));
            BufferedWriter escribirImpares = new BufferedWriter (new FileWriter ("fichero38IMP.txt"));
            BufferedReader leer = new BufferedReader (new FileReader("fichero38.txt"));
            Scanner teclado = new Scanner (System.in);
            
            //pedir linea
            System.out.println("Dime la linea a escribir");    
            linea = teclado.nextLine();
            //escribir
            while (linea.length()>0){
            escribir.write(linea + "\n");
            System.out.println("Dime la linea a escribir");    
            linea = teclado.nextLine();
            }
            escribir.close();
 
            //leer
            lineaLeer = leer.readLine();
            int contador =1;
            while (lineaLeer!=null){
                System.out.println(lineaLeer);
                //si es impar grabamos
                if (contador%2!=0){
                    escribirImpares.write(lineaLeer + "\n");
                }
                contador++;
                lineaLeer = leer.readLine();     
        }
        leer.close();
        escribirImpares.close();
        
        
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio38.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
