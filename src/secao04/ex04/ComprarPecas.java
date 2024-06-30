package secao04.ex04;

import java.util.Locale;
import java.util.Scanner;

public class ComprarPecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe a quantidade de peças 1: ");
        int qtdPeca1 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        double valorPeca1 = scanner.nextDouble();

        System.out.print("Informe a quantidade das peças 2: ");
        int qtdPeca2 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        double valorPeca2 = scanner.nextDouble();

        double totalPagar = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
        System.out.println("VALOR A PAGAR: " + String.format("%.2f", totalPagar));
    }
}
