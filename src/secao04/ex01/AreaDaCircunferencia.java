package secao04.ex01;

import java.util.Locale;
import java.util.Scanner;

public class AreaDaCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Scanner é uma classe que permite que o usuário insira dados através do teclado no dentro do programa e usa a formatação padrão 'US'(Estados Unidos)

        System.out.print("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2); // Math é uma classe de operações matemáticas que possui uma função estática chamada 'pow' que faz a potenciação dos valores inseridos
        System.out.println("Área: " + String.format("%.4f", area));
    }
}
