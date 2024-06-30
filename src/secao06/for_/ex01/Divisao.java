package secao06.for_.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de operações: ");
        int n = scanner.nextInt();

        double divisao;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o numerador: ");
            double numerador = scanner.nextDouble();
            System.out.print("Informe o denominador: ");
            double denominador = scanner.nextDouble();

            if (denominador == 0) {
                System.out.println("Divisão impossível");
            } else {
                divisao = numerador / denominador;
                System.out.println(divisao);
            }
        }
    }
}
