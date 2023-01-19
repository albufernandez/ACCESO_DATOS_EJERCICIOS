
package pkg8;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        try {
            
            File directorio = new File("directorio18");
            directorio.mkdir();
            File fichero = new File ("C:\\Users\\albuf\\Documents\\NetBeansProjects\\8","fichero18.txt");
            fichero.createNewFile();
            
            System.out.println(fichero.canRead());
            System.out.println("");fichero.canWrite();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
}
