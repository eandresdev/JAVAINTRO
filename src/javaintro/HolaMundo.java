package javaintro;

// importamos el Scanner
import java.util.Scanner;


public class HolaMundo {

    
    public static void main(String[] args) {
        // se crea una variable para el Scanner (variable leer o scan que va a alojar o guardar la informacion dada por el usuario)que se utiliza para permitir que el usuario pueda ingresar datos por teclado
        Scanner leer = new Scanner(System.in);
        //se crea una variable cadena (String) que se utiliza para almacenar los datos ingresados por el usuario
        String nombre;
        //el sout permite imprimir por pantalla el mensaje que especifiquemos entre las comillas
        System.out.println("Hola, ingresa tu nombre por favor: ");
        //leemos el nombre de la persona en la variable nombre.
        nombre = leer.next();
        
        
        //mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java :P ...");
       
    }
    
}
