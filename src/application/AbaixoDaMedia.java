package application;



import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = tc.nextInt();
        double[] vetor = new double[n];
        double soma = 0.0, media;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Digite o \{i + 1}° número: ");
            vetor[i] = tc.nextDouble();
            soma += vetor[i];
        }
        System.out.println();
        media = soma / n;
        System.out.printf("Média do vetor = %.3f\n",media);
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
