package ComportamentoDeMemoriaArraysEListas.Exercicios.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas linhas e colunas terá a matriz?");
        System.out.print("Linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Colunas: ");
        int colunas = scanner.nextInt();

        int[][] mat = new int[linhas][colunas];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("Insira o valor na posição [" + i + ", " + j + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nToda a matriz");
        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + ints[j] + "] ");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal da Matriz");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int contador = 0;
        System.out.println("\nNegativo da Matriz");
        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                if (ints[j] < 0) {
                    System.out.print(ints[j] + " ");
                    contador++;
                }
            }
        }
        System.out.println("\nQuantidade de negativos da Matriz: " + contador);
    }
}
