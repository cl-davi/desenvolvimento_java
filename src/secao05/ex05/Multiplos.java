package secao05.ex05;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Infome o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Infome o valor de B: ");
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }
        scanner.close();
    }
}
