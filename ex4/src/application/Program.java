package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.precoDolar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.valor = sc.nextDouble();

        System.out.printf("%s%.2f", "Amount to be paid in reais = ", CurrencyConverter.precoReais(CurrencyConverter.precoDolar));
    }
}
