package secao06.while_.ex02;

import java.util.Scanner;

public class ProdutosPreferidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o tipo do combustível: ");
        int tipoCombustivel = scanner.nextByte();
        int qtdCombustivel1 = 0;
        int qtdCombustivel2 = 0;
        int qtdCombustivel3 = 0;

        if (tipoCombustivel >= 5) {
            System.out.println("MUITO OBRIGADO!");
        } else {
            while (tipoCombustivel > 0 && tipoCombustivel < 5) {
                if (tipoCombustivel == 1) {
                    qtdCombustivel1 += 1;
                    System.out.println("Álcool: " + qtdCombustivel1);

                    System.out.print("\nEscolha o tipo do combustível: ");
                    tipoCombustivel = scanner.nextByte();
                } else if (tipoCombustivel == 2) {
                    qtdCombustivel2 += 1;
                    System.out.println("Gasolina: " + qtdCombustivel2);

                    System.out.print("\nEscolha o tipo do combustível: ");
                    tipoCombustivel = scanner.nextByte();
                } else if (tipoCombustivel == 3) {
                    qtdCombustivel3 += 1;
                    System.out.println("Diesel: " + qtdCombustivel3);
                    System.out.print("\nEscolha o tipo do combustível: ");
                    tipoCombustivel = scanner.nextByte();
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
