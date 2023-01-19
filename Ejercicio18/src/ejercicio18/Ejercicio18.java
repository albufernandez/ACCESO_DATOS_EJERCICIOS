
package ejercicio18;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        File directorio = new File ("directorio18");
        File fichero = new File (".//directorio18", "fichero18.txt");
        
        //crea
        directorio.mkdir();
        try {
            
            fichero.createNewFile();
            
        } catch (IOException ex) {
            System.out.println("Error IOE");;
        }
        
        //si es de lectura o escritura
        if (fichero.canRead()) System.out.println("Es de lectura");
        if (fichero.canWrite()) System.out.println("Es de escritura");
        
        //fecha
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM7yyy HH:mm:ss");
        fecha.format(fichero.lastModified());
        
        //renombrado
        File renom = new File ("fichero18Nuevo.txt");
        fichero.renameTo(renom);
        
        //listar contenido direct18
        File dirList = new File (".//directorio18");
        String[] lista = dirList.list();
        for (int i=0; i<lista.length; i++){
            System.out.println(lista[i]);
        }
        
      
    }
    
}
