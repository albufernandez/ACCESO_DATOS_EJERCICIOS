
package entregable1_random;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Alba_Entregable1_Random {

    public static void main(String[] args) {
        
        try {
            //creamos los Buffered para escribir y leer
            RandomAccessFile escribir = new RandomAccessFile ("entregable.dat","rw");
            RandomAccessFile leer = new RandomAccessFile ("entregable.dat","r");
            
            //declaracion de variables
            Scanner teclado = new Scanner (System.in);
            String nombre, nombreLargo;
            int edad;
            float estatura;
            
            //bucle que se va a repetir 3 veces (insertamos 3 atletas)
            for (int i =1; i<4; i++){
                System.out.println("Dime el nombre del atleta numero " + i);
                nombre = teclado.nextLine();
                
                System.out.println("Dime la edad del atleta numero " + i);
                edad = teclado.nextInt();
                teclado.nextLine();
                
                System.out.println("Dime la estatura del atleta numero " + i);
                estatura = teclado.nextFloat();
                teclado.nextLine();
                
                nombreLargo = comprobarNombre(nombre);
                System.out.println("nombrelargo:"+nombreLargo);
                escribir.writeUTF(nombreLargo);
                escribir.writeInt(edad);
                escribir.writeFloat(estatura); 
                
            } 
            escribir.close();
            
            //bucle que lee los datos de los atletas y los imprime por consola
            for (int i =1; i<4; i++){
                System.out.println("Nombre del atleta " + i + " " +leer.readUTF());
                System.out.println("Edad del atleta " + i + " " +leer.readInt());
                System.out.println("Estatura del atleta " + i + " " +leer.readFloat());
            }
            leer.close();
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error IO");
        }
    }
    
    //metodo que comprueba las longitudes de los nombres para que siempre sean 10
    public static String comprobarNombre(String nombre){
        
        String nombreLargo="";
        int longitud;
      
        longitud = nombre.length();
 
        if (longitud<10){ //si la longitud del nombre es menor que 10
            nombreLargo=nombre;
            
            //bucle que rellena con espacios hasta que la cadena tenga una longitud de 10
            while (nombreLargo.length()!=10){
                nombreLargo=nombreLargo + " ";
            }
        }
        
        if (longitud>10){ //si la longitud del nombre es mayor de 10
            nombreLargo="";
            
            //bucle que se va a repetir 10 veces(la longitud max del nombre)
            for (int i=0; i<10;i++){
                
                //a la cadena valida le añadimos los 10 primeros caracteres del nombre que comprobamos
                nombreLargo= nombreLargo + nombre.charAt(i);
            }
        }
       
        if (longitud==10){ //si la longitud del nombre es 10
            nombreLargo=nombre; //se queda como está
        }
        return nombreLargo;
    }
    
}
