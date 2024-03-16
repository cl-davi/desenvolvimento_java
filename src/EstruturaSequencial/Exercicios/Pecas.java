package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código da peça 1: ");
        int numPeca1 = scanner.nextInt();
        System.out.print("Informe a quantidade das peças 1: ");
        int qtdPecas1 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        double valorPeca1 = scanner.nextDouble();

        System.out.print("\nInforme o código da peça 2: ");
        int numPeca2 = scanner.nextInt();
        System.out.print("Informe a quantidade das peças 2: ");
        int qtdPecas2 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        double valorPeca2 = scanner.nextDouble();

        double totalPagar = (qtdPecas1 * valorPeca1) + (qtdPecas2 * valorPeca2);
        System.out.printf("\nVALOR A PAGAR: %.2f", totalPagar);
    }
}
