
package entregable1_consola;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Alba_Entregable1_Consola {

    public static void main(String[] args) {
        try {
            //creamos el buffer de lectura del archivo
            RandomAccessFile leer = new RandomAccessFile ("..\\entregable.dat", "r");
            
            //el numero de atleta se lo pasamos en el cmd
            String atleta = args[0];
            String atleta2 =args[1];
            
            System.out.println("Voy a imprimir los atletas " + atleta + " y "+ atleta2);
            
            //llamamos al metodo que nos situa en el atleta que corresponde e imprime sus datos
            imprimir(atleta);
            imprimir(atleta2);
            
            leer.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error de fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error IO");
        }
    }
    
    //metodo que se coloca en el atleta que le pasamos y nos imprime sus datos
    public static void imprimir (String atleta){
        
        try {
            //buffer del archivo a leer
            RandomAccessFile leer = new RandomAccessFile ("..\\entregable.dat", "r");
            
            //si el atleta es el 1 nos ponemos apuntando al atleta 1
            if (atleta.equals("1")){
                leer.seek(0);
            }
            //si es atleta 2 el seek apunta al 2
            if (atleta.equals("2")){
                leer.seek(20);
            }
            //si es atleta 3 el seek apunta al 3
            if (atleta.equals("3")){
                leer.seek(40);
            }
         
            //imprimimos sus datos
            System.out.println("Nombre: " + leer.readUTF() + " edad: " + leer.readInt() + " altura: " + leer.readFloat());
            
            //cerramos el buffer
            leer.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error de fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error IO");
        }
        
    }
 
}
