package GrauTecnico.testes.exemplo1POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Quadrado quadrado = new Quadrado();

        System.out.print("Insira a base do quadrado: ");
        quadrado.setBase(scanner.nextDouble());

        quadrado.area();
        quadrado.perimetro();

        System.out.println(quadrado);

        Trangulo triangulo = new Trangulo();

        System.out.print("Insira a base do triângulo: ");
        triangulo.setBase(scanner.nextDouble());

        System.out.print("Insira a altura do triângulo: ");
        triangulo.setAltura(scanner.nextDouble());

        System.out.print("Insira o lado 1 do triângulo: ");
        triangulo.setLado1(scanner.nextDouble());

        System.out.print("Insira a lado 2 do triângulo: ");
        triangulo.setLado2(scanner.nextDouble());

        triangulo.area();
        triangulo.perimetro();

        System.out.println(triangulo);
    }
}
