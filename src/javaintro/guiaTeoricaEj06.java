
package javaintro;

// imports y Librerias
import java.util.Scanner;//importante siempre importar el scanner.


public class guiaTeoricaEj06 {

    
    public static void main(String[] args) {
        /* Ej 6. Implementar un programa que le pida dos números enteros al usuario y determine si ambos o
         alguno de ellos es mayor a 25.*/
        
        Scanner scan = new Scanner(System.in); // inicializo Scanner para permitir ingreso de datos por teclado
        
        //variables.
        int num1;
        int num2; 
        
        //pedido de datos e interacción con usuario
        System.out.println("Hola, ingresa el primer número: "); 
        num1 = scan.nextInt(); 
        System.out.println("Hola, ingresa el segundo número: ");
        num2 = scan.nextInt();
        
        //bloque solución
        if (num1>25  & num2>25) {// si las dos condiciones se cumplen, entra la siguiente linea de sentencias.
            System.out.println("Los números ingresados son mayores a 25. ");
            
        }else if (num1>25 || num2>25) {// si al menos una de las condiciones se cumplen, entra esta linea.
            System.out.println("Al menos uno de los números ingresados es mayor 25. ");
            
        }else {// si ninguna condicion se cumple, entra esta linea.
            System.out.println("Ninguno de los números ingresados es mayor a 25. ");            
        }
        
        
    }
    
}
