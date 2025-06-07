package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Funcionario> listaFuncionario = new ArrayList<>();
        Funcionario f1 = new Funcionario("Eric");

        listaFuncionario.add(f1);
        listaFuncionario.add(new Funcionario("Ana"));
        listaFuncionario.add(new Funcionario("Tereza"));
        listaFuncionario.add(new Funcionario("Pedro"));
        listaFuncionario.add(new Funcionario("Paulo"));
        listaFuncionario.add(new Funcionario("Paulo"));
        listaFuncionario.add(new Funcionario("Petuni"));

        System.out.println(listaFuncionario.get(4));

        System.out.println(listaFuncionario.get(2));


        System.out.println("Contém? " + listaFuncionario.contains(new Funcionario("Petuni")));

        System.out.println("Removido? " + listaFuncionario.remove(new Funcionario("Paulo")));
        System.out.println("Removido? " + listaFuncionario.remove(new Funcionario("Paulo")));
        System.out.println("Contém? " + listaFuncionario.contains(new Funcionario("Paulo")));

        for (Funcionario f : listaFuncionario) {
            System.out.println(f.nome);
        }

    }
}
