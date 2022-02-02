package utils;

public class CurrencyConverter {

    public static final double imposto = 1.06;
    public static double precoDolar;
    public static double valor;

    public static double precoReais(double precoDolar){
        return valor * precoDolar * imposto;
    }
}
