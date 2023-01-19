
package fernandezalba_tarea2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class FernandezAlba_Tarea2 {

    //metodo que muestra el menu
    public static void mostrarMenu(){
        System.out.println("Bienvenido al programa de gestion de la base de datos Instituto3, porfavor escoga una opcion de las siguientes");
        System.out.println("1) Listrar los registros de una tabla");
        System.out.println("2) Insertar un registro en una tabla");
        System.out.println("3) Modificar un registro de una tabla");
        System.out.println("4) Borrar un registro de una tabla");
        System.out.println("0) Salir del programa");
    }
    
    //metodo que nos pide una tabla y lista los resgistros de la misma
    public static void listar(){
        
        //declaramsos las variables que necesitaremos
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime la tabla que quieres que listemos");
        String tabla = teclado.nextLine();
        System.out.println("Dime la columna de " + tabla + " que quieres que listemos, o escribe todas si quieres listarla todas");
        String columna = teclado.nextLine();
        String consulta="";
        boolean todas=false;
        
        if (columna.equals("todas")){
           consulta = "Select * from " + tabla; 
           todas = true;
        }
        else {
         consulta = "Select " + columna + " from " + tabla;
         todas = false;
        }
        
        //llamamos al metodo que nos devuleve el nuemro de columnas en funcion de la tabla que el usuario escribe
        int columnas = compruebaColumnas(tabla) + 1;
       
        try {    
        //realizamos la conexion
        Class.forName("org.sqlite.JDBC");  
        Connection conexion = DriverManager.getConnection("jdbc:sqlite:instituto3.db");
        Statement sentencia = conexion.createStatement();
        ResultSet resul = sentencia.executeQuery(consulta);
 
        //imprimos los resultados de la consulta
        //si solo hemos puesto una columna
        if (todas ==false){
            while(resul.next()){
                System.out.print(resul.getString(1)+" ");
                System.out.println("");
            }
        }
        //si son todas las columnas
        else{
        while(resul.next()){
                for (int i=1; i<columnas;i++){
                    System.out.print(resul.getString(i)+" ");
                }
                System.out.println("");
            }
        }
  
        //imprimos un salto de linea al final para una mejor comprension del programa
        System.out.println("");
        
       //excepciones
       } catch (ClassNotFoundException ex) {
            System.out.print("Driver no cargado");
        } catch (SQLException ex) {
            System.out.println("Error de sql" + ex.getMessage());
        }
        
    }
    
    //metdoo que nos pide una tabla le decimos los datos a insertar
    public static void insertar(){
        //declaramsos las variables que necesitaremos
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime la tabla en la que quieres insertar datos");
        String tabla = teclado.nextLine();
        //nTabla es un numero en funcion del nombre de tabla que hemos escrito
        int nTabla = tablaNumero(tabla);
        
        try {    
        //realizamos la conexion
        Class.forName("org.sqlite.JDBC");  
        Connection conexion = DriverManager.getConnection("jdbc:sqlite:instituto3.db");
        Statement sentencia = conexion.createStatement();
        String instruccion="";
    
        //en funcion de la tabla que hemos escrito se insertan unos datos u otros
        switch(nTabla){
            case 1: 
                String cod_alumno, nombre_alumno, apellidos_alumno, fecha_nacimiento, grupo;
                System.out.println("Dime cod_alumno");
                cod_alumno = teclado.nextLine();
                System.out.println("Dime nombre_alumno");
                nombre_alumno = teclado.nextLine();
                System.out.println("Dime apellidos_alumno");
                apellidos_alumno = teclado.nextLine();
                System.out.println("Dime fecha_nacimiento con formato AAAA-MM-DD");
                fecha_nacimiento = teclado.nextLine();
                System.out.println("Dime grupo");
                grupo = teclado.nextLine();
                instruccion = "INSERT INTO alumno VALUES ('" + cod_alumno + "','"+nombre_alumno+"','"+apellidos_alumno+"','"+fecha_nacimiento+"','"+grupo+"');";                        
                break;
            case 2:
                System.out.println("Lo siento pero no puedes insertar datos en la tabla almuno_modulo, debes insertar los datos en cada tabla respectivamente");
                break;
                
            case 3:
                String cod_ciclo, nombre, grado;
                System.out.println("Dime cod_ciclo");
                cod_ciclo = teclado.nextLine();
                System.out.println("Dime nombre");
                nombre = teclado.nextLine();
                System.out.println("Dime grado");
                grado = teclado.nextLine();  
                instruccion = "INSERT INTO ciclo VALUES ('" + cod_ciclo + "','"+nombre+"','"+grado+"');"; 
                break;
           
            case 4:
                String cod_modulo, nombre_modulo, curso, cod_profesor;
                System.out.println("Dime cod_modulo");
                cod_modulo = teclado.nextLine();
                System.out.println("Dime nombre_modulo");
                nombre_modulo = teclado.nextLine();
                System.out.println("Dime cod_ciclo");
                cod_ciclo = teclado.nextLine();  
                System.out.println("Dime curso");
                curso = teclado.nextLine(); 
                System.out.println("Dime cod_profesor");
                cod_profesor = teclado.nextLine(); 
                instruccion = "INSERT INTO modulo VALUES ('" + cod_modulo + "','" +nombre_modulo+ "','"+cod_ciclo+ "','"+curso+ "','"+cod_profesor + "');"; 
                break;
                
            case 5:
                String nombre_profesor,ciudad;
                System.out.println("Dime cod_profesor");
                cod_profesor = teclado.nextLine();
                System.out.println("Dime nombre_profesor");
                nombre_profesor = teclado.nextLine();
                System.out.println("Dime ciudad");
                ciudad = teclado.nextLine();  
                instruccion = "INSERT INTO profesor VALUES ('" + cod_profesor + "','"+nombre_profesor+"','"+ciudad+"');"; 
                break;
                
            default :
                    System.out.println("No has introducido una tabla correcta");
                    break;
             
        }
     
        //ejecutamos esa sentencia
        sentencia.executeUpdate(instruccion);
        System.out.println("Se han introducido los datos insertados" + "\n");
      
       //excepciones
       } catch (ClassNotFoundException ex) {
            System.out.print("Driver no cargado");
        } catch (SQLException ex) {
            System.out.println("Error de sql" + ex.getMessage());
        }
        
    }
    
    //metodo que nos pide tabla, columna, nuevo dato y la condicion del registro que queremos modificar y modifica
    public static void modificar(){
        try {
            //declaramsos las variables que necesitaremos
            Scanner teclado = new Scanner (System.in);
            System.out.println("Dime la tabla en la que quieres modificar datos");
            String tabla = teclado.nextLine();
            int nTabla = tablaNumero(tabla);
            
            System.out.println("Dime la columna en la que quieres modificar datos");
            String columna = teclado.nextLine();
            
            System.out.println("Dime el nuevo dato que quieres insertar para el valor de "+ columna);
            String dato = teclado.nextLine();
            
            //realizamos la conexion
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:instituto3.db");
            Statement sentencia = conexion.createStatement();
            String instruccion="";
            
            switch(nTabla){
                case 1:
                    System.out.println("Dime el cod_alumno del registro que quieres modificar " + columna);
                    String condicion = teclado.nextLine();
                    instruccion= "UPDATE " + tabla + " set " + columna + " = '" + dato + "' where cod_alumno = " + condicion;     
                    break;
                case 2:
                    System.out.println("Te recuerdo que en alumno_modulo solo puedes modificar la nota, dime el cod_alumno del que le vas modificar la nota");
                    String cod_alumno = teclado.nextLine();
                    System.out.println("Y ahora dime el cod_modulo del registro a modificar");
                    String cod_modulo = teclado.nextLine();
                    instruccion= "UPDATE " + tabla + " set " + columna + " = '" + dato + "' where cod_alumno = " + cod_alumno + " AND cod_modulo = " + cod_modulo;
                    break;
                case 3:
                    System.out.println("Dime el cod_ciclo del registro que quieres modificar " + columna);
                    condicion = teclado.nextLine();
                    instruccion= "UPDATE " + tabla + " set " + columna + " = '" + dato + "' where cod_ciclo = " + condicion;
                    break;
                case 4:
                    System.out.println("Dime el cod_modulo del registro que quieres modificar " + columna);
                    condicion = teclado.nextLine();
                    instruccion= "UPDATE " + tabla + " set " + columna + " = '" + dato + "' where cod_modulo = " + condicion;
                    break;
                case 5:
                    System.out.println("Dime el cod_profesor del que quieres modificar " + columna);
                    condicion = teclado.nextLine();
                    instruccion= "UPDATE " + tabla + " set " + columna + " = '" + dato + "' where cod_profesor = " + condicion;
                    break;
                    
                default:
                    System.out.println("Has introducito algun dato erroneamente");
                    break;
               
            }
          
            sentencia.executeUpdate(instruccion);
            System.out.println("Se han modificado los datos insertados" + "\n");
         
        //excepciones
       } catch (ClassNotFoundException ex) {
            System.out.print("Driver no cargado");
        } catch (SQLException ex) {
            System.out.println("Error de sql" + ex.getMessage());
        }
        
        
    }
    
    //metodo que nos pide tabla, y en funcion de la tabla nos pide una condicion y borra ese registro
    public static void borrar(){
       
        try{
            //declaramos las variables que necesitaremos
            Scanner teclado = new Scanner (System.in);
            System.out.println("Dime la tabla de la que quieres borrar datos");
            String tabla = teclado.nextLine();
            int nTabla = tablaNumero(tabla);
            String instruccion="";
            
        //realizamos la conexion
        Class.forName("org.sqlite.JDBC");  
        Connection conexion = DriverManager.getConnection("jdbc:sqlite:instituto3.db");
        Statement sentencia = conexion.createStatement();
        
            switch(nTabla){
                case 1:
                    System.out.println("Dime el cod_alumno del registro que quieres borrar");
                    String condicion = teclado.nextLine();
                    instruccion = "DELETE from " + tabla + " where cod_alumno = '" + condicion + "'";
                    break;
                case 2:
                    System.out.println("Dime el cod_alumno del registro que quieres borrar");
                    String cod_alumno = teclado.nextLine();
                    System.out.println("Ahora dime el cod_modulo del registro a borrar");
                    String cod_modulo = teclado.nextLine();
                    instruccion = "DELETE from " + tabla + " where cod_alumno = '" + cod_alumno + "' AND cod_modulo = '" + cod_modulo + "'" ;
                    break;
                case 3:
                    System.out.println("Dime el cod_ciclo del registro que quieres borrar");
                    condicion = teclado.nextLine();
                    instruccion = "DELETE from " + tabla + " where cod_ciclo = '" + condicion + "'";
                    break;
                case 4:
                    System.out.println("Dime el cod_modulo del registro que quieres borrar");
                    condicion = teclado.nextLine();
                    instruccion = "DELETE from " + tabla + " where cod_modulo = '" + condicion +"'";
                    break;
                case 5:
                    System.out.println("Dime el cod_profesor del registro que quieres borrar");
                    condicion = teclado.nextLine();
                    instruccion = "DELETE from " + tabla + " where cod_profesor = '" + condicion + "'";
                    break;
                
            }
 
            sentencia.executeUpdate(instruccion);
            System.out.println("Se han borrado los datos insertados" + "\n");
      
            //excepciones
       } catch (ClassNotFoundException ex) {
            System.out.print("Driver no cargado");
        } catch (SQLException ex) {
            System.out.println("Error de sql" + ex.getMessage());
        }
        
    }
    
    //metodo al que le pasamos el nombre de una tabla y nos devuelve la cantidad de columnas que esta tiene
    public static int compruebaColumnas(String tabla){
        int columnas=0;
        if (tabla.equals("alumno")) columnas = 5;
        if (tabla.equals("alumno_modulo")) columnas = 3;
        if (tabla.equals("ciclo")) columnas = 3;
        if (tabla.equals("modulo")) columnas = 5;
        if (tabla.equals("profesor")) columnas = 3;
        return columnas;
        
    }
    
    //metodo que asigna un valor numerico ordenado a las tablas (alumno es 1, alumno_modulo es 2...) para poder operar en un switch
    public static int tablaNumero(String tabla){
        int nTabla=0;
        
        if (tabla.equals("alumno")) nTabla = 1;
        if (tabla.equals("alumno_modulo")) nTabla = 2;
        if (tabla.equals("ciclo")) nTabla = 3;
        if (tabla.equals("modulo")) nTabla = 4;
        if (tabla.equals("profesor")) nTabla = 5;
     
        return nTabla;
    }
    
    //metodo main que ejecuta el programa
     public static void main(String[] args) {
         
//hacer menu para 1) Listado 2) Insercion 3) MOdificacion 4) Borrado
        Scanner teclado = new Scanner (System.in);
        int opcion=0;
        
        do{
        mostrarMenu();
        opcion = teclado.nextInt();
        switch(opcion){
            case 0: 
                System.out.println("Has salido del programa");
                break;
            case 1: 
                listar();
                break;
            case 2:
                insertar();
                break;
            case 3: 
                modificar();
                break;
            case 4: 
                borrar();
                break;
            default:
                System.out.println("Has introducido un numero erroneo");
                break;
        }
        teclado.nextLine();
        }while (opcion!=0);
        
    }
  
}
