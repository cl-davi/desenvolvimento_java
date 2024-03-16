package EstruturaSequencial.Exercicios;

import java.util.Scanner;

public class SomaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("SOMA = " + soma);
    }
}
