
package pruebarandom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaRandom {

    public static void main(String[] args) {
        try {
            
            RandomAccessFile prueba = new RandomAccessFile("prueba3.dat", "rw");
            RandomAccessFile pruebaleer = new RandomAccessFile("prueba3.dat", "rw");
            // DataOutputStream escribir = new DataOutputStream (new FileOutputStream ("prueba2.dat"));
            // DataInputStream leer = new DataInputStream (new FileInputStream ("prueba2.dat"));
            System.out.println(prueba.getFilePointer());
            
            int numero = 2;
            prueba.writeInt(numero);
            //escribir.write(numero);
            System.out.println(prueba.getFilePointer());
            System.out.println(prueba.readInt());
            
            numero = 39;
            prueba.writeInt(numero);
            //escribir.write(numero);
            System.out.println(prueba.getFilePointer());
            System.out.println(prueba.readInt());
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebaRandom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PruebaRandom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
