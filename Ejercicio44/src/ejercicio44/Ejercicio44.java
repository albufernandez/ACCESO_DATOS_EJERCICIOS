
package ejercicio44;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio44 {

    //grabamos forsales y nombres
    public static void main(String[] args) {
     
        int [] dorsal = new int[] {22, 5, 7, 11, 14, 8};
        String[] nombre = new String[] {"Juan", "Luis", "Pedro", "Marcos", "Jose", "Blas"};
        
        try { 
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream ("fichero4.dat"));
            DataInputStream leer =  new DataInputStream (new FileInputStream ("fichero4.dat"));
            
            int veces = dorsal.length; 
            
            //escribir
            for (int i=0; i<veces;i++){
                escribir.writeInt(dorsal[i]);
                escribir.writeUTF(nombre[i]);
            }
            escribir.close();
            
            //leer
            for (int i=0; i<veces;i++){
                System.out.println("dorsal " + leer.readInt());
                System.out.println("nombre " + leer.readUTF());
                System.out.println("");
            }
            leer.close();
            
        } catch (EOFException ex){
            System.out.println("Error");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio44.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(Ejercicio44.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
