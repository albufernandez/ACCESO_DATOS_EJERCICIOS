
package ejercicio26;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        
        int a=0x0;
        for (int i=0; i<0xFFFF; i++){
            System.out.println((char)i+" ");
            if ((i%0x50) ==0 ) System.out.println();
        }
    }
    
}
