package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);
    }
}
