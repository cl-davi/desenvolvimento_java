package EstruturaRepetitiva.Exercicios.For;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
