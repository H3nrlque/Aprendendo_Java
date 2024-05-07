package application;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = tc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];
        System.out.println("Digite os valores de A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = tc.nextInt();
        }
        System.out.println();
        System.out.println("Digite os valores de B");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = tc.nextInt();
        }
        System.out.println();
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = Soma(vetorA[i], vetorB[i]);
            System.out.println(vetorC[i]);
        }
    }

    public static int Soma(int A, int B) {
        return A + B;
    }
}
