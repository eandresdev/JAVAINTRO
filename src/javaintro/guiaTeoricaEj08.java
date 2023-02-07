
package javaintro;

// importamos el scanner
import java.util.Scanner;

public class guiaTeoricaEj08 {

   
    public static void main(String[] args) {
        /* Ej 8. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
            pedirá de nuevo hasta que la nota sea correcta. */
        
        Scanner scan = new Scanner(System.in); // inicializamos el scanner.
            int nota;
        
            System.out.println("Hola, por favor ingrese la nota a evaluar: ");
            nota = scan.nextInt();
        
            // entramos al while(mientras) que va a evaluar si la nota es correcta, de no ser asi la seguira pidiendo.
        while (nota <0 || nota >10) {
       
        System.out.println("La nota ingresada no es valida, por  favor vuelva a intentarlo: ");
            nota = scan.nextInt();
        
        }
        
        // si la nota fue correcta sale del while y imprime el sgte mensaje por pantalla.
        System.out.println("La nota ingresada es correcta. ");
    }
    
}
