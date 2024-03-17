package EstruturaRepetitiva.Exercicios.While;

import java.util.Scanner;

public class CoordenadasXY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Infome o valor do ponto X: ");
        int x = scanner.nextInt();
        System.out.print("Infome o valor do ponto Y: ");
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            System.out.print("Infome novamente o valor do ponto X: ");
            x = scanner.nextInt();
            System.out.print("Infome novamente o valor do ponto Y: ");
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
