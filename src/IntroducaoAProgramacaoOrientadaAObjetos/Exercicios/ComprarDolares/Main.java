package IntroducaoAProgramacaoOrientadaAObjetos.Exercicios.ComprarDolares;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the Dollar price: ");
        CurrencyConverter.dollarPrice = scanner.nextDouble();

        System.out.print("Hpow many dollars will be bought: ");
        double dollarQuantity = scanner.nextDouble();

        double totalValue = CurrencyConverter.totalValue(dollarQuantity);
        System.out.println("Amount to be paid in reais: " + String.format("%.2f", totalValue));
    }
}
