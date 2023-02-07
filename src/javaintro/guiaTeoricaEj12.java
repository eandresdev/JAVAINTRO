
package javaintro;

// importamos el scanner
import java.util.Scanner;

public class guiaTeoricaEj12 {

    
    public static void main(String[] args) {
        /* Ej 12. Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
            que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
            segundo, sino informe que no lo son. */
        
        // inicializo scanner.
        Scanner scan= new Scanner(System.in);
        
        // variables
        int num1;
        int num2;
        
        
        //pedido de datos
        System.out.println("Hola, este programa te dice si el primer número ingresado es multiplo del segundo. ");
        
        System.out.print("Ingresa el primer número:");
        num1 = scan.nextInt();
        System.out.print("Ingresa el segundo número:");
        num2 = scan.nextInt();
        
       esMultiplo(num1,num2); // llamo la funcion, pasandole los argumentos
        
    }//fin main
    
    
    // funcion que te indica si n1 es multiplo de n2.
    public static void esMultiplo(int num1, int num2){ // se reciben dos enteros como parametros
    int resto = num1 % num2 ; // se usa el MOD para llegar a resultado entero o resto 0.
    
        if (resto==0) {// se valida si el resto de la division es cero y actua según ello.
            System.out.println("El número " + num1 + " SI ES MULTIPLO del número " + num2);
            
        }else{ 
            System.out.println("El número " + num1 + " NO ES MULTIPLO del número " + num2);

        }
    
    }//fin metodo
    
}//fin class
