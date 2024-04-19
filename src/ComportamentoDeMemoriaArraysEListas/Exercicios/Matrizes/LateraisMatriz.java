package ComportamentoDeMemoriaArraysEListas.Exercicios.Matrizes;

import java.util.Scanner;

public class LateraisMatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas linhas e colunas terá a matriz?");
        System.out.print("Linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Insira o valor na posição [" + i + ", " + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nEscolha um número na matriz para puxar os valores que estão ao seu redor: ");
        int x = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição " + i + ", " + j);
                    if (j > 0) {
                        System.out.print("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        scanner.close();
    }
}
