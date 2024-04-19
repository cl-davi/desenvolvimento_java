package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terão o vetor: ");
        int[] vetor = new int[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextInt();
        }

        double soma = 0;
        int numPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                numPares++;
            }
        }

        double media;
        if (numPares == 0) {
            System.out.println("NÃO HÁ VALORES PARES");
        } else {
            media = soma / numPares;
            System.out.println("MÉDIA DOS PARES: " + media);
        }
        scanner.close();
    }
}
