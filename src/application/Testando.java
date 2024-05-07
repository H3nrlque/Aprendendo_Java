package application;

import java.util.Scanner;

public class Testando {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um número[0,10]: ");
        int n = tc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = tc.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        tc.close();
    }
}
