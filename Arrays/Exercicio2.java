package arrays;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.3;
        notasAlunoA[2] = 6.2;
        notasAlunoA[3] = 7.6;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[2]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;
        for (double nota : notasAlunoA) {
            totalAlunoA += nota;
        }

        System.out.println("Media:" + totalAlunoA / notasAlunoA.length);

        double nota2 = 8.4;
        double[] notasAlunoB = {9.2, nota2, 6.8, 7.7};
        double totalAlunoB = 0;

        for (double nota : notasAlunoB) {
            totalAlunoB += nota;
        }

        System.out.println("Media:" + totalAlunoB / notasAlunoB.length);

        double[] notasAlunoC = new double[3];
        double totalAlunoC = 0;

        for (int i = 0; i < notasAlunoC.length; i++) {
            notasAlunoC[i] = Math.random() * 10;
            System.out.println(notasAlunoC[i]);
            totalAlunoC += notasAlunoC[i];
        }
        System.out.println("Media: " + totalAlunoC / notasAlunoC.length);
    }
}
