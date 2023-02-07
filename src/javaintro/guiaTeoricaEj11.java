
package javaintro;

// importamos scanner
import java.util.Scanner;

public class guiaTeoricaEj11 {

    public static void main(String[] args) {
        /* Ej 11. Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
            en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
            reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
            vocales acentuadas) se mantienen sin cambios.
                                                a e i o u
                                                @ # $ % *
        
            Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
            correspondiente. Utilice la estructura “según” para la transformación.
            Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
            La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
        
        
        // inicializa scanner para permitir el ingreso de datos por teclado.
        Scanner scan=new Scanner(System.in); 
        //variables
        String frase;
        
        //pedido de datos
        System.out.println("Hola, ingresa la frase que quieres codificar ");
        frase = scan.nextLine().concat(".");//aqui concatené un punto, como lo pide la consigna.
        
        
        
        fraseCodificada(frase); // llamo al metodo, usando la frase como argumento.
  
    }//fin main
    
    
    //  este metodo codifica la palabra
    public static void fraseCodificada(String cadena) { //recibe un string como parametro
      String subCadena;// variable en la que se alojara el parametro una vez lo reciba el metodo.
      
      for (int i = 0; i<cadena.length(); i++) {// recorro i con paso en 1 hasta la longitud de la cadena.
           subCadena = cadena.substring(i, i+1);// se suma el 1 al ultimo caracter para que vaya modificando en cada iteracion del for.
          
          switch (subCadena) { //según cada vocal o cada caso, se modificará.
              case "a":
                  subCadena ="@";
                  
                  break;//break sirve para abandonar una estructura de control.
              case "e":
                   subCadena ="#";
                  
                  break;
              case "i":
                   subCadena ="$";
                  
                  break;
              case "o":
                   subCadena ="%";
                  
                  break;
              case "u":
                   subCadena ="*";
                  
                  break;
            }
            System.out.print(subCadena + " ");
        }//fin for
      
    }// fin metodo
}//fin class
