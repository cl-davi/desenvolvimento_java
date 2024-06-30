package secao06.for_.ex05;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inicial: ");
        int n = scanner.nextInt();

        double mediaPonderada;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor de X: ");
            double valorX = scanner.nextDouble();
            System.out.print("Informe o valor de Y: ");
            double valorY = scanner.nextDouble();
            System.out.print("Informe o valor de Z: ");
            double valorZ = scanner.nextDouble();

            mediaPonderada = (valorX * 2.0 + valorY * 3.0 + valorZ * 5.0) / 10.0;
            System.out.printf("\n%.1f", mediaPonderada);
        }
        scanner.close();
    }
}
