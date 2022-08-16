package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

//        Offer e add -> adicionam elementos na fila
//        Diferenca e o comportamento ocorre
//        quando a fila esta cheia.
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lanca uma excecao
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafael");
        fila.offer("Gui");

//        Peek e element -> obter o proximo elemento da fila (sem remover)
//        Diferenca e o comportamento ocorre
//        quando a fila esta vazia.
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lanca uma excecao
        System.out.println(fila.element());




//        Pool e remove -> obter o proximo elemento
//        da fila e remove!

//        Diferenca e o comportamento ocorre
//        quando a fila esta vazia.
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // Lanca uma excecao
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();
    }
}
