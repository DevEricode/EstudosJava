package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaAula {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.push("Nada pode me parar!");
        livros.add("Nunca é hora de parar!");
        livros.push("Buda Rebelde");
        livros.push("Trainsurfing"); // Se usa esse metodo em pilhas.

        for (String livro : livros) {
            System.out.println("Estrutura de repetição: " + livro + ".");
        }

        System.out.println(livros.pop()); // Se usa esse metodo em pilhas.
        System.out.println(livros.poll());


//        livros.size();
//        livros.contains();
//        livros.isEmpty();
//        livros.clear();

    }
}
