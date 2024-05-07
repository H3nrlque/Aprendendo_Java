package application;


import util.Verificacao;
import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados: ");
        int n = tc.nextInt();
        Verificacao[] vetor = new Verificacao[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."Dados da \{i + 1}° pessoa: ");
            System.out.print("Nome: ");
            tc.nextLine();
            String nome = tc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = tc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = tc.nextDouble();
            vetor[i] = new Verificacao(nome, nota1, nota2);
            System.out.println();
        }
        System.out.println();
        String aprovado;
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < vetor.length; i++) {
            double media = vetor[i].Media(vetor[i].getNota1(), vetor[i].getNota2());
            if (media >= 6) {
                aprovado = vetor[i].getNome();
                System.out.println(aprovado);
            }
        }

    }
}
