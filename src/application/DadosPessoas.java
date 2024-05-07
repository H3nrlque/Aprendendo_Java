package application;

import java.util.Locale;
import java.util.Scanner;
import util.Dados;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas: ");
        int n = tc.nextInt();
        Dados[] vetor = new Dados[n];
        double menor = 10000000, maior = 0.0, mediaF, soma = 0.0;
        int ContM = 0, ContF = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Altura da \{i + 1}° pessoa: ");
            double altura = tc.nextDouble();
            System.out.print(STR."Gênero da \{i + 1}° pessoa: ");
            char genero = tc.next().charAt(0);
            System.out.println();
            vetor[i] = new Dados(altura, genero);
        }
        for (Dados dados : vetor) {
            if (dados.getAltura() > maior) {
                maior = dados.getAltura();
            }
            if (dados.getAltura() < menor) {
                menor = dados.getAltura();
            }
        }

        for (Dados dados : vetor) {
            if (dados.getGenero() == 'F') {
                soma += dados.getAltura();
                ContF++;
            } else {
                ContM++;
            }
        }
        mediaF = soma / ContF;

        System.out.println(STR."Menor altura = \{menor}");
        System.out.println(STR."Maior altura = \{maior}");
        System.out.println(STR."Número de mulheres: \{ContF}");
        System.out.printf("Média das alturas das mulheres = %.2f\n",mediaF);
        System.out.println(STR."Número de homens = \{ContM}");
    }
}
