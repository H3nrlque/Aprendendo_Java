package util;

public class CurrencyConverter {
    public static double IOF(double dollar) {
        return dollar * 0.06 + dollar;
    }

    public static double Reais(double price, double dollar) {
        return dollar * price;
    }


}
