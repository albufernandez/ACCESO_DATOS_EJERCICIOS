
package ejercicio42;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio42 {
//nombre y edad, termina con blanco
    public static void main(String[] args) {
        
        try {
            //declaraciones
            DataOutputStream escribir = new DataOutputStream (new FileOutputStream ("fichero2.dat"));
            DataInputStream leer = new DataInputStream (new FileInputStream("fichero2.dat"));
            Scanner teclado = new Scanner (System.in);
            
            //pedimos nombre
            System.out.println("Introduce nombre:");
            String nombre = teclado.nextLine();  
            int edad;
            
            //si no esta vacio pedimos edad grabamos ambas
            while (nombre.length()>0){

                System.out.println("Dime la edad:");
                edad = teclado.nextInt();
                escribir.writeUTF(nombre);
                escribir.writeInt(edad);
                
                teclado.nextLine();
                System.out.println("Dime el nombre a guardar");
                nombre = teclado.nextLine();   
                }
 
            escribir.close();
            
            while (true){ //se puede hacer con for si le has puesto nombre al tipo File (yo no lo hago)
                nombre = leer.readUTF();
                edad = leer.readInt();
                System.out.println("Nombre: " + nombre + " edad: " + edad);
            }
                          
        } catch (EOFException ioe){
            System.out.println("Hemos llegado al final del archivo");
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error por no encontrar");
         
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio42.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
    }
    
}
