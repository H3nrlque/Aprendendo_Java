package application;


import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int n = tc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o "+(i+1)+"° número: ");
            vetor[i] = tc.nextInt();
        }

        int c = 0;
        System.out.println("Números pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i]+" ");
                c++;
            }
        }
        System.out.println();
        System.out.print("Quantidade de pares = "+c);








        tc.close();
    }
}
