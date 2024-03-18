package IntroducaoAProgramacaoOrientadaAObjetos.Exercicios.AreaRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle widht: ");
        rect.width = scanner.nextDouble();
        System.out.print("Enter rectangle height: ");
        rect.height = scanner.nextDouble();

        rect.area();
        rect.perimeter();
        rect.diagonal();

        System.out.println(rect);
    }
}
