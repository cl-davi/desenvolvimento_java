package ComportamentoDeMemoriaArraysEListas.Exercicios.Vetores;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        int[] vetor = new int[scanner.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(STR."Digite o \{i + 1}º valor: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nNUMERO DE PARES: ");
        int contador = 0;
        for (int i : vetor) {
            if (i % 2 == 0) {
                contador++;
                System.out.printf(STR."\{i} ");
            }
        }
        System.out.println(STR."\n\nQUANTIDADE DE PARES: \{contador}");
    }
}
