package application;

import util.Calc;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos pessoa serão digitadas: ");
        int n = tc.nextInt();
        int cont, c = 0;
        double soma = 0, media, porcentagem = 0;
        Calc[] vetor = new Calc[n];
        String[] name = new String[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."Dados da \{i + 1}° pessoa: ");
            System.out.print("Nome: ");
            String nome = tc.next();
            System.out.print("Idade: ");
            int idade = tc.nextInt();
            System.out.print("Altura: ");
            double altura = tc.nextDouble();
            System.out.println();
            vetor[i] = new Calc(nome, idade, altura);
            soma += vetor[i].getAltura();
            cont = vetor[i].getIdade();
            if (cont < 16) {
                c++;
                name[i] = vetor[i].getNome();
            }
            porcentagem = vetor[i].Verificacao(c);
        }

        media = soma / n;
        System.out.printf("Altura média: %.2f\n",media);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
        System.out.println("Nomes: ");
        for (int i = 0; i < vetor.length; i++) {
            if (name[i] != null) {
                System.out.println(name[i]);
            }
        }
        tc.close();
    }
}
