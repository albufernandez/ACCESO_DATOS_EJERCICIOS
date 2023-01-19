
package ejercicio39;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio39 {

    public static void main(String[] args) {
        //grabamos lineas hasta que linea blanca, grabamos en otro seguido
        try {
            //declarar buffereds
            BufferedWriter escribir = new BufferedWriter (new FileWriter ("fichero39.txt"));
            BufferedWriter escribirSeguido = new BufferedWriter (new FileWriter ("fichero39seguido.txt"));
            BufferedReader leer = new BufferedReader (new FileReader ("fichero39.txt"));
            
            //pedimos linea
            Scanner teclado = new Scanner (System.in);
            System.out.println("Introduce linea");
            String linea = teclado.nextLine();
            escribir.write(linea);
            
            //si no esta en blanco escribimos
            while (linea.length()>0){
                System.out.println("Introduce linea");
                linea = teclado.nextLine();
                escribir.write(linea);
            }
            escribir.close();
            
            int letra;
            letra = leer.read();
            
            //leemos letra a letra grabamos todo menos espacios
            while (letra!=-1){
                if (letra != 10 && letra!= 32){
                    escribirSeguido.write(letra);
                }
                letra = leer.read();
                        
            }
           leer.close();
           escribirSeguido.close();
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio39.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
