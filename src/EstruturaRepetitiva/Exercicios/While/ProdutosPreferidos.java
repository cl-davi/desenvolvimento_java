package EstruturaRepetitiva.Exercicios.While;

import java.util.Scanner;

public class ProdutosPreferidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o tipo do combustível: ");
        int tipoCombustível = scanner.nextByte();
        int qtdCombustivel1 = 0;
        int qtdCombustivel2 = 0;
        int qtdCombustivel3 = 0;

        if (tipoCombustível >= 5) {
            System.out.println("MUITO OBRIGADO!");
        } else {
            while (tipoCombustível > 0 && tipoCombustível < 5) {
                if (tipoCombustível == 1) {
                    qtdCombustivel1 += 1;
                    System.out.println("Álcool: " + qtdCombustivel1);

                    System.out.print("\nEscolha o tipo do combustível: ");
                    tipoCombustível = scanner.nextByte();
                } else if (tipoCombustível == 2) {
                    qtdCombustivel2 += 1;
                    System.out.println("Gasolina: " + qtdCombustivel2);

                    System.out.print("\nEscolha o tipo do combustível: ");
                    tipoCombustível = scanner.nextByte();
                } else if (tipoCombustível == 3) {
                    qtdCombustivel3 += 1;
                    System.out.println("Diesel: " + qtdCombustivel3);
                    System.out.print("\nEscolha o tipo do combustível: ");
                    tipoCombustível = scanner.nextByte();
                } else {
                    break;
                }
            }
        }
        System.out.println("\nÁlcool: " + qtdCombustivel1);
        System.out.println("Gasolina: " + qtdCombustivel2);
        System.out.println("Diesel: " + qtdCombustivel3);

        scanner.close();
    }
}
