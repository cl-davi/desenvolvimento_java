package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        int[] vetor = new int[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("\nNÚMEROS NEGATIVOS");
        for (int j : vetor) {
            if (j < 0) {
                System.out.println(j);
            }
        }
    }
}
