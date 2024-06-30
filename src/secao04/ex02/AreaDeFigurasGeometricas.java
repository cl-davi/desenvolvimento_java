package secao04.ex02;

import java.util.Locale;
import java.util.Scanner;

public class AreaDeFigurasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o valor de C: ");
        double c = scanner.nextDouble();

        double pi = 3.14159;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTriRet = (a * c) / 2;
        double areaTrapezio = (a + b) / 2 * c;
        double areaQuadrado = Math.pow(b, 2);
        double areaRet = a * b;

        System.out.println("TRIÂNGULO: " + String.format("%.3f", areaTriRet));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo));
        System.out.println("TRAPÉZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETÂNGULO: " + String.format("%.3f", areaRet));
    }
}
