package application;

import util.Quarto;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];
        System.out.print("Número de estudantes que vão alugar quartos: ");
        int n = tc.nextInt();

        tc.nextLine();
        System.out.println("Registro de aluguel: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nome do estudante: ");
            String nome = tc.nextLine();
            System.out.print("Email do estudante: ");
            String email = tc.nextLine();
            System.out.print("Número do quarto[0,9]: ");
            int numeroquarto = tc.nextInt();
            tc.nextLine();
            quartos[numeroquarto] = new Quarto(nome, email);
            System.out.println();
        }

        System.out.println("Quartos alugados: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(STR."\{i}: \{quartos[i]}");
            }

        }
    }
}
