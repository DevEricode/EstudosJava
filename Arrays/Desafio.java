package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade = 0;
        double media = 0;


        System.out.println("Digite a quantidade de notas? ");
        quantidade = entrada.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %d nota? \n", i + 1);
            notas[i] += entrada.nextDouble();
        }

        for (double nota : notas) {
            media += nota;
        }

        System.out.printf("A média das notas é %.2f. \n", media / notas.length);


        entrada.close();

    }
}
