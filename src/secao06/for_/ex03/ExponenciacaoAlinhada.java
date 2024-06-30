package secao06.for_.ex03;

import java.util.Scanner;

public class ExponenciacaoAlinhada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int valor = scanner.nextInt();

        for (int i = 1; i <= valor; i++) {
            double segundo = Math.pow(i, 2);
            double terceiro = Math.pow(i, 3);
            System.out.println((int)i + " " + (int)segundo + " " + (int)terceiro);
        }
        scanner.close();
    }
}
