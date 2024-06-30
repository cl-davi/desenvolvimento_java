package secao04.ex03;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaNosProdutos {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = scanner.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = scanner.nextInt();
        System.out.print("Informe o valor de D: ");
        int d = scanner.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DIFRENÇA: " + diferenca);
    }
}
