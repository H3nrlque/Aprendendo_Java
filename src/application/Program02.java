package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("What is the dollar price: $ ");
        double priceDollar = tc.nextDouble();
        System.out.print("How many dollars will be bought: $ ");
        double manyDol = tc.nextDouble();

        double dollar = CurrencyConverter.IOF(manyDol);
        double reais = CurrencyConverter.Reais(priceDollar, dollar);

        System.out.printf("Amount to be paid in reais: R$ %.2f\n",reais);

    }
}
