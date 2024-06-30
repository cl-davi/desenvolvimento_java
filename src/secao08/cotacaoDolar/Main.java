package secao08.cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Qual o preço do dolar: ");
        double precoDolar = scanner.nextDouble();

        System.out.print("Quantos dólares serão comprados: ");
        double qtdDolar = scanner.nextDouble();

        System.out.println("Quantidade a ser paga em reais: R$" + String.format("%.2f", ConversorMonetario.dolarToReal(qtdDolar) * precoDolar));
    }
}
