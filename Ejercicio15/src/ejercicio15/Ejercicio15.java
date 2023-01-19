
package ejercicio15;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ejercicio15 {

    public static void main(String[] args) {
      
        //crea un fichero y dice fecha modificacion
        File fichero1 = new File ("C://Users//albuf//Documents//NetBeansProjects//Ejercicio11");
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("La ultima modificacion es del:" + fecha.format(fichero1.lastModified()));
    }
    
}
