* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilapersonal.pkg1;

import java.util.Stack;

/**
 *
 * @author patri
 */
public class PilaPersonal1 {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

    // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        pila.push(1);
        System.out.println(pila);
        pila.push(9);
        System.out.println(pila);
        pila.push(11);
        System.out.println(pila);


        // TODO 2: Busca tu número de lista con search() e imprime la posición.
        
        System.out.println("La posicion de mi numero de lista es: "+ pila.search(1));
                
        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        while (!pila.empty()) {
            int datoeliminado=pila.pop();
            System.out.println("se saco el dato: "+ datoeliminado);
            imprimirPila(pila);
                  
        // saca con pop(), imprime y llama a imprimirPila
        }
    }
    // Este método ya está completo: muestra la cima y el contenido
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
    
}
