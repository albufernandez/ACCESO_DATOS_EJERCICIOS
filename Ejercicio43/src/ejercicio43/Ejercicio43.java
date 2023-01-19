
package ejercicio43;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio43 {
//
    public static void main(String[] args) {
        //graba en un archivo edad, nombre, altura, y en otro nombre y altura
        try {
            //declaraciones
            DataOutputStream escribir = new DataOutputStream (new FileOutputStream ("fichero31.dat"));
            DataOutputStream escribir2 = new DataOutputStream (new FileOutputStream ("fichero32.dat"));
            DataInputStream leer = new DataInputStream (new FileInputStream("fichero31.dat"));
            DataInputStream leer2 = new DataInputStream (new FileInputStream ("fichero32.dat"));
            Scanner teclado = new Scanner (System.in);
            int veces= 3;
            
            for (int i =0; i<veces ; i++){
                
            System.out.println("Dime la edad");
            byte edad = teclado.nextByte();
            teclado.nextLine();
            
            System.out.println("Dime el nombre");
            String nombre = teclado.nextLine();
            
            System.out.println("Dime la altura");
            float altura = teclado.nextFloat();
            
            escribir.write(edad);
            escribir.writeUTF(nombre);
            escribir.writeFloat(altura);
            
            escribir2.writeUTF(nombre);
            escribir2.writeFloat(altura);
            
            }
            
            
            
            
            for (int e =0; e<veces ; e++){
                System.out.println("ARCHIVO 1");
                System.out.println(leer.readByte());
                System.out.println(leer.readUTF());
                System.out.println(leer.readFloat());
                
                System.out.println("ARCHIVO 2");
                System.out.println(leer2.readUTF());
                System.out.println(leer2.readFloat());
                
        }
                    
            
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio43.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio43.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
