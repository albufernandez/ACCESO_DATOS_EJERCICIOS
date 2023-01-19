
package ejercicio37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio37 {
//Crear un libro de firmas (“ejercicio37”) en el que introducimos nombres de visitantes.
//No debe haber nombres repetidos. Cada vez que se añade un nombre, se comprueba que ese 
//nombre no figura en el libro.
    
    public static void main(String[] args) {
        
            Scanner teclado = new Scanner (System.in);
            String nombre=" ";
        //crea el documento antes de que empieces a escribir o leer nada
        try {
           //declara el escribir
            BufferedWriter escribir = new BufferedWriter (new FileWriter ("ejercicio37.txt"));
            escribir.close();
            } catch (IOException ex) {
            System.out.println("Error IO");
        }
        try{
            //introduce el primer nombre ESCRITO
            System.out.println("Introduce nombre para firmas");
            nombre = teclado.nextLine();
            
            //comprueba que el nombre no este vacio
            while(nombre.length()>0){
                
                //declara el leer
                BufferedReader leer = new BufferedReader (new FileReader("ejercicio37.txt"));
                boolean encontrado = false;
                
                //declara el primer nombre LEIDO
                String firmas = leer.readLine(); 
                
                    //bucle que comprueba si nombre esta entre firmas
                    while (firmas != null){
                        if (nombre.equals(firmas)){
                        encontrado=true; }
                        firmas = leer.readLine();
                         }
                
                //si esta avisa
                if (encontrado) System.out.println("el nombre " + nombre + " ya está");
                
                //si no esta lo graba
                else {
                    System.out.println("El nombre " + nombre + " no aparece lo voy a grabar");
                    BufferedWriter escribir = new BufferedWriter (new FileWriter ("ejercicio37.txt", true));
                    escribir.newLine();
                    escribir.write(nombre);
                    escribir.close();
                }           
                //cierra el leer y velve a pedir un nombre
                leer.close();
                System.out.println("Introduce nombre para firmas");
                nombre = teclado.nextLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio37.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
    

