
package javaintro;

// importamos el scanner
import java.util.Scanner;

public class guiaTeoricaEj13 { // y ejercicio 14

   
    public static void main(String[] args) {
       /* Ej 13. Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
          define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        
          Ej 14. Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo. */
        
        // se inicializa scanner.
        Scanner scan= new Scanner(System.in);
        
        //variables y vectores
        String[] equipo; // declaro vector string
        
        //bloque solucion
        System.out.println("Ingresa el número de personas de tu grupo : "); //  solicito tamaño del vector
        equipo = new String[scan.nextInt()]; 
        
        for (int i = 0; i < equipo.length; i++) { // llenando valores al vector
            System.out.println("Ingresa el nombre de tu compañero en la posición "+ i );
            equipo[i] = scan.next();  // se guardan los nombres ingresados en la posicion i
           
        }
        
        System.out.println("El grupo guardado en el vector equipo está conformado por : ");
        System.out.print("[");
        for (String equipo1 : equipo) {  
            System.out.print(equipo1 + " "); // mostrando por pantalla el vector
        }
        System.out.println("]");
    }//fin metodo main
    
}// fin class
