package EstruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class areaFigurasGeometricas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o valor de C: ");
        double c = scanner.nextDouble();

        double pi = 3.14159;

        double areaTriRet = (a * c) / 2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = (a + b) / 2 * c;
        double areaQuadrado = Math.pow(b, 2);
        double areaRet = a * b;

        System.out.printf("\nTRIÂNGULO = %.3f", areaTriRet);
        System.out.printf("\nCIRCULO = %.3f", areaCirculo);
        System.out.printf("\nTRAPÉZIO = %.3f", areaTrapezio);
        System.out.printf("\nQUADRADO = %.3f", areaQuadrado);
        System.out.printf("\nRETÂNGULO = %.3f", areaRet);
    }
}
