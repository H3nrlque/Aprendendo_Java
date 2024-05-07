package application;

import util.Velho;

import java.util.Locale;
import java.util.Scanner;

public class Maisvelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar: ");
        int n = tc.nextInt();
        Velho[] vetor = new Velho[n];
        tc.nextLine();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."Dados da \{i + 1}° pessoa: ");
            System.out.print("Nome: ");
            String nome = tc.nextLine();
            System.out.print("Idade: ");
            int idade = tc.nextInt();
            vetor[i] = new Velho(nome, idade);
            tc.nextLine();
        }

        System.out.println();
        String maisvelho = null;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                if (vetor[i].getIdade() > vetor[(j)].getIdade()) {
                    maisvelho = vetor[i].getNome();
                } else {
                    maisvelho = vetor[j].getNome();
                }
            }
        }

        System.out.println(STR."Pessoa mais velha: \{maisvelho}");
















    }
}
