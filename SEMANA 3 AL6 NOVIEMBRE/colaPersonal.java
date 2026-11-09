/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colapersonal;
import java.util.LinkedList;
import java.util.Queue;

public class ColaPersonal {

    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();

        // TODO 1: Mete con offer() los MISMOS 3 datos del ejercicio 1,
        //         en el mismo orden. Después de cada offer, llama a imprimirCola(cola);
        cola.offer(1);
        imprimirCola(cola);
        cola.offer(9);
        imprimirCola(cola);
        cola.offer(11);
        imprimirCola(cola);

        // TODO 2: Atiende al primero con poll(). Guárdalo en una variable Integer,
        //         imprime "Se atendio X" y llama a imprimirCola(cola);
        Integer sacar = cola.poll();
        System.out.println("se saco el dato: "+ sacar);
        imprimirCola(cola);
        


        // TODO 3: Vacía la cola de forma segura con isEmpty() y poll().
        while (!cola.isEmpty()) {
            Integer num= cola.poll();
            System.out.println("Eliminado: "+num);
            imprimirCola(cola);
    // saca con poll(), imprime y llama a imprimirCola
    }
            
        
    }

    

    // Este método ya está completo: muestra tamaño, cabeza y contenido
    private static void imprimirCola(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia\n");
        } else {
            System.out.println("Tamano: " + cola.size());
            System.out.println("Cabeza: " + cola.peek());
            System.out.println("Contenido: " + cola + "  <- la cabeza es el de la izquierda\n");
        }
    }
}
