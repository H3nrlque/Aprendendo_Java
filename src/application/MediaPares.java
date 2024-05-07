package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = tc.nextInt();
        int[] vetor = new int[n];
        int soma = 0, contPar = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Digite o \{i + 1}° número: ");
            vetor[i] = tc.nextInt();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                contPar++;
            }
        }
        System.out.println();
        if (soma > 0) {
            System.out.println(STR."Soma dos valores par = \{soma}");
            double media = (double) soma / contPar;
            System.out.printf("Média dos pares = %.1f\n",media);
        } else {
            System.out.println("Nenhum número par digitado");
        }










    }
}
