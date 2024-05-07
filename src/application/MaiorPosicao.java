package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int n = tc.nextInt();
        double[] vetor = new double[n];
        double maior = 0.0;
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o "+(i+1)+ "° número: ");
            vetor[i] = tc.nextDouble();
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.println();
        System.out.println("Maior valor = "+maior);
        System.out.println("Posição do maior valor = "+posicao);
    }
}
