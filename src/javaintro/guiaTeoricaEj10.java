package javaintro;

// importamos el scanner
import java.util.Scanner;

public class guiaTeoricaEj10 {

    public static void main(String[] args) {
        /* Ej 10. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
            ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
            5 *****
            3 ***
            11 ***********
            2 **    
         */
        Scanner scan = new Scanner(System.in); // inicializamos el scanner permitiendo el ingreso de datos por teclado
        
        //variables.
        int num;
        
        //bloque solución
        for (int i = 0; i < 4; i++){ // condición del for, iterar i 4 veces.
            
            do{  // el do va a permitir repetir la petición del número al usuario 
                System.out.println("Ingresa un número: ");
                num = scan.nextInt();
                
                if (num<0 || num>20){// se valida que el número sea positivo y menor que 20
                    System.out.println("Ingresa números positivos menores a 20 ");
                }
                
            } while (num<1 || num>20);// mientras el número sea menor a 1 o mayor a 20 el bucle estara activo.
            
            System.out.print(num + " ");
            
                for(int j = 0; j < num;j++){ // este for va a iterar hasta desde cero hasta el número ingresado y va a imprimir un asterisco por cada iteración.
                    System.out.print("*");
                }
            System.out.println(" ");
       
        }
    }

}
