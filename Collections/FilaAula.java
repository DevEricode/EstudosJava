package Collections;

import java.util.LinkedList;
import java.util.Queue;;

public class FilaAula {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Breno"); // Esse metodo jogo erro caso a fila esteja cheia.
        fila.offer("Carol"); // Esse metodo retorna false.
        fila.offer("Hayley");
        fila.offer("Pepa");
        fila.add("Pedro");
        fila.add("Petuni");
        fila.add("Pepa");


        System.out.println(fila.peek());   // NÃO lança exceção se a fila estiver vazia — retorna null.
        System.out.println(fila.element()); // Lança exceção (NoSuchElementException) se a fila estiver vazia.

        System.out.println(fila.poll());   // Saída: null (fila vazia)
        System.out.println(fila.remove()); // Exceção: NoSuchElementException

        for (String f : fila) {
            System.out.println(f);
        }

        //fila.contains();
        //fila.clear();
        //fila.isEmpty();
        //fila.size();

    }

}
