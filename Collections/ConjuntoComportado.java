package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("Eric");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Tereza");

        for (String n : nomes) {
            System.out.println(n);
        }

        SortedSet<Double> notas = new TreeSet<>();

        notas.add(9.5);
        notas.add(8.7);
        notas.add(6.8);
        notas.add(7.6);

        for (double n : notas) {
            System.out.println(n);
        }

    }
}
