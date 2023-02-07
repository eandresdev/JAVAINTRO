
package javaintro;

// importamos el scanner
import java.util.Scanner;


public class guiaTeoricaEj07 {

    public static void main(String[] args) {
        /* Ej 7. Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipo Motor y
        permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        - Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        - Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
        gasolina”.
        - Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
        hormigón”.
        - Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
        alimenticia”.
        - Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
        válido para tipo de bomba”.
        */
        
        Scanner scan = new Scanner(System.in); // inicializo Scanner para permitir ingreso de datos por teclado
        
        //variables
        int motor ;
        
        //pedido de datos
        System.out.println("Hola, ingrese un número del 1 al 4 para elegir el tipo de motor que desea usar: ");
        motor = scan.nextInt();
        
        //bloque solucion. usando Estructura switch para permitir el uso de opciones.
        switch (motor) {
            case 1:
                System.out.println("Ustéd escogió una bomba de agua. ");
                break;//break sirve para abandonar una estructura de control.  
            case 2:
                System.out.println("Ustéd escogió una bomba de gasolina. ");
                break;
            case 3:
                System.out.println("Ustéd escogió una bomba de hormigón. ");
                break;
            case 4:
                System.out.println("Ustéd escogió una bomba de pasta alimenticia. ");
                break;
            default://opcion descarte(no es obligatorio su uso).
                System.out.println("No existe un valor válido para tipo de bomba. ");
        }
    }
    
}
