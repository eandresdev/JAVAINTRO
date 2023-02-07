
package javaintro;

// importamos el scanner 
import java.util.Scanner;

public class guiaTeoricaEj09 {

    
    public static void main(String[] args) {
        /* Ej 9. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
            bucle y mostrar el mensaje "Se capturó el número cero". El programa deberá calcular y mostrar el
            resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        
            Nota: recordar el uso de la sentencia break.*/
        
        Scanner scan = new Scanner(System.in);// se inicializa el escaner asignadole una variable (scan) que almacenará el dato solicitado por teclado. 
        
        //variables
        int num;
        int suma = 0; // siempre se inicializa un acumulador en cero
        int cont = 0;// siempre se inicializa un contador en cero.
        
        //bloque solución
        System.out.println("Hola, por favor ingresa un número: ");
        do {   
            num = scan.nextInt(); // num alojará o guardará cada nuevo ingreso del número solicitado al usuario
            
            if (num > 0) {  
                 cont++; //cont guardara los giros que de el bucle
                 suma += num; // suma guardara la sumatoria de suma+num en cada nuevo ingreso del nú    mero, actualizandose en cada nuevo ingreso del num.
                 System.out.println("Por favor ingresa otro número: ");
            }else if (num == 0) {
                 System.out.println("Se capturó el numero cero");
                 
             break;//break sirve para abandonar una estructura de control.
                 
            }else {
                System.out.println("El número ingresado es negativo por tanto no se tendra en cuenta");
                System.out.println("Por favor ingresa otro número: ");
                 
            }
            
        } while (cont != 20);// mientras la acumulacion guardada en la variable cont sea distinta de 20, el bucle estará activo.
            System.out.println(" La suma de los números ingresados fue de: " + suma);
    }
    
}
