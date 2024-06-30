package secao05.ex06;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        scanner.close();
    }
}
