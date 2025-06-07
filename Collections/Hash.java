package Collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        HashSet<Funcionario> func = new HashSet<>();

        func.add(new Funcionario("Eric"));
        func.add(new Funcionario("Joana Dark"));
        func.add(new Funcionario("Pedro"));
        func.add(new Funcionario("Petuni"));

        boolean resultado = func.contains(new Funcionario("Petuni"));
        System.out.println(resultado);

    }
}
