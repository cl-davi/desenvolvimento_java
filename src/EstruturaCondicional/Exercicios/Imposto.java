package EstruturaCondicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe o salário: ");
        double salario = scanner.nextDouble();

        double imposto;

        if (salario <= 2000.0) {
            imposto = 0.0;
            System.out.println("Isento");
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
        scanner.close();
    }
}
