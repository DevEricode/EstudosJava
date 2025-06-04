package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Quantos alunos? ");
        int qtDeAlunos =  entrada.nextInt();

        System.out.printf("Quantas notas por aluno? ");
        int qtDeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];

        double total = 0;

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota do %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtDeAlunos * qtDeNotas);
        System.out.println("Média da turma é  " + media);

        for(double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
