
package javaintro;

import java.util.Scanner;


public class guiaTeoricaEj05 {

    
    public static void main(String[] args) {
        // Ej 5. Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
        
        Scanner leer = new Scanner(System.in);// inicializo Scanner para permitir ingreso de datos por teclado, dicha lectura la guardo en la variable 'leer'.
        
        
        System.out.println("Ingresa un booleano: ");
        boolean resultado=leer.nextBoolean();
        
        System.out.println("Ahora ingresa un decimal: ");
        double decimal =leer.nextDouble(); // RECUERDA que en consola para el decimal debes usar coma (,) y no un punto (.) .
        
        System.out.println("Y ahora ingresa un Simbolo: ");
        Scanner scan = new Scanner(System.in);
        char simbolo = scan.next().charAt(0); //primer carácter de la línea leída.
        
        
        /*
        DETECCIÓN DE ERRORES.
        Arreglar la siguiente porción de codigo.
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa tu edad: ");
         int edad = leer.nextInt();
         System.out.println("Hola, mi nombre es "+nombre+" y tengo "+edad+" años.");
         */

    }
    
}
