package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores terão cada vetor: ");
        int[] vetorA = new int[scanner.nextInt()];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(STR."Digite o \{i + 1}º valor do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }
        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(STR."Digite o \{i + 1}º valor do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }
        System.out.println("\nVETOR RESULTANTE:");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
        scanner.close();
    }
}
