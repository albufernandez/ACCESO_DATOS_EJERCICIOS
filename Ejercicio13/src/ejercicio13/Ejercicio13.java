
package ejercicio13;

import java.io.File;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        //nos posiciona en la carpeta que estamos 
        File dir = new File (".");
        //array de string con esos directorios
        String [] lista = dir.list();
      
        //recorre el array e imprime directorios
        for (int i=0; i< lista.length ; i++){
            System.out.println(lista[i]);
        }
    }
    
}
